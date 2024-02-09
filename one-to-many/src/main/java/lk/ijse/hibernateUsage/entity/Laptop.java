/*
 * Author  : Mr.electrix
 * Project : hibernateMapping
 * Date    : 2/2/24

 */

package lk.ijse.hibernateUsage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String model;
    @ManyToOne
    private Student student;

    public Laptop(int lid, String model, Student student) {
        this.lid = lid;
        this.model = model;
        this.student = student;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
