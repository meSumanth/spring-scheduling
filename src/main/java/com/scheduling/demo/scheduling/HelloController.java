/**
 * 
 */
package com.scheduling.demo.scheduling;

import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sumanth
 *
 */

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	@Scheduled(fixedRate = 10000)
	public String hello() {
		System.out.println(new Timestamp(System.currentTimeMillis()));
		return "Welcome Sumanth ..!!"+UUID.randomUUID().toString();
	}
	
	@GetMapping("/hello1")
	@Scheduled(fixedDelay = 10000)
	public String hello1() {
		System.out.println(new Timestamp(System.currentTimeMillis()));
		return "Welcome Sumanth ..!!"+UUID.randomUUID().toString();
	}
	
	@GetMapping("/hello2")
	@Scheduled(cron = "0 1 1 1 1 1 1")
	public String hello2() {
		System.out.println(new Timestamp(System.currentTimeMillis()));
		return "Welcome Sumanth ..!!"+UUID.randomUUID().toString();
	}

}
