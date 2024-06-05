package app.employeeapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
    int eid;
    String ename;
    int esalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
    
}
