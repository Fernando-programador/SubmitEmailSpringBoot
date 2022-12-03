package service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.fsc.models.EmailMessage;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public void enviar(EmailMessage emailMessage) throws MessagingException{
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		//MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
		
		helper.setFrom(emailMessage.getRemetente());
		helper.setSubject(emailMessage.getAssunto());
		helper.setText(emailMessage.getMensagem());
		helper.setTo(emailMessage.getDestinatario()
				.toArray(new String[emailMessage.getDestinatario().size()]));
		
		javaMailSender.send(mimeMessage);	
		
	}

}
