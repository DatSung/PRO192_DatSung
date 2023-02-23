package tdo;

import data.Pet;
import data.Service;
import ult.PetList;

public class Tester {
    public static void main(String[] args) {
        Pet p1 = new Pet();
        p1.input();
        Service s1 = new Service(1, "Tia Long", 100);
        if(p1.addUsedService(s1))
            System.out.println("Add successful");
        Service s2 = new Service(20, "Tam", 200);
        if(p1.addUsedService(s2))
            System.out.println("Add successful");
        Service s3 = new Service(10, "Cat mong", 50);
        if(p1.addUsedService(s3))
            System.out.println("Add successful");

        System.out.println("Pet's information: ");
        p1.output();

        Pet p2 = new Pet();
        p2.input();
        p2.addUsedService(s1);
        p2.addUsedService(s2);
        p2.output();

        //add Pet vào Petlist
        PetList list = new PetList();
        list.add(p1);
        list.add(p2);
        p1.sortUsedServiceById();
        list.sortById();
        System.out.println("Pet's list is updated: ");
        list.display();



    }
}
