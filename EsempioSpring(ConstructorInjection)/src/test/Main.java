package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import displayService.DisplayService;

//Il main esprime il modo in cui io voglio utilizzare la mia architettura software!! 
//Diciamo che è l'unica parte di codice che io posso sempre cambiare e rifare.
public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean_config.xml");
		
		DisplayService dispService=(DisplayService)context.getBean("_displayService");
		dispService.display();
		
	}

}
