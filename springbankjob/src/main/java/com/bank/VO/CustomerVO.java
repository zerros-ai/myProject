package com.bank.VO;

public class CustomerVO {
	private String name;
	private String post;
	private String addr;
	private String credrate;
	private String custno;
	private String DELBIT;
	private String REG_T;
	private String REG_ID;
	private String MOD_T;
	private String MOD_ID;
	
	public CustomerVO(String custno, String name, String post, String addr, String credrate, String DELBIT,
	 String REG_T,
	 String REG_ID,
	 String MOD_T,
	 String MOD_ID)
	{
		super();
		this.setName(name);
		this.setPost(post);
		this.setAddr(addr);
		this.setCredrate(credrate);
		this.setCustno(custno);
		this.setDELBIT(DELBIT);
		this.setMOD_ID(MOD_ID);
		this.setMOD_T(MOD_T);
		this.setREG_T(REG_T);
		this.setREG_ID(REG_ID);
		
	}
	
	public CustomerVO(String custno)
	{
		super();
		this.setCustno(custno);
		
	}			
	public CustomerVO(String name, String post, String addr, String credrate, String custno, String dELBIT) {
		super();
		this.name = name;
		this.post = post;
		this.addr = addr;
		this.credrate = credrate;
		this.custno = custno;
		this.DELBIT = dELBIT;
	}

	public CustomerVO()
	{}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCredrate() {
		return credrate;
	}
	public void setCredrate(String credrate) {
		this.credrate = credrate;
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
