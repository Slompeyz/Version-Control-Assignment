/* ----------------------------------------------------------
 * Name: Richard Caraballo
 * Date: July 19, 2022
 * Purpose: To create 2 objects which extend an abstract class, requiring them to
 * have a Volume method along with inheriting the compareTo method so we can
 * compare their volumes.
 * ----------------------------------------------------------
 */
package cop2800;

public class Test{
	public static void main(String[] args){
		
		//creates a Cuboid and Cylinder object
		Shape3D box = new Cuboid(2,3,4);
		Shape3D tinCan = new Cylinder(4,7);
		
		//displays the objects' volumes
		System.out.println("box has a volume of: " + box.Volume());
		System.out.println("tinCan has a volume of: " + tinCan.Volume());
		
		//uses compareTo to print the bigger object
		if(box.compareTo(tinCan) < 1) {
			System.out.println("tinCan is bigger");
		}else if(box.compareTo(tinCan) == 0) {
			System.out.println("box and tinCan have the same volume");
		}else {
			System.out.println("box is bigger");
		}
		
	}

}
