package com.springdemo.bootboard.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int boardIdx;
	private String title;
	private String contents;
	private int hitCount;
	private Date createdDatetime;
	private String creatorId;
	private Date updatedDatetime;
	private String updaterId;
	private String deletedYn;
	
}
