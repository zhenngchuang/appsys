package cn.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

public class Ad_Promotion  implements Serializable{
	//����һ�������Ϣ��
	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 1L;
	private int id ;//���
	private int appld;// APPid���
	private String adPicPath;//���ͼƬ�洢·��
	private int adPV;//�������
	private int carouselPosition;//�ֲ�λ
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
	public int getAppld() {
		return appld;
	}
	public void setAppld(int appld) {
		this.appld = appld;
	}
	public String getAdPicPath() {
		return adPicPath;
	}
	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}
	public int getAdPV() {
		return adPV;
	}
	public void setAdPV(int adPV) {
		this.adPV = adPV;
	}
	public int getCarouselPosition() {
		return carouselPosition;
	}
	public void setCarouselPosition(int carouselPosition) {
		this.carouselPosition = carouselPosition;
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
