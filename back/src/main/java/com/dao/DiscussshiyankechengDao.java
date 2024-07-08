package com.dao;

import com.entity.DiscussshiyankechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshiyankechengVO;
import com.entity.view.DiscussshiyankechengView;


/**
 * 实验课程评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
public interface DiscussshiyankechengDao extends BaseMapper<DiscussshiyankechengEntity> {
	
	List<DiscussshiyankechengVO> selectListVO(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
	
	DiscussshiyankechengVO selectVO(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
	
	List<DiscussshiyankechengView> selectListView(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);

	List<DiscussshiyankechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
	
	DiscussshiyankechengView selectView(@Param("ew") Wrapper<DiscussshiyankechengEntity> wrapper);
	
}
