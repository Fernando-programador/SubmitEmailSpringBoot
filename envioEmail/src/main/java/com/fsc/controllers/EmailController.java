package com.fsc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsc.models.EmailMessage;
import com.fsc.service.EmailService;

@RestController
@RequestMapping("/api")
public class EmailController {

@Autowired
private EmailService emailService;



@PostMapping("/email")
public String eviandoEmail(@RequestBody EmailMessage emailMessage){
	
	try {
		emailService.enviar(emailMessage);
		return "Email enviado com sucesso";
	} catch (Exception e) {
		e.printStackTrace();
		
		
		return "email não foi enviado";
	}
	
	
}
	
	
	
}
