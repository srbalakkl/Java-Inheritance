package methodOverloading;

class P{
    public void job(){
        System.out.println("parents dream is family bussiness");
    }
}
class C extends P {
    public void job(){
        System.out.println("child's dream is sec govt job");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("asdfsdf");

        P p1 = new P();
        p1.job();

        C c1 = new C();
        c1.job();

        P b = new C();
        b.job();
    }
}
