package com.shyamal.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shyamal.model.TrainingCenter;
import com.shyamal.service.TrainingCenterService;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {
	 @Autowired
	    private TrainingCenterService service;

	    @PostMapping
	    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
	        TrainingCenter savedCenter = service.createTrainingCenter(center);
	        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
	    }

	    @GetMapping
	    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
	        List<TrainingCenter> centers = service.getAllTrainingCenters();
	        return new ResponseEntity<>(centers, HttpStatus.OK);
	    }
	}
	
