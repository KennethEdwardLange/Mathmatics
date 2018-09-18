package main;

import java.util.Scanner;

public class SurfaceArea {
	static Scanner input = new Scanner(System.in);
//    String productDescription = input.nextLine();
	static SurfaceArea sa = new SurfaceArea();
	public static void main(String[] args){
		System.out.println("What are you trying to find the suface area of?");
		String type = input.next();
		System.out.println("Your input is " + type);
		
		if (type.equals("Cube")){
			System.out.println("Please input length on edge.");
			double edge = input.nextDouble();
			System.out.println(sa.SACube(edge));
		}
		
		else if (type.equals("Sphere")){
			System.out.println("Please input the radius. (Half of the diameter)");
			double radius = input.nextDouble();
			System.out.println(sa.SASphere(radius));
		}
		
		else if(type.equals("Cylinder")){
			System.out.println("Please input the radius. (Half of the diameter)");
			double radius = input.nextDouble();
			System.out.println("Please input the height.");
			double height = input.nextDouble();
			System.out.println(sa.SACylinder(radius, height));
		}
		else if(type.equals("Cone")){
			System.out.println("Please input the radius. (Half of the diameter)");
			double radius = input.nextDouble();
			System.out.println("Please input the height.");
			double height = input.nextDouble();
			System.out.println(sa.SACone(radius, height));
		}
	}
	double SACube (double edge){
		return (edge * edge *6);
	}
	double SASphere (double diameter){
		return (4*Math.PI*diameter*diameter);
	}
	double SACylinder (double radius, double height){
		return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
	}
	double SACone (double radius, double height){
		return ((Math.PI*radius)*(radius+Math.sqrt((height*height)+(radius*radius))));
	}
}
