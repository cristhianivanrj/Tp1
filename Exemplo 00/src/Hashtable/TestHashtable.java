package Hashtable;
import java.util.Hashtable;


public class TestHashtable {
  public static void main(String args[]) {
    Hashtable TabelaEstudantes = new Hashtable();
    TabelaEstudantes.put("9716093",new Estudante("Andre Barnabe", "9716093", 8.0f));
    TabelaEstudantes.put("9717000",new Estudante("Beatriz Amaro", "9717000", 7.5f));
    TabelaEstudantes.put("9716127",new Estudante("Tales Raduan","9716127", 6.5f));
    TabelaEstudantes.put("8711970",new Estudante("Vitor Brandi","8711970", 3.5f));
    Estudante estudante = (Estudante) TabelaEstudantes.get("8711970");
    System.out.println("Aluno: ");
    System.out.println(estudante);
    Estudante estudante1 = (Estudante) TabelaEstudantes.get("8611970");
    System.out.print("Aluno: ");
    System.out.println(estudante1);
  }
}