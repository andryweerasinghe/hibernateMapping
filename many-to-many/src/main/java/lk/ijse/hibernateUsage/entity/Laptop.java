/*
 * Author  : Mr.electrix
 * Project : hibernateMapping
 * Date    : 2/2/24

 */

package lk.ijse.hibernateUsage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lid;
    private String model;
    @ManyToMany(mappedBy = "laptops")
    private List<Student> students;

    public Laptop(int lid, String model, List<Student> students) {
        this.lid = lid;
        this.model = model;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
