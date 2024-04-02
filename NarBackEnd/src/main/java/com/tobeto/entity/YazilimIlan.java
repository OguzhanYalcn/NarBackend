package com.tobeto.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * The persistent class for the yazilim_ilan database table.
 * 
 */
@Entity
@Table(name = "yazilim_ilan")
@NamedQuery(name = "YazilimIlan.findAll", query = "SELECT y FROM YazilimIlan y")
@Data
@ToString(exclude = "kullanicilar")
@EqualsAndHashCode(exclude = "kullanicilar")
public class YazilimIlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "is_tanimi")
	private String isTanimi;

	private String isim;

	private String soyisim;

	private String sure;

	private BigDecimal ucret;

	@Column(name = "yazilim_dili")
	private short yazilimDili;

	@ManyToOne
	@JoinColumn(name = "kullanici_id")
	private Kullanicilar kullanicilar;

}