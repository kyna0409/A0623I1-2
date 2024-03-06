package com.example.e2_upload_songs.controller;

import com.example.e2_upload_songs.model.Upload;
import com.example.e2_upload_songs.model.UploadForm;
import com.example.e2_upload_songs.repository.IUploadRepository;
import com.example.e2_upload_songs.service.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/upload-song")
@PropertySource("classpath:upload_file.properties")
public class UploadController {
    @Autowired
    private IUploadService service;
    @Value("${file-upload}")
    private String fileUpload;
    @GetMapping("")
    public String showList(Model model)
    {
        List<Upload> uploadList = service.findAll();
        model.addAttribute("products",uploadList);
        return "list";
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("productForm", new UploadForm());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveProduct(@ModelAttribute UploadForm productForm) {
        MultipartFile multipartFile = productForm.getLink();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(productForm.getLink().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Upload product = new Upload(productForm.getId(), productForm.getName(), productForm.getActor(),productForm.getGenre(), fileName);
        service.save(product);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("productForm", productForm);
        modelAndView.addObject("message", "Created new product successfully !");
        return modelAndView;
    }

}
