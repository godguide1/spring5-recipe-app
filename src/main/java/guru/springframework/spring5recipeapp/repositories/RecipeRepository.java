package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adetola on 23/06/2019
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
