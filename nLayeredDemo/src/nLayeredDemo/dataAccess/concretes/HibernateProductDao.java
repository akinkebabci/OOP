package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.PoductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements PoductDao {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate İle Eklendi" + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
