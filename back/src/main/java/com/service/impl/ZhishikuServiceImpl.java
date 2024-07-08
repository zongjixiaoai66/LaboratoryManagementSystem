package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhishikuDao;
import com.entity.ZhishikuEntity;
import com.service.ZhishikuService;
import com.entity.vo.ZhishikuVO;
import com.entity.view.ZhishikuView;

@Service("zhishikuService")
public class ZhishikuServiceImpl extends ServiceImpl<ZhishikuDao, ZhishikuEntity> implements ZhishikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishikuEntity> page = this.selectPage(
                new Query<ZhishikuEntity>(params).getPage(),
                new EntityWrapper<ZhishikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishikuEntity> wrapper) {
		  Page<ZhishikuView> page =new Query<ZhishikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishikuVO> selectListVO(Wrapper<ZhishikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishikuVO selectVO(Wrapper<ZhishikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishikuView> selectListView(Wrapper<ZhishikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishikuView selectView(Wrapper<ZhishikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
