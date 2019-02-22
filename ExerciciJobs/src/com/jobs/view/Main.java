package com.jobs.view;

import java.util.List;

import com.jobs.application.DTOStaffMember;
import com.jobs.application.JobsController;


public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Lluis Boss", "Carrer Sense Nom, 44", "666666666", 100.0);
		controller.createEmployee("Jaume Employee", "Carrer Anónim, 87", "665266666", 40.0);
		controller.createEmployee("Clara Employee", "Carrer Brontosaure, 432", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Carrer Belloc, 3", "614266666", "Sense sou");
		controller.createManagerEmployee("Sara Employee", "Carrer Major, 99", "665226666", 80.0);

		controller.payAllEmployeers();

	
		List<DTOStaffMember> allEmployees = controller.getAllEmployees();


		for (DTOStaffMember d: allEmployees) {
			
			
			System.out.println( "Treballador: " + d.getName() + " rep un sou total de:   " + d.getTotalPaid());
		}
	}
}
