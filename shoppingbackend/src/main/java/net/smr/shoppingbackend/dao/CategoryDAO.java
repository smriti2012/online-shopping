package net.smr.shoppingbackend.dao;

import java.util.List;

import net.smr.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category getById(int id);

}
