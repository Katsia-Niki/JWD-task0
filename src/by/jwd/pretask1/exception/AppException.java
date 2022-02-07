package by.jwd.pretask1.exception;

public class AppException extends Exception{
	
	public AppException() {
		super();
	}
	
	public AppException(String message) {
		super(message);
	}
	
	public AppException(Exception e) {
		super(e);
	}
	
	public AppException(String message, Exception e) {
		super (message, e);
	}
}
