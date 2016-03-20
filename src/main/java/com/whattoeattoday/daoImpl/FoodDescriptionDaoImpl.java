package com.whattoeattoday.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whattoeattoday.dao.FoodDescriptionDao;
import com.whattoeattoday.model.IngrediantsModel;
import com.whattoeattoday.model.MenuIngrediantsQuantityTable;

/**
 * 
 * @author raviksoni
 * 
 */
@Repository
public class FoodDescriptionDaoImpl implements FoodDescriptionDao {

	private static final Logger logger = LoggerFactory
			.getLogger(FoodDescriptionDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<MenuIngrediantsQuantityTable> getListOfMenuIngrediantsQuatity(
			int menuId) {
		Session session = this.sessionFactory.getCurrentSession();
		List<MenuIngrediantsQuantityTable> menuIngrediantsQuantityList = session
				.createQuery(
						"from MenuIngrediantsQuantityTable m where m.menuModel = "
								+ menuId + " order by m.ingrediantAmouunt")
				.list();
		for (MenuIngrediantsQuantityTable mQuantityTable : menuIngrediantsQuantityList) {
			logger.info("MenuIngrediantsQuantity List::" + mQuantityTable);
		}
		return menuIngrediantsQuantityList;
	}

	@SuppressWarnings("unchecked")
	public List<IngrediantsModel> getIngrediantsList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<IngrediantsModel> iList = session.createQuery(
				"from IngrediantsModel m").list();
		return iList;
	}
}
