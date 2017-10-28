package printers;
import interfaces.TextFilePrinter;

public class DocTextFilePrinter implements TextFilePrinter 
{

	@Override
	public void print() 
	{
		System.out.println("This is a textfile .doc!!");
	}

}
