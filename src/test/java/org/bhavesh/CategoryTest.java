package org.bhavesh;

import static org.junit.Assert.assertEquals;

import org.bhavesh.model.Category;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	Category category;
	
	@Before
	public void init()
	{
		category=new Category();
	}
	
	@Test
	public void getId() throws Exception
	{
		Long lonval=4L;
		category.setId(lonval);
		assertEquals(lonval, category.getId());
	}
}
