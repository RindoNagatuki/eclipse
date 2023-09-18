package com.example.app.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Snsdata { 
	private Integer id;
	
	
	private String name;
	
	private String userName;
	private String snsName;
	
	@NotBlank(message = "このURLは既に登録されています")
	private String url;
	

}
