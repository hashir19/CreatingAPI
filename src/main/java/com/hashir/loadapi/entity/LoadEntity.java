package com.hashir.loadapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "load")
public class LoadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "load_id")
	private long loadId;

	@Column(name = "loading_point")
	private String loadingPoint;
	@Column(name = "unloading_point")
	private String unloadingPoint;
	@Column(name = "product_type")
	private String productType;
	@Column(name = "truck_type")
	private String truckType;
	@Column(name = "no_of_trucks")
	private int noOfTrucks;
	@Column(name = "weight")
	private int weight;
	@Column(name = "comment")
	private String comment;
	@Column(name = "shipper_id")
	private String shipperId;

	@JsonFormat(pattern = "dd-mm-yyyy", shape = Shape.STRING)
	@Column(name = "date")
	private String date;

	public long getLoadId() {
		return loadId;
	}

	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "LoadEntity [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}

}
