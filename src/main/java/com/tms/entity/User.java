package com.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User implements Serializable{


	/**
	 * 
//@AllArgsConstructor
//@NoArgsConstructor	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	@Column(nullable = false, length = 30)
	private String name;
	
	@Column(nullable = false, length = 30)
	private String password;

	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne//(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id")//, referencedColumnName ="deptid", insertable = true, updatable = true, nullable = false)
	private Department department;
	
	
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@OneToMany(targetEntity=Ticket.class, mappedBy = "user_id", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//	@JsonIgnore
//	private Set<Ticket> ticket_user;
//	
//	
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@OneToMany(targetEntity=Ticket.class, mappedBy = "assignee_id", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//	private Set<Ticket> ticket_assignee;
	
	@Override
	public String toString() {
		return  name + " (" + department + ")";
	}

	public User() {
	}
		
	public User(int uid, String name, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
	}

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return the ticket_user
	 */
//	public Set<Ticket> getTicket_user() {
//		return ticket_user;
//	}
//
//	/**
//	 * @param ticket_user the ticket_user to set
//	 */
//	public void setTicket_user(Set<Ticket> ticket_user) {
//		this.ticket_user = ticket_user;
//	}
//
//	/**
//	 * @return the ticket_assignee
//	 */
//	public Set<Ticket> getTicket_assignee() {
//		return ticket_assignee;
//	}
//
//	/**
//	 * @param ticket_assignee the ticket_assignee to set
//	 */
//	public void setTicket_assignee(Set<Ticket> ticket_assignee) {
//		this.ticket_assignee = ticket_assignee;
//	}

	
}