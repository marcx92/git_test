package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	public String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);

	}

	
	@Override
	public void pay() {
	}

	@Override
	public double pay(double salaryPerMonth) {
		return 0;
	}

}
