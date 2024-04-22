package com.example.abeday6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.abeday6cw3.abemodel.AbeProduct;
import com.example.abeday6cw3.aberepository.AbeProductRepo;

@Service
public class AbeProductService {
    public AbeProductRepo productRepo;
    public AbeProductService(AbeProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AbeProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AbeProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AbeProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AbeProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
