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


import com.dao.ShiyanshebeiDao;
import com.entity.ShiyanshebeiEntity;
import com.service.ShiyanshebeiService;
import com.entity.vo.ShiyanshebeiVO;
import com.entity.view.ShiyanshebeiView;

@Service("shiyanshebeiService")
public class ShiyanshebeiServiceImpl extends ServiceImpl<ShiyanshebeiDao, ShiyanshebeiEntity> implements ShiyanshebeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshebeiEntity> page = this.selectPage(
                new Query<ShiyanshebeiEntity>(params).getPage(),
                new EntityWrapper<ShiyanshebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshebeiEntity> wrapper) {
		  Page<ShiyanshebeiView> page =new Query<ShiyanshebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanshebeiVO> selectListVO(Wrapper<ShiyanshebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshebeiVO selectVO(Wrapper<ShiyanshebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshebeiView> selectListView(Wrapper<ShiyanshebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshebeiView selectView(Wrapper<ShiyanshebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
