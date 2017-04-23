package home.data;

/**
 *
 * @author Elliot Martinez
 * Description: Employee DB class that uses employee entity 
 * methods to retrieve and manipulate database entries
 */

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import home.business.Employee;

public class EmployeeDB {
    
    // Since I am not required to edit or update the customer 
    // database from the web application, I will only 
    // provide the web app with the ability to view the 
    // Customer database.
    public static List<Employee> selectEmployees() {
        EntityManager em = getEM();
        String qString = "SELECT e from Employee e";
        TypedQuery<Employee> q = em.createQuery(qString, Employee.class);
        List<Employee> results = null;
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
