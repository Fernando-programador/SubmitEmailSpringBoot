package com.fsc.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@PropertySource("classpath:env/mail.properties")
public class EmailConfig {

	@Autowired
	private Environment environment;
	
	@Bean
	public JavaMailSender mailSender() {
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(environment.getProperty("mail.smtp.host"));
		mailSender.setPort(environment.getProperty("mail.smtp.port", Integer.class));
		mailSender.setUsername(environment.getProperty("mail.smtp.username"));
		mailSender.setPassword(environment.getProperty("mail.smtp.password"));
	
		Properties properties = mailSender.getJavaMailProperties();
		
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.debug", "true");
		
		return mailSender;
	}
}
