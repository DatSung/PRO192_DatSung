package ult;

import data.Service;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ServiceSet extends TreeSet<Service> {
    public boolean addService(Service x){
        return add(x);
        //Service ko phai String class nen minh phai lam compareTo o Service
    }
    //xuất tập các danh sách trong ServiceSet

    //xuất cây từ RNL
    public void displayAll_RNL(){
        Iterator<Service> x = descendingIterator();
        //iterator: duyệt 1 tập hợp bất kì
        while (x.hasNext()){
            System.out.println(x.next().toString()); //x.next: lấy node tiếp theo (con trỏ của đối tượng kế tiếp)
        }
    }
    public void displayAll_LNR(){
        Iterator<Service> x = iterator();
        while (x.hasNext()){
            System.out.println(x.next().toString());
        }
    }
    public Service getServiceById(int id){
        for (Service x : this) {
            if (x.getId() == id) return x;
        }
        return null;
    }

}
