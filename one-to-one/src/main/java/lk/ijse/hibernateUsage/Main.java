package lk.ijse.hibernateUsage;

import lk.ijse.hibernateUsage.config.FactoryConfiguration;
import lk.ijse.hibernateUsage.entity.Laptop;
import lk.ijse.hibernateUsage.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setModel("Acer");

        Student student = new Student();
        student.setId(1);
        student.setName("Naveen");
        student.setAddress("Aluthgama");
        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        session.save(laptop);

        transaction.commit();
        session.close();
    }
}