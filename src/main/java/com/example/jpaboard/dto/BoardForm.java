package com.example.jpaboard.dto;
// DTO: 데이터 전송 객체

import com.example.jpaboard.entity.Board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardForm {
	private Integer no;
	private String title;
	private String content;
	
	// 폼으로 받은 데이터를 Entity(Board) 객체로 변환해 주는 메서드
	// DB에 저장하거나 수정할 때는 반드시 Entity 타입으로 넘겨야 함
	public Board toEntity() {
		Board entity = new Board();
		entity.setNo(this.no);
		entity.setTitle(this.title);
		entity.setContent(this.content);
		return entity;
	}
	
	// DB와 통신하는 레포지토리(JPA)는 반드시 Entity 타입을 다룸
	// Entity란? JPA가 DB 테이블이라고 인정한 객체
	// DTO는 직접 연결되어있지 않아서 Entity 타입으로 넘기는 것
}
