package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qualification") 

public class QualificationModel {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
    //local decleration
	private int qualificationId;
	private String qualificationName;
	
	
	//Getters and Setters
	public int getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	
	
	//ToString
	@Override
	public String toString() {
		return "Qualification [qualificationId=" + qualificationId + ", qualificationName=" + qualificationName + "]";
	}
	

}
