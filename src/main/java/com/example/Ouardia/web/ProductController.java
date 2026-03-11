package com.example.Ouardia.web;

import com.example.Ouardia.entities.Product;
import com.example.Ouardia.repsitory.ProductRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepsitory productRepsitory;
    @GetMapping("/index")
    public String  index(Model model){
        List<Product> products = productRepsitory.findAll();
        model.addAttribute("productList",products);
        return "products";}
    @GetMapping("/delete")
    public String delete(@RequestParam(name ="id")Long id ){
      productRepsitory.deleteById(id);
        return "redirect:/index";
    }

}
