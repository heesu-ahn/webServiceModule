package com.webModule.webService.vo;

import java.util.Arrays;
import java.util.Date;

public class HumanResourceVo {
	@Override
	public String toString() {
		return "HumanResourceVo [loginIP=" + loginIP + ", loginId=" + loginId + ", Name=" + Name + ", NickName="
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
	protected String loginId;				// 로그인 ID
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
	protected String getLoginIP() {
		return loginIP;
	}
	/**
	 * @param loginIP the loginIP to set
	 */
	protected void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
	/**
	 * @return the loginId
	 */
	protected String getLoginId() {
		return loginId;
	}
	/**
	 * @param loginId the loginId to set
	 */
	protected void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * @return the name
	 */
	protected String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		Name = name;
	}
	/**
	 * @return the nickName
	 */
	protected String getNickName() {
		return NickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	protected void setNickName(String nickName) {
		NickName = nickName;
	}
	/**
	 * @return the password
	 */
	protected String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	protected void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emaiAddress
	 */
	protected String getEmaiAddress() {
		return emaiAddress;
	}
	/**
	 * @param emaiAddress the emaiAddress to set
	 */
	protected void setEmaiAddress(String emaiAddress) {
		this.emaiAddress = emaiAddress;
	}
	/**
	 * @return the mobilePhone
	 */
	protected String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	protected void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * @return the secondEmaiAddress
	 */
	protected String getSecondEmaiAddress() {
		return secondEmaiAddress;
	}
	/**
	 * @param secondEmaiAddress the secondEmaiAddress to set
	 */
	protected void setSecondEmaiAddress(String secondEmaiAddress) {
		this.secondEmaiAddress = secondEmaiAddress;
	}
	/**
	 * @return the nationality
	 */
	protected String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	protected void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * @return the engishTextName
	 */
	protected String getEngishTextName() {
		return engishTextName;
	}
	/**
	 * @param engishTextName the engishTextName to set
	 */
	protected void setEngishTextName(String engishTextName) {
		this.engishTextName = engishTextName;
	}
	/**
	 * @return the koreanTextName
	 */
	protected String getKoreanTextName() {
		return koreanTextName;
	}
	/**
	 * @param koreanTextName the koreanTextName to set
	 */
	protected void setKoreanTextName(String koreanTextName) {
		this.koreanTextName = koreanTextName;
	}
	/**
	 * @return the japaneseTextName
	 */
	protected String getJapaneseTextName() {
		return japaneseTextName;
	}
	/**
	 * @param japaneseTextName the japaneseTextName to set
	 */
	protected void setJapaneseTextName(String japaneseTextName) {
		this.japaneseTextName = japaneseTextName;
	}
	/**
	 * @return the chineseTextName
	 */
	protected String getChineseTextName() {
		return chineseTextName;
	}
	/**
	 * @param chineseTextName the chineseTextName to set
	 */
	protected void setChineseTextName(String chineseTextName) {
		this.chineseTextName = chineseTextName;
	}
	/**
	 * @return the homeAddress
	 */
	protected String getHomeAddress() {
		return homeAddress;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	protected void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	/**
	 * @return the gender
	 */
	protected String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	protected void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the companyName
	 */
	protected String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	protected void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the companyAddress
	 */
	protected String getCompanyAddress() {
		return companyAddress;
	}
	/**
	 * @param companyAddress the companyAddress to set
	 */
	protected void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	/**
	 * @return the dept
	 */
	protected String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	protected void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the jobPosition
	 */
	protected String getJobPosition() {
		return jobPosition;
	}
	/**
	 * @param jobPosition the jobPosition to set
	 */
	protected void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	/**
	 * @return the employmentStatus
	 */
	protected String getEmploymentStatus() {
		return employmentStatus;
	}
	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	protected void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	/**
	 * @return the previousCompanies
	 */
	protected String[] getPreviousCompanies() {
		return previousCompanies;
	}
	/**
	 * @param previousCompanies the previousCompanies to set
	 */
	protected void setPreviousCompanies(String[] previousCompanies) {
		this.previousCompanies = previousCompanies;
	}
	/**
	 * @return the birthDay
	 */
	protected String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	protected void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the birthDate
	 */
	protected Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	protected void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the employmentDate
	 */
	protected Date getEmploymentDate() {
		return employmentDate;
	}
	/**
	 * @param employmentDate the employmentDate to set
	 */
	protected void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}
	/**
	 * @return the departureDate
	 */
	protected Date getDepartureDate() {
		return departureDate;
	}
	/**
	 * @param departureDate the departureDate to set
	 */
	protected void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	/**
	 * @return the birthYear
	 */
	protected Integer getBirthYear() {
		return birthYear;
	}
	/**
	 * @param birthYear the birthYear to set
	 */
	protected void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * @return the age
	 */
	protected Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	protected void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the careear
	 */
	protected Integer getCareear() {
		return careear;
	}
	/**
	 * @param careear the careear to set
	 */
	protected void setCareear(Integer careear) {
		this.careear = careear;
	}
	/**
	 * @return the wight
	 */
	protected Float getWeight() {
		return weight;
	}
	/**
	 * @param wight the wight to set
	 */
	protected void setWeight(Float weight) {
		this.weight = weight;
	}
	/**
	 * @return the height
	 */
	protected Float getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	protected void setHeight(Float height) {
		this.height = height;
	}
}
