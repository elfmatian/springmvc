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
 * Homepage generated by hbm2java
 */
@Entity
@Table(name = "homepage", catalog = "d1")
public class Homepage implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主页ID(自增序号).
	 */
	private Integer homepageId;

	/**
	 * 主页名称.
	 */
	private String homepageName;

	/**
	 * 主页链接.
	 */
	private String homepageUrl;

	/**
	 * 备注.
	 */
	private String note;

	/**
	 * 记录建立时间.
	 */
	private Date createTime;

	public Homepage() {
	}

	public Homepage(String homepageName, String homepageUrl, Date createTime) {
		this.homepageName = homepageName;
		this.homepageUrl = homepageUrl;
		this.createTime = createTime;
	}
	public Homepage(String homepageName, String homepageUrl, String note,
			Date createTime) {
		this.homepageName = homepageName;
		this.homepageUrl = homepageUrl;
		this.note = note;
		this.createTime = createTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "HomepageID", unique = true, nullable = false)
	public Integer getHomepageId() {
		return this.homepageId;
	}

	public void setHomepageId(Integer homepageId) {
		this.homepageId = homepageId;
	}

	@Column(name = "Homepage_Name", nullable = false, length = 100)
	public String getHomepageName() {
		return this.homepageName;
	}

	public void setHomepageName(String homepageName) {
		this.homepageName = homepageName;
	}

	@Column(name = "Homepage_Url", nullable = false, length = 65535)
	public String getHomepageUrl() {
		return this.homepageUrl;
	}

	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}

	@Column(name = "Note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
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
		buffer.append("homepageId").append("='").append(getHomepageId())
				.append("' ");
		buffer.append("homepageName").append("='").append(getHomepageName())
				.append("' ");
		buffer.append("homepageUrl").append("='").append(getHomepageUrl())
				.append("' ");
		buffer.append("note").append("='").append(getNote()).append("' ");
		buffer.append("createTime").append("='").append(getCreateTime())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

}
