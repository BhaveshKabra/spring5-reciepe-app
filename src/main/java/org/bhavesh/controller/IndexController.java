package org.bhavesh.controller;

import org.bhavesh.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private final RecipeService recipeService;
	
	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}



	@RequestMapping({"/","","index","index.html"})
	public String getindex(Model model)
	{
		
		model.addAttribute("reciepes",recipeService.getRecipe());
		return "index";
	}
}
