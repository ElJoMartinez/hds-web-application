/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.data;

import home.business.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toillezenitram
 */
public class UserDBTest {
    
    public UserDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of insert method, of class UserDB.
     */
    @Test
    public void testInsert() {
         EntityManager em = DBUtil.getEmFactory().createEntityManager();
         User u = new User();
         u.setFirstName("mock");
         u.setLastName("user");
         u.setEmail("mock@user.com");
         EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(u);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            assertTrue(true);
            em.close();
        }
          
         
        
    }

    /**
     * Test of update method, of class UserDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User user = null;
        UserDB.update(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUser method, of class UserDB.
     */
    @Test
    public void testSelectUser() {
        System.out.println("selectUser");
        String email = "";
        User expResult = null;
        User result = UserDB.selectUser(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emailExists method, of class UserDB.
     */
    @Test
    public void testEmailExists() {
        System.out.println("emailExists");
        String email = "";
        boolean expResult = false;
        boolean result = UserDB.emailExists(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
