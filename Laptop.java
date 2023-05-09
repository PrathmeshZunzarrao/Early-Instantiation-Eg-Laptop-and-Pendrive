package earlyInstantiation;

public class Laptop {

	String brand;
	int ram;
	boolean pendriveSlot;
	int storageCapacity;
	String colour;
	
	PenDrive p1 = new PenDrive("Sandisk", 16);
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String brand,int ram,boolean pendriveSlot,int storageCapacity,String colour)
	{
		this.brand = brand;
		this.ram = ram;
		this.pendriveSlot = pendriveSlot;
		this.storageCapacity = storageCapacity;
		this.colour = colour;
	}
	
	public void displayLaptop()
	{
		System.out.println("Laptop's Description"+"\n");
		
		System.out.println("Brand : "+ brand);
		System.out.println("Ram : "+ ram + "GB");
		System.out.println("Pendrive Slot : "+ pendriveSlot);
		System.out.println("Internal Storage : "+ storageCapacity + " GB");
		System.out.println("Colour : "+ colour);
		
		System.out.println("=================================");
	}
}
