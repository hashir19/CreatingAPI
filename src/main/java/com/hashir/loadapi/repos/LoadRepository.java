package com.hashir.loadapi.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashir.loadapi.entity.LoadEntity;

public interface LoadRepository extends JpaRepository<LoadEntity, Long> {

	List<LoadEntity> findByShipperId(String shipperId);

}
