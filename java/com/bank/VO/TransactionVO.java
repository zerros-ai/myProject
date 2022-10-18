package com.bank.VO;

public class TransactionVO {
	private String cardno;
	private String transdate;
	private String transtime;
	private String transplace;
	private String transamount;
	private String loc;
	private String transno;
	private String DELBIT;
	private String REG_T;
	private String REG_ID;
	private String MOD_T;
	private String MOD_ID;
	private String cancelno;
	
	public TransactionVO(String transno, String cardno, String transdate, String transtime, String transplace,
			String transamount, String loc,String DELBIT,
			 String REG_T,
			 String REG_ID,
			 String MOD_T,
			 String MOD_ID) {
		// TODO Auto-generated constructor stub
		super();
		this.setCardno(cardno);
		this.setTransdate(transdate);
		this.setTranstime(transtime);
		this.setTransplace(transplace);
		this.setTransamount(transamount);
		this.setTransno(transno);
		this.setLoc(loc);
		this.setDELBIT(DELBIT);
		this.setMOD_ID(MOD_ID);
		this.setMOD_T(MOD_T);
		this.setREG_T(REG_T);
		this.setREG_ID(REG_ID);
	}
	
	public TransactionVO(String transno) {
		// TODO Auto-generated constructor stub
		super();
		this.setTransno(transno);
		
	}
	public TransactionVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public String getTranstime() {
		return transtime;
	}
	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}
	public String getTransplace() {
		return transplace;
	}
	public void setTransplace(String transplace) {
		this.transplace = transplace;
	}
	public String getTransamount() {
		return transamount;
	}
	public void setTransamount(String transamount) {
		this.transamount = transamount;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
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
	public String getCancelno() {
		return cancelno;
	}
	public void setCancelno(String cancelno) {
		this.cancelno = cancelno;
	}

	public String getTransno() {
		return transno;
	}

	public void setTransno(String transno) {
		this.transno = transno;
	}
}
