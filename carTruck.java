package assignment_6_oops;

public class carTruck {
	String name;
	String model;
	int avg;
	int warrentyYears;
	String cost;

	carTruck(String name, String model, int avg, int warrentyYears, String cost) {
		this.name = "car";
		this.model = "mercedes";
		this.avg = 40;
		this.warrentyYears = 8;
		this.cost = "1 crore";
	}

	carTruck(String name

			, int avg, int warrentyYears, String cost) {
		this.name = "truck";
		this.avg = 60;
		this.warrentyYears = 6;
		this.cost = "4 Lack";
	}

	public String toString()

	{
		return ("Name of vehicle::" + this.name + "\n" + "Name of model::" + this.model + "\n" + "avarage km per hr::"
				+ this.avg + "\n" + "warrenty in years::" + this.warrentyYears + "\n" + "cost of vehicle::"
				+ this.cost);
	}




	public static void main(String args[]) {
		carTruck v1 = new carTruck("", "", 30, 5, "");
		carTruck v2 = new carTruck("", 0, 0, "");

		System.out.println(v1);
		System.out.println();
		System.out.println(v2);
	}

}


