package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionId;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public UUID getSectionId() {
		return SectionId;
	}
	public void setSectionId(UUID sectionId) {
		SectionId = sectionId;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}

	private Enrollment(){
	}
	public Enrollment(UUID StudentID, UUID SectionID)
	{
		this.StudentID = StudentID;
		this.SectionId = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
}
