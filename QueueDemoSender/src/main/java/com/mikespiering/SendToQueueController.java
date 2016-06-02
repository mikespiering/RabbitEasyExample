package com.mikespiering;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendToQueueController {
	final static String queueName = "SampleQueueName";
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@RequestMapping(method = RequestMethod.GET, value = "/sendMessage")
	public @ResponseBody ResponseEntity<String> handleFileUpload()  {
		
	    rabbitTemplate.convertAndSend(queueName, "504");
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
