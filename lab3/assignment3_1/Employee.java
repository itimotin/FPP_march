package assignment3_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;

	// constructor
	public Employee(String aName, String aNickName, double aSalary, int aYear, int aMonth, int aDay) {
		this.name = aName;
		this.nickName = aNickName;
		this.salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		this.hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		this.nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}


	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s";

	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}
