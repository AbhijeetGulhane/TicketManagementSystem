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

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	@Column(nullable=false, length=500)
	private String description;
	
	@Column(length=30)
	private String timestamp;

	@Column(nullable=false)
	private String status;
	
	@Column(nullable=false)
	private String priority;
	
	@Column
	private String solution;

	//@ManyToOne(fetch = FetchType.LAZY, optional = false)

	@Autowired
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(optional = false)
    @JoinColumn(name = "user_id",referencedColumnName = "uid", insertable = true, updatable = true, nullable = false)
	private User user_id;
	

	@Autowired
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(optional = false)
    @JoinColumn(name = "assignee_id",referencedColumnName = "uid", insertable = true, updatable = true)
	private User assignee_id;
	
	
	public Ticket() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int tid, String description, String timestamp, String status, String priority, String solution,
			User user_id, User assignee_id) {
		super();
		this.tid = tid;
		this.description = description;
		this.timestamp = timestamp;
		this.status = status;
		this.priority = priority;
		this.solution = solution;
		this.user_id = user_id;
		this.assignee_id = assignee_id;
	}

	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the user_id
	 */
	public User getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the assignee_id
	 */
	public User getAssignee_id() {
		return assignee_id;
	}

	/**
	 * @param assignee_id the assignee_id to set
	 */
	public void setAssignee_id(User assignee_id) {
		this.assignee_id = assignee_id;
	}

	/**
	 * @return the solution
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * @param solution the solution to set
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
}