package home.data;

/**
 *
 * @author Elliot Martinez
 * Description: customer DB class that uses customer entity 
 * methods to retrieve and manipulate database entries
 */

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import home.business.Customer;

public class CustomerDB {
    
    // Since I am not required to edit or update the customer 
    // database from the web application, I will only 
    // provide the web app with the ability to view the 
    // Customer database.
    public static List<Customer> selectCustomers() {
        EntityManager em = getEM();
        String qString = "SELECT c from Customer c";
        TypedQuery<Customer> q = em.createQuery(qString, Customer.class);
        List<Customer> results = null;
        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        return results;
    }
    
    
    // Entitymanager method that creates the static
    // entity manager for this class
    private static EntityManager getEM() {
        return DBUtil.getEmFactory().createEntityManager();
    }
}
