package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, Parametrizado2Test.class,
		parametrizadoTest.class, PessoaTest.class, PessoaTest2.class,
		UtilArraysP1Test.class, UtilArraysTest.class,
		UtilidadesLibreriaTest.class })
public class AllTest2 {

}
