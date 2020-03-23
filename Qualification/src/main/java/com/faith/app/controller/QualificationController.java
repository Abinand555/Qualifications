package com.faith.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.faith.app.model.QualificationModel;
import com.faith.app.service.QualificationServiceImplementation;


@CrossOrigin
@RestController
@RequestMapping("/")

public class QualificationController {           //RestController

	@Autowired
	private QualificationServiceImplementation qualService;

	//add qualification
	@PostMapping("/qualification")
	public ResponseEntity<QualificationModel> addQualifications(@RequestBody QualificationModel qual)
	{
		return new ResponseEntity<QualificationModel>(qualService.addQualification(qual),HttpStatus.OK);

	}
	
	//list qualifications
	@GetMapping("/qualifications")
	public ResponseEntity<List<QualificationModel>> getAllQualifications() {
		return new ResponseEntity<List<QualificationModel>>(qualService.listQualifications(),HttpStatus.OK);

	}
}
