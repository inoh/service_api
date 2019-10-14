package com.example.demo;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TableController {
	@RequestMapping(value="/table")
	public TableId index() {
		return new TableId();
	}
	
}

@Data
class TableId {
	private String tableId;
	
	public TableId() {
		super();
		tableId = "550e8400-e29b-41d4-a716-446655440000";
	}
	
}