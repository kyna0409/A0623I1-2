package com.example.e2_upload_songs.service.impl;

import com.example.e2_upload_songs.model.Upload;
import com.example.e2_upload_songs.repository.IUploadRepository;
import com.example.e2_upload_songs.service.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadService implements IUploadService {
    @Autowired
    private IUploadRepository repository;

    @Override
    public List<Upload> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Upload product) {
        repository.save(product);
    }
}
