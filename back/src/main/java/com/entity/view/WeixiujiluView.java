package com.entity.view;

import com.entity.WeixiujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-17 08:45:46
 */
@TableName("weixiujilu")
public class WeixiujiluView  extends WeixiujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiujiluView(){
	}
 
 	public WeixiujiluView(WeixiujiluEntity weixiujiluEntity){
 	try {
			BeanUtils.copyProperties(this, weixiujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
