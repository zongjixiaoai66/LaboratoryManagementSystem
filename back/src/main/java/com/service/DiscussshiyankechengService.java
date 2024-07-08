package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiyankechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiyankechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiyankechengView;


/**
 * 实验课程评论表
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface DiscussshiyankechengService extends IService<DiscussshiyankechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyankechengVO> selectListVO(Wrapper<DiscussshiyankechengEntity> wrapper);
   	
   	DiscussshiyankechengVO selectVO(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
   	
   	List<DiscussshiyankechengView> selectListView(Wrapper<DiscussshiyankechengEntity> wrapper);
   	
   	DiscussshiyankechengView selectView(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiyankechengEntity> wrapper);
   	
}

