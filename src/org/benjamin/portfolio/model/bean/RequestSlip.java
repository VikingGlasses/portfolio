package org.benjamin.portfolio.model.bean;

/**
 * POJO for checking users request behavior.
 * 
 * @author Benjamin Rosman
 *
 */
public class RequestSlip {
	
	private boolean viewPrediction;
	private boolean runPrediction;
	private boolean runTraining;
	
	public RequestSlip() {
		viewPrediction = false;
		runPrediction = false;
		runTraining = true;
	}
	
	public RequestSlip(boolean viewPrediction, boolean runPrediction, boolean runTraining) {
		this.viewPrediction = viewPrediction;
		this.runPrediction = runPrediction;
		this.runTraining = runTraining;
	}

	public boolean isViewPrediction() {
		return viewPrediction;
	}
	
	public void setViewPrediction(boolean viewPrediction) {
		this.viewPrediction = viewPrediction;
	}
	
	public boolean isRunPrediction() {
		return runPrediction;
	}
	
	public void setRunPrediction(boolean runPrediction) {
		this.runPrediction = runPrediction;
	}
	
	public boolean isRunTraining() {
		return runTraining;
	}
	
	public void setRunTraining(boolean runTraining) {
		this.runTraining = runTraining;
	}

	@Override
	public String toString() {
		return String.format("RequestSlip [viewPrediction=%s, runPrediction=%s, runTraining=%s]", viewPrediction,
				runPrediction, runTraining);
	}

}
