package com.jobs.application;

import com.jobs.domain.AbsStaffMember;

public class DTOStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid = 0;

	private static int COUNTER_MEMBERS = 1;

	public DTOStaffMember(AbsStaffMember staffmember) throws Exception {
		if (staffmember == null)
			throw new Exception();

		this.name = staffmember.getName();
		this.address = staffmember.getAddress();
		this.phone = staffmember.getPhone();
		this.totalPaid=staffmember.getTotalPaid();
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public static int getCOUNTER_MEMBERS() {
		return COUNTER_MEMBERS;
	}
}
