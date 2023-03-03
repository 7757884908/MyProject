package StudentManagement;

import java.util.Scanner;

public class Student implements StudentInterface {
    private int rollNum;
    private String name;
    private String clgName;
    private String city;
    private double percentage;

    public Student(){

    }

    public Student(String name, String clgName, String city, double percentage) {
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
    }

    public Student(int rollNum, String name, String clgName, String city, double percentage) {
        this.rollNum = rollNum;
        this.name = name;
        this.clgName = clgName;
        this.city = city;
        this.percentage = percentage;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", clgName='" + clgName + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                '}';
    }

	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int roll) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int roll, String update, int ch, Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showAllStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean showStudentById(int roll) {
		// TODO Auto-generated method stub
		return false;
	}
}
