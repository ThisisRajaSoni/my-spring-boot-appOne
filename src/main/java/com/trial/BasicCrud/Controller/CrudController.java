package com.trial.BasicCrud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
	

	@GetMapping("/hello")
    @ResponseBody
    public String summarize() {
        return "Hi Welcome to Custom.... War";
    }
	
}
