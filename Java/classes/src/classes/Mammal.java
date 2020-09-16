package classes;

public  abstract class Mammal extends Animal {
    
     String name; // ?? why not
     
     Mammal(){
       
     }
     
     Mammal(int weight){
    	 super(weight);  // call the parent's constructor with weight
     }
     
     Mammal(int weight, int num_legs){
    	 super(weight,num_legs);  // call the parent's constructor with weight
     }

}
