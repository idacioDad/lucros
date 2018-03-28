package mz.co.clabs.lucros.exception;

/**
 * 
 * @author clabs programmer
 *
 */
public class CompanyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  CompanyException(){
		super("Empresa ja existente...");
	}

}
