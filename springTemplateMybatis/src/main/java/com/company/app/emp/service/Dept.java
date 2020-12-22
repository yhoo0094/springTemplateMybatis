package com.company.app.emp.service;

import lombok.Data;

@Data
public class Dept {
	Integer department_id;
	String department_name;
	Integer manager_id;
	Integer location_id;
}
