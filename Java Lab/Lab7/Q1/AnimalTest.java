package Q1;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

		Vet vet = new Vet("james");
		vet.vaccinate(cat);
		vet.vaccinate(dog);

		}
}