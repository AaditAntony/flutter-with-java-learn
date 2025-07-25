package com.example.demo.productCreation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private List<ProductRequest>productList= new ArrayList<>();
    @PostMapping("/add")
    public  ProductResponse addProduct(@RequestBody ProductRequest request){
        productList.add(request);

        return new ProductResponse("product added Successfully", request.getName());
    }

    // this is where the product mapping is sended
    @GetMapping("/all")
    public  List<ProductRequest>getAllProducts(){
        return productList;
    }

}
