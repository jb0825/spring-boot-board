package com.springdemo.bootboard.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class MailVO {

	private int mailIdx;
	private String receiver;
	private String sender;
	private String title;
	private String contents;
	private String readYn;
	private String deletedYn;
	private Date mailDate;
	
}
