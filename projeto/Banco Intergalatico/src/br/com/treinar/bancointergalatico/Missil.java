package br.com.treinar.bancointergalatico;

public class Missil {
	
	public Integer targetX;
	public Integer targetY;
	
	
	public void setTarget(int _x, int _y){
		targetX = _x;
		targetY = _y;
		
		System.out.println(hit(targetX, targetY));
	}
	
	public String hit(int x, int y){
		if(x%y ==0){
			return "Acertou o alvo!";
		}
		else{
			return "Errou!";
		}
	}
}
