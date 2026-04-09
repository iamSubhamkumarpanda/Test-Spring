package com.subham.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class WishMessageGenerator {
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("in The WishMessageGenerator");
	}
	
	@Autowired
	public void setLDT(LocalDateTime ldt) {
		System.out.println("Setting Local Date and time.");
		this.ldt=ldt;
	}
	
	public String generateWishMessage(String user) {
		int hours=ldt.getHour();
		String finalMessage = (hours < 12) ? "Good Morning " + user
                : (hours < 17) ? "Good Afternoon " + user
                : "Good Evening " + user;
		return finalMessage;
	}
	
}
