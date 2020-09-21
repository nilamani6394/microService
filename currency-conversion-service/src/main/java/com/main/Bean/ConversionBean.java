package com.main.Bean;

import java.math.BigDecimal;

public class ConversionBean {
	private int id;
	private String from;
	private String to;
	private BigDecimal conversationmultople;
	private BigDecimal quantity;
	private BigDecimal totalCalamount;
	private int port;
	
	public ConversionBean() {}

	public ConversionBean(int id, String from, String to, BigDecimal conversationmultople, BigDecimal quantity,
			BigDecimal totalCalamount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversationmultople = conversationmultople;
		this.quantity = quantity;
		this.totalCalamount = totalCalamount;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversationmultople() {
		return conversationmultople;
	}

	public void setConversationmultople(BigDecimal conversationmultople) {
		this.conversationmultople = conversationmultople;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalamount() {
		return totalCalamount;
	}

	public void setTotalCalamount(BigDecimal totalCalamount) {
		this.totalCalamount = totalCalamount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
