package com.paliwal.demo1.service;

import com.paliwal.demo1.Product;
import com.paliwal.demo1.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class ProductService {

    @Autowired
    ProductRepo productRepo;

   // List<Product> products = new ArrayList<>(Arrays.asList(new Product(100,"amit",11), new Product(101,"Dev",12)));

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {

      //  return products.stream().filter(p->p.getProdId()==id).findFirst().orElse(new Product(0,"no Data",0));
        return productRepo.findById(id).get();
    }

    public void addProduct(Product product) {
       // products.add(product);
        productRepo.save(product);
    }
}
