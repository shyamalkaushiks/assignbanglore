package com.shyamal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shyamal.model.TrainingCenter;
import com.shyamal.repo.TrainingCenterRepository;

@Service
public class TrainingCenterService {

	 @Autowired
	    private TrainingCenterRepository repository;
	 
	 public TrainingCenter createTrainingCenter(TrainingCenter center) {

	        center.setCreatedOn(System.currentTimeMillis());
	        return repository.save(center);
	    }
	 public List<TrainingCenter> getAllTrainingCenters() {
	        return repository.findAll();
	    }
	}
	 

