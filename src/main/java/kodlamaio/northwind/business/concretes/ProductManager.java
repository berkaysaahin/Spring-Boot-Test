package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;
    //productDao injectionı

    @Autowired    //productDaonun bir instansı olabilecek sınıfı üretip verir. bağımlılık oluşturur.injectionı otomatik yapar
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll(){
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
    }
}
//injection bagımlılıkları yonetmek icin kullanılır