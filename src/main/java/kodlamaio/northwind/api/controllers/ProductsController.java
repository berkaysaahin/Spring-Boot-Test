package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")  //böyle bir istek yaratılırsa bu controllerın çalışmasını sağlar
public class ProductsController {
    private ProductService productService;

    @Autowired //autowired ProductService productService projede implemente eden classları arar ve bulur, arka planda newler ve buraya yerleştirir.
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product  product){
        return this.productService.add(product);
    }
    //requestbody anotasyonu post isleminde execute dendiğinde kalan bilgileri json dosyasına çevirip gonderir
}
