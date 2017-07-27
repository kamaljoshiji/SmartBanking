package com.hcl.smart.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_account")
public class CustomerAccount implements Serializable {

	/**
	 * Customer account
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "accountid")
	private int accountId;
	@Column(name = "accounttype")
	private String accountType;
	@Column(name = "accountbalance")
	private String accountBalance;
	@Column(name = "customerid")
	private String customerid;
	

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
