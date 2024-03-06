package com.example.e1_product_orm.controller;

import com.example.e1_product_orm.model.Product;
import com.example.e1_product_orm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService service;
    @GetMapping("")
    public String showList(Model model)
    {
        List<Product> products = service.findAll();
        model.addAttribute("products",products);
        return "/product/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model)
    {
        model.addAttribute("product",new Product());
        return "/product/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute(name = "product") Product product, RedirectAttributes redirectAttributes){
        service.save(product);
        System.out.println(product.getId());
        redirectAttributes.addFlashAttribute("message","you have created it successfully ");
        return "redirect:/products";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable(name = "id") long id, Model model)
    {
        Product product = service.findById(id);
        model.addAttribute("product",product);
        return "/product/edit";
    }
    @GetMapping ("/{id}/delete")
    public String delete(@PathVariable(name = "id") long id,RedirectAttributes redirectAttributes)
    {
        service.remove(id);
        redirectAttributes.addFlashAttribute("success","you have successfully deleted a product !!!");
        return "redirect:/products";
    }
    @PostMapping("/search")
    public String search(@RequestParam(name = "search_choose") String search_choose,@RequestParam(name = "search_txt") String search_txt,Model model)
    {
        List<Product> productList = null;
//        if(search_choose.equals("name"))
//        {
//            customerList = service.searchByName(search_txt);
//        }
        switch (search_choose)
        {
            case "name":
                productList = service.searchByName(search_txt);
                break;
            case "price":
                productList = service.searchByPrice(search_txt);
                break;
            case "producer":
                productList = service.searchByProducer(search_txt);
                break;
            default:
                break;
        }
//        model.addAttribute("customers", customerList);
//        model.addAttribute("success","khong tim thay ket qua");

        model.addAttribute("products", productList);
        return "/product/list";
    }

}
