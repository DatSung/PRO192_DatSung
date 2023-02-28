package data;

import ult.PetList;

public class Customer {
    private String name;
    private PetList bosses = new PetList();
    public Customer(){
        
    }
    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetList getBosses() {
        return bosses;
    }

    public void setBosses(PetList bosses) {
        this.bosses = bosses;
    }
    public void output(){
        System.out.println("customer name : " + name);
        System.out.println("Pet list: ");
        bosses.display();
    }
    //thêm 1 pet vào bosses của khách hàng
    public void addPet(Pet x){
        if(bosses.add(x))
            System.out.println("added");
        else System.out.printf("Error, try again");
    }
    //xóa 1 pet khỏi danh sách
    public void removePet(int id){
        int index = bosses.findPetIndexById(id);
        bosses.removePetById(index);
    }
}
