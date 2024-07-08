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


import com.dao.CaigoujiluDao;
import com.entity.CaigoujiluEntity;
import com.service.CaigoujiluService;
import com.entity.vo.CaigoujiluVO;
import com.entity.view.CaigoujiluView;

@Service("caigoujiluService")
public class CaigoujiluServiceImpl extends ServiceImpl<CaigoujiluDao, CaigoujiluEntity> implements CaigoujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigoujiluEntity> page = this.selectPage(
                new Query<CaigoujiluEntity>(params).getPage(),
                new EntityWrapper<CaigoujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigoujiluEntity> wrapper) {
		  Page<CaigoujiluView> page =new Query<CaigoujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigoujiluVO> selectListVO(Wrapper<CaigoujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigoujiluVO selectVO(Wrapper<CaigoujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigoujiluView> selectListView(Wrapper<CaigoujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigoujiluView selectView(Wrapper<CaigoujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
