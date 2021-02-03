package com.haust.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "logic_flag")
	private Integer logicFlag;
	
	
	public User(Integer id, String name, Integer logicFlag) {
		super();
		this.id = id;
		this.name = name;
		this.logicFlag = logicFlag;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLogicFlag() {
		return logicFlag;
	}
	public void setLogicFlag(Integer logicFlag) {
		this.logicFlag = logicFlag;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", logicFlag=" + logicFlag + "]";
	}
	
	
}
