package com.Servicecenter.repo;


import com.Servicecenter.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepo extends JpaRepository<Rider,Integer> {
}
