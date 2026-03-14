package HibernateDemo.HibernateDemo_S7;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class App {

    public static void main(String[] args) {

        // Hibernate setup
        StandardServiceRegistry ssr =
                new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();

        Metadata md = new MetadataSources(ssr)
                .getMetadataBuilder()
                .build();

        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Query<Employee> q = s.createQuery(
                "FROM Employee ORDER BY regno ASC",
                Employee.class
        );

        List<Employee> list = q.list();

        System.out.println("Sorted by RegNo (ASC):");
        for (Employee e : list) {
            System.out.println(
                    e.getRegno() + " " +
                    e.getFname() + " " +
                    e.getLname()
            );
        }

        t.commit();
        s.close();
        sf.close();
    }
}
