package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiujiluView;


/**
 * 维修记录
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface WeixiujiluService extends IService<WeixiujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiujiluVO> selectListVO(Wrapper<WeixiujiluEntity> wrapper);
   	
   	WeixiujiluVO selectVO(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
   	
   	List<WeixiujiluView> selectListView(Wrapper<WeixiujiluEntity> wrapper);
   	
   	WeixiujiluView selectView(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiujiluEntity> wrapper);
   	
}

