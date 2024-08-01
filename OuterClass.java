class OuterClass {
    int x = 10;

    static class InnerClass {
        public int InnerMethod()
        {
            OuterClass outer = new OuterClass();
            return outer.x;
        }

        static class InnerClass2 {
            int y = 5;
        }
    }
}

    class Main3 {
    public static void main(String[] args) {
        OuterClass myObj = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        OuterClass.InnerClass.InnerClass2 myInner2 = new OuterClass.InnerClass.InnerClass2();
        System.out.println(myObj.x + myInner2.y);
    }
}




