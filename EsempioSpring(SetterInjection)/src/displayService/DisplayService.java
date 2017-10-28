package displayService;
import interfaces.IDisplayService;
import interfaces.TextFilePrinter;

/*
 * DisplayService sarà incaricato di ricevere un file testo (il cui tipo(txt, odt o doc) sarà deciso dallo stakeholder
 * al momento della commissione e gestirlo nel modo opportuno
 * 
 */

public class DisplayService implements IDisplayService
{
	//Questa è solo un interfaccia!!
	//ATTENZIONE AL NOME DI MY_PRINTER!!!
	private TextFilePrinter my_printer;
	private String disp_name;
	
	//Costruttore
	public DisplayService()
	{
		//vuoto
	}
	
	//Metodi Getter e Setter (Necessari per la Dependency Setter Injection)
	public TextFilePrinter getPrinter() 
	{
		return my_printer;
	}

	public void setPrinter(TextFilePrinter my_printer) 
	{
		this.my_printer = my_printer;
	}

	public String getDispName() 
	{
		return disp_name;
	}

	public void setDispName(String name) 
	{
		this.disp_name = name;
	}

	
	public void display() 
	{
		System.out.println("I'm "+ disp_name);				
		my_printer.print();
	}
}
