
public class SingletonTest {

	// executa SingletonExample
	public static void main( String[] args )
	{
	Singleton firstSingleton;
	Singleton secondSingleton;
	// cria objetos Singleton
	firstSingleton = Singleton.getInstance();
	secondSingleton = Singleton.getInstance();
	// o dois "Singletons" devem se referir ao mesmo Singleton
	if (firstSingleton == secondSingleton )
	System.err.println( "firstSingleton and secondSingleton " +
	"refer to the same Singleton object" );
	} // fim de main
	} // fim da classe SingletonTest


