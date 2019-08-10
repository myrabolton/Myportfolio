package com.tss.myPersonal;


@Controller
public class MyController {

	
	
	   @GetMapping("/home")
	   public String getDefaultMap() {
	       return "index.html";
	   
	}

}
