package com.Investify.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class InvestorInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String mobileNo;
	private String mailId;
//	private String panId;
	
	private String startupname;
	private String investmentAmount;
	 
	private String username;
	
	private String password;
	@ManyToOne
	private StartUpInfo startUpInfo;
	
	

	
	
	public InvestorInfo(Long id, String name, String mobileNo, String mailId, String startupname,
			String investmentAmount, String username, String password, StartUpInfo startUpInfo) {
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.startupname = startupname;
		this.investmentAmount = investmentAmount;
		this.username = username;
		this.password = password;
		this.startUpInfo = startUpInfo;
	}





	public Long getInvestorId() {
		return id;
	}





	public void setInvestorId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getMobileNo() {
		return mobileNo;
	}





	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}





	public String getMailId() {
		return mailId;
	}





	public void setMailId(String mailId) {
		this.mailId = mailId;
	}





	public String getStartupname() {
		return startupname;
	}





	public void setStartupname(String startupname) {
		this.startupname = startupname;
	}





	public String getInvestmentAmount() {
		return investmentAmount;
	}





	public void setInvestmentAmount(String investmentAmount) {
		this.investmentAmount = investmentAmount;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public StartUpInfo getStartUpInfo() {
		return startUpInfo;
	}





	public void setStartUpInfo(StartUpInfo startUpInfo) {
		this.startUpInfo = startUpInfo;
	}





	public InvestorInfo() {
		
	}
	
	
}
