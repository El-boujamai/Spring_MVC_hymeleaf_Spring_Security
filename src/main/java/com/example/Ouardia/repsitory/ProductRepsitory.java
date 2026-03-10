package com.example.Ouardia.repsitory;

import com.example.Ouardia.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepsitory  extends JpaRepository<Product,Long> {
}
