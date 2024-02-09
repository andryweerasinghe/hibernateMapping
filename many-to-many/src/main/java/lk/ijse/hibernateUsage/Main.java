package lk.ijse.hibernateUsage;

import lk.ijse.hibernateUsage.config.FactoryConfiguration;
import lk.ijse.hibernateUsage.entity.Laptop;
import lk.ijse.hibernateUsage.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop1 = new Laptop();
        laptop1.setLid(1);
        laptop1.setModel("Acer");
        Laptop laptop2 = new Laptop();
        laptop2.setLid(2);
        laptop2.setModel("Hp");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Naveen");
        student1.setAddress("Aluthgama");
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Dulara");
        student2.setAddress("Beruwala");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        student1.setLaptops(laptopList);
        student2.setLaptops(laptopList);

        laptop1.setStudents(studentList);
        laptop2.setStudents(studentList);

        session.save(student1);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);

        transaction.commit();
        session.close();
    }
}