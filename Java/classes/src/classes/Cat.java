package classes;  // collection of classes (kind of like friends)


// Every Class in Java is a sub-class of a class called Object.

// We are saying that Cat is an Object 
// toString must belong to the class called Object

// Cat is a Mamal
// C++  Cat :public Mamal ...


//  Cat IS-A Mamal 

public class Cat extends Mamal {
	
   // public, private or protected?
   // in C++ name and weight are private.
   // However in Java name, weight are package 
	
   String name;
   int weight;
   
   // just like C++ -- this is a constructor 
   // called when we do new
   
   Cat(){
	   System.out.println("called when created");
   }

   Cat(String name, int weight){
	   // this means "me" 
	   this.weight = weight;
	   this.name = name;
   }
   
   void speak() {
	   // print meow
	   System.out.println("ニャー");
   }
 
   // this is my "printed" representation of the class. 
   // toString is overridden from a Parent class. 
   // similar to overloading in C++
   
   public String toString() {
	 
	   String printable= "{ اسم="+name+" وزن="+weight+"}";
	   return printable;
   }
   
   
}
