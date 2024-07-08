package com.dao;

import com.entity.ShiyanshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshixinxiVO;
import com.entity.view.ShiyanshixinxiView;


/**
 * 实验室信息
 * 
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ShiyanshixinxiDao extends BaseMapper<ShiyanshixinxiEntity> {
	
	List<ShiyanshixinxiVO> selectListVO(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
	
	ShiyanshixinxiVO selectVO(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
	
	List<ShiyanshixinxiView> selectListView(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);

	List<ShiyanshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
	
	ShiyanshixinxiView selectView(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
	
}
