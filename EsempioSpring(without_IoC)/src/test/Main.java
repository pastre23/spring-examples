package test;
import displayService.DisplayService;
import interfaces.IDisplayService;

public class Main 
{
	public static void main(String[] args) 
	{
		IDisplayService dispService=(IDisplayService)new DisplayService("Display_WithoutSpring");
		dispService.display();
	}

}
