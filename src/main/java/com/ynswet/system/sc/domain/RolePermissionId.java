package com.ynswet.system.sc.domain;
// Generated 2015-6-12 13:37:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RolePermissionId generated by hbm2java
 */
@Embeddable
public class RolePermissionId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 角色内码(取自 Role表).
	 */
	private Integer roleId;

	/**
	 * 权限内码(取自 Permission表).
	 */
	private Integer permissionId;

	public RolePermissionId() {
	}

	public RolePermissionId(Integer roleId, Integer permissionId) {
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	@Column(name = "RoleID", nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "PermissionID", nullable = false)
	public Integer getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(" [");
		buffer.append("roleId").append("='").append(getRoleId()).append("' ");
		buffer.append("permissionId").append("='").append(getPermissionId())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

	public boolean equals(Object obj) {
		if ((this == obj))
			return true;
		if ((obj == null))
			return false;
		if (!(obj instanceof RolePermissionId))
			return false;
		RolePermissionId castOther = (RolePermissionId) obj;

		return (this.getRoleId() == castOther.getRoleId())
				&& (this.getPermissionId() == castOther.getPermissionId());
	}

	public int hashCode() {
		Integer result = 17;

		result = 37 * result + this.getRoleId();

		result = 37 * result + this.getPermissionId();

		return result;
	}

}
