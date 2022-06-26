package com.zensar.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Adverties;
import com.zensar.db.AdvertiesDAO;

@Service
public class AdvertiesService {

	@Autowired
	AdvertiesDAO dao;

	public Adverties addAdveries(Adverties adverties) {
		return this.dao.save(adverties);
	}

	public List<Adverties> getAllAdverties(Adverties adverties) {
		return this.dao.findAll();
	}

	public Adverties updateAdvertise(Adverties ad, Integer id) {
		Optional<Adverties> advertise = dao.findById(id);
		if (advertise != null) {
			return dao.save(ad);
		}
		return null;
	}

	public Adverties getAdvertisesById(Integer id) {
		Optional<Adverties> advertise = dao.findById(id);
		if (advertise.isPresent()) {
			return advertise.get();
		} else {
			return null;
		}
	}
	
	public boolean deleteAdvertiseById(Integer id) {
		dao.deleteById(id);
		if (dao.findById(id) != null) {
			return false;
		}
		return true;
	}
}
