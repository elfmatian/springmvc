package com.ynswet.system.sc.domain;
// Generated 2015-6-12 13:37:56 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MenuL generated by hbm2java
 */
@Entity
@Table(name = "menu_l", catalog = "d1")
public class MenuL implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 日志内码(自增序号).
	 */
	private Integer logId;

	/**
	 * 菜单内码.
	 */
	private Integer menuId;

	/**
	 * 菜单日志类型(*,C=建立, M=调整).
	 */
	private String menuLogType;

	/**
	 * 用户内码(取自 USER表,当前操作人).
	 */
	private Integer modifyUid;

	/**
	 * 日志描述.
	 */
	private String logDesc;

	/**
	 * 记录建立时间.
	 */
	private Date createTime;

	public MenuL() {
	}

	public MenuL(Integer menuId, Integer modifyUid, Date createTime) {
		this.menuId = menuId;
		this.modifyUid = modifyUid;
		this.createTime = createTime;
	}
	public MenuL(Integer menuId, String menuLogType, Integer modifyUid, String logDesc,
			Date createTime) {
		this.menuId = menuId;
		this.menuLogType = menuLogType;
		this.modifyUid = modifyUid;
		this.logDesc = logDesc;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LogID", unique = true, nullable = false)
	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	@Column(name = "MenuID", nullable = false)
	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	@Column(name = "MenuLog_Type", length = 1)
	public String getMenuLogType() {
		return this.menuLogType;
	}

	public void setMenuLogType(String menuLogType) {
		this.menuLogType = menuLogType;
	}

	@Column(name = "Modify_UID", nullable = false)
	public Integer getModifyUid() {
		return this.modifyUid;
	}

	public void setModifyUid(Integer modifyUid) {
		this.modifyUid = modifyUid;
	}

	@Column(name = "Log_DESC", length = 65535)
	public String getLogDesc() {
		return this.logDesc;
	}

	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Create_Time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(" [");
		buffer.append("logId").append("='").append(getLogId()).append("' ");
		buffer.append("menuId").append("='").append(getMenuId()).append("' ");
		buffer.append("menuLogType").append("='").append(getMenuLogType())
				.append("' ");
		buffer.append("modifyUid").append("='").append(getModifyUid())
				.append("' ");
		buffer.append("logDesc").append("='").append(getLogDesc()).append("' ");
		buffer.append("createTime").append("='").append(getCreateTime())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

}
