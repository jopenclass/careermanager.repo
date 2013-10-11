package JobAdminEJB.src.com.careermanager.api.model;



public class Job {
	
	private String position;
	
	private String organization;
	
	private int numOfPositions;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getNumOfPositions() {
		return numOfPositions;
	}

	public void setNumOfPositions(int numOfPositions) {
		this.numOfPositions = numOfPositions;
	}	

}
