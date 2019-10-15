package example.util;

import example.entity.Employee;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class HibernateUtility {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction =null;
        try {
            transaction =session.beginTransaction();
            Employee employee = new Employee();
            employee.setId(1);
            employee.setName("ttt");
            employee.setSalary(1000);
            session.save(employee);
            System.out.println("save success!!!!");
            transaction.commit();

        }catch (Exception ex){
            if(transaction!=null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }
}