package com.dao;

import com.entity.ShiyanshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshebeiVO;
import com.entity.view.ShiyanshebeiView;


/**
 * 实验设备
 * 
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface ShiyanshebeiDao extends BaseMapper<ShiyanshebeiEntity> {
	
	List<ShiyanshebeiVO> selectListVO(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
	
	ShiyanshebeiVO selectVO(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
	
	List<ShiyanshebeiView> selectListView(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);

	List<ShiyanshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
	
	ShiyanshebeiView selectView(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
	
}
