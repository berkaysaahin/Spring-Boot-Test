package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

import org.springframework.stereotype.Service;
import kodlamaio.northwind.entities.concretes.ProductWithCategoryDto;

import java.util.List;
@Service
public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory_CategoryId(String productName,int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName,int categoryId);

    DataResult<List<Product>> getByCategory_CategoryIdIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);


    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
