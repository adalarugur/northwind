package kodlamaio.northwind.api.controllers;

//kural isimlendirme çoğul verilir
//api üzerinde kontroller sağlamak istedği alıp verip ne yapılacağı sistemle dış dünya ui arasın

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //sen bir rest controllersun
@RequestMapping("/api/products") //birden fazla kontroller api map sağlar
public class ProductsController {

    //interface ile iletişim
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall") //isteği belirt ne olacak get update vb
    public List<Product> getAll() {
        return this.productService.getAll();  //servisten tüm product listi döndük
    }

}
