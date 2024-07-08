package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyankechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyankechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyankechengView;


/**
 * 实验课程
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ShiyankechengService extends IService<ShiyankechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyankechengVO> selectListVO(Wrapper<ShiyankechengEntity> wrapper);
   	
   	ShiyankechengVO selectVO(@Param("ew") Wrapper<ShiyankechengEntity> wrapper);
   	
   	List<ShiyankechengView> selectListView(Wrapper<ShiyankechengEntity> wrapper);
   	
   	ShiyankechengView selectView(@Param("ew") Wrapper<ShiyankechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyankechengEntity> wrapper);
   	
}

