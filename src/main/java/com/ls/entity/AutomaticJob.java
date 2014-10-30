package com.ls.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job")
public class AutomaticJob implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2676258363138538790L;
	@Id
	@GeneratedValue
	protected Integer id;
	protected String type;
	protected String name;
	protected String clientIp;
	protected String start;
	protected String stop;
	protected String lastGrabStart;
	protected String lastGrabEnd;
	protected String username;
	protected String password;
	protected String status;
	protected String interval;
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
	
	public String getClientIp() {
	
		return clientIp;
	}
	
	public void setClientIp(String clientIp) {
	
		this.clientIp = clientIp;
	}
	
	public String getStart() {
	
		return start;
	}
	
	public void setStart(String start) {
	
		this.start = start;
	}
	
	public String getStop() {
	
		return stop;
	}
	
	public void setStop(String stop) {
	
		this.stop = stop;
	}

	
	public String getType() {
	
		return type;
	}
	
	public void setType(String type) {
	
		this.type = type;
	}

	
	public String getLastGrabStart() {
	
		return lastGrabStart;
	}

	
	public void setLastGrabStart(String lastGrabStart) {
	
		this.lastGrabStart = lastGrabStart;
	}

	
	public String getLastGrabEnd() {
	
		return lastGrabEnd;
	}

	
	public void setLastGrabEnd(String lastGrabEnd) {
	
		this.lastGrabEnd = lastGrabEnd;
	}

	
	public String getUsername() {
	
		return username;
	}

	
	public void setUsername(String username) {
	
		this.username = username;
	}

	
	public String getPassword() {
	
		return password;
	}

	
	public void setPassword(String password) {
	
		this.password = password;
	}

	
	public String getStatus() {
	
		return status;
	}

	
	public void setStatus(String status) {
	
		this.status = status;
	}

	public String getInterval() {
	
		return interval;
	}
	
	public void setInterval(String interval) {
	
		this.interval = interval;
	}

}
