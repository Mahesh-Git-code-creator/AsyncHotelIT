package com.ExceptionPage;

@SuppressWarnings("serial")
public class ErrorPage extends RuntimeException{
	
	public ErrorPage() {
		
		super("I think You are entered Wrong Browser name Except Chrome,Firefox, edge..");
		
	}

}
