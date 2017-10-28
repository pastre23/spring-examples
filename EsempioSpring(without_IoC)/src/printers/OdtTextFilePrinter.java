package printers;
import interfaces.TextFilePrinter;

public class OdtTextFilePrinter implements TextFilePrinter 
{
	@Override
	public void print() 
	{
		System.out.println("This is a textfile .odt!!");
	}

}
