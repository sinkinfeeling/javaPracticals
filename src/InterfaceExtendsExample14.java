interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class InterfaceExtendsExample14 implements B {
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    public void methodB() {
        System.out.println("Method B from interface B");
    }

    public static void main(String[] args) {
        InterfaceExtendsExample obj = new InterfaceExtendsExample();
        obj.methodA();
        obj.methodB();
    }
}
