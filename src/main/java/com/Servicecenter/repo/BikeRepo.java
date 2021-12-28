package com.Servicecenter.repo;

import com.Servicecenter.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepo extends JpaRepository<Bike ,Integer> {
}
