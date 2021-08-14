package org.bhavesh.controller;

import org.bhavesh.repository.RecipeRepoistory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private final RecipeRepoistory recipeRepoistory;
	
	public IndexController(RecipeRepoistory recipeRepoistory) {
		super();
		this.recipeRepoistory = recipeRepoistory;
	}



	@RequestMapping({"/","","index","index.html"})
	public String getindex(Model model)
	{
		
		model.addAttribute("reciepes",recipeRepoistory.findAll());
		return "index";
	}
}
