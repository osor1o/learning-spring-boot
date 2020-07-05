package com.learning.api.responses;

import java.util.ArrayList;
import java.util.List;

public class ExampleResponse<T> {
	private T data;
	private List<String> errors;
	
	public ExampleResponse() {	
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErrors() {
		if (errors == null) {
			errors = new ArrayList<String>();
		}
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
