package sowndv02.quiz.exception;

public class SubjectNotFoundException extends RuntimeException{
	
	public SubjectNotFoundException() {
		super("Subject not found!");
	}

}
