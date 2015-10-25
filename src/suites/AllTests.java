package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import manipulacao.LoginTest;
import manipulacao.NovoPedidoTest;

@RunWith(Suite.class)
@SuiteClasses({LoginTest.class, NovoPedidoTest.class})
public class AllTests {

}
