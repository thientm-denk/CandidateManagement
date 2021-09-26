/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Experience;
import data.Fresher;
import data.Intern;
import data.Person;
import java.util.ArrayList;

/**
 *
 * @author Truc Tran 2T Design
 */
class Manager {

    public static int menu() {
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Update");
        System.out.println("6. Delete");
        System.out.println("7. Exit");
        int choice = library.Denk.inputInteger("Enter your choice: ", 1, 7);
        return choice;
    }

    //lựa chọn 1 - 3
    public static void createCandidate(ArrayList<Person> candidates, int type) {
        // nhập hoài 1 thằng luôn
        while (true) {
            Person candidate = new Person();
            candidate.create();

            //check id exist or not. đúng thì
            if (checkIdExist(candidates, candidate.getCandi(), "ID ĐÃ TỒN TẠI\n")) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!library.Denk.checkInputYN()) {
                return;
            }
        }
    }
//    lựa chọn 1

    public static void createExperience(ArrayList<Person> candidates, Person candidate) {
        int yearExperience = library.Denk.inputInteger("Nhập số năm kinh nghiệm: ", 0, 100);
        String professionalSkill = library.Denk.inputString("Kỹ năng đặc biệt: ");
        candidates.add(new Experience(candidate.getCandi(), candidate.getPhone(), candidate.getEmail(), candidate.getFirstName(), candidate.getLastName(), candidate.getBrirthDay(),
                candidate.getAddress(), yearExperience, professionalSkill));
        System.err.println("Create success.");
    }
//lựa chọn 2

    private static void createFresher(ArrayList<Person> candidates, Person candidate) {
        String graduationDate = library.Denk.inputString("Nhập ngày tốt nghiệp: ");
        String graduationRank = library.Denk.inputString("Nhập hành tích: ");
        String education = library.Denk.inputString("Nhập tên trường: ");
        candidates.add(new Fresher(candidate.getCandi(), candidate.getPhone(), candidate.getEmail(), candidate.getFirstName(), candidate.getLastName(), candidate.getBrirthDay(),
                candidate.getAddress(), graduationDate, graduationRank, education));
        System.err.println("Create success.");
    }
//lựa chọn 3

    private static void createInternship(ArrayList<Person> candidates, Person candidate) {
        String major = library.Denk.inputString("Nhập nghề: ");
        String semester = library.Denk.inputString("Nhập học kỳ: ");
        String university = library.Denk.inputString("Nhập tên trường: ");
        candidates.add(new Intern(candidate.getCandi(), candidate.getPhone(), candidate.getEmail(), candidate.getFirstName(), candidate.getLastName(), candidate.getBrirthDay(),
                candidate.getAddress(), major, semester, university));
        System.err.println("Create success.");
    }
// lựa chọn 4

    public static void searchCandidate(ArrayList<Person> candidates) {
        printListNameCandidate(candidates);
        String nameSearch = library.Denk.inputString("Enter andidate name (First name or Last name): ");
        for (Person candidate : candidates) {
            if (candidate.getFirstName().contains(nameSearch)
                    || candidate.getLastName().contains(nameSearch)) {
                candidate.pain();
            }
        }
    }

    public static boolean checkIdExist(ArrayList<Person> candidates, String id, String mess) {
        for (Person candidate : candidates) {
            if (candidate.getCandi().equalsIgnoreCase(id)) {
                System.err.printf(mess);
                return false;
            }
        }
        return true;
    }

    public static void printListNameCandidate(ArrayList<Person> candidates) {
        System.out.printf("$$$$ Experience Candidate $$$$\n");
        for (Person candidate : candidates) {
            if (candidate instanceof Experience) { // candidate là exp thì... (instanceof)
                System.out.println("ID: " + candidate.getCandi() + " " + candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.printf("$$$$ Fresher Candidate $$$$\n"); // candidate là Fresher thì... (instanceof)
        for (Person candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println("ID: " + candidate.getCandi()+ " " + candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.printf("$$$$ Internship Candidate $$$$\n"); // candidate là Internship thì... (instanceof)
        for (Person candidate : candidates) {
            if (candidate instanceof Intern) {
                System.out.println("ID: " + candidate.getCandi()+ " " + candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }
// update theo id
    public static void updateCandite(ArrayList<Person> candidates) {
        if(candidates.isEmpty()){
            System.out.printf("Mảng trống\n");
            return;
        }
        printListNameCandidate(candidates);
        String id = library.Denk.inputString("Enter Id candidates to update: ");
        if (!checkIdExist(candidates, id,"")) {
            for (Person candidate : candidates) {
                if (candidate.getCandi().equalsIgnoreCase(id)) {
                    candidate.updateAll();
                }
            }
        }else{
            System.out.println("ID không tồn tại");
        }
    }
//  xóa phần tử theo id   
    public static void deleteCandite(ArrayList<Person> candidates) {
        if(candidates.isEmpty()){
            System.out.printf("Mảng trống\n");
            return;
        }
        
        printListNameCandidate(candidates);
        String id = library.Denk.inputString("Enter Id candidates to delete: ");
        int flag = -1;
        int index = 0;
        if (!checkIdExist(candidates, id,"")) {
            for (Person candidate : candidates) {
                if (candidate.getCandi().equalsIgnoreCase(id)) {
                    flag = index;
                }
                index++;
            }
        }else{
            System.out.println("ID không tồn tại");
        }
        
        if(flag != -1){
            candidates.remove(flag);
            System.out.println("Xóa thành công");
        }
        
    }
    
    
}
