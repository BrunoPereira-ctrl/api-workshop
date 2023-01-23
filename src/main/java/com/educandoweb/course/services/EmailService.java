package com.educandoweb.course.services;

import org.springframework.mail.SimpleMailMessage;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;


public interface EmailService {
	
	void sendOrderConfirmationEmail(Order obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(User user, String newPass);

}
