package com.ott;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author c302318
 * Rest Controller annotation - example
 *
 */
@RestController
@RequestMapping("/application")
public class ApplicationController {
	/**
	 * Autowiring along with qualifier name
	 */
	@Autowired
	@Qualifier("appEnvironment")
	public Environment environment;
	
	@Autowired
	public ProductServiceImpl productService;
	
	@Autowired
	TutorialRepository tutorialRepository;

	@GetMapping("/hello")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name+" "+environment.toString()+" "+EnvironmentI.verion;
	}
	
	@GetMapping("/products")
	public ResponseEntity<Object> getProducts() {
		return new ResponseEntity<Object>(productService.getProducts(),HttpStatus.OK);
	}
	
	@GetMapping("/tutorials")
	public ResponseEntity<Object> getTutorials() {
		try {
			tutorialRepository.findAll().forEach((t) -> {
				System.out.println(t);
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Object>(productService.getProducts(),HttpStatus.OK);
	}
}
