package org.benjamin.portfolio.model.controller;

import java.util.List;

import org.benjamin.portfolio.model.bean.Code;
import org.benjamin.portfolio.model.bean.RequestSlip;
import org.benjamin.portfolio.model.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private CodeRepository codeRepository;
	
	// create Code
	@RequestMapping(path = "/create/{code}/{train}/{predict}/{view}/{admin}", 
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	Code createCode(@PathVariable("code") String code,
					@PathVariable("train") boolean train, 
					@PathVariable("predict") boolean predict,
					@PathVariable("view") boolean view,
					@PathVariable("admin") boolean admin) {
		
		System.out.println("Creating code...");
		RequestSlip requestSlip = new RequestSlip(view, predict, train);
		Code objCode = new Code(code, requestSlip, admin);
		return codeRepository.save(objCode);
	}
	
	// Read Codes
	@RequestMapping(path = "/codes", 
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	List<Code> readCodes() {
		System.out.println("getting code...");
		List<Code> list = codeRepository.findAll();
		list.stream().forEach(obj -> System.out.println(obj));
		return list;
	}

	// update Code
	@RequestMapping(path = "/update/{code}/{train}/{predict}/{view}/{admin}", 
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	Code updateCode(@PathVariable("code") String code,
					@PathVariable("train") boolean train, 
					@PathVariable("predict") boolean predict,
					@PathVariable("view") boolean view,
					@PathVariable("admin") boolean admin) {

		RequestSlip requestSlip = new RequestSlip(view, predict, train);
		Code objCode = codeRepository.findByCode(code);
		if (objCode == null) {
			System.out.println("Creating new code...");
			objCode = new Code(code, requestSlip, admin);
		}
		objCode.setRequestSlip(requestSlip);
		objCode.setAdmin(admin);
		return codeRepository.save(objCode);
	}

	// delete Code
	@RequestMapping(path = "/delete/{code}", 
					method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	void deleteCode(@PathVariable("code") String code) {
		Code objCode = codeRepository.findByCode(code);
		if (objCode != null) {
			codeRepository.delete(objCode);
		}
}

}
