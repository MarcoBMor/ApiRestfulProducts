package com.landingpage.crudmongoback.CRUD.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@RequestMapping("/images")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {

    @GetMapping("{imageName:.+}")
    public ResponseEntity<byte[]> getImage(@PathVariable String imageName) throws IOException {

        //Load img form file system
        //Path imagePath = ResourceUtils.getFile("static/images/" + imageName).toPath();
        Path imagePath = new ClassPathResource("static/images/" + imageName).getFile().toPath();
        byte[] imageBytes = Files.readAllBytes(imagePath);

        //Return image
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
}
