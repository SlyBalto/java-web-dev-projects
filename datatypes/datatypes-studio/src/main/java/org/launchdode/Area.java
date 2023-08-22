package org.launchdode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area);
        input.close();
    }
}