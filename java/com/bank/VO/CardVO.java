package com.bank.VO;

public class CardVO {
	private String cardno;
	private String cardkind;
	private String rmn;
	private String cardname;
	private String exprday;
	private String pwd;
	private String lmtmoney;
	private String accountno;
	private String custno;
	private String DELBIT;
	private String REG_T;
	private String REG_ID;
	private String MOD_T;
	private String MOD_ID;
	
	public CardVO(String cardno, String cardkind, String rmn, String cardname, String exprday, String pw,
			String lmtmoney, String accountno, String custno, String DELBIT,
			 String REG_T,
			 String REG_ID,
			 String MOD_T,
			 String MOD_ID) {
		// TODO Auto-generated constructor stub
		super();
		this.setCardno(cardno);
		this.setCardkind(cardkind);
		this.setRmn(rmn);
		this.setCardname(cardname);
		this.setExprday(exprday);
		this.setPwd(pw);
		this.setLmtmoney(lmtmoney);
		this.setAccountno(accountno);
		this.setCustno(custno);
		this.setDELBIT(DELBIT);
		this.setMOD_ID(MOD_ID);
		this.setMOD_T(MOD_T);
		this.setREG_T(REG_T);
		this.setREG_ID(REG_ID);
	}
	
	public CardVO(String accountno) {
		// TODO Auto-generated constructor stub
		super();	
		this.setAccountno(accountno);
	}
	public CardVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCardkind() {
		return cardkind;
	}
	public void setCardkind(String cardkind) {
		this.cardkind = cardkind;
	}
	public String getRmn() {
		return rmn;
	}
	public void setRmn(String rmn) {
		this.rmn = rmn;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getExprday() {
		return exprday;
	}
	public void setExprday(String exprday) {
		this.exprday = exprday;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLmtmoney() {
		return lmtmoney;
	}
	public void setLmtmoney(String lmtmoney) {
		this.lmtmoney = lmtmoney;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCustno() {
		return custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
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
}
