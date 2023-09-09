package com.flip.html.model;

public class InputDTO {
	
	private String timeStamp;
	private double amount;
	private String orderProduct;
	private String email;
	private String status;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

   
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}
	public InputDTO() {
		super();
	}
	@Override
	public String toString() {
		return "InputDTO [timeStamp=" + timeStamp + ", amount=" + amount + ", orderProduct=" + orderProduct + "]";
	}
	
	
	

}
