package com.tobeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.YazilimIlan;
import com.tobeto.repository.YazilimIlanRepository;

@Service
public class IlanService {
	@Autowired
	private YazilimIlanRepository yazilimIlanRepository;

	public YazilimIlan yazilimIlanVer(YazilimIlan yazilimIlan) {
		return yazilimIlanRepository.save(yazilimIlan);
	}

}