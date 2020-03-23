package com.faith.app.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faith.app.repository.IQualificationRepository;
import com.faith.app.model.QualificationModel;


@Service
public class QualificationServiceImplementation implements IQualificationService {

	@Autowired
	private IQualificationRepository qualRepo;

	@Transactional
	@Override
	public QualificationModel addQualification(QualificationModel qual) {

		return qualRepo.save(qual);
	}

	
	//list qualifications
	@Override
	public List<QualificationModel> listQualifications() {
		
		return qualRepo.findAll();
	}
}
	