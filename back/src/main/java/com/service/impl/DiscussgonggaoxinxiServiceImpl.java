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


import com.dao.DiscussgonggaoxinxiDao;
import com.entity.DiscussgonggaoxinxiEntity;
import com.service.DiscussgonggaoxinxiService;
import com.entity.vo.DiscussgonggaoxinxiVO;
import com.entity.view.DiscussgonggaoxinxiView;

@Service("discussgonggaoxinxiService")
public class DiscussgonggaoxinxiServiceImpl extends ServiceImpl<DiscussgonggaoxinxiDao, DiscussgonggaoxinxiEntity> implements DiscussgonggaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgonggaoxinxiEntity> page = this.selectPage(
                new Query<DiscussgonggaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgonggaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgonggaoxinxiEntity> wrapper) {
		  Page<DiscussgonggaoxinxiView> page =new Query<DiscussgonggaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgonggaoxinxiVO> selectListVO(Wrapper<DiscussgonggaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgonggaoxinxiVO selectVO(Wrapper<DiscussgonggaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgonggaoxinxiView> selectListView(Wrapper<DiscussgonggaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgonggaoxinxiView selectView(Wrapper<DiscussgonggaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
