package com.bboss.product.entity;

public class CharacterEntity {
    
	private String id;
	private String skuNum;
    private String alias;
    private String backOptionalFlag;
    private String bizCharEnumSpecLst;
    private String charName;
    private String charNum;
    private String charType;
    private String charValue;
    private String groupNum;
    private String optionalFlag;
    private String placeHolder;
    private String prodordAttachFiles;
    private String promptFlag;
    private String promptInfo;
    private String readonly;
    private String regular;
    private String toBossFlag;
	public CharacterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CharacterEntity(String id, String skuNum, String alias, String backOptionalFlag, String bizCharEnumSpecLst,
			String charName, String charNum, String charType, String charValue, String groupNum, String optionalFlag,
			String placeHolder, String prodordAttachFiles, String promptFlag, String promptInfo, String readonly,
			String regular, String toBossFlag) {
		super();
		this.id = id;
		this.skuNum = skuNum;
		this.alias = alias;
		this.backOptionalFlag = backOptionalFlag;
		this.bizCharEnumSpecLst = bizCharEnumSpecLst;
		this.charName = charName;
		this.charNum = charNum;
		this.charType = charType;
		this.charValue = charValue;
		this.groupNum = groupNum;
		this.optionalFlag = optionalFlag;
		this.placeHolder = placeHolder;
		this.prodordAttachFiles = prodordAttachFiles;
		this.promptFlag = promptFlag;
		this.promptInfo = promptInfo;
		this.readonly = readonly;
		this.regular = regular;
		this.toBossFlag = toBossFlag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSkuNum() {
		return skuNum;
	}
	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getBackOptionalFlag() {
		return backOptionalFlag;
	}
	public void setBackOptionalFlag(String backOptionalFlag) {
		this.backOptionalFlag = backOptionalFlag;
	}
	public String getBizCharEnumSpecLst() {
		return bizCharEnumSpecLst;
	}
	public void setBizCharEnumSpecLst(String bizCharEnumSpecLst) {
		this.bizCharEnumSpecLst = bizCharEnumSpecLst;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public String getCharNum() {
		return charNum;
	}
	public void setCharNum(String charNum) {
		this.charNum = charNum;
	}
	public String getCharType() {
		return charType;
	}
	public void setCharType(String charType) {
		this.charType = charType;
	}
	public String getCharValue() {
		return charValue;
	}
	public void setCharValue(String charValue) {
		this.charValue = charValue;
	}
	public String getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	public String getOptionalFlag() {
		return optionalFlag;
	}
	public void setOptionalFlag(String optionalFlag) {
		this.optionalFlag = optionalFlag;
	}
	public String getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
	}
	public String getProdordAttachFiles() {
		return prodordAttachFiles;
	}
	public void setProdordAttachFiles(String prodordAttachFiles) {
		this.prodordAttachFiles = prodordAttachFiles;
	}
	public String getPromptFlag() {
		return promptFlag;
	}
	public void setPromptFlag(String promptFlag) {
		this.promptFlag = promptFlag;
	}
	public String getPromptInfo() {
		return promptInfo;
	}
	public void setPromptInfo(String promptInfo) {
		this.promptInfo = promptInfo;
	}
	public String getReadonly() {
		return readonly;
	}
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}
	public String getRegular() {
		return regular;
	}
	public void setRegular(String regular) {
		this.regular = regular;
	}
	public String getToBossFlag() {
		return toBossFlag;
	}
	public void setToBossFlag(String toBossFlag) {
		this.toBossFlag = toBossFlag;
	}
	@Override
	public String toString() {
		return "CharacterEntity [id=" + id + ", skuNum=" + skuNum + ", alias=" + alias + ", backOptionalFlag="
				+ backOptionalFlag + ", bizCharEnumSpecLst=" + bizCharEnumSpecLst + ", charName=" + charName
				+ ", charNum=" + charNum + ", charType=" + charType + ", charValue=" + charValue + ", groupNum="
				+ groupNum + ", optionalFlag=" + optionalFlag + ", placeHolder=" + placeHolder + ", prodordAttachFiles="
				+ prodordAttachFiles + ", promptFlag=" + promptFlag + ", promptInfo=" + promptInfo + ", readonly="
				+ readonly + ", regular=" + regular + ", toBossFlag=" + toBossFlag + "]";
	}
	
}
