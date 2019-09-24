package sourceCode.basics.superEx;

class Animal
{
	public void eat()
	{
		System.out.println("Animal Eat!!");
	}
}

class Dog extends Animal
{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//super.eat();
		System.out.println("Bark and Cut!!");
	}
}
public class SuperDemo1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.eat();
		
	}

}
