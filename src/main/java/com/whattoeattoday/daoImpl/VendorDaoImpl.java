package com.whattoeattoday.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whattoeattoday.dao.VendorDao;
import com.whattoeattoday.model.VendorModel;

/**
 * 
 * @author raviksoni
 * 
 */
@Repository
public class VendorDaoImpl implements VendorDao {

	private static final Logger logger = LoggerFactory
			.getLogger(VendorDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<VendorModel> getVendorList(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<VendorModel> vendorList = session.createQuery(
				"from VendorModel v where v.dcModel = " + id).list();
		for (VendorModel vendor : vendorList) {
			logger.info("Vendor List::" + vendor);
		}
		return vendorList;
	}

	@SuppressWarnings("unchecked")
	public List<VendorModel> getDcListForAdmin() {
		Session session = this.sessionFactory.getCurrentSession();
		List<VendorModel> vendorList = session
				.createQuery("from VendorModel v").list();
		for (VendorModel vendor : vendorList) {
			logger.info("Vendor List::" + vendor);
		}
		return vendorList;
	}

}
