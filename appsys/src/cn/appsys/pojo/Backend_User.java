package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class Backend_User implements Serializable {
	//����һ����̨�û��б�
	/**
	 * ���л�ʵ����
	 */
	private static final long serialVersionUID = 1L;
	private int id; //���
	private String userCode;//�û����
	private String userName;//�û�����
	private String userPassword;//�û�����
	private int userType;//�û���ɫ����
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
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
