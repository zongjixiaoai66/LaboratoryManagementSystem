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


import com.dao.ShiyanshixinxiDao;
import com.entity.ShiyanshixinxiEntity;
import com.service.ShiyanshixinxiService;
import com.entity.vo.ShiyanshixinxiVO;
import com.entity.view.ShiyanshixinxiView;

@Service("shiyanshixinxiService")
public class ShiyanshixinxiServiceImpl extends ServiceImpl<ShiyanshixinxiDao, ShiyanshixinxiEntity> implements ShiyanshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshixinxiEntity> page = this.selectPage(
                new Query<ShiyanshixinxiEntity>(params).getPage(),
                new EntityWrapper<ShiyanshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshixinxiEntity> wrapper) {
		  Page<ShiyanshixinxiView> page =new Query<ShiyanshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanshixinxiVO> selectListVO(Wrapper<ShiyanshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshixinxiVO selectVO(Wrapper<ShiyanshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshixinxiView> selectListView(Wrapper<ShiyanshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshixinxiView selectView(Wrapper<ShiyanshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
