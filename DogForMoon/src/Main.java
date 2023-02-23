public class Main {
    public static void main(String[] args) {
        Dog Phuc = new Dog();
        Dog Tuan = new Dog();
        Dog Nhan = new Dog("Hoang Nhan", "Se1723234234", "2003");

        Phuc.inputDog();
        Tuan.inputDog();

        Phuc.bark();
        Tuan.showProfile();
        Phuc.showProfile();

        System.out.println(Phuc.getName());
    }
}