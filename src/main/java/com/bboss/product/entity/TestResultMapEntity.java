package com.bboss.product.entity;

public class TestResultMapEntity {
    private String  doCharName;
    private String  doCharNum;
    private String  doCharType;
    private String  doCharDisplay;
    private String  doReadonly;
	public TestResultMapEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestResultMapEntity(String doCharName, String doCharNum, String doCharType, String doCharDisplay,
			String doReadonly) {
		super();
		this.doCharName = doCharName;
		this.doCharNum = doCharNum;
		this.doCharType = doCharType;
		this.doCharDisplay = doCharDisplay;
		this.doReadonly = doReadonly;
	}
	public String getDoCharName() {
		return doCharName;
	}
	public void setDoCharName(String doCharName) {
		this.doCharName = doCharName;
	}
	public String getDoCharNum() {
		return doCharNum;
	}
	public void setDoCharNum(String doCharNum) {
		this.doCharNum = doCharNum;
	}
	public String getDoCharType() {
		return doCharType;
	}
	public void setDoCharType(String doCharType) {
		this.doCharType = doCharType;
	}
	public String getDoCharDisplay() {
		return doCharDisplay;
	}
	public void setDoCharDisplay(String doCharDisplay) {
		this.doCharDisplay = doCharDisplay;
	}
	public String getDoReadonly() {
		return doReadonly;
	}
	public void setDoReadonly(String doReadonly) {
		this.doReadonly = doReadonly;
	}
	@Override
	public String toString() {
		return "TestResultMapEntity [doCharName=" + doCharName + ", doCharNum=" + doCharNum + ", doCharType="
				+ doCharType + ", doCharDisplay=" + doCharDisplay + ", doReadonly=" + doReadonly + "]";
	} 
} 
