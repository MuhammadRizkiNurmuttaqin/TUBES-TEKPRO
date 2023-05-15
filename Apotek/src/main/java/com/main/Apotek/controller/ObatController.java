package com.main.Apotek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.main.Apotek.model.Obat;
import com.main.Apotek.model.ObatCategory;
import com.main.Apotek.repository.ObatRepository;
import com.main.Apotek.service.ObatService;


@Controller
@RequestMapping
public class ObatController {
	
	private final ObatService obatService;
	
	@Autowired
	public ObatController(ObatService obatService) {
		this.obatService = obatService;
	}
	
	@GetMapping("/redirect-daftar-obat")
	public String redirectDaftarObat(Model model) {
		List<Obat> obat = obatService.getAllObat();
		model.addAttribute("obat", obat);
	
		return "daftar-obat";
	}

	@GetMapping("/redirect-tambah-obat")
	public String redirectTambahObat(Model model) {
		
		return "tambah-obat";
	}

	@GetMapping(path = {"/edit/{id}"})
	public String redirectEditObat(Model model, @PathVariable("id") String id) {
		if(id.isEmpty()){
			Mono<Obat> obat = ObatRepository
		}
		return "edit-obat";
	}

	@GetMapping("/redirect-pesan-obat")
	public String redirectPesanObat(Model model) {
		
		return "pesan-obat";
	}

	@PostMapping("/tambah-obat")
	public String tambahObat(@RequestParam("name") String name, @RequestParam("keterangan") String keterangan, @RequestParam("category") String category, @RequestParam("amount") String amount, @RequestParam("harga") String harga){
		
		BigDecimal Harga = new BigDecimal(harga);

		Obat obat = new Obat(name, keterangan, ObatCategory.valueOf(category.toUpperCase()) , Integer.parseInt(amount), Harga);
		
		obatService.addObat(obat);

		return "daftar-obat";
	}

	@PostMapping("/edit-obat")
	public String tambahObat(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("keterangan") String keterangan, @RequestParam("category") String category, @RequestParam("amount") String amount, @RequestParam("harga") String harga){
		Obat obat = obatService.getPaketById(id);
		BigDecimal Harga = new BigDecimal(harga);
		obat.setObatName(name);
		obat.setObatKeterangan(keterangan);
		obat.setObatCategory(ObatCategory.valueOf(category.toUpperCase()));
		obat.setObatAmount(Integer.parseInt(amount));
		obat.setObatHarga(Harga);

		obatService.updateObat(obat);

		return "daftar-obat";
	}
	
	@GetMapping("/delete-obat/{id}")
	public String deleteObat(@PathVariable("id") String id) {
		
		obatService.deleteObat(id);
		
		return "redirect:/redirect-daftar-obat";
	}

	}


