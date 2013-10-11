/**
 * 
 */
package JobAdminEJB.src.com.careermanager.core.ejb;

/**
 * @author Pathmasri Ambegoda
 * 2013Oct 11, 201310:36:12 PM
 */

import java.util.ArrayList;

import javax.ejb.Stateless;

import JobAdminEJB.src.com.careermanager.api.model.Job;
import JobAdminEJB.src.com.careermanager.core.ejbService.JobBDLocal;
import JobAdminEJB.src.com.careermanager.core.ejbService.JobBDRemote;

@Stateless 
public class JobBDBean implements JobBDLocal,JobBDRemote {

	
	@Override
	public ArrayList<Job> getJobs(String jobType) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
