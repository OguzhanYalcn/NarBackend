package com.tobeto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Kullanicilar;
import com.tobeto.repository.KullanicilarRepository;

@Service
public class KullaniciService {
	@Autowired
	private KullanicilarRepository kullanicilarRepository;

	public Optional<Kullanicilar> getKullanici(String adi) {
		return kullanicilarRepository.findByKullaniciAdi(adi);
	}

}