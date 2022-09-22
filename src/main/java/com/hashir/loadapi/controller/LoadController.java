package com.hashir.loadapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hashir.loadapi.entity.LoadEntity;
import com.hashir.loadapi.repos.LoadRepository;

@Controller
public class LoadController {
	
	@Autowired
	private LoadRepository loadRepo;
	
	@PostMapping("/load")
	public ResponseEntity<LoadEntity> saveLoad(@RequestBody LoadEntity loadEntity) {
		return new ResponseEntity<LoadEntity>(loadRepo.save(loadEntity),HttpStatus.OK);
	}
	
	@GetMapping("/load")
	public ResponseEntity<List<LoadEntity>> findAllLoad(){
		return new ResponseEntity<List<LoadEntity>>(loadRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/load/shipperId")
	public ResponseEntity<List<LoadEntity>> findByShipperId(@RequestParam String shipperId ){
		return new ResponseEntity<List<LoadEntity>>(loadRepo.findByShipperId(shipperId),HttpStatus.OK);
	}
	
	@GetMapping("load/{loadId}")
	public ResponseEntity<LoadEntity> findByLoadId(@RequestParam Long loadId){
		return new ResponseEntity<LoadEntity>(loadRepo.findById(loadId).get(),HttpStatus.OK);
	}
	
	@PutMapping("/load")
	public ResponseEntity<LoadEntity> updateLoad(@RequestBody LoadEntity loadEntity) {
		return new ResponseEntity<LoadEntity>(loadRepo.save(loadEntity),HttpStatus.OK);
	}
     
	@DeleteMapping("/load/{loadId}")
	@ResponseBody
	public void deleteLoad(@RequestParam(value="loadId") Long loadId) {
		loadRepo.deleteById(loadId);
	}
}

