package com.whattoeattoday.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whattoeattoday.dao.DCDao;
import com.whattoeattoday.model.DCModel;

/**
 * 
 * @author raviksoni
 * 
 */
@Repository
public class DCDaoImpl implements DCDao {

	private static final Logger logger = LoggerFactory
			.getLogger(DCDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<DCModel> getDcList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<DCModel> dcList = session.createQuery("from DCModel").list();
		for (DCModel dc : dcList) {
			logger.info("DC List::" + dc);
		}
		return dcList;
	}

}
