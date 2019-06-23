package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by Adetola on 23/06/2019
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
