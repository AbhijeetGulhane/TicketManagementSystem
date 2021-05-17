package com.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "departments")
public class Department implements Serializable{

    /**
	 * 
	 * 
	 *
//@AllArgsConstructor
//@NoArgsConstructor
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptid;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable=false)
    private int accesslevel;
	
    @Column
    private String sub_department;
	
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//	private Set<User> users;
	
	
	public Department() {	
	}
	
	public Department(int deptid, String name, int accesslevel, String sub_department) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.accesslevel = accesslevel;
		this.sub_department = sub_department;
	}

	/**
	 * @return the deptid
	 */
	public int getDeptid() {
		return deptid;
	}

	/**
	 * @param deptid the deptid to set
	 */
	public void setDeptid(int deptid) {
		this.deptid = deptid;
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
	 * @return the accesslevel
	 */
	public int getAccesslevel() {
		return accesslevel;
	}

	/**
	 * @param accesslevel the accesslevel to set
	 */
	public void setAccesslevel(int accesslevel) {
		this.accesslevel = accesslevel;
	}

	/**
	 * @return the subDepartment
	 */
	public String getSubDepartment() {
		return sub_department;
	}

	/**
	 * @param subDepartment the subDepartment to set
	 */
	public void setSubDepartment(String sub_department) {
		this.sub_department = sub_department;
	}

	@Override
	public String toString() {
		return name + " ( " + sub_department + " )";
	}


}