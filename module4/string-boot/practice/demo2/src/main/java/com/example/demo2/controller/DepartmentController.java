package com.example.demo2.controller;

import com.example.demo2.entity.Department;
import com.example.demo2.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    // Annotation
//    @Autowired
//    private IDepartmentService departmentService;
    @GetMapping("/show")
    public String show()
    {
        return "hello";
    }
//
//    // Save operation
//    @PostMapping("/departments")
//    public Department saveDepartment(@Validated @RequestBody Department department)
//    {
//        return departmentService.save(department);
//    }
//
//    // Read operation
//    @GetMapping("/departments")
//    public List<Department> fetchDepartmentList()
//    {
//
//        return departmentService.findAll();
//    }
//
//    // Update operation
////    @PutMapping("/departments/{id}")
////    public Department
////    updateDepartment(@RequestBody Department department,
////                     @PathVariable("id") Long departmentId)
////    {
////
////        return departmentService.updateDepartment(
////                department, departmentId);
////    }
//
//    // Delete operation
//    @DeleteMapping("/departments/{id}")
//    public String deleteDepartmentById(@PathVariable("id")
//                                       Long departmentId)
//    {
//
//        departmentService.deleteById(departmentId);
//        return "Deleted Successfully";
//    }
}
