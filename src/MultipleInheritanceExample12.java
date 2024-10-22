interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MultipleInheritanceExample12 implements Printable, Showable {
    public void print() {
        System.out.println("Printable interface method.");
    }

    public void show() {
        System.out.println("Showable interface method.");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.print();
        obj.show();
    }
}
