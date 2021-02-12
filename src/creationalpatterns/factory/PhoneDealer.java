package creationalpatterns.factory;

public class PhoneDealer {
    public static void main(String[] args) {

        Phone s8 = PhoneFactory.getPhone("s8","2600mah",4,6);
        Phone note8 = PhoneFactory.getPhone("note8","3000mah",5,8);

        System.out.println("Features of S8: ");
        System.out.println(s8);
        System.out.println("Features of Note8: ");
        System.out.println(note8);
    }
}
