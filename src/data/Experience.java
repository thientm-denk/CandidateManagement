/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

public class Experience extends Person {

    private int expInYear;
    private String proSkill;
    
    public Experience(){};
    public Experience(String Candi, String phone, String email,
            String firstName, String lastName, String brirthDay, String address,
             int expInYear, String proSkill) {
        super(Candi, phone, email, firstName, lastName, brirthDay, address);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

   

    @Override
    public void create(){
        super.create();
        setExpInYear(library.Denk.inputInteger("Nhập số năm kinh nghiệm: "));
        setProSkill(library.Denk.inputString("Nhập kỹ năng đặc biệt: "));
    }
     
    @Override
    public void updateAll(){
       super.updateAll();
       updateExpInYear();
       updateProSkill();
    }

    public void updateExpInYear() {
        this.expInYear = library.Denk.inputInteger("Nhập số năm kinh nghiệm: ");
    }

    public void updateProSkill() {
        String tmp;
        if (!(tmp = library.Denk.inputString("Nhập kỹ năng đặc biệt: ")).isEmpty()) {
            this.proSkill = tmp;
        }
    }
    
    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    

    @Override
    public void pain() {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|", Candi, phone, email, lastName, firstName, brirthDay, address);
        System.out.printf("%-3d|%-20s|\n", expInYear, proSkill);
    }

    
}
