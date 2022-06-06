package com.bank.VO;

public class AccountVO {
	private String accountno;
	private String accountmoney;
	private String interest;	
	private String custno;
	private String DELBIT;
	private String REG_T;
	private String REG_ID;
	private String MOD_T;
	private String MOD_ID;
	
	
	public AccountVO(String accountno, String accountmoney, String interest, String loc,String DELBIT,
			 String REG_T,
			 String REG_ID,
			 String MOD_T,
			 String MOD_ID) {
		// TODO Auto-generated constructor stub
		super();
		this.setAccountno(accountno);
		this.setAccountmoney(accountmoney);
		this.setInterest(interest);
		this.setDELBIT(DELBIT);
		this.setMOD_ID(MOD_ID);
		this.setMOD_T(MOD_T);
		this.setREG_T(REG_T);
		this.setREG_ID(REG_ID);
	}
	public AccountVO(String accountno) {
		// TODO Auto-generated constructor stub
		super();
		this.setAccountno(accountno);		
	}
	public AccountVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getAccountmoney() {
		return accountmoney;
	}
	public void setAccountmoney(String accountmoney) {
		this.accountmoney = accountmoney;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getDELBIT() {
		return DELBIT;
	}
	public void setDELBIT(String dELBIT) {
		DELBIT = dELBIT;
	}
	public String getREG_T() {
		return REG_T;
	}
	public void setREG_T(String rEG_T) {
		REG_T = rEG_T;
	}
	public String getREG_ID() {
		return REG_ID;
	}
	public void setREG_ID(String rEG_ID) {
		REG_ID = rEG_ID;
	}
	public String getMOD_T() {
		return MOD_T;
	}
	public void setMOD_T(String mOD_T) {
		MOD_T = mOD_T;
	}
	public String getMOD_ID() {
		return MOD_ID;
	}
	public void setMOD_ID(String mOD_ID) {
		MOD_ID = mOD_ID;
	}
	public String getCustno() {
		return custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
	}
}
