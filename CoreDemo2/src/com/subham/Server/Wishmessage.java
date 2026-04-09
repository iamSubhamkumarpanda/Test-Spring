package com.subham.Server;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Wishmessage {
	  private LocalDateTime ldt;

	    @Autowired
	    @Qualifier("")
	    public void setLdt(LocalDateTime ldt) {
	        this.ldt = ldt;
	    }

	    public String Generater(String user) {
	        int time = ldt.getHour();

	        String msg =
	                (time < 12) ? "Good Morning "
	              : (time < 16) ? "Good Afternoon "
	              : (time < 20) ? "Good Evening "
	              : "Good Night ";
	        return msg + user;
	    }
}
