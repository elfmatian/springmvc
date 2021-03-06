package com.ynswet.system.sc.domain;
// Generated 2015-7-17 16:03:34 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "menu", catalog = "d1")
public class Menu implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 菜单内码.
	 */
	private Integer menuId;

	/**
	 * 菜单名称.
	 */
	private String menuName;

	/**
	 * 菜单导航地址.
	 */
	private String menuUrl;

	/**
	 * 菜单级别根节点为0，.
	 */
	private String menuLevel;

	/**
	 * 父菜单ID, 直接上一级的MenuID.
	 */
	private Integer parentId;

	/**
	 * 是否最低级别的标志(*, closed=有子节点, open=没有子节点).
	 */
	private String state;

	/**
	 * 备注.
	 */
	private String note;

	/**
	 * 记录建立时间.
	 */
	private Date createTime;

	public Menu() {
	}

	public Menu(String menuName, String menuLevel, Integer parentId, String state,
			Date createTime) {
		this.menuName = menuName;
		this.menuLevel = menuLevel;
		this.parentId = parentId;
		this.state = state;
		this.createTime = createTime;
	}
	public Menu(String menuName, String menuUrl, String menuLevel,
			Integer parentId, String state, String note, Date createTime) {
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.menuLevel = menuLevel;
		this.parentId = parentId;
		this.state = state;
		this.note = note;
		this.createTime = createTime;
	}

	@Id
	@JsonProperty("id")
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MenuID", unique = true, nullable = false)
	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	@JsonProperty("text")
	@Column(name = "Menu_name", nullable = false, length = 30)
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "Menu_url", length = 65535)
	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Column(name = "Menu_level", nullable = false, length = 1)
	public String getMenuLevel() {
		return this.menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	@Column(name = "ParentID", nullable = false)
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "State", nullable = false, length = 30)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "Note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Create_Time",length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(" [");
		buffer.append("menuId").append("='").append(getMenuId()).append("' ");
		buffer.append("menuName").append("='").append(getMenuName())
				.append("' ");
		buffer.append("menuUrl").append("='").append(getMenuUrl()).append("' ");
		buffer.append("menuLevel").append("='").append(getMenuLevel())
				.append("' ");
		buffer.append("parentId").append("='").append(getParentId())
				.append("' ");
		buffer.append("state").append("='").append(getState()).append("' ");
		buffer.append("note").append("='").append(getNote()).append("' ");
		buffer.append("createTime").append("='").append(getCreateTime())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

}
