package dto;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = -213112312313123L;
	
	public Product() {
		super();
	}
	
	private String productId;
	private String pname;
	private Integer unitPrice;
	private String decription;
	private String manufacturer;
	private String category;
	private long unitInStock;
	private String condition;
	
	
	
	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getpname() {
		return pname;
	}
	public void setpname(String pname) {
		this.pname = pname;
	}
	
	public Integer getunitPrice() {
		return unitPrice;
	}
	public void setunitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getdecription() {
		return decription;
	}
	public void setdecription(String decription) {
		this.decription = decription;
	}
	
	public String getmanufacturer() {
		return manufacturer;
	}
	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	
	public long getunitInStock() {
		return unitInStock;
	}
	public void setunitInStock(long unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	public String getcondition() {
		return condition;
	}
	public void setcondition(String condition) {
		this.condition = condition;
	}
}


















