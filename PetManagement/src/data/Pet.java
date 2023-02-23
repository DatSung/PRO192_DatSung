package data;

import java.util.*;

public class Pet {
    private int id;
    private String name;
    ArrayList <Service> serviceList = new ArrayList<>();
    public Pet(){

    }
    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //Method
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        name = sc.nextLine().trim();
    }
    public void output(){
        System.out.printf("|PET|%-4d|%10s|\n", id, name);
        System.out.println("Pet's services: ");
        for (Service x :serviceList) {
            System.out.println(x.toString());
        }
    }
    public void sortUsedServiceById(){
        Collections.sort(serviceList, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
    }

    //add dich vu cho Pet
    //1 con Pet co nhung dich vu....
    public boolean addUsedService(Service x){
        return serviceList.add(x);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
