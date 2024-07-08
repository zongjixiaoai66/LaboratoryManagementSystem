package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgonggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgonggaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgonggaoxinxiView;


/**
 * 公告信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface DiscussgonggaoxinxiService extends IService<DiscussgonggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgonggaoxinxiVO> selectListVO(Wrapper<DiscussgonggaoxinxiEntity> wrapper);
   	
   	DiscussgonggaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussgonggaoxinxiEntity> wrapper);
   	
   	List<DiscussgonggaoxinxiView> selectListView(Wrapper<DiscussgonggaoxinxiEntity> wrapper);
   	
   	DiscussgonggaoxinxiView selectView(@Param("ew") Wrapper<DiscussgonggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgonggaoxinxiEntity> wrapper);
   	
}

