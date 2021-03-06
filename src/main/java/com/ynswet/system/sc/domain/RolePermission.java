package com.ynswet.system.sc.domain;
// Generated 2015-7-17 16:03:34 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RolePermission generated by hbm2java
 */
@Entity
@Table(name = "role_permission", catalog = "d1")
public class RolePermission implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 角色内码(取自 Role表).
	 */
	/**
	 * 权限内码(取自 Permission表).
	 */
	private RolePermissionId id;

	/**
	 * 备注.
	 */
	private String note;

	/**
	 * 记录建立时间.
	 */
	private Date createTime;

	public RolePermission() {
	}

	public RolePermission(RolePermissionId id, Date createTime) {
		this.id = id;
		this.createTime = createTime;
	}
	public RolePermission(RolePermissionId id, String note, Date createTime) {
		this.id = id;
		this.note = note;
		this.createTime = createTime;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleId", column = @Column(name = "RoleID", nullable = false)),
			@AttributeOverride(name = "permissionId", column = @Column(name = "PermissionID", nullable = false))})
	public RolePermissionId getId() {
		return this.id;
	}

	public void setId(RolePermissionId id) {
		this.id = id;
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
		buffer.append("id").append("='").append(getId()).append("' ");
		buffer.append("note").append("='").append(getNote()).append("' ");
		buffer.append("createTime").append("='").append(getCreateTime())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

}
