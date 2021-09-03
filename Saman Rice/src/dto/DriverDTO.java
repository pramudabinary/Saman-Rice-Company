package dto;

public class DriverDTO {
    private String name;
    private String nic;
    private String license;
    private String address;
    private String contact;

    public DriverDTO() {
    }

    public DriverDTO(String name, String nic, String license, String address, String contact) {
        this.name = name;
        this.nic = nic;
        this.license = license;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", license='" + license + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
