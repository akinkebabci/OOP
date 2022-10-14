package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.entities.concretes.Product;

import nLayeredDemo.dataAccess.abstracts.PoductDao;

import java.util.List;

public class ProductMenager implements ProductService {

    private PoductDao productDao;
    private LoggerService loggerService;

    public ProductMenager(PoductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        //İŞ Kodları
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride Ürün kabul Edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün Eklendi" + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
