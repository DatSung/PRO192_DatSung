package demothrow;

public class Pet {
    int id;
    String name;
    public Pet() {

    }

    public void input() throws Exception {
//        try {
//            id = MyLib.inputNumber(1,1000);
//        } catch (Exception e) {
//            System.out.println("Id is invalid");
//        }
        id = MyLib.inputNumber(1,1000);
    }
}
