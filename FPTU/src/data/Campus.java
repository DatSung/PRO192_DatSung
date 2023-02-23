package data;

public class Campus {
    private String campusCode;
    private String campusName;
    private String campusAddress;

    public Campus(String campusCode, String campusName, String campusAddress) {
        this.campusCode = campusCode;
        this.campusName = campusName;
        this.campusAddress = campusAddress;
    }

    public String getCampusCode() {
        return campusCode;
    }

    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getCampusAddress() {
        return campusAddress;
    }

    public void setCampusAddress(String campusAddress) {
        this.campusAddress = campusAddress;
    }
}
