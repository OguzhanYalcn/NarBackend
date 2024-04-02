package com.tobeto.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * The persistent class for the kullanicilar database table.
 * 
 */
@Entity
@NamedQuery(name = "Kullanicilar.findAll", query = "SELECT k FROM Kullanicilar k")
@Data
@ToString(exclude = { "rollers", "yazilimIlans" })
@EqualsAndHashCode(exclude = { "rollers", "yazilimIlans" })
public class Kullanicilar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "kullanici_adi")
	private String kullaniciAdi;

	private String sifre;

	// bi-directional many-to-many association to Roller
	@ManyToMany(mappedBy = "kullanicilars")
	private List<Roller> rollers;

	@OneToMany(mappedBy = "kullanicilar")
	private List<YazilimIlan> yazilimIlans;

}