package s4c.microservices.GIS.model;

public class Geometry {
	
	private String type;
	private double[] coordinates;
	
	public Geometry(String type, double[] coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}

	public Geometry(String string, double d, double e) {
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}

}
