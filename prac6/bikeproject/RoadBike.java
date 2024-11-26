package bikeproject;

public class RoadBike extends Bike implements BicycleManufacturer, RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	@Override
	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription

	@Override
	public int getTireWidth() {
		return this.tyreWidth;
	}

	@Override
	public void setTyreWidth(int num) {
		this.tyreWidth = num;
	}

	@Override
	public int getPostHeight() {
		return this.postHeight;
	}

	@Override
	public void setPostHeight(int num) {
		this.postHeight = num;
	}
}//end class RoadBike
