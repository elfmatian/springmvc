package com.ynswet.system.sc.domain;
// Generated 2015-6-12 13:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
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
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "d1")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户内码(自增序号).
	 */
	private Integer uid;

	/**
	 * 用户名称.
	 */
	private String userName;

	/**
	 * 用户类型(*, 0=员工, C=客户, P=合作伙伴, T=临时用户).
	 */
	private String userType;

	/**
	 * 证件类型(*, 0=身份证, 1=护照, 2=军官证).
	 */
	private String idType;

	/**
	 * 证件号码(登录识别).
	 */
	private String idNo;

	/**
	 * 联系手机(登录识别,仅能有一个号码).
	 */
	private String cell;

	/**
	 * 邮箱(登录识别).
	 */
	private String email;

	/**
	 * 备用手机(可录入多个).
	 */
	private String cell2;

	/**
	 * 联系电话(可录入多个).
	 */
	private String tel;

	/**
	 * 传真.
	 */
	private String fax;

	/**
	 * QQ号.
	 */
	private String qq;

	/**
	 * 微信号.
	 */
	private String weChat;

	/**
	 * 民族(*).
	 */
	private Integer nationality;

	/**
	 * 宗教(*).
	 */
	private Integer religion;

	/**
	 * 政治面貌(*).
	 */
	private Integer polityFace;

	/**
	 * 生日.
	 */
	private Date birthdate;

	/**
	 * 出生地/籍贯.
	 */
	private String birthPlace;

	/**
	 * 婚姻情况0=未知(*, 1=已婚, 2=未婚, 3=离异, 4=丧偶).
	 */
	private String marriage;

	/**
	 * 血型(*, 0=未知, 1=A型, 2=B型, 3=O型, 4=AB型).
	 */
	private String blood;

	/**
	 * 性别(*, 0=未知, M=男性, F=女性, 外部员工可能未知).
	 */
	private String gender;

	/**
	 * 身高(厘米).
	 */
	private BigDecimal height;

	/**
	 * 体重(公斤).
	 */
	private BigDecimal weight;

	/**
	 * 学历(*, 0=未知, 1=专科及以下, 2=专科, 3=本科, 4=硕士, 5=博士).
	 */
	private String education;

	/**
	 * 毕业学校.
	 */
	private String gradSchool;

	/**
	 * 专业.
	 */
	private String major;

	/**
	 * 毕业时间.
	 */
	private Date graduationDate;

	/**
	 * 职业.
	 */
	private String occupation;

	/**
	 * 职称.
	 */
	private String jobTitle;

	/**
	 * 区域(与省, 市, 县都取自Region表).
	 */
	private Integer regionId;

	/**
	 * 省(直辖市。).
	 */
	private Integer provinceId;

	/**
	 * 市.
	 */
	private Integer cityId;

	/**
	 * 区(县).
	 */
	private Integer districtId;

	/**
	 * 街道(镇, 手工填写).
	 */
	private String town;

	/**
	 * 户籍地址.
	 */
	private String addr1;

	/**
	 * 当前居住地址.
	 */
	private String addr2;

	/**
	 * 通讯地址.
	 */
	private String addr3;

	/**
	 * 通讯地址邮政编码.
	 */
	private String zip;

	/**
	 * 紧急联系人.
	 */
	private String urgLinkman;

	/**
	 * 紧急联系人电话.
	 */
	private String urgTel;

	/**
	 * 安全问题1.
	 */
	private String secQuestion1;

	/**
	 * 安全问题2.
	 */
	private String secQuestion2;

	/**
	 * 安全问题3.
	 */
	private String secQuestion3;

	/**
	 * 加密安全答案1.
	 */
	private String secAnswer1;

	/**
	 * 加密安全答案2.
	 */
	private String secAnswer2;

	/**
	 * 加密安全答案3.
	 */
	private String secAnswer3;

	/**
	 * 安全密码, 成为正式用户后必须填加.
	 */
	private String secPassword;

	/**
	 * 防挟持密码, 成为正式用户后必须填加.
	 */
	private String bindPassword;

	/**
	 * 状态(*, 0=正常, S=失效).
	 */
	private String status;

	/**
	 * 备注.
	 */
	private String note;

	/**
	 * 记录建立时间.
	 */
	private Date createTime;

	/**
	 * 最后修改时间.
	 */
	private Date modifyTime;

	/**
	 * 停用日期.
	 */
	private Date closeDate;

	public User() {
	}

	public User(String userName, String userType, String idType, String idNo,
			String cell, String email, String cell2, String marriage,
			String blood, String gender, String education, String status,
			Date createTime, Date modifyTime) {
		this.userName = userName;
		this.userType = userType;
		this.idType = idType;
		this.idNo = idNo;
		this.cell = cell;
		this.email = email;
		this.cell2 = cell2;
		this.marriage = marriage;
		this.blood = blood;
		this.gender = gender;
		this.education = education;
		this.status = status;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
	}
	public User(String userName, String userType, String idType, String idNo,
			String cell, String email, String cell2, String tel, String fax,
			String qq, String weChat, Integer nationality, Integer religion,
			Integer polityFace, Date birthdate, String birthPlace,
			String marriage, String blood, String gender, BigDecimal height,
			BigDecimal weight, String education, String gradSchool,
			String major, Date graduationDate, String occupation,
			String jobTitle, Integer regionId, Integer provinceId,
			Integer cityId, Integer districtId, String town, String addr1,
			String addr2, String addr3, String zip, String urgLinkman,
			String urgTel, String secQuestion1, String secQuestion2,
			String secQuestion3, String secAnswer1, String secAnswer2,
			String secAnswer3, String secPassword, String bindPassword,
			String status, String note, Date createTime, Date modifyTime,
			Date closeDate) {
		this.userName = userName;
		this.userType = userType;
		this.idType = idType;
		this.idNo = idNo;
		this.cell = cell;
		this.email = email;
		this.cell2 = cell2;
		this.tel = tel;
		this.fax = fax;
		this.qq = qq;
		this.weChat = weChat;
		this.nationality = nationality;
		this.religion = religion;
		this.polityFace = polityFace;
		this.birthdate = birthdate;
		this.birthPlace = birthPlace;
		this.marriage = marriage;
		this.blood = blood;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.education = education;
		this.gradSchool = gradSchool;
		this.major = major;
		this.graduationDate = graduationDate;
		this.occupation = occupation;
		this.jobTitle = jobTitle;
		this.regionId = regionId;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.districtId = districtId;
		this.town = town;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		this.zip = zip;
		this.urgLinkman = urgLinkman;
		this.urgTel = urgTel;
		this.secQuestion1 = secQuestion1;
		this.secQuestion2 = secQuestion2;
		this.secQuestion3 = secQuestion3;
		this.secAnswer1 = secAnswer1;
		this.secAnswer2 = secAnswer2;
		this.secAnswer3 = secAnswer3;
		this.secPassword = secPassword;
		this.bindPassword = bindPassword;
		this.status = status;
		this.note = note;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.closeDate = closeDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UID", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "User_Name", nullable = false, length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "User_Type", nullable = false, length = 1)
	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name = "ID_Type", nullable = false, length = 1)
	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	@Column(name = "ID_NO", nullable = false, length = 30)
	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	@Column(name = "CELL", nullable = false, length = 30)
	public String getCell() {
		return this.cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	@Column(name = "EMAIL", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "CELL2", nullable = false, length = 100)
	public String getCell2() {
		return this.cell2;
	}

	public void setCell2(String cell2) {
		this.cell2 = cell2;
	}

	@Column(name = "TEL", length = 100)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "FAX", length = 30)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "QQ", length = 30)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "WeChat", length = 30)
	public String getWeChat() {
		return this.weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	@Column(name = "Nationality")
	public Integer getNationality() {
		return this.nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	@Column(name = "Religion")
	public Integer getReligion() {
		return this.religion;
	}

	public void setReligion(Integer religion) {
		this.religion = religion;
	}

	@Column(name = "PolityFace")
	public Integer getPolityFace() {
		return this.polityFace;
	}

	public void setPolityFace(Integer polityFace) {
		this.polityFace = polityFace;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Birthdate", length = 10)
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "BirthPlace", length = 30)
	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	@Column(name = "Marriage", nullable = false, length = 1)
	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	@Column(name = "Blood", nullable = false, length = 1)
	public String getBlood() {
		return this.blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	@Column(name = "Gender", nullable = false, length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "Height", precision = 12, scale = 3)
	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	@Column(name = "Weight", precision = 12, scale = 3)
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "Education", nullable = false, length = 1)
	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Column(name = "GradSchool", length = 100)
	public String getGradSchool() {
		return this.gradSchool;
	}

	public void setGradSchool(String gradSchool) {
		this.gradSchool = gradSchool;
	}

	@Column(name = "Major", length = 100)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Graduation_Date", length = 10)
	public Date getGraduationDate() {
		return this.graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	@Column(name = "Occupation", length = 30)
	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Column(name = "JobTitle", length = 100)
	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Column(name = "RegionID")
	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Column(name = "ProvinceID")
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "CityID")
	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@Column(name = "DistrictID")
	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	@Column(name = "TOWN", length = 100)
	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Column(name = "ADDR1", length = 100)
	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	@Column(name = "ADDR2", length = 100)
	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	@Column(name = "ADDR3", length = 100)
	public String getAddr3() {
		return this.addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	@Column(name = "ZIP", length = 30)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "URG_Linkman", length = 30)
	public String getUrgLinkman() {
		return this.urgLinkman;
	}

	public void setUrgLinkman(String urgLinkman) {
		this.urgLinkman = urgLinkman;
	}

	@Column(name = "URG_TEL", length = 30)
	public String getUrgTel() {
		return this.urgTel;
	}

	public void setUrgTel(String urgTel) {
		this.urgTel = urgTel;
	}

	@Column(name = "Sec_Question1", length = 100)
	public String getSecQuestion1() {
		return this.secQuestion1;
	}

	public void setSecQuestion1(String secQuestion1) {
		this.secQuestion1 = secQuestion1;
	}

	@Column(name = "Sec_Question2", length = 100)
	public String getSecQuestion2() {
		return this.secQuestion2;
	}

	public void setSecQuestion2(String secQuestion2) {
		this.secQuestion2 = secQuestion2;
	}

	@Column(name = "Sec_Question3", length = 100)
	public String getSecQuestion3() {
		return this.secQuestion3;
	}

	public void setSecQuestion3(String secQuestion3) {
		this.secQuestion3 = secQuestion3;
	}

	@Column(name = "Sec_Answer1", length = 100)
	public String getSecAnswer1() {
		return this.secAnswer1;
	}

	public void setSecAnswer1(String secAnswer1) {
		this.secAnswer1 = secAnswer1;
	}

	@Column(name = "Sec_Answer2", length = 100)
	public String getSecAnswer2() {
		return this.secAnswer2;
	}

	public void setSecAnswer2(String secAnswer2) {
		this.secAnswer2 = secAnswer2;
	}

	@Column(name = "Sec_Answer3", length = 100)
	public String getSecAnswer3() {
		return this.secAnswer3;
	}

	public void setSecAnswer3(String secAnswer3) {
		this.secAnswer3 = secAnswer3;
	}

	@Column(name = "Sec_Password", length = 30)
	public String getSecPassword() {
		return this.secPassword;
	}

	public void setSecPassword(String secPassword) {
		this.secPassword = secPassword;
	}

	@Column(name = "Bind_Password", length = 30)
	public String getBindPassword() {
		return this.bindPassword;
	}

	public void setBindPassword(String bindPassword) {
		this.bindPassword = bindPassword;
	}

	@Column(name = "Status", nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Modify_Time", nullable = false, length = 19)
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Close_Date", length = 10)
	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getClass().getName()).append("@").append(" [");
		buffer.append("uid").append("='").append(getUid()).append("' ");
		buffer.append("userName").append("='").append(getUserName())
				.append("' ");
		buffer.append("userType").append("='").append(getUserType())
				.append("' ");
		buffer.append("idType").append("='").append(getIdType()).append("' ");
		buffer.append("idNo").append("='").append(getIdNo()).append("' ");
		buffer.append("cell").append("='").append(getCell()).append("' ");
		buffer.append("email").append("='").append(getEmail()).append("' ");
		buffer.append("cell2").append("='").append(getCell2()).append("' ");
		buffer.append("tel").append("='").append(getTel()).append("' ");
		buffer.append("fax").append("='").append(getFax()).append("' ");
		buffer.append("qq").append("='").append(getQq()).append("' ");
		buffer.append("weChat").append("='").append(getWeChat()).append("' ");
		buffer.append("nationality").append("='").append(getNationality())
				.append("' ");
		buffer.append("religion").append("='").append(getReligion())
				.append("' ");
		buffer.append("polityFace").append("='").append(getPolityFace())
				.append("' ");
		buffer.append("birthdate").append("='").append(getBirthdate())
				.append("' ");
		buffer.append("birthPlace").append("='").append(getBirthPlace())
				.append("' ");
		buffer.append("marriage").append("='").append(getMarriage())
				.append("' ");
		buffer.append("blood").append("='").append(getBlood()).append("' ");
		buffer.append("gender").append("='").append(getGender()).append("' ");
		buffer.append("height").append("='").append(getHeight()).append("' ");
		buffer.append("weight").append("='").append(getWeight()).append("' ");
		buffer.append("education").append("='").append(getEducation())
				.append("' ");
		buffer.append("gradSchool").append("='").append(getGradSchool())
				.append("' ");
		buffer.append("major").append("='").append(getMajor()).append("' ");
		buffer.append("graduationDate").append("='")
				.append(getGraduationDate()).append("' ");
		buffer.append("occupation").append("='").append(getOccupation())
				.append("' ");
		buffer.append("jobTitle").append("='").append(getJobTitle())
				.append("' ");
		buffer.append("regionId").append("='").append(getRegionId())
				.append("' ");
		buffer.append("provinceId").append("='").append(getProvinceId())
				.append("' ");
		buffer.append("cityId").append("='").append(getCityId()).append("' ");
		buffer.append("districtId").append("='").append(getDistrictId())
				.append("' ");
		buffer.append("town").append("='").append(getTown()).append("' ");
		buffer.append("addr1").append("='").append(getAddr1()).append("' ");
		buffer.append("addr2").append("='").append(getAddr2()).append("' ");
		buffer.append("addr3").append("='").append(getAddr3()).append("' ");
		buffer.append("zip").append("='").append(getZip()).append("' ");
		buffer.append("urgLinkman").append("='").append(getUrgLinkman())
				.append("' ");
		buffer.append("urgTel").append("='").append(getUrgTel()).append("' ");
		buffer.append("secQuestion1").append("='").append(getSecQuestion1())
				.append("' ");
		buffer.append("secQuestion2").append("='").append(getSecQuestion2())
				.append("' ");
		buffer.append("secQuestion3").append("='").append(getSecQuestion3())
				.append("' ");
		buffer.append("secAnswer1").append("='").append(getSecAnswer1())
				.append("' ");
		buffer.append("secAnswer2").append("='").append(getSecAnswer2())
				.append("' ");
		buffer.append("secAnswer3").append("='").append(getSecAnswer3())
				.append("' ");
		buffer.append("secPassword").append("='").append(getSecPassword())
				.append("' ");
		buffer.append("bindPassword").append("='").append(getBindPassword())
				.append("' ");
		buffer.append("status").append("='").append(getStatus()).append("' ");
		buffer.append("note").append("='").append(getNote()).append("' ");
		buffer.append("createTime").append("='").append(getCreateTime())
				.append("' ");
		buffer.append("modifyTime").append("='").append(getModifyTime())
				.append("' ");
		buffer.append("closeDate").append("='").append(getCloseDate())
				.append("' ");
		buffer.append("]");

		return buffer.toString();
	}

}
