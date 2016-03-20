package com.whattoeattoday.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.whattoeattoday.dao.FoodiesDao;
import com.whattoeattoday.model.UserHistory;

@Repository
public class FoodiesDaoImpl implements FoodiesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<UserHistory> getUserHistoryList(int userId) {
		Session session = sessionFactory.getCurrentSession();
		List<UserHistory> userHistoriesList = session.createQuery(
				"from UserHistory u where u.user = " + userId).list();
		return userHistoriesList;
	}

	public void saveUserHistory(UserHistory userHistory) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(userHistory);
		tx.commit();
		session.close();
	}

}
