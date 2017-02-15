package org.meron.string;

public class PlicyTest {

	public static void main(String[] args) {
		Policy[] p = {new Policy("a", "m"), new Policy("b", "m") , new Policy("c", "f") };
		
		for(Policy c : p){
			if(c.getType().equals("m")){
				System.out.println(c.getName());
			}				
		}
		
		for(int i =0 ; i < p.length ; i++){
			if(p[i].getType().equals("m")){
				System.out.println(p[i].getName());
			}
		}
	}

}

class Policy{
	String name, type;

	public Policy(String name , String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	
}