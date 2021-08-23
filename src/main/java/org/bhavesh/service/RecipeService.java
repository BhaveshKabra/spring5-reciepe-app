package org.bhavesh.service;

import java.util.HashSet;
import java.util.Set;

import org.bhavesh.model.Recipe;
import org.bhavesh.repository.RecipeRepoistory;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
	private final RecipeRepoistory recipeRepoistory;

	public RecipeService(RecipeRepoistory recipeRepoistory) {
		super();
		this.recipeRepoistory = recipeRepoistory;
	}
	
	public Set<Recipe> getRecipe()
	{
		Set<Recipe> recipes=new HashSet<Recipe>();
		recipeRepoistory.findAll().forEach(recipes::add);
		return recipes;
	}
}
