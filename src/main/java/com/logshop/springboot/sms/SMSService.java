package com.logshop.springboot.sms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import com.logshop.springboot.model.SMSPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Component
public class SMSService {

	    
	    private final String ACCOUNT_SID = "AC241492985748838bc87183ed17c92d25";

	    private final String AUTH_TOKEN = "09f65f80b59a8f230c0704f4b7f2de15";

	    private final String FROM_NUMBER = "+19283253465";

	    public void send(SMSPojo sms) {
	    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
	                .create();
	        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

	    }

	    public void receive(MultiValueMap<String, String> smscallback) {
	    }
	
}
