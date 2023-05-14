package com.main.Apotek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.main.Apotek.model.Obat;
import com.main.Apotek.model.ObatCategory;
import com.main.Apotek.service.ObatService;


@Controller
@RequestMapping("home")
public class ObatController {
	
	private final ObatService obatService;
	
	@Autowired
	public ObatController(ObatService obatService) {
		this.obatService = obatService;
	}
	
	@GetMapping("/daftar-obat")
	public String tampilkanDaftarObat(Model model) {
		List<Obat> obat = obatService.getAllObat();
		model.addAttribute("listobat", obat);
	
		return "daftar-obat";
	}
	
	// @PostMapping("/addObat")
	// public String addObat(@RequestParam("name") String name, @RequestParam("keterangan") String keterangan, @RequestParam("category") String category, @RequestParam("amount") String amount, @RequestParam("harga") String harga) {
		
	// 	BigDecimal Harga = new BigDecimal(harga);
	// 	Obat obat = new Obat(name, keterangan, ObatCategory.valueOf(category.toUpperCase()), Integer.parseInt(amount), Harga);
	// 	obatService.addObat(obat);
	// 	return "daftarObat";
	// }

	// @PostMapping("/deleteObat")
	// public String delObat(@RequestParam("id") String id){
	// 	obatService.deleteObat(id);
	// 	return "daftarObat";
	// }

	// @PostMapping("/editObat")
	// public String putObat(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("keterangan") String keterangan, @RequestParam("category") String category, @RequestParam("amount") String amount, @RequestParam("harga") String harga){
	// 	Obat obat = obatService.getPaketById(id);
	// 	BigDecimal Harga = new BigDecimal(harga);
	// 	obat.setObatName(name);
	// 	obat.setObatKeterangan(keterangan);
	// 	obat.setObatCategory(ObatCategory.valueOf(category.toUpperCase()));
	// 	obat.setObatAmount(Integer.parseInt(amount));
	// 	obat.setObatHarga(Harga);

	// 	obatService.updateObat(obat);

	// 	return "daftarObat";
	// }
	


	// @GetMapping("/tampilkanAddObat")
	// public String tampilkanAddObat(Model model) {

	// 	return "addObat";
	// }

	// @GetMapping("/tampilkanEditObat")
	// public String tampilkanEditObat(Model model) {

	// 	return "editObat";
	// }

	}


