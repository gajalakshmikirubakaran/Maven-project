package com.cg.spring.dao;

import javax.management.Query;

public interface IQueryDAO {
	public void searchQuery(int id);
	public void updateQuery(Query q);

}
