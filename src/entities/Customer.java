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
public class Customer extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rfc;

    private String name;

    private String address;

    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sales")
    private Collection<Sale> sales = new ArrayList();

    public Collection<Sale> getSaleItems() {
        return sales;
    }

    public void setSaleItems(Collection<Sale> sales) {
        this.sales = sales;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
