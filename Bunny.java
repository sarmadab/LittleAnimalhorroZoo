public class Bunny {

//Attributter (navneord)
//er altid private 
private String name = "stampe ";
private String colour = "Pink";
private String fur = "Fluffy";
private String personality = "Cute";
private String taste = "Delicious";
private String sound = "thhhhh";
private int weight = 2;
private int age = 5;

private int x = 0;
private int y = 0;


//metoder (handlinger) er altid public
public Bunny(String name, String colour, String fur, String personality, String taste, String sound, int age, int weight, int x, int y){
   this.name = name;
   this.colour = colour;
   this.fur = fur;
   this.personality = personality;
   this.taste = taste;
   this.sound = sound;
   this.weight = weight;
   this.age = age;
   
   this.x = x;
   this.y = y; 
}

//get metode
   public void tell(){
   System.out.println(" I am the " + name + " and i am standing on square" + x + "," + y);   
}
   public void setX(int x){
      this.x = x;
}
   
   public void setY(int y){
      this.y = y;
}
/*public void BunnyInfo(){
   System.out.println("Name:\t\t" + name);
   System.out.println("Colour:\t" + colour);
   System.out.println("Fur:\t" + fur);
   System.out.println("Weight:\t\t" + weight);
   System.out.println("Personality:\t" + personality);
   System.out.println("Age:\t" + age);
   System.out.println("Taste:\t\t" + taste);
*/
}
