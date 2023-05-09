package earlyInstantiation;

public class PenDrive {
	
	
	String brand;
	int storageCapacaity;
	
	
	public PenDrive() {
		// TODO Auto-generated constructor stub
	}
	
	public PenDrive(String brand,int storageCapacaity)
	{
		this.brand = brand;
		this.storageCapacaity = storageCapacaity;
	}
	
	public void displayPendrive()
	{
		System.out.println("Pendrive's Description"+"\n");
		
		System.out.println("Brand Name : " + brand);
		System.out.println("Storage Capacity : " + storageCapacaity + " GB");
		
		System.out.println("=================================");
	}
	
}
