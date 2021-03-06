package home.data;

/**
 *
 * @author Elliot Martinez
 * Description: SalesRecord DB class that uses SalesRecord entity 
 * methods to retrieve and manipulate database entries
 */

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import home.business.SalesRecord;

public class SalesRecordsDB {
    
    // Since I am not required to edit or update the salesrecords 
    // database from the web application, I will only 
    // provide the web app with the ability to view the 
    // salesrecords database.
    public static List<SalesRecord> selectSalesRecords() {
        EntityManager em = getEM();
        String qString = "SELECT s from SalesRecord s";
        TypedQuery<SalesRecord> q = em.createQuery(qString, SalesRecord.class);
        List<SalesRecord> results = null;
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
