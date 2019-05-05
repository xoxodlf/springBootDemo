
package com.example.demoPj.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Users {
	@Id
	@Column(name = "USERNO", unique = true, nullable = false)
    @SequenceGenerator(schema = "hr", name = "Users_Sequence" , sequenceName = "SEQ_USERS")
    @GeneratedValue(generator = "Users_Sequence", strategy = GenerationType.SEQUENCE)
	private int userNo;
	@Column
	private String uuid;
	@Column
	private String uPW;
	@Column
	private String uname;
	@Column
	private String udob;
	@Column
	private String uemail;
	@Column
	private String uaddr;
	
	@Builder
	public Users(String uuid, String uPW, String uName, String uDob, String uEmail, String uAddr) {
		this.uuid = uuid;
		this.uPW = uPW;
		this.uname = uName;
		this.udob = uDob;
		this.uemail = uEmail;
		this.uaddr = uAddr;
	}
}
