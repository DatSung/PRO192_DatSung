package data;

import java.util.Scanner;

public class OperationSystem {
    private  String osName;
    private String osVersion;

    public OperationSystem(){
    }
    public OperationSystem(String osName, String osVersion) {
        this.osName = osName;
        this.osVersion = osVersion;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

//    FUNCTION
    public void inputOs(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter OS Name: ");
        osName = input.nextLine();
        System.out.println("Enter OS Version: ");
        osVersion = input.nextLine();
    }

    public void showOS(){
        this.toString();
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "osName='" + osName + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';
    }
}
