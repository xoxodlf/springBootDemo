package com.example.demoPj.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsersSaveRequestDto {
	private String uuid;
	private String uPW;
	private String uName;
	private String uDob;
	private String uEmail;
	private String uAddr;
	
	public Users toEntity() {
		return Users.builder().
				uuid(uuid)
				.uAddr(uAddr)
				.uDob(uDob)
				.uEmail(uEmail)
				.uName(uName)
				.uPW(uPW)
				.build();
				
	}

	@Override
	public String toString() {
		return "UsersSaveRequestDto [uuid=" + uuid + ", uPW=" + uPW + ", uName=" + uName + ", uDob=" + uDob
				+ ", uEmail=" + uEmail + ", uAddr=" + uAddr + "]";
	}
}
