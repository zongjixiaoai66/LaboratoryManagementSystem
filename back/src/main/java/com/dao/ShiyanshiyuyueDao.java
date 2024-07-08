package com.dao;

import com.entity.ShiyanshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshiyuyueVO;
import com.entity.view.ShiyanshiyuyueView;


/**
 * 实验室预约
 * 
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ShiyanshiyuyueDao extends BaseMapper<ShiyanshiyuyueEntity> {
	
	List<ShiyanshiyuyueVO> selectListVO(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
	
	ShiyanshiyuyueVO selectVO(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
	
	List<ShiyanshiyuyueView> selectListView(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);

	List<ShiyanshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
	
	ShiyanshiyuyueView selectView(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
	
}
