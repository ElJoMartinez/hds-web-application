/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.data;

/**
 *
 * @author Elliot Martinez
 */

import home.business.Product;
import home.data.DBUtil;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.persistence.NoResultException;

public class ProductDBTest {
    @Test
    public void testSelectProducts() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        System.out.println("Entity Manager Created");
        // create query string
        String qString = "SELECT p FROM Product p";
        TypedQuery<Product> q = em.createQuery(qString, Product.class);
        System.out.println("Created query String");
        List<Product> results = null;
        try {
            results = q.getResultList();
        } catch (NoResultException e) {
            fail("There is no result something went wrong");
        } finally {
            assertTrue(results != null);
        }
        
    }
}
