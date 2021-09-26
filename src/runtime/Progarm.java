/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.Experience;
import data.Person;
import java.util.ArrayList;


public class Progarm {
    public static void main(String[] args) {

        // mảng tự co dãn, không giới hạn trước số phần tử
        ArrayList<Person> candidates = new ArrayList<>();
        // chạy tới khi người dùng chọn thoát
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createCandidate(candidates, 0);
                    break;
                case 2:
                    Manager.createCandidate(candidates, 1);
                    break;
                case 3:
                    Manager.createCandidate(candidates, 2);
                    break;
                case 4:
                    Manager.searchCandidate(candidates);
                    break;
                case 5:
                    Manager.updateCandite(candidates);
                    break;    
                case 6:
                    Manager.deleteCandite(candidates);
                    break;    
                case 7:
                    return;
            }
        }
    }
}
