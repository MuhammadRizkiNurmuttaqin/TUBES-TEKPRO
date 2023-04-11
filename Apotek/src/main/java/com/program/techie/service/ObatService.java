package com.program.techie.service;

import com.program.techie.model.Obat;
import com.program.techie.repository.ObatRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ObatService {
	private final ObatRepository obatRepository;
	public ObatService(ObatRepository obatRepository) {
		this.obatRepository = obatRepository;
	}

	public void addObat(Obat obat) {
		obatRepository.insert(obat);
	}

	public void updateObat(Obat obat) {
		Obat savedExpense = obatRepository.findById(obat.getId())
				.orElseThrow(() -> new RuntimeException(
						String.format("Cannot Find Expense by ID %s", obat.getId())));
		
		savedExpense.setObatName(obat.getObatName());
		savedExpense.setObatCategory(obat.getObatCategory());
		savedExpense.setObatAmount(obat.getObatAmount());
		savedExpense.setObatKeterangan(obat.getObatKeterangan());
		savedExpense.setObatHarga(obat.getObatHarga());
		
		obatRepository.save(obat);
	}
	
	public List<Obat> getAllObat() {
		return obatRepository.findAll();
	}

	public Obat getObatByName(String name) {
		return obatRepository.findByName(name).orElseThrow(() -> new RuntimeException(
				String.format("Cannot Find Obat by Name %s", name)));
	}

	public void deleteObat(String id) {
		obatRepository.deleteById(id);
	}
	
	
}

