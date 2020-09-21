 package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sensex")
public class ExchangeValue {
	@Id
	private int id;
	@Column(name="exch_frm")
	private String from;
	@Column(name="exch_to")
	private String to;
	private BigDecimal conversationmultople;
	private int port;
	

	public ExchangeValue() {
		
	}
	
	public ExchangeValue(int id, String from, String to, BigDecimal conversationmultople) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversationmultople = conversationmultople;
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
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
