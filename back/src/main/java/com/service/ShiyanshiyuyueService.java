package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshiyuyueView;


/**
 * 实验室预约
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ShiyanshiyuyueService extends IService<ShiyanshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiyuyueVO> selectListVO(Wrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	ShiyanshiyuyueVO selectVO(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	List<ShiyanshiyuyueView> selectListView(Wrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	ShiyanshiyuyueView selectView(@Param("ew") Wrapper<ShiyanshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshiyuyueEntity> wrapper);
   	
}

