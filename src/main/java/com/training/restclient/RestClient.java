package com.training.restclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix="newConfig")
@RestController
@RequestMapping("/api")
public class RestClient {

	private String data;
	
		@RequestMapping("/message")
		
		public String getMessage() {
			return data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}
}
