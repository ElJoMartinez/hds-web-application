
package home.controllers;

/**
 *
 * @author Elliot Martinez
 * changelog: 3/25/2017 - testing different queries and 
 * the actual connection to the database
 */

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import home.business.Product;
import home.data.DBUtil;

public class TestDatabaseConnect {
    public static void main (String[] args) {
        EntityManager em = getEM();
        String qString = "SELECT p FROM Product p " ;
                
        TypedQuery<Product> q = em.createQuery(qString, Product.class);
        List<Product> results = null;
        try {
            results = q.getResultList();
        } catch (NoResultException ex) {
            System.exit(0);
            
        } finally {
            
            em.close();
        }
        for (Product p : results) {
            String s = p.getDescription();
            String x = p.getSerialId();
            System.out.println(s);
            System.out.println(x);
        }
        
    }
    
    // Gets an em factory and creates an entity manager
    // from the DBUtil class and returns the entity manager for use
    // by the TestDatabaseConnect class
    public static EntityManager getEM() {
        
        return DBUtil.getEmFactory().createEntityManager();
    }
}
