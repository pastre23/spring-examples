package printers;
import interfaces.TextFilePrinter;

public class TxtTextFilePrinter implements TextFilePrinter 
{
	public void print() 
	{
		System.out.println("This is a textfile .txt!!");
	}

}
