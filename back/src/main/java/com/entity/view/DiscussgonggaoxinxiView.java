package com.entity.view;

import com.entity.DiscussgonggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
@TableName("discussgonggaoxinxi")
public class DiscussgonggaoxinxiView  extends DiscussgonggaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgonggaoxinxiView(){
	}
 
 	public DiscussgonggaoxinxiView(DiscussgonggaoxinxiEntity discussgonggaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussgonggaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
