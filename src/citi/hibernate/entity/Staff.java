package citi.hibernate.entity;
// Generated Aug 24, 2017 9:35:40 PM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Staff generated by hbm2java
 */
public class Staff implements java.io.Serializable {

	private String soeid;
	private String name;
	private String location;
	private String unit;
	private String team;
	private Boolean isadmin;
	private Set orderses = new HashSet(0);

	public Staff() {
	}

	public Staff(String soeid) {
		this.soeid = soeid;
	}

	public Staff(String soeid, String name, Boolean isadmin,String location, String unit, String team, Set orderses) {
		this.soeid = soeid;
		this.name = name;
		this.location = location;
		this.unit = unit;
		this.team = team;
		this.isadmin = isadmin;
		this.orderses = orderses;
	}
	public Staff(String soeid, String name, Boolean isadmin,String location, String unit, String team) {
		this.soeid = soeid;
		this.name = name;
		this.location = location;
		this.unit = unit;
		this.team = team;
		this.isadmin = isadmin;
	}
	public Staff(String soeid, Boolean isadmin) {
		this.soeid = soeid;
		this.isadmin = isadmin;
	}
	public String getSoeid() {
		return this.soeid;
	}

	public void setSoeid(String soeid) {
		this.soeid = soeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Boolean getIsadmin() {
		return this.isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}
	public boolean isNeedUpdate(Staff staff) {
        if(this.name.equals(staff.name)&& this.location.equals(staff.location) && this.unit.equals(staff.unit)&& this.team.equals(staff.team)) {
        	return false;
        }else {
        	return true;
        }
		
	}

}
