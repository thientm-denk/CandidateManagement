/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Intern extends Person {

    private String majors, semester, universityName;

    public Intern(String Candi, String phone, String email, String firstName, String lastName,
            String brirthDay, String address, String majors, String semester, String universityName) {
        super(Candi, phone, email, firstName, lastName, brirthDay, address);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    @Override
    public void create() {
        super.create();
        setCandi(library.Denk.inputString("Nhập chuyên ngành: "));
        setPhone(library.Denk.inputString("Nhập Tên trường đại học: "));
        setEmail(library.Denk.inputString("Nhập học kỳ: "));
    }

    @Override
    public void updateAll() {
        super.updateAll();
        udateCandi();
        updatePhone();
        updateEmail();
    }

    public void udateCandi() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập chuyên ngành: ")).isEmpty()) {
            this.majors = tmp;
        }
    }

    public void updatePhone() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Tên trường đại học: ")).isEmpty()) {
            this.universityName = tmp;
        }
    }

    public void updateEmail() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập học kỳ:")).isEmpty()) {
            this.semester = tmp;
        }
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void pain() {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|", Candi, phone, email, lastName, firstName, brirthDay, address);
        System.out.printf("%-20s|%-20s|%-20s|", majors, semester, universityName);
    }

}
