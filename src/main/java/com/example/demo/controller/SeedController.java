package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Sale;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String seed(){
        Product product1 = new Product("Tivi Samsung","Sản phẩm tốt nhất",Calendar.getInstance().getTimeInMillis()-1*86400,10000000.00);
        Sale sale1 = new Sale(1,"Nguyễn Đăng Bằng",Calendar.getInstance().getTimeInMillis()-1*86400,product1);
        product1.setSale(sale1);

        Product product2 = new Product("Tivi LG","Sản phẩm tốt nhì",Calendar.getInstance().getTimeInMillis()-2*86400,11000000.00);
        Sale sale2 = new Sale(2,"Nguyễn Văn Song",Calendar.getInstance().getTimeInMillis()-2*86400,product2);
        product2.setSale(sale2);

        Product product3 = new Product("Tivi panasonic","Sản phẩm tốt ba",Calendar.getInstance().getTimeInMillis()-3*86400,11000000.00);
        Sale sale3 = new Sale(3,"Nguyễn Văn Luân",Calendar.getInstance().getTimeInMillis()-3*86400,product3);
        product3.setSale(sale3);


        Product product4 = new Product("Máy giặt LG","Sản phẩm tốt bốn",Calendar.getInstance().getTimeInMillis()-4*86400,11000000.00);
        Sale sale4 = new Sale(4,"Nguyễn Văn Hậu",Calendar.getInstance().getTimeInMillis()-4*86400,product4);
        product4.setSale(sale4);


        Product product5 = new Product("Tivi sony","Sản phẩm tốt năm",Calendar.getInstance().getTimeInMillis()-5*86400,11000000.00);
        Sale sale5 = new Sale(5,"Nguyễn Văn Cường",Calendar.getInstance().getTimeInMillis()-5*86400,product5);
        product5.setSale(sale5);


        Product product6 = new Product("Máy giặt panasonic","Sản phẩm tốt sáu",Calendar.getInstance().getTimeInMillis()-6*86400,11000000.00);
        Sale sale6 = new Sale(6,"Nguyễn Văn Thắng" ,Calendar.getInstance().getTimeInMillis()-6*86400,product6);
        product6.setSale(sale6);


        Product product7 = new Product("Tủ lạnh panasonic","Sản phẩm tốt bảy",Calendar.getInstance().getTimeInMillis()-7*86400,11000000.00);
        Sale sale7 = new Sale(7,"Nguyễn Văn Hà",Calendar.getInstance().getTimeInMillis()-7*86400,product7);
        product7.setSale(sale7);


        Product product8 = new Product("Điều hòa panasonic","Sản phẩm tốt tám",Calendar.getInstance().getTimeInMillis()-8*86400,11000000.00);
        Sale sale8= new Sale(8,"Nguyễn Văn Nam",Calendar.getInstance().getTimeInMillis()-8*86400,product8);
        product8.setSale(sale8);


        Product product9 = new Product("Nồi cơm panasonic","Sản phẩm tốt chín",Calendar.getInstance().getTimeInMillis()-9*86400,11000000.00);
        Sale sale9 = new Sale(9,"Nguyễn Văn Bách",Calendar.getInstance().getTimeInMillis()-9*86400,product9);
        product9.setSale(sale9);


        Product product10 = new Product("Quạt panasonic","Sản phẩm tốt mười",Calendar.getInstance().getTimeInMillis()-10*86400,11000000.00);
        Sale sale10 = new Sale(10,"Nguyễn Văn Đoàn",Calendar.getInstance().getTimeInMillis()-10*86400,product10);
        product10.setSale(sale10);
        List<Product> products= Arrays.asList(product1,product2,product3,product4,product5,product6,product7,product8,product9,product10);
        productRepository.saveAll(products);
        return   "ok";
    }
}
