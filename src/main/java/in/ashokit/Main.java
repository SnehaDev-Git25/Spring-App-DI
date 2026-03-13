package in.ashokit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		ATM atm = ctxt.getBean(ATM.class);
		
		atm.withdraw();
		atm.showBalance();
	}

	}


