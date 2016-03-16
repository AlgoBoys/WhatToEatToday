package com.whattoeattoday.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whattoeattoday.dao.DCDao;
import com.whattoeattoday.model.DCModel;
import com.whattoeattoday.service.DCService;

/**
 * 
 * @author ravikson
 * 
 */
@Service
public class DCServiceImpl implements DCService {

	private DCDao dcDao;

	@Autowired
	public void setDcDao(DCDao dcDao) {
		this.dcDao = dcDao;
	}

	@Transactional
	public List<DCModel> getDcList() {
		return this.dcDao.getDcList();
	}
}
