package com.unifeso.Imed.domain.utils.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifeso.Imed.domain.utils.Image;
import com.unifeso.Imed.domain.utils.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private ObjectMapper objectMapper;

    public Optional<Image> getImg(Long id) {
        return imageRepository.findById(id);
    }
}
