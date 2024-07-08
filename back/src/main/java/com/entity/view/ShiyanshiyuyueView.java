package com.entity.view;

import com.entity.ShiyanshiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验室预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
@TableName("shiyanshiyuyue")
public class ShiyanshiyuyueView  extends ShiyanshiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshiyuyueView(){
	}
 
 	public ShiyanshiyuyueView(ShiyanshiyuyueEntity shiyanshiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanshiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
