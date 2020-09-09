package classes;

public class Cat {
	
   // public, private or protected?
   String name;
   int weight;
   
   Cat(){
	   
   }

   Cat(String name, int weight){
	   this.weight = weight;
	   this.name = name;
   }
   
   void speak() {
	   // print meow
	   System.out.println("ニャー");
   }
 
   public String toString() {
	   String printable= " اسم="+name+" وزن="+weight;
	   return printable;
   }
   
}
