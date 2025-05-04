package es.codeurjc.test.web;

import jakarta.validation.constraints.NotBlank;

public class Message {

	@NotBlank(message = "El título es obligatorio")
	private String title;

	@NotBlank(message = "El body es obligatorio")
	private String body;
	
	public Message() {
		
	}

	public Message(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Message [title=" + title + ", body=" + body + "]";
	}

}
