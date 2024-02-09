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
        laptop2.setModel("HP");

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);

        Student student = new Student();
        student.setId(1);
        student.setName("Naveen");
        student.setAddress("Aluthgama");
        student.setLaptops(laptopList);

        laptop1.setStudent(student);
        laptop2.setStudent(student);

        session.save(laptop1);
        session.save(laptop2);
        session.save(student);

        transaction.commit();
        session.close();
    }
}