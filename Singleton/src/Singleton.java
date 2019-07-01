
// Singleton.java
// Demonstra o padrão de design Singleton
public final class Singleton
{
// Objeto Singleton a ser retornado por getSingletonInstance
private static final Singleton singleton = new Singleton();
// construtor privado impede a instanciação pelos clientes
private Singleton()
{
System.err.println( "Singleton object created." );
} // fim do construtor Singleton
// retorna o objeto Singleton estático
public static Singleton getInstance()
{
return singleton;
} // fim do método getInstance
} // fim da classe Singleton
