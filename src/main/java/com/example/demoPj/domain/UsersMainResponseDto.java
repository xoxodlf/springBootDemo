package com.example.demoPj.domain;

import lombok.Getter;

@Getter
public class UsersMainResponseDto {
	private int userNo;
	private String uuid;
	private String upw;
	private String uname;
	private String udob;
	private String uaddr;
	private String uemail;
	
	public UsersMainResponseDto(Users entity) {
		userNo = entity.getUserNo();
		uuid = entity.getUuid();
		upw = entity.getUPW();
		uname = entity.getUname();
		udob = entity.getUdob();
		uaddr = entity.getUaddr();
		uemail = entity.getUemail();
	}

	@Override
	public String toString() {
		return "UsersMainResponseDto [userNo=" + userNo + ", uuid=" + uuid + ", upw=" + upw + ", uname=" + uname
				+ ", udob=" + udob + ", uaddr=" + uaddr + ", uemail=" + uemail + "]";
	}
	
}
