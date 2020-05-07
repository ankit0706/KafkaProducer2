package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.producer.CustomComponentLoader;
import com.sample.producer.Producer;

@RestController
public class KafkaController {
	@Autowired
	Producer producer;
	
	@Autowired
	CustomComponentLoader propLoader;
	
	@GetMapping(value = "/check")
	public String checkAppStatus() {
		return "Receiving requests";
	}
	
	@PostMapping(value = "/pushxml")
    public String pushMessageToXmlTopic(@RequestBody String message) {
		producer.pushDataOnKafkaTopic(propLoader.getXmlTopic(), message);
		return "Data pushed on xml topic";
    }
	
	@PostMapping(value = "/pushjson")
    public String pushMessageToJsonTopic(@RequestBody String message) {
		producer.pushDataOnKafkaTopic(propLoader.getJsonTopic(), message);
		return "Data pushed on json topic";
    }
	
	@PostMapping(value = "/pushmovie")
    public String pushMessageToMovieTopic(@RequestBody String message) {
		producer.pushDataOnKafkaTopic(propLoader.getMovieTopic(), message);
		return "Data pushed on movie topic";
    }
	
	@PostMapping(value = "/pushdirector")
    public String pushMessageToDirectorTopic(@RequestBody String message) {
		producer.pushDataOnKafkaTopic(propLoader.getDirectorTopic(), message);
		return "Data pushed on director topic";
    }

}
