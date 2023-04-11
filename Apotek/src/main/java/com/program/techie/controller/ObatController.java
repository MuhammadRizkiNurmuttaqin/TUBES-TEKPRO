package com.program.techie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.program.techie.model.Obat;
import com.program.techie.service.ObatService;



@RestController
@RequestMapping("/api/Obat")
public class ObatController {
	
	private final ObatService obatService;
	
	public ObatController(ObatService obatService) {
		this.obatService = obatService;
	}
	
	@PostMapping
	public ResponseEntity<Obat> addObat(@RequestBody Obat obat) {
		obatService.addObat(obat);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping
	public ResponseEntity<Obat> updateObat(@RequestBody Obat obat) {
		obatService.updateObat(obat);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<Obat>> getAllObat() {
		return ResponseEntity.ok(obatService.getAllObat());
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<Obat> getObatByName(@PathVariable String name) {
		return ResponseEntity.ok(obatService.getObatByName(name));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Obat> deleteObat(@PathVariable String id) {
		obatService.deleteObat(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	
}


