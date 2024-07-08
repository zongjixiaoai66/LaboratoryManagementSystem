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


import com.dao.WeixiujiluDao;
import com.entity.WeixiujiluEntity;
import com.service.WeixiujiluService;
import com.entity.vo.WeixiujiluVO;
import com.entity.view.WeixiujiluView;

@Service("weixiujiluService")
public class WeixiujiluServiceImpl extends ServiceImpl<WeixiujiluDao, WeixiujiluEntity> implements WeixiujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiujiluEntity> page = this.selectPage(
                new Query<WeixiujiluEntity>(params).getPage(),
                new EntityWrapper<WeixiujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiujiluEntity> wrapper) {
		  Page<WeixiujiluView> page =new Query<WeixiujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiujiluVO> selectListVO(Wrapper<WeixiujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiujiluVO selectVO(Wrapper<WeixiujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiujiluView> selectListView(Wrapper<WeixiujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiujiluView selectView(Wrapper<WeixiujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
