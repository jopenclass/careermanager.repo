/**
 * 
 */
package JobAdminEJB.src.com.careermanager.api.ejbServiceApi;

import java.util.ArrayList;

import JobAdminEJB.src.com.careermanager.api.model.Job;

/**
 * @author Pathmasri Ambegoda
 * 2013Oct 11, 201310:28:38 PM
 */
public interface JobBD {
	
	public ArrayList<Job> getJobs(String jobType);

}
