package Hashtable;

class Estudante {
	  String nome;
	  String RA;
	  float media;
	  
	  Estudante(String nome, String RA, float media) { 
	    this.nome = new String(nome);
	    this.RA = new String(RA);
	    this.media = media;
	  }
	  public String toString(){
	    return("Nome: " + nome + "\nRA: " + RA +"\nMedia.: " + media);
	  }
	}