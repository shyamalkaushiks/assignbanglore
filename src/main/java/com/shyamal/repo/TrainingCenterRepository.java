package com.shyamal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shyamal.model.TrainingCenter;
@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long>{

}
