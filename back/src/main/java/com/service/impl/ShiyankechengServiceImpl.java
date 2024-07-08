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


import com.dao.ShiyankechengDao;
import com.entity.ShiyankechengEntity;
import com.service.ShiyankechengService;
import com.entity.vo.ShiyankechengVO;
import com.entity.view.ShiyankechengView;

@Service("shiyankechengService")
public class ShiyankechengServiceImpl extends ServiceImpl<ShiyankechengDao, ShiyankechengEntity> implements ShiyankechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyankechengEntity> page = this.selectPage(
                new Query<ShiyankechengEntity>(params).getPage(),
                new EntityWrapper<ShiyankechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyankechengEntity> wrapper) {
		  Page<ShiyankechengView> page =new Query<ShiyankechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyankechengVO> selectListVO(Wrapper<ShiyankechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyankechengVO selectVO(Wrapper<ShiyankechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyankechengView> selectListView(Wrapper<ShiyankechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyankechengView selectView(Wrapper<ShiyankechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
