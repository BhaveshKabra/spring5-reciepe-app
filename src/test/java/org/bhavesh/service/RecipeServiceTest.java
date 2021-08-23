package org.bhavesh.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;

import org.bhavesh.model.Recipe;
import org.bhavesh.repository.RecipeRepoistory;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class RecipeServiceTest {

	RecipeService recipeService;
	
	@Mock
	RecipeRepoistory recipeRepoistory;
	
	@Before
	public void setup()
	{
		recipeService=new RecipeService(recipeRepoistory);
	}
	
	@Test
	public void getRecipeTests() throws Exception
	{
		Recipe recipe=new Recipe();
		HashSet<Recipe> recipes2=new HashSet<Recipe>();
		recipes2.add(recipe);
		
		when(recipeService.getRecipe()).thenReturn(recipes2);
		assertEquals(recipeService.getRecipe().size(), recipes2.size());
		verify(recipeRepoistory,times(1)).findAll();
	}

}
