package interfaces;

public interface IDisplayService 
{
	//Metodi Getter e Setter (Necessari per la Dependency Setter Injection)
	public TextFilePrinter getPrinter();
	public void setPrinter(TextFilePrinter my_printer);
	public void display();	
}
