package com.lti.beans;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*insert into Users (user_Id,user_Name,user_Phone,user_Email,user_Pass,user_Confirm_Pass,user_Add,user_Salary,user_Card)
  values (401,'Nikhil',56235412,'abc@gmail.com','qwerty123','qwerty123','agra',120000,'Gold'); */
@Entity
@Table(name = "Users")
public class User {

	@Id
	private int userId;

	@Column(length = 10)
	private String userName;

	private long userPhone;

	@Column(length = 20)
	private String userEmail;

	@Column(length = 10)
	private String userPass;

	@Column(length = 10)
	private String userConfirmPass;

	@Column(length = 30)
	private String userAdd;

	private double userSalary;

	@Column(length = 10)
	private String userCard;

	@Column(name = "isverified")
	private boolean isVerified = false;

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

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
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

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public User(int userId, String userName, long userPhone, String userEmail, String userPass, String userConfirmPass,
			String userAdd, double userSalary, String userCard, boolean isVerified ) {
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
		this.isVerified = isVerified;
		
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userEmail="
				+ userEmail + ", userPass=" + userPass + ", userConfirmPass=" + userConfirmPass + ", userAdd=" + userAdd
				+ ", userSalary=" + userSalary + ", userCard=" + userCard + ", isVerified=" + isVerified + "]";
	}

	

		
	


}