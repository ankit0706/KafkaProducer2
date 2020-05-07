package com.sample.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * This class is loaded at start of the spring boot app
 * because of its component annotation. Here we use this class
 * to load the custom property file and access values defined
 * in that custom property file.
 * @author AANU
 *
 */

@Component
@PropertySource({"classpath:custom.properties"})
public class CustomComponentLoader {
	
	@Value("${kafka.topic.json}")
	private String jsonTopic;
	
	@Value("${kafka.topic.xml}")
	private String xmlTopic;
	
	@Value("${kafka.topic.movie}")
	private String movieTopic;
	
	@Value("${kafka.topic.dir}")
	private String directorTopic;
	
	public String getJsonTopic() {
		return jsonTopic;
	}
	
	public String getXmlTopic() {
		return xmlTopic;
	}
	
	public String getMovieTopic() {
		return movieTopic;
	}
	
	public String getDirectorTopic() {
		return directorTopic;
	}
	
}
