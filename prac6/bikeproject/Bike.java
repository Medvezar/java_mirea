package bikeproject;

public class Bike implements BicycleManufacturer, BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike(){	
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor


	protected void printDescription()
	{
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

	@Override
	public void setHandleBars(String bars) {
		this.handleBars = bars;
	}

	@Override
	public String getHandeBars() {
		return this.handleBars;
	}

	@Override
	public void setFrame(String frame) {
		this.frame = frame;
	}

	@Override
	public String getFrame() {
		return this.frame;
	}

	@Override
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}

	@Override
	public String getTyres() {
		return this.tyres;
	}

	@Override
	public void setSeatType(String seat) {
		this.seatType = seat;
	}

	@Override
	public String getSeatType() {
		return this.seatType;
	}

	@Override
	public void setNumGears(int gears) {
		this.NumGears = gears;
	}

	@Override
	public int getNumGears() {
		return this.NumGears;
	}

}//end class Bike
	
	

