package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //servis görevi alacak business görevi atadık
public class ProductManager implements ProductService {


    //productdao injetion apıyoruz dao erişim
    //arka planda repository oluşturuyor
    private ProductDao productDao;


    //autowired instance oluşturuyor ve getiriyor //fabrika tasarım deseni
    // bağımnlılık oluşturur  injetion!!!
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }



//add implements
    @Override
    public List<Product> getAll() {
        return this.productDao.findAll(); //tüm dataları getir
    }
}
