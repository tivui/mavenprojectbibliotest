/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.thierry.mavenprojectbibliotest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stag
 */

@RestController
public class BiblioController {
    
    	@Controller
	public class HtmlPageController {
	    @GetMapping("/test")
	    public String getTestPage() {
	        return "test.html";
	    }
	}
	
}
