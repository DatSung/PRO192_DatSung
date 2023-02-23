import java.util.Scanner;
public class Dog {
//    Đặc tính (Biến)
    private String name;
    private String id;
    private String bDay;

//    Khuôn, phễu
    public Dog(){
    }
    public Dog(String Nname, String Nid, String NbDay) {
        this.name = name;
        this.id = id;
        this.bDay = bDay;
    }
//Setter getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
    }

    //    Hanh động (Hàm)
    public void bark() {
        System.out.println("Gau Gau");
    }
    public void showProfile() {
        System.out.println(name + id + bDay);
    }

    public void inputDog() {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        id = input.nextLine();
        bDay = input.nextLine();
    }

}
