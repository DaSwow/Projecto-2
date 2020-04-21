/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author carls
 */
@Entity
public class Category extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    @OneToMany(mappedBy = "categoryId", cascade = CascadeType.PERSIST)
    private Collection<Product> products = new ArrayList();

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        product.setCategoryId(this.getId());
    }

}
