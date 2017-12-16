package org.benjamin.portfolio.model.controller;

import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Response;

import org.benjamin.portfolio.model.bean.RequestSlip;
import org.benjamin.portfolio.model.bean.Token;
import org.benjamin.portfolio.model.bean.Training;
import org.benjamin.portfolio.model.bean.TrainingSession;
import org.benjamin.portfolio.model.repository.TokenRepository;
import org.benjamin.portfolio.model.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Machine learning API for training a algorithm and running predictions.
 * 
 * @author Benjamin Rosman
 *
 */
@RestController
@RequestMapping("/ml")
public class PredictionController {
	
	@Autowired
	private TokenRepository tokenRepository;
	
	@Autowired
	private TrainingRepository trainingRepository;
	
	@Autowired
	private TrainingSession trainingSession;
	
	/**
	 * Runs the appropriate algorithms based on the users token.
	 * 
	 * @param name User input.
	 * @param session The users session.
	 * @return Either an empty ok response or a prediction.
	 */
	@RequestMapping(path="/{name}", method=RequestMethod.POST)
	public Response runMachineLearning(@PathVariable String name, HttpSession session) {
		System.out.println("running machine learning request...");
//		String key = (String) session.getAttribute("token-key");
		// pre validate token with interceptor

		System.out.println("token repo is null = " + Boolean.toString(tokenRepository == null));
		Token token = tokenRepository.findOne("2");
//		RequestSlip slip = token.getRequestSlip();
		RequestSlip slip = new RequestSlip();
		
		if (slip.isRunTraining()) {
			Training training = new Training(trainingSession.summariesData(), name);
			trainingSession.handle(name);
			// save training
			trainingRepository.save(training);
			// run training
			// execute training
			System.out.println("Saved training...");
		}
		
		if (slip.isRunPrediction()) {
			System.out.println("running prediction...");
			// run prediction
			if (slip.isViewPrediction()) {
				System.out.println("Sending viewable response...");
				// return prediction
			}
		}
		// return empty response
		return Response.ok().build();
	}

}
