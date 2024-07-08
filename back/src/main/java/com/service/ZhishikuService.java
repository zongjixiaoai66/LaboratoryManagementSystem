package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishikuView;


/**
 * 知识库
 *
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public interface ZhishikuService extends IService<ZhishikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishikuVO> selectListVO(Wrapper<ZhishikuEntity> wrapper);
   	
   	ZhishikuVO selectVO(@Param("ew") Wrapper<ZhishikuEntity> wrapper);
   	
   	List<ZhishikuView> selectListView(Wrapper<ZhishikuEntity> wrapper);
   	
   	ZhishikuView selectView(@Param("ew") Wrapper<ZhishikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishikuEntity> wrapper);
   	
}

