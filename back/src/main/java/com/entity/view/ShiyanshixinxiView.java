package com.entity.view;

import com.entity.ShiyanshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验室信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
@TableName("shiyanshixinxi")
public class ShiyanshixinxiView  extends ShiyanshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshixinxiView(){
	}
 
 	public ShiyanshixinxiView(ShiyanshixinxiEntity shiyanshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
