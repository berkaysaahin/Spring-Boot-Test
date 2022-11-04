package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.concretes.ProductWithCategoryDto;
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

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @GetMapping("/getAllSorted")
    public DataResult<List<Product>> getAllSorted(){

        return this.productService.getAllSorted();
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo,int pageSize){

        return this.productService.getAll(pageNo,pageSize);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product  product){
        return this.productService.add(product);
    }
    //requestbody anotasyonu post isleminde execute dendiğinde kalan bilgileri json dosyasına çevirip gonderir

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){  //requestparam: parametresiyle dön
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategory_CategoryId(@RequestParam String productName,@RequestParam int categoryId){
        return this.productService.getByProductNameAndCategory_CategoryId(productName,categoryId);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult <List<Product>> getByProductNameContains(@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult <List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
        return this.productService.getProductWithCategoryDetails();
    }


}
