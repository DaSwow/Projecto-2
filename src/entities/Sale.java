/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author carls
 */
@Entity
public class Sale extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date date;

    private Float discount;

    private Float total;

    private Integer customerId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerID) {
        this.customerId = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

}
