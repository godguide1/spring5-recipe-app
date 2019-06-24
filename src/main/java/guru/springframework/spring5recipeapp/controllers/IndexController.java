package guru.springframework.spring5recipeapp.controllers;


import guru.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Adetola on 22/06/2019
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public  String getIndexPage(Model model){
        log.debug("I'm in the Index Controller");

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
