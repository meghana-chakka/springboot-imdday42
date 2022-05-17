package com.jobiak.springbootimd.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
    @Id//primary key
	private Long accno;
	private String name;
	private double balance;
	
	public Long getAccno() {
		return accno;
	}
	public void setAccno(Long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
