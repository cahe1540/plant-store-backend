package dev.backend.daos;

import dev.backend.models.Product;

import java.util.List;

public interface ProductDao {
    //CRUD
    public abstract Product createProduct(Product p);

    public abstract Product getProduct(int productId);

    public abstract List<Product> getAllProducts();

    public abstract Product updateProduct(Product p);

    public abstract boolean deleteProduct(int productId);

}
