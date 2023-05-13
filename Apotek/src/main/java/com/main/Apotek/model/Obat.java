package com.main.Apotek.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document("obat")
public class Obat {
	@Id
	private String id;
	@Field(name = "name")
	@Indexed(unique = true)
	private String obatName;
	@Field(name = "keterangan")
	private String obatKeterangan;
	@Field(name = "category")
	private ObatCategory obatCategory;
	@Field(name = "amount")
	private int obatAmount;
	@Field(name = "harga")
	private BigDecimal obatHarga;

	public Obat(){
		
	}

	public Obat(String id, String obatName, String obatKeterangan, ObatCategory obatCategory, int obatAmount,
			BigDecimal obatHarga) {
		this.id = id;
		this.obatName = obatName;
		this.obatKeterangan = obatKeterangan;
		this.obatCategory = obatCategory;
		this.obatAmount = obatAmount;
		this.obatHarga = obatHarga;
	}

	public Obat(String obatName, String obatKeterangan, ObatCategory obatCategory, int obatAmount,
			BigDecimal obatHarga) {
		this.obatName = obatName;
		this.obatKeterangan = obatKeterangan;
		this.obatCategory = obatCategory;
		this.obatAmount = obatAmount;
		this.obatHarga = obatHarga;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObatName() {
		return obatName;
	}

	public void setObatName(String obatName) {
		this.obatName = obatName;
	}

	public String getObatKeterangan() {
		return obatKeterangan;
	}

	public void setObatKeterangan(String obatKeterangan) {
		this.obatKeterangan = obatKeterangan;
	}

	public ObatCategory getObatCategory() {
		return obatCategory;
	}

	public void setObatCategory(ObatCategory obatCategory) {
		this.obatCategory = obatCategory;
	}

	public int getObatAmount() {
		return obatAmount;
	}

	public void setObatAmount(int obatAmount) {
		this.obatAmount = obatAmount;
	}

	public BigDecimal getObatHarga() {
		return obatHarga;
	}

	public void setObatHarga(BigDecimal obatHarga) {
		this.obatHarga = obatHarga;
	}
}

