package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshebeiView;


/**
 * 实验设备
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface ShiyanshebeiService extends IService<ShiyanshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshebeiVO> selectListVO(Wrapper<ShiyanshebeiEntity> wrapper);
   	
   	ShiyanshebeiVO selectVO(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
   	
   	List<ShiyanshebeiView> selectListView(Wrapper<ShiyanshebeiEntity> wrapper);
   	
   	ShiyanshebeiView selectView(@Param("ew") Wrapper<ShiyanshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshebeiEntity> wrapper);
   	
}

