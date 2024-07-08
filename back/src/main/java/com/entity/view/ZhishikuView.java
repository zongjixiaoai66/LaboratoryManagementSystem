package com.entity.view;

import com.entity.ZhishikuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
@TableName("zhishiku")
public class ZhishikuView  extends ZhishikuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhishikuView(){
	}
 
 	public ZhishikuView(ZhishikuEntity zhishikuEntity){
 	try {
			BeanUtils.copyProperties(this, zhishikuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
