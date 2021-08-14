package org.bhavesh.repository;

import org.bhavesh.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepoistory extends CrudRepository<Recipe, Long> {
	
}
