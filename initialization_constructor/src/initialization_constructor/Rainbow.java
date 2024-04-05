package initialization_constructor;

public class Rainbow 
{
	int position;
	String colourname;
	int wavelength;
	int frequency;
	Rainbow(int position,String colourname,int wavelength,int frequency)
	{
		this.position=position;
		this.colourname=colourname;
		this.wavelength=wavelength;
		this.frequency=frequency;
	}
	void details()
	{
		System.out.println("position"+": "+position);
		System.out.println("colourname"+": "+colourname);
		System.out.println("wavelegth"+": "+wavelength);
		System.out.println("frequency"+": "+frequency+"Hz");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Rainbow R1=new Rainbow (1,"RED",750,480);
		Rainbow R2=new Rainbow (2,"ORANGE",620,510);
		Rainbow R3=new Rainbow (3,"YELLOW",590,530);
		Rainbow R4=new Rainbow (4,"GREEN",570,600);
		Rainbow R5=new Rainbow (5,"BLUE",495,670);
		Rainbow R6=new Rainbow (6,"INDIGO",480,700);
		Rainbow R7=new Rainbow (7,"VIOLET",450,750);

		R1.details();
		R2.details();
		R3.details();
		R4.details();
		R5.details();
		R6.details();
		R7.details();
		
		


	}
}
