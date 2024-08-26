/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz2.repository;

import com.example.nxttrendz2.model.Product;
import java.util.ArrayList;

public interface ProductRepository {
    ArrayList<Product> getProducts();
}