class Inheritance {
    protected String car_name = "Ford";

    protected void horn() {
        System.out.println("pom, pom");
    }

    public void setHorn() {
        horn();
    }
}

class Car extends Inheritance {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setHorn();
    }
}
