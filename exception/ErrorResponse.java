package com.webModule.webService.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	private String status;
    private String message;
    private String code;

    public ErrorResponse(Throwable e){
        this.setStatus(HttpStatus.BAD_REQUEST.name());
        this.setMessage(getErrorMessageByType(e));
        this.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
    }
    private String getErrorMessageByType(Throwable e) {
		String message = "";
		if(e.getClass().equals(NoSuchFieldException.class)) {
			message = String.format("Invalid Key Error : %s", e.getMessage());
		} else {
			message = e.getMessage();
		}
    	return message;
	}
	public ErrorResponse RaiseError() {
    	return this;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
