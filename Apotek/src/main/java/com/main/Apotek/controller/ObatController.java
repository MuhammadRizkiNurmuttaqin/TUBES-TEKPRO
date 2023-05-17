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

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.main.Apotek.model.Obat;
import com.main.Apotek.model.ObatCategory;
import com.main.Apotek.repository.ObatRepository;
import com.main.Apotek.service.ObatService;
import org.springframework.validation.BindingResult;


@Controller
@RequestMapping
public class ObatController {
	
	private final ObatService obatService;
	
	@Autowired
	public ObatController(ObatService obatService) {
		this.obatService = obatService;
	}
	
	//List Obat
	@GetMapping("/redirect-daftar-obat")
	public String redirectDaftarObat(Model model) {
		List<Obat> obat = obatService.getAllObat();
		model.addAttribute("obat", obat);
	
		return "daftar-obat";
	}

	//Go to Page tambah obat
	@GetMapping("/redirect-tambah-obat")
	public String redirectTambahObat() {
		
		return "tambah-obat";
	}

	//Go to pesan obat
	@GetMapping("/redirect-pesan-obat")
	public String redirectPesanObat(Model model) {
		List<Obat> obat = obatService.getAllObat();
		model.addAttribute("obat", obat);

		return "pesan-obat";
	}

	//Menambahkan obat ke database
	@PostMapping("/tambah-obat")
	public String tambahObat(@RequestParam("name") String name, @RequestParam("keterangan") String keterangan, @RequestParam("category") String category, @RequestParam("amount") String amount, @RequestParam("harga") String harga){
		
		BigDecimal Harga = new BigDecimal(harga);

		Obat obat = new Obat(name, keterangan, ObatCategory.valueOf(category.toUpperCase()) , Integer.parseInt(amount), Harga);
		
		obatService.addObat(obat);

		return "daftar-obat";
	}

	@GetMapping("/redirect-edit-obat/{id}")
		public String redirectEditObat(Model model, @PathVariable("id") String id){
			Obat obat = obatService.getObatById(id);
			model.addAttribute("obat", obat);
			return "edit-obat";
		}
	

	@PostMapping("/save-obat")
	public String saveObat(Obat obat) {
		obatService.updateObat(obat);
		return "redirect:/redirect-daftar-obat";
	}
	
	//Delete Obat
	@GetMapping("/delete-obat/{id}")
	public String deleteObat(@PathVariable("id") String id) {
		
		obatService.deleteObat(id);
		
		return "redirect:/redirect-daftar-obat";
	}
	

	}
  

