package com.faith.app.service;

import java.util.List;

import com.faith.app.model.QualificationModel;

//Interface
public interface IQualificationService {

	public QualificationModel addQualification(QualificationModel qual);

	
	public List<QualificationModel> listQualifications();

	

}
