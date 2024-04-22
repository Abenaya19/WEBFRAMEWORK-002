package com.example.abeday5cw1.service;

import org.springframework.stereotype.Service;

import com.example.abeday5cw1.model.Product;
import com.example.abeday5cw1.repository.ProductRepo;

@Service
public class AbeProductService {
    public AbeProductRepo productRepo;
    public ProductService(AbeProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AbeProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AbeProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AbeProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
