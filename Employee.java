/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Yang
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input id: ");
        setId(sc.nextInt());      
        System.out.println("input name: ");
        sc = new Scanner(System.in);
        setName(sc.nextLine());
        System.out.println("input salary: ");
        setSalary(sc.nextDouble());
    }
    public void output(){
        System.out.println("=> "+getId()+" - "+getName()+" - "+getSalary());
    }
}
