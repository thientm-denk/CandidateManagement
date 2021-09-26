/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


public class Fresher extends Person {

    private String graduationDate, graduationRank, education;

    public Fresher(String Candi, String phone, String email,
            String firstName, String lastName, String brirthDay, String address,
             String graduationDateString, String graduationRankString, String educationString) {
        super(Candi, phone, email, firstName, lastName, brirthDay, address);
        this.graduationDate= graduationDateString;
        this.graduationRank = graduationRankString;
        this.education = educationString;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void updateGraduationDate() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập ngày tốt nghiệp: ")).isEmpty()) {
            this.graduationDate = tmp;
        }
    }

    public void updateraduationRank() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập ranking: ")).isEmpty()) {
            this.graduationRank = tmp;
        }
    }

    public void updateEducation() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập Tên trường: ")).isEmpty()) {
            this.education = tmp;
        }
    }
    
    @Override
    public void pain() {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|", Candi, phone, email, lastName, firstName, brirthDay, address);
        System.out.printf("%-20s|%-20s|%-20s|", graduationDate, graduationRank, education);
    }

    @Override
    public void create(){
        super.create();
        setGraduationDate(library.Denk.inputString("Nhập ngày tốt nghiệp: "));
        setGraduationRank(library.Denk.inputString("Nhập ranking: "));
        setEducation(library.Denk.inputString("Nhập Tên trường: "));
    }
    
    @Override
    public void updateAll(){
        super.updateAll();
        updateGraduationDate();
        updateraduationRank();
        updateEducation();
    }
    
}
