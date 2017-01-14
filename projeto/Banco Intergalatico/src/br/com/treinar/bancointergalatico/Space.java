package br.com.treinar.bancointergalatico;

public class Space {
	public static void main(String[] args) {
		
		Nave n = new Nave("Enterprise", 999999);
		int y = (int)(Math.random()*100);
		
		while(y==0){
			y = (int)(Math.random()*100);
		}
		
		n.atirar((int)(Math.random()*10), y);
	}
}
