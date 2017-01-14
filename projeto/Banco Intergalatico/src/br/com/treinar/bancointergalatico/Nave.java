package br.com.treinar.bancointergalatico;

public class Nave {
	
	public String nome;
	public Integer hp;
	public Boolean lightSpeed;
	public Missil missil;
	
	public Nave(String nome, Integer pot){
		this.nome = nome;
		this.hp = pot;
	}
	
	public void dobraEspacial(Boolean b){
			lightSpeed = b;
	}
	
	public Missil atirar(int x, int y){
		Missil m = new Missil();
		m.setTarget(x, y);
		
		return m;
	}
}
