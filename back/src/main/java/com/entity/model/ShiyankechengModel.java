package com.entity.model;

import com.entity.ShiyankechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验课程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-17 08:45:45
 */
public class ShiyankechengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 实验日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyanriqi;
		
	/**
	 * 实验室号
	 */
	
	private String shiyanshihao;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 实验内容
	 */
	
	private String shiyanneirong;
		
	/**
	 * 实验要求
	 */
	
	private String shiyanyaoqiu;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：实验日期
	 */
	 
	public void setShiyanriqi(Date shiyanriqi) {
		this.shiyanriqi = shiyanriqi;
	}
	
	/**
	 * 获取：实验日期
	 */
	public Date getShiyanriqi() {
		return shiyanriqi;
	}
				
	
	/**
	 * 设置：实验室号
	 */
	 
	public void setShiyanshihao(String shiyanshihao) {
		this.shiyanshihao = shiyanshihao;
	}
	
	/**
	 * 获取：实验室号
	 */
	public String getShiyanshihao() {
		return shiyanshihao;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：实验内容
	 */
	 
	public void setShiyanneirong(String shiyanneirong) {
		this.shiyanneirong = shiyanneirong;
	}
	
	/**
	 * 获取：实验内容
	 */
	public String getShiyanneirong() {
		return shiyanneirong;
	}
				
	
	/**
	 * 设置：实验要求
	 */
	 
	public void setShiyanyaoqiu(String shiyanyaoqiu) {
		this.shiyanyaoqiu = shiyanyaoqiu;
	}
	
	/**
	 * 获取：实验要求
	 */
	public String getShiyanyaoqiu() {
		return shiyanyaoqiu;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
