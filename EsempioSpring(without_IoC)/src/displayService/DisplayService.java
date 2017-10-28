package displayService;
import interfaces.IDisplayService;
import interfaces.TextFilePrinter;
import printers.DocTextFilePrinter;

/*
 * DisplayService sarà incaricato di ricevere un file testo (il cui tipo(txt, odt o doc) sarà deciso dallo stakeholder
 * al momento della commissione e gestirlo nel modo opportuno
 * 
 */

public class DisplayService implements IDisplayService
{
	private TextFilePrinter printer;
	private String disp_name;
	
	//Costruttore
	public DisplayService(String name)
	{
		printer=new DocTextFilePrinter(); //dipendenza 
		this.disp_name=name;
	}
	
	public void display() 
	{
		System.out.println("I'm "+ disp_name);
		printer.print();
	}
}
