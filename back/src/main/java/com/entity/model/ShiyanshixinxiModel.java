package com.entity.model;

import com.entity.ShiyanshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验室信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public class ShiyanshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实验室名称
	 */
	
	private String shiyanshimingcheng;
		
	/**
	 * 实验室规模
	 */
	
	private String shiyanshiguimo;
		
	/**
	 * 实验室图片
	 */
	
	private String shiyanshitupian;
		
	/**
	 * 实验室位置
	 */
	
	private String shiyanshiweizhi;
		
	/**
	 * 可约时间
	 */
	
	private String keyueshijian;
		
	/**
	 * 实验室详情
	 */
	
	private String shiyanshixiangqing;
		
	/**
	 * 实验室状态
	 */
	
	private String shiyanshizhuangtai;
				
	
	/**
	 * 设置：实验室名称
	 */
	 
	public void setShiyanshimingcheng(String shiyanshimingcheng) {
		this.shiyanshimingcheng = shiyanshimingcheng;
	}
	
	/**
	 * 获取：实验室名称
	 */
	public String getShiyanshimingcheng() {
		return shiyanshimingcheng;
	}
				
	
	/**
	 * 设置：实验室规模
	 */
	 
	public void setShiyanshiguimo(String shiyanshiguimo) {
		this.shiyanshiguimo = shiyanshiguimo;
	}
	
	/**
	 * 获取：实验室规模
	 */
	public String getShiyanshiguimo() {
		return shiyanshiguimo;
	}
				
	
	/**
	 * 设置：实验室图片
	 */
	 
	public void setShiyanshitupian(String shiyanshitupian) {
		this.shiyanshitupian = shiyanshitupian;
	}
	
	/**
	 * 获取：实验室图片
	 */
	public String getShiyanshitupian() {
		return shiyanshitupian;
	}
				
	
	/**
	 * 设置：实验室位置
	 */
	 
	public void setShiyanshiweizhi(String shiyanshiweizhi) {
		this.shiyanshiweizhi = shiyanshiweizhi;
	}
	
	/**
	 * 获取：实验室位置
	 */
	public String getShiyanshiweizhi() {
		return shiyanshiweizhi;
	}
				
	
	/**
	 * 设置：可约时间
	 */
	 
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
				
	
	/**
	 * 设置：实验室详情
	 */
	 
	public void setShiyanshixiangqing(String shiyanshixiangqing) {
		this.shiyanshixiangqing = shiyanshixiangqing;
	}
	
	/**
	 * 获取：实验室详情
	 */
	public String getShiyanshixiangqing() {
		return shiyanshixiangqing;
	}
				
	
	/**
	 * 设置：实验室状态
	 */
	 
	public void setShiyanshizhuangtai(String shiyanshizhuangtai) {
		this.shiyanshizhuangtai = shiyanshizhuangtai;
	}
	
	/**
	 * 获取：实验室状态
	 */
	public String getShiyanshizhuangtai() {
		return shiyanshizhuangtai;
	}
			
}
