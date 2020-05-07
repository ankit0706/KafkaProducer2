package com.sample.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * This class is responsible for sending the data on kafka topic
 * @author AANU
 *
 */
@Service
public class Producer {
	    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

	    @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;

	    public void pushDataOnKafkaTopic(String topic, String data) {
	        this.kafkaTemplate.send(topic, data);
	        logger.info("topic : " + topic);
	        logger.info("data : " + data);
	    }

}
