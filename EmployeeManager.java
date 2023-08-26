/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Yang
 */
public class EmployeeManager {

    public static void main(String[] args) {
        System.out.println("｡ ･: *: ･ ﾟ '★ ,｡ ･: *: ･ ﾟ");
        System.out.println("0. Thêm nhân viên");
        System.out.println("1. Nhập thông tin nhân viên");
        System.out.println("2. Xem danh sách nhân viên");
        System.out.println("3. Tìm kiếm");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Thoát");
        System.out.println("｡ ･: *: ･ ﾟ '★ ,｡ ･: *: ･ ﾟ");

        menu();
    }

    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            ListEmployee ls = new ListEmployee();
            int choice;
            System.out.println("Chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    ls.dummyData();
                    break;
                case 1:
                    ls.inputs();
                    break;
                case 2:
                    ls.outputs();
                    break;
                case 3:
                    System.out.println("Nhập mã nhân viên: ");
                    int id = sc.nextInt();
                    int position = ls.findById(id);
                    if (position < 0) {
                        System.out.println("Không tìm thấy");
                    } else {
                        System.out.println("Tìm thấy");
                        ls.outputByPosition(position);
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã nhân viên: ");
                    int idDel = sc.nextInt();
                    ls.delById(idDel);
                    break;
                case 5:
                    System.exit(0);
                    break;                            
            }
        }
    }
}
