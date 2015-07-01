package com.ynswet.system.sc.domain;
// Generated 2015-6-16 16:11:07 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrgroleId generated by hbm2java
 */
@Embeddable
public class OrgroleId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 组织内码, 所属部门.
	 */
	private Integer orgid;

	/**
	 * 角色编码, 部门职务.
	 */
	private Integer roleId;

	public OrgroleId() {
	}

	public OrgroleId(Integer orgid, Integer roleId) {
		this.orgid = orgid;
		this.roleId = roleId;
	}

	@Column(name = "ORGID", nullable = false)
	public Integer getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	@Column(name = "RoleID", nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(" [");
		buffer.append("orgid").append("='").append(getOrgid()).append("' ");
		buffer.append("roleId").append("='").append(getRoleId()).append("' ");
		buffer.append("]");

		return buffer.toString();
	}

	public boolean equals(Object obj) {
		if ((this == obj))
			return true;
		if ((obj == null))
			return false;
		if (!(obj instanceof OrgroleId))
			return false;
		OrgroleId castOther = (OrgroleId) obj;

		return (this.getOrgid() == castOther.getOrgid())
				&& (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		Integer result = 17;

		result = 37 * result + this.getOrgid();

		result = 37 * result + this.getRoleId();

		return result;
	}

}
