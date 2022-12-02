package com.fsc.models;

import java.util.List;

public class EmailMessage {

	private String assunto;
	
	private String messagem;
	
	private String remetente;
	
	private List<String> destinatario;

	
	
	public EmailMessage() {
	}
	
	public EmailMessage(String assunto, String messagem, String remetente, List<String> destinatario) {
		super();
		this.assunto = assunto;
		this.messagem = messagem;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}




	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public List<String> getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(List<String> destinatario) {
		this.destinatario = destinatario;
	}
	
	
}
