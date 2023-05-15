package cop2800;

public class Cylinder extends Shape3D{

	int radius;
	int height;
	
	//Cylinder constructor
	public Cylinder(int radius,int height){
		this.radius = radius;
		this.height = height;
	}

	//returns the volume of the Cylinder object
	public double Volume(){
		return (Math.PI * radius * height);
	}
	
}
