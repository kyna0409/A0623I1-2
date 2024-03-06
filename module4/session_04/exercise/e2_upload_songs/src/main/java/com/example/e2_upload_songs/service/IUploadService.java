package com.example.e2_upload_songs.service;

import com.example.e2_upload_songs.model.Upload;

import java.util.List;

public interface IUploadService {
    List<Upload> findAll();

    void save(Upload product);
}
