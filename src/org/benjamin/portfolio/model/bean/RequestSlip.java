package org.benjamin.portfolio.model.bean;

import java.io.Serializable;

public class RequestSlip implements Serializable {
	
	private static final long serialVersionUID = 3818505587437427342L;
	
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
