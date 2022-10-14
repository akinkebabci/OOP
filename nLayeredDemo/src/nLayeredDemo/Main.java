package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductMenager;
import nLayeredDemo.core.JLoggerMenagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {
    public static void main(String[] args){
        //ToDo : Spring Ioc ile Çözülecek
        ProductService productService = new ProductMenager(new AbcProductDao(),new JLoggerMenagerAdapter());
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}
