package com.example.e2_upload_songs.repository.impl;

import com.example.e2_upload_songs.model.Upload;
import com.example.e2_upload_songs.repository.IUploadRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UploadRepository implements IUploadRepository {
    private List<Upload> uploadList = new ArrayList<>();
    @Override
    public List<Upload> findAll() {
        return uploadList;
    }

    @Override
    public void save(Upload product) {
        uploadList.add(product);
    }
}
