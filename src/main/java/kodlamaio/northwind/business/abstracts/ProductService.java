package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
