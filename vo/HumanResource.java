package com.webModule.webService.vo;

import java.util.Arrays;
import java.util.Date;

public class HumanResource {
	@Override
	public String toString() {
		return "HumanResource [loginIP=" + loginIP + ", loginID=" + loginID + ", Name=" + Name + ", NickName="
				+ NickName + ", password=" + password + ", emaiAddress=" + emaiAddress + ", mobilePhone=" + mobilePhone
				+ ", secondEmaiAddress=" + secondEmaiAddress + ", nationality=" + nationality + ", engishTextName="
				+ engishTextName + ", koreanTextName=" + koreanTextName + ", japaneseTextName=" + japaneseTextName
				+ ", chineseTextName=" + chineseTextName + ", homeAddress=" + homeAddress + ", gender=" + gender
				+ ", companyName=" + companyName + ", companyAddress=" + companyAddress + ", dept=" + dept
				+ ", jobPosition=" + jobPosition + ", employmentStatus=" + employmentStatus + ", previousCompanies="
				+ Arrays.toString(previousCompanies) + ", birthDay=" + birthDay + ", birthDate=" + birthDate
				+ ", employmentDate=" + employmentDate + ", departureDate=" + departureDate + ", birthYear=" + birthYear
				+ ", age=" + age + ", careear=" + careear + ", weight=" + weight + ", height=" + height + "]";
	}
	protected String loginIP;				// 로그인 IP
	protected String loginID;				// 로그인 ID
	protected String Name;					// 성명
	protected String NickName;				// 별칭
	protected String password;				// 비밀번호
	protected String emaiAddress;			// 이메일
	protected String mobilePhone;			// 전화 번호
	protected String secondEmaiAddress;		// 제 2 이메일 주소
	protected String nationality;			// 국적
	protected String engishTextName; 		// 영어
	protected String koreanTextName; 		// 한글
	protected String japaneseTextName; 		// 일본어
	protected String chineseTextName; 		// 한자
	protected String homeAddress; 			// 자택 주소
	protected String gender; 				// 성별
	protected String companyName; 			// 회사명
	protected String companyAddress; 		// 회사주소
	protected String dept; 					// 부서
	protected String jobPosition; 			// 직위
	protected String employmentStatus;		// 재직 상태
	protected String [] previousCompanies;	// 이전 재직 회사
	protected String birthDay; 				// 생년월일(제출용)
	protected Date birthDate; 				// 생일 (날짜) 매년 사용할 날짜
	protected Date employmentDate; 			// 입사일
	protected Date departureDate; 			// 퇴사일
	protected Integer birthYear; 			// 생년
	protected Integer age; 					// 나이
	protected Integer careear; 				// 경력 총합
	protected Float weight;					// 체중
	protected Float height; 				// 신장
	
	/**
	 * @return the loginIP
	 */
	public String getLoginIP() {
		return loginIP;
	}
	/**
	 * @param loginIP the loginIP to set
	 */
	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
	/**
	 * @return the loginId
	 */
	public String getLoginID() {
		return loginID;
	}
	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return NickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emaiAddress
	 */
	public String getEmaiAddress() {
		return emaiAddress;
	}
	/**
	 * @param emaiAddress the emaiAddress to set
	 */
	public void setEmaiAddress(String emaiAddress) {
		this.emaiAddress = emaiAddress;
	}
	/**
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the secondEmaiAddress
	 */
	public String getSecondEmaiAddress() {
		return secondEmaiAddress;
	}
	/**
	 * @param secondEmaiAddress the secondEmaiAddress to set
	 */
	public void setSecondEmaiAddress(String secondEmaiAddress) {
		this.secondEmaiAddress = secondEmaiAddress;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the engishTextName
	 */
	public String getEngishTextName() {
		return engishTextName;
	}
	/**
	 * @param engishTextName the engishTextName to set
	 */
	public void setEngishTextName(String engishTextName) {
		this.engishTextName = engishTextName;
	}
	/**
	 * @return the koreanTextName
	 */
	public String getKoreanTextName() {
		return koreanTextName;
	}
	/**
	 * @param koreanTextName the koreanTextName to set
	 */
	public void setKoreanTextName(String koreanTextName) {
		this.koreanTextName = koreanTextName;
	}
	/**
	 * @return the japaneseTextName
	 */
	public String getJapaneseTextName() {
		return japaneseTextName;
	}
	/**
	 * @param japaneseTextName the japaneseTextName to set
	 */
	public void setJapaneseTextName(String japaneseTextName) {
		this.japaneseTextName = japaneseTextName;
	}
	/**
	 * @return the chineseTextName
	 */
	public String getChineseTextName() {
		return chineseTextName;
	}
	/**
	 * @param chineseTextName the chineseTextName to set
	 */
	public void setChineseTextName(String chineseTextName) {
		this.chineseTextName = chineseTextName;
	}
	/**
	 * @return the homeAddress
	 */
	public String getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}
	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the jobPosition
	 */
	public String getJobPosition() {
		return jobPosition;
	}
	/**
	 * @param jobPosition the jobPosition to set
	 */
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	/**
	 * @return the employmentStatus
	 */
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	/**
	 * @return the previousCompanies
	 */
	public String[] getPreviousCompanies() {
		return previousCompanies;
	}
	/**
	 * @param previousCompanies the previousCompanies to set
	 */
	public void setPreviousCompanies(String[] previousCompanies) {
		this.previousCompanies = previousCompanies;
	}
	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the employmentDate
	 */
	public Date getEmploymentDate() {
		return employmentDate;
	}
	/**
	 * @param employmentDate the employmentDate to set
	 */
	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}
	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	/**
	 * @return the birthYear
	 */
	public Integer getBirthYear() {
		return birthYear;
	}
	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the careear
	 */
	public Integer getCareear() {
		return careear;
	}
	/**
	 * @param careear the careear to set
	 */
	public void setCareear(Integer careear) {
		this.careear = careear;
	}
	/**
	 * @return the wight
	 */
	public Float getWeight() {
		return weight;
	}
	/**
	 * @param wight the wight to set
	 */
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	/**
	 * @return the height
	 */
	public Float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Float height) {
		this.height = height;
	}
}
