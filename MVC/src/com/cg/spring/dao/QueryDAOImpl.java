package com.cg.spring.dao;

import javax.management.Query;

@Repository(IQueryDAO)
public class QueryDAOImpl implements IQueryDAO {
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public void searchQuery(int id) {
		Query queryOne=entitymanager.createQuery
				("FROM  where id=:emp_id");
		queryOne.setParameter("emp_id",id);
		ScheduledSessions empList=(ScheduledSessions) queryOne.getSingleResult();
		
		return empList;
		
	}

	@Override
	public void updateQuery(Query q) {
		// TODO Auto-generated method stub
		
	}

}
