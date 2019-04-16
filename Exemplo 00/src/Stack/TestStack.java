package Stack;

import java.util.*;
public class TestStack{
  public static void main(String args[]) {
    String s;
    Stack pilha = new Stack();
    pilha.push(new String("Um"));
    System.out.println("Topo da pilha = "+ (String) pilha.peek());
    pilha.push(new String("Dois"));
    System.out.println("Topo da pilha = "+ (String) pilha.peek());
    pilha.push(new String("Tres"));
    System.out.println("Topo da pilha = "+ (String) pilha.peek());
    int busca = pilha.search("Dois");
    if (busca != -1)
      System.out.println("Dois  posicao: " + busca + " da pilha");
    s =(String) pilha.pop();
    System.out.println("Retirado da pilha = " + s);
    s =(String) pilha.pop();
    System.out.println("Retirado da pilha = " + s);
    pilha.push(new String("Quatro"));
    System.out.println("Topo da pilha = "+ (String) pilha.peek());
    s =(String) pilha.pop();
    System.out.println("Retirado da pilha = " + s);
    s =(String) pilha.pop();
  }
}