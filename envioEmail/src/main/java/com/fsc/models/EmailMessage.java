package com.fsc.models;

import java.util.List;

public class EmailMessage {

	private String assunto;
	
	private String mensagem;
	
	private String remetente;
	
	private List<String> destinatario;

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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
