package guru.springframework.spring5recipeapp.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jt on 7/3/17.
 */

@Service
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}