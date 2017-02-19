package org.meron.string;

abstract public class AbstructConstructor {
	private final int height;
	private final int weight;
	
	public AbstructConstructor(){
		this.height =  myheight();
		this.weight = myweight();
		System.out.println(height);
	}
	
	abstract public int myheight();
	abstract public int myweight();
	
	public static void main(String args[]){
		//System.out.println(AbstructConstructor);
	}
}

