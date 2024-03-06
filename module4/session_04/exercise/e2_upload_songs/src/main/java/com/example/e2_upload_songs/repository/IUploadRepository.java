package com.example.e2_upload_songs.repository;

import com.example.e2_upload_songs.model.Upload;

import java.util.List;

public interface IUploadRepository {
    List<Upload> findAll();

    void save(Upload product);
}
