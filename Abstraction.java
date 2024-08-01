abstract class Abstraction {
    abstract void animalSounds();

    void sound() {
        System.out.println("ewwww");
    }
}
    class Dog2 extends Abstraction
    {
        public void animalSounds()
        {
            System.out.println("Dog sound like : bow bow");
        }
    }
    class Main2
    {
        public static void main(String[] args)
        {
            Dog2 myObj = new Dog2();
            myObj.sound();
            myObj.animalSounds();
        }
    }
//To achieve security - hide certain details and only show the important details of an object.