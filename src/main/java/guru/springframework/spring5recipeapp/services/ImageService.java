package guru.springframework.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Adetola on 28/06/2019
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
