/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz2.repository;

import java.util.ArrayList;
import com.example.nxttrendz2.model.Category;

public interface CategoryRepository {
    ArrayList<Category> getCategories();
}
