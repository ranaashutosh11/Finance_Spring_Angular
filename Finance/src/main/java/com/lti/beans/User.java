package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	private int userId;
	
	@Column(length=10)
	private String userName;
	
	private int userPhone;
	
	@Column(length=20)
	private String userEmail;
	
	@Column(length=10)	
	private String userPass;
	
	@Column(length=10)
	private String userConfirmPass;
	
	@Column(length=30)
	private String userAdd;
	
	private double userSalary;
	
	@Column(length=10)
	private String userCard;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserConfirmPass() {
		return userConfirmPass;
	}

	public void setUserConfirmPass(String userConfirmPass) {
		this.userConfirmPass = userConfirmPass;
	}

	public String getUserAdd() {
		return userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public double getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}

	public String getUserCard() {
		return userCard;
	}

	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}

	public User(int userId, String userName, int userPhone, String userEmail, String userPass, String userConfirmPass,
			String userAdd, double userSalary, String userCard) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.userConfirmPass = userConfirmPass;
		this.userAdd = userAdd;
		this.userSalary = userSalary;
		this.userCard = userCard;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userEmail="
				+ userEmail + ", userPass=" + userPass + ", userConfirmPass=" + userConfirmPass + ", userAdd=" + userAdd
				+ ", userSalary=" + userSalary + ", userCard=" + userCard + "]";
	}
	
	
}
