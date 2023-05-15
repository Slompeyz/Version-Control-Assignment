package cop2800;

abstract public class Shape3D implements Comparable<Shape3D>{
	
	//an abstract method subclasses of Shape3D must have
	abstract public double Volume();
	
	//method that returns a value based on which Shape3D object has more volume
	public int compareTo(Shape3D other){
		if(this.Volume() > other.Volume()){
			return 1;
		}else if(this.Volume() > other.Volume()){
			return -1;
		}else{
			return 0;
		}
	}
	
}
