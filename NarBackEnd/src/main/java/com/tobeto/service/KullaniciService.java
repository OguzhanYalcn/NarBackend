package com.tobeto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Kullanicilar;
import com.tobeto.repository.KullanicilarRepository;

import jakarta.transaction.Transactional;

@Service
public class KullaniciService {
	@Autowired
	private KullanicilarRepository kullanicilarRepository;

	@Transactional
	public Optional<Kullanicilar> getKullanici(String adi) {
		Optional<Kullanicilar> kullanicilar = kullanicilarRepository.findByKullaniciAdi(adi);
		if (kullanicilar.isPresent()) {
			kullanicilar.get().getRollers();
		}
		return kullanicilar;
	}

}