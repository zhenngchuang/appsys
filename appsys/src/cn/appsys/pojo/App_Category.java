package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class App_Category implements Serializable{
	//����һ��APP�����
	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 1L;
	private int id;//
	private String categoryCode;//�������
	private String categoryName;//��������
	private int parentld;//�����ڵ�
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentld() {
		return parentld;
	}
	public void setParentld(int parentld) {
		this.parentld = parentld;
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
