package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class App_Version  implements Serializable{
	//����һ��App�汾��Ϣ��
	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 1L;
	private int id;//���
	private int appid;//��Դ
	private String versionNo;//�汾��
	private String versionInfo;//�汾����
	private int publishStatus;//����״̬
	private String downloadLink;//��������
	private Float versionSize;//�汾��С
	private int createdBy;//����ʱ��
	private Date creationDate;//����ʱ��
	private int modifyBy;//�޸���
	private Date modifyDate;//����޸�ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionInfo() {
		return versionInfo;
	}
	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
	public int getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public Float getVersionSize() {
		return versionSize;
	}
	public void setVersionSize(Float versionSize) {
		this.versionSize = versionSize;
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
	
}
