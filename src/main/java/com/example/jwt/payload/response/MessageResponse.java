package com.example.jwt.payload.response;

public class MessageResponse {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageResponse(String message) {
		super();
		this.message = message;
	}

	public MessageResponse() {
		super();
	}

	@Override
	public String toString() {
		return "MessageResponse [message=" + message + "]";
	}

}
