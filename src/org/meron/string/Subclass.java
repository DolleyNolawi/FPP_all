package org.meron.string;

public class Subclass extends AbstructConstructor {
	public final int  height;
	//public int weight;
	
	public Subclass(int height ){
		this.height = height;
		//this.weight = weight;
	}
	@Override
	public int myheight() {
		return height;
	}

	@Override
	public int myweight() {
		return height;
	}
	
	
	public static void main(String[] args){
	
		AbstructConstructor sub = new Subclass(2);
		System.out.println(sub.myheight());
		
	}
	

}
