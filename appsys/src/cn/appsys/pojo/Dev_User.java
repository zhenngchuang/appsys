package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dev_User implements Serializable {
	/**
	 * ���л�ʵ����
	 */
	private static final long serialVersionUID = 1L;
	//����һ���������û���
	private int id; //���
	private String devCode;//�������˺�
	private String devName;//����������
	private String devPassword;//����������
	private String devEmail;//����
	private int createdBy;//�������
	private Date creationDate;//����ʱ��
	private int modifBy;//�޸��˱��
	private Date modifyDate;//�޸�ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDevCode() {
		return devCode;
	}
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
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
	public int getModifBy() {
		return modifBy;
	}
	public void setModifBy(int modifBy) {
		this.modifBy = modifBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
