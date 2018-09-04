package com.java456.entity;

import java.util.Date;

/**
 * 
 * 关于用户 显示菜单的思路，菜单传到前台之前 应该过虑一边。
 * 拿到用户的treeMenusIds然后过虑一下，
 */
public class User {
	//用户ID
	private Long userId;
	//用户名
	private String 	fullname;
	//用户账号
	private String account;
	private String password;
	private Integer isExpired;
	private Integer isLock;
	private Date createtime;
	private Integer status;
	private String email;
	private String mobile;
	private String phone;
	private String sex;
	private String picture;
	private Integer FROMTYPE;
	private Long orgId;
	private Long orgSn;
	private String shortAccount;
	private String orgType;
	private Long typeId;
	private String typeName;
	private String code;
	private String refCode;
	private Integer security_level;
	private Integer id;
	private String menuIds;
	private Integer isApply;
	private String openId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getIsExpired() {
		return isExpired;
	}
	public void setIsExpired(Integer isExpired) {
		this.isExpired = isExpired;
	}
	public Integer getIsLock() {
		return isLock;
	}
	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getFROMTYPE() {
		return FROMTYPE;
	}
	public void setFROMTYPE(Integer fROMTYPE) {
		FROMTYPE = fROMTYPE;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Long getOrgSn() {
		return orgSn;
	}
	public void setOrgSn(Long orgSn) {
		this.orgSn = orgSn;
	}
	public String getShortAccount() {
		return shortAccount;
	}
	public void setShortAccount(String shortAccount) {
		this.shortAccount = shortAccount;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRefCode() {
		return refCode;
	}
	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}
	public Integer getSecurity_level() {
		return security_level;
	}
	public void setSecurity_level(Integer security_level) {
		this.security_level = security_level;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}
	public Integer getIsApply() {
		return isApply;
	}
	public void setIsApply(Integer isApply) {
		this.isApply = isApply;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
