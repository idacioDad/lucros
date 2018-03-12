package mz.co.clabs.lucros.util;

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
