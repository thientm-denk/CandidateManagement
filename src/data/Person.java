/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


public class Person {
    protected String Candi, phone, email;
    protected String firstName, lastName, brirthDay, address;

    public Person() {
    }

    ;
    public Person(String Candi, String phone, String email, String firstName, String lastName, String brirthDay, String address) {
        this.Candi = Candi;
        this.phone = phone;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.brirthDay = brirthDay;
        this.address = address;
    }

    public void create() {
        setCandi(library.Denk.inputString("Nhập ID: "));
        setPhone(library.Denk.inputString("Nhập Số điện thoại: "));
        setEmail(library.Denk.inputString("Nhập Gmail: "));
        setFirstName(library.Denk.inputString("Nhập Tên: "));
        setLastName(library.Denk.inputString("Nhập Họ: "));
        setBrirthDay(library.Denk.inputString("Nhập Sinh Nhật: "));
        setAddress(library.Denk.inputString("Nhập Địa chỉ: "));
    }

    public void updateAll() {
        updateCandi();
        updatePhone();
        updateEmail();
        updateFirstName();
        updateLastName();
        updateBrirthDay();
        updateAddress();
    }

    public void updateCandi() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập ID: ")).isEmpty()) {
            this.Candi = tmp;
        }
    }

    public void updatePhone() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Số điện thoại: ")).isEmpty()) {
            this.phone = tmp;
        }
    }

    public void updateEmail() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Gmail: ")).isEmpty()) {
            this.email = tmp;
        }
    }

    public void updateFirstName() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Tên: ")).isEmpty()) {
            this.firstName = tmp;
        }
    }

    public void updateLastName() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Họ: ")).isEmpty()) {
            this.lastName = tmp;
        }
    }

    public void updateBrirthDay() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Sinh nhật: ")).isEmpty()) {
            this.brirthDay = tmp;
        }
    }

    public void updateAddress() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập địa chỉ: ")).isEmpty()) {
            this.address = tmp;
        }
    }

    public String getCandi() {
        return Candi;
    }

    public void setCandi(String Candi) {
        this.Candi = Candi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBrirthDay() {
        return brirthDay;
    }

    public void setBrirthDay(String brirthDay) {
        this.brirthDay = brirthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void pain() {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n", Candi, phone, email, lastName, firstName, brirthDay, address);
    }

}
