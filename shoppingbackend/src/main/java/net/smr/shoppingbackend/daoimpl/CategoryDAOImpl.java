package net.smr.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.smr.shoppingbackend.dao.CategoryDAO;
import net.smr.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories= new ArrayList();
	
	static
	{
		/* adding first category*/
		Category category= new Category();	
		category.setId(1);
		category.setName("Photography");
		category.setDescription("This is short description for photography");
		category.setImageURl("cat_1.png");
		categories.add(category);
		
		/* adding second category*/
		 category= new Category();	
		category.setId(2);
		category.setName("ArtGallery");
		category.setDescription("This is short description for art gallery");
		category.setImageURl("cat_2.png");
		categories.add(category);
		
		/* adding third category*/
		 category= new Category();	
		category.setId(3);
		category.setName("quotations");
		category.setDescription("This is short description for quotations");
		category.setImageURl("cat_3.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category getById(int id) {
		/*
		 * Advanced for each loop for finding category by id
		 * */
		for(Category category:categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
