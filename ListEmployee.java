/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yang
 */
public class ListEmployee {
    static ArrayList<Employee> ls = new ArrayList<>();
    private void yChoice() {
        
    }
    public void inputs(){
        String choice = "y";
        Scanner sc = new Scanner(System.in);
        do {            
            Employee e = new Employee();
            e.input();
            ls.add(e);
            System.err.println("Continue?(Y/N)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
    }
    public void outputs(){
        for (Employee ee : ls) {
            ee.output();
        }
    }
    public int findById(int id){
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if (ee.getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void outputByPosition(int pos){
        Employee e = ls.get(pos);
        e.output();
    }
    public void dummyData(){
        ls.add(new Employee(1, "aaa", 2300));
        ls.add(new Employee(2, "bbb", 2400));
        ls.add(new Employee(3, "ccc", 2500));
        ls.add(new Employee(4, "ddd", 2600));
    }
    public void delById(int id){
        int pos = findById(id);
        if (pos < 0) {
            System.out.println("Không tìm thấy");
        } else {
            ls.remove(pos);
            System.out.println("Xóa thành công");
        }
    }
}
