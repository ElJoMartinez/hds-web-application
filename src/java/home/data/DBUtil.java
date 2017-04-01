// Author: Elliot Martinez
// File: User.java
// Create Date: Thursday, January 26, 2017
package home.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory EMF = 
            Persistence.createEntityManagerFactory("HDSPU");
    public static EntityManagerFactory getEmFactory() {
        return EMF;
    }
}
