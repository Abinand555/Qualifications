package com.faith.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.faith.app.model.QualificationModel;

//Repository Interface
public interface IQualificationRepository extends JpaRepositoryImplementation<QualificationModel,Integer> {

	
}