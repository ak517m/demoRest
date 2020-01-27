package com.example.demoRest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping("/rest")
    public String getTest()
    {
        return "REST ENDPOINT !!!";
    }

}

