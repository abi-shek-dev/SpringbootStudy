package com.xeno.SimpleWebApp.service;

import com.xeno.SimpleWebApp.model.Product;
import com.xeno.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101,"IPhone",50000),
//            new Product(102,"Asus Laptop",60000)
//    ));

    public List<Product> getProducts(){

        return repo.findAll();

    }

    public Product getProductById(int proId) {

        return repo.findById(proId).orElse(new Product());
    }

    public void addProduct(Product prod){

        repo.save(prod);

    }

    public void updateProduct(Product prod){

        repo.save(prod);

    }

    public void deleteProduct(int proId){

        repo.deleteById(proId);

    }
    
}
