class Polymorphism {
    public void AnimalSound() {
        System.out.println("Animal makes different sounds");
    }
}
    class Dog extends Polymorphism
    {
        public void AnimalSound()
        {
            System.out.println("Dog sounds like: Bow Bow");
        }
    }
    class Pig extends Polymorphism
    {
        public void AnimalSound()
        {
            System.out.println("Pig sounds like: Eww Eww");
        }
    }
    class Main
    {
        public  static void main(String[]args)
        {
            Polymorphism myObj = new Polymorphism();
            Polymorphism myObj1 = new Dog();
            Polymorphism myObj2 = new Pig();
            myObj.AnimalSound();
            myObj1.AnimalSound();
            myObj2.AnimalSound();

        }
    }
//Different classes with same method AnimalSound.