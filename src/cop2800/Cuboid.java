package cop2800;

public class Cuboid extends Shape3D{

	int width;
	int depth;
	int height;
	
	//Cuboid constructor
	public Cuboid(int width,int depth,int height){
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	//returns the volume of the Cuboid object
	public double Volume(){
		return (width*depth*height);
	}
	
}
