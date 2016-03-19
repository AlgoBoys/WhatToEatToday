package com.whattoeattoday.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whattoeattoday.dao.MenuDao;
import com.whattoeattoday.model.MenuModel;

/**
 * 
 * @author raviksoni
 * 
 */
@Repository
public class MenuDaoImpl implements MenuDao {

	private static final Logger logger = LoggerFactory
			.getLogger(VendorDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<MenuModel> getMenuList(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<MenuModel> menuList = session.createQuery(
				"from MenuModel m where m.vendorModel = " + id + " order by m.isLunch").list();
		for (MenuModel menu : menuList) {
			logger.info("Menu List::" + menu);
		}
		return menuList;
	}

}
