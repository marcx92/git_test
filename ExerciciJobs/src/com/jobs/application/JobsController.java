package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;

	public JobsController() {

		repository = new EmployeeRepository();
	}

	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}

	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee employee = new Employee(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth)
			throws Exception {
		Employee manager = new Employee(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);

	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}

	public void payAllEmployeers() {
		for (AbsStaffMember m : repository.getAllMembers())
			m.pay();
	}

	public List<DTOStaffMember> getAllEmployees() throws Exception {
		List<DTOStaffMember> employees = new ArrayList<>();
		for (AbsStaffMember m : repository.getAllMembers()) {
			employees.add(new DTOStaffMember(m));

		}
		return employees;

	}

	public List<Double> getAllPayments() {
		List<Double> payments = new ArrayList<>();
		for (AbsStaffMember m : repository.getAllMembers()) {
			payments.add(m.getTotalPaid());

		}
		return payments;

	}
}
