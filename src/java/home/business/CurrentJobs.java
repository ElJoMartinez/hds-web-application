package home.business;

/**
 *
 * @author Elliot Martinez
 * Changelog - 4/6/2017: added CurrentJobs class for database
 */

import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CurrentJobs implements Serializable {
    
    @Id //primary key
    @Column(name="JobId", nullable = false)
    private long jobId;
    
    @Column(name="JobTypeId", nullable = false)
    private long jobTypeId;
    
    
    
}
