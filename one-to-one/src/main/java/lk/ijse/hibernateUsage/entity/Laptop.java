/*
 * Author  : Mr.electrix
 * Project : hibernateMapping
 * Date    : 2/2/24

 */

package lk.ijse.hibernateUsage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Laptop {

    @Id
    private int lid;
    private String model;

    public Laptop(int lid, String model) {
        this.lid = lid;
        this.model = model;
    }

    public Laptop() {
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
