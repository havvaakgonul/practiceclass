package week8;
/*
Create a class: Case
    // Create private instance variable String actualCase, boolean isTested, String
    // conclusion;
    // Create getters and setters
 */
public class Case {

	private String  actualCase;
	private boolean isTested;
	private String coclusion;
	
	public String getActualCase() {
		return actualCase;
	}
	public void setActualCase(String actualCase) {
		this.actualCase = actualCase;
	}
	public boolean isTested() {
		return isTested;
	}
	public void setTested(boolean isTested) {
		this.isTested = isTested;
	}
	public String getCoclusion() {
		return coclusion;
	}
	public void setCoclusion(String coclusion) {
		this.coclusion = coclusion;
	}
}
