/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import entities.Category;
import entities.Product;

/**
 *
 * @author carls
 */
public class Projecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Category categoria=new Category();
        Product producto=new Product();
        
       categoria.setDescription("First Person Shooter");
       categoria.setId(1);
       categoria.setName("FPS");
      
       producto.setName("COD");
        producto.setId(1);
       producto.setPrice(15.5f);
       producto.setProviderId(1);
       
       
        categoria.addProduct(producto);
        System.out.println(producto.getCategoryId());
    }
    
}
