package classes;

public abstract class Animal {
	 int weight;
	 
	 int num_legs = 0;
	 leg    []  legs;  // legs is an address to an array of "leg"

	 Animal(){
		 
	 }
	 
	 Animal(int weight){
		 this.weight = weight;
	 }
	 
	 Animal(int weight, int num_legs){
		 this.weight = weight;
		 legs = new leg[num_legs]; // create an array of addresses of leg(s)
		 
		 // we are actually creating EACH leg
		 for(int i=0; i<num_legs;i++) {
			 legs[i]= new leg();
		 }
		 
		 
	 }
}
