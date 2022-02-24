package io.dowlath.product.repository;

import io.dowlath.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * Author : Dowlath Basha G
 * Date   : 2/20/2022
 * Time   : 11:50 PM
 ***/
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
