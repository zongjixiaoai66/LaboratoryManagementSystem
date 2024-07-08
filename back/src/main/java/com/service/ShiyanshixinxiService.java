package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshixinxiView;


/**
 * 实验室信息
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ShiyanshixinxiService extends IService<ShiyanshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshixinxiVO> selectListVO(Wrapper<ShiyanshixinxiEntity> wrapper);
   	
   	ShiyanshixinxiVO selectVO(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
   	
   	List<ShiyanshixinxiView> selectListView(Wrapper<ShiyanshixinxiEntity> wrapper);
   	
   	ShiyanshixinxiView selectView(@Param("ew") Wrapper<ShiyanshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshixinxiEntity> wrapper);
   	
}

