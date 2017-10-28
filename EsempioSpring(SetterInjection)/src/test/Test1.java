package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.IDisplayService;

//Il main esprime il modo in cui io voglio utilizzare la mia architettura software!! 
//Diciamo che è l'unica parte di codice che io posso sempre cambiare e rifare.
public class Test1 
{
	public static void main(String[] args) 
	{
		//Nel momento in cui viene istanziato l'oggetto context, scorrendo il file xml
		//vengono creati e istanziati i beans al suo interno. 
		//Tali beans potranno poi essere richiamati in seguito tramite la funzione
		//getBean("nomeBeanNelFileXML")
		ApplicationContext context= new ClassPathXmlApplicationContext("bean_config.xml");
		
		//Richiamo il bean di cui voglio invocare la funzione!
		IDisplayService dispService=(IDisplayService)context.getBean("_displayService");
		dispService.display();
		
	}

}
