package mz.co.clabs.lucros.util;

/**
 * Enumeracao que contem  estados de  Entidade
 * @author Clerio Alfredo Faife
 * @since  13/03/2018
 * {@value Activo e Inactivo}
 *
 */
public enum EEntityState {
	
	
	ACTIVE(1), 
	
	INACTIVE(0);
	
	private int state;
	
	EEntityState(int state){
		this.state=state;
	}
	EEntityState(){
		 
	}
	public int getState(){
		return state;
	}
	

}
