package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class App_Info  implements Serializable{
	//����һ���汾������Ϣ��
	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 1L;
	private int id;//APP���
	private String softwareName;//�������
	private String APKName;//APK����
	private String supportRom;//֧��ROM
	private String interfaceLanguage;//��������
	private  Float softwareSize;//�����С
	private Date updateDate;//����ʱ��
	private int devld;//������ID
	private String appinfo;//Ӧ�ü��
	private int status;//��ǰ״̬
	private Date inSaleDate;//�ϼ�ʱ��
	private Date offSaleDate;//�¼�ʱ��
	private int flatformld;//����ƽ̨
	private int categoryLevel3;//������������
	private int downloads;//������
	private int createdBy;//����ʱ��
	private Date creationDate;//����ʱ��
	private int modifyBy;//�޸���
	private Date modifyDate;//����޸�ʱ��
	private int categoryLevel1;//����һ������
	private int categoryLevel2;//������������
	private String logoPicPath;//LogoͼƬurl��ַ
	private String logoLocPath;//LOGoͼƬ���λ��
	private int versionld;//���°汾ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportRom() {
		return supportRom;
	}
	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public Float getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(Float softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getDevld() {
		return devld;
	}
	public void setDevld(int devld) {
		this.devld = devld;
	}
	public String getAppinfo() {
		return appinfo;
	}
	public void setAppinfo(String appinfo) {
		this.appinfo = appinfo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getInSaleDate() {
		return inSaleDate;
	}
	public void setInSaleDate(Date inSaleDate) {
		this.inSaleDate = inSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public int getFlatformld() {
		return flatformld;
	}
	public void setFlatformld(int flatformld) {
		this.flatformld = flatformld;
	}
	public int getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(int categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(int categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public int getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(int categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public int getVersionld() {
		return versionld;
	}
	public void setVersionld(int versionld) {
		this.versionld = versionld;
	}
	
	
	
	
}
