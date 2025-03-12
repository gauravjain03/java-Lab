class Basic {
    int id;
    String name;

    Basic() {
        System.out.println("Default Constructor");
    }

    Basic(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parametrized Constructor");
    }

    Basic(Basic s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Basic s1 = new Basic();
        s1.display();

        Basic s2 = new Basic(1, "Gaurav");
        s2.display();

        Basic s3 = new Basic(s2);
        s3.display();
    }
}