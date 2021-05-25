/*Arris Manduma
 * 5-24-2021
 * Revature
 * 
 * Project1: Unit Converter
 * This project aims to design a menu-driven console application
 * that will let users convert between one type unit
 * to another using length, mass and volume.
 * 
 * requirement
 * push your repository through Github
 * then provide the link
 */

package main;
 

import java.util.*;

public class Converter {
	
	public static void main(String[] args) {
		// Obtaining input from user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("UNIT CONVERTER");
		System.out.println("--------------");
		System.out.println("Please make selection from (1-4): ");
		
		//Making selections
		
		System.out.println("1)Length measurement\n"
				+ "2)Mass measurement \n"
				+ "3)volume measurement\n"
				+ "4)Quit");
		
		//Initializing and iterating menu selection
		
		int menuSelection = 0;
		while(menuSelection != 4) {
			
			menuSelection =scan.nextInt();
			
			switch (menuSelection) {
			
			//Outer-switch statement for length measurement
			case 1:
				System.out.println("**You have selected Length measurement**:");
				System.out.println("Select from (1-5): ");
				System.out.println("1)miles to meter\n"
						+ "2)Mile to yard\n"
						+ "3)Mile to inch\n"
						+ "4)mile to kilometer\n"
						+ "5)Mile to foot");
				int menuOption = 0;
				while(menuOption != 5) {
					
					menuOption = scan.nextInt();
					
					switch (menuOption) {
					
					//inner switch statement for length measurement
					case 1:
						System.out.println("Please provide a number in mile: ");
						double meters = Converter.milesToMeters(scan.nextDouble());
						System.out.println("Your length in meter is:  " + meters +"\t"+"m");
						break;
					case 2:
						System.out.println("Please provide a number in mile: ");
						double yards = Converter.milesToYards(scan.nextDouble());
						System.out.println("Your length in yard  is:  " + yards + "\t" + "yrd");
						break;
					case 3:
						System.out.println("Please provide a number in mile:");
						double inches = Converter.milesToInches(scan.nextDouble());
						System.out.println("Your length in inch is:  " + inches + "\t" + "in");
						break;
					case 4:
						System.out.println("Please provide a number in mile ");
						double kilometers = Converter.milesToKilometers(scan.nextDouble());
						System.out.println("Your length in kilometer is:  " + kilometers +"\t"+"Km");
						break;
					case 5:
						System.out.println("Please provide a number mile: ");
						double feet = Converter.milesToFeet(scan.nextDouble());
						System.out.println("Your length in foot is:  " + feet +"\t"+"ft");
						break;
						
					}
					
				}
				break;
				
				//Outer switch statement for mass measurement
			case 2:
				System.out.println("**You have selected Mass measurement**: ");
				System.out.println("Select from (1-4): ");
				System.out.println("1)Pound to ounce to meter\n"
						+ "2)Pound to kilogram\n"
						+ "3)Pound to uston\n"
						+ "4)Pound to gram");
				
				int menuChoice = 0;
				while(menuChoice != 4) {
				
					menuChoice = scan.nextInt();
					
					switch (menuChoice) {
					
				//Inner switch statement for mass measurement
					case 1:
						System.out.println("Please provide a number in pound: ");
						double ounce = Converter.poundToOunce(scan.nextDouble());
						System.out.println("Your mass in teaspoon  is:  " + ounce + "\t" + "ft.oz");
						break;
					case 2:
						System.out.println("Please provide a number in pound: ");
						double kilogram = Converter.poundToKilogram(scan.nextDouble());
						System.out.println("Your mass in kilogram  is:  " + kilogram + "\t" + "Kg");
						break;
					case 3:
						System.out.println("Please provide a number in pound: ");
						double uston = Converter.poundToUsTon(scan.nextDouble());
						System.out.println("Your mass in us ton  is:  " + uston + "\t" + "uston");
						break;
					case 4:
						System.out.println("Please provide a number in pound: ");
						double gram = Converter.poundToGram(scan.nextDouble());
						System.out.println("Your mass in gram  is:  " + gram +"\t"+"gr");
						break;
						
					}
					
					
				}
				break;
				 
				//Outer statement for volume measurement
			case 3:
				System.out.println("**You have Selected Volume measurement**:");
				System.out.println("Select from (1-4):");
				System.out.println("1)Us gallon to imperial gallon\n"
						+ "2)Us gallon to liter\n"
						+ "3)Us gallon to cubic foot\n"
						+ "4)Us gallon to cubic inch");
				int menuPick = 0;
				while(menuPick != 4) {
				
					menuPick = scan.nextInt();
					
					switch (menuPick) {
					
					//inner statement for volume measurement
					case 1:
						System.out.println("Please provide a number in us gallon: ");
						double imperialgallons = Converter.usGallonsToImperialGallons(scan.nextDouble());
						System.out.println("Your volume in imperial gallon is:  " + imperialgallons + "\t" + "gal(imp)");
						break;
					case 2:
						System.out.println("Please provide a number in us gallon: ");
						double liters = Converter.usGallonsToLiter(scan.nextDouble());
						System.out.println("Your volume in liter  is:  " + liters + "\t" + "l");
						break;
					case 3:
						System.out.println("Please provide a number in us gallon: ");
						double cuft = Converter.usGallonsToCubicFeet(scan.nextDouble());
						System.out.println("Your volume in cubic foot is:  " + cuft + "\t" + "cuft");
						break;
					case 4:
						System.out.println("Please provide a number in us gallon: ");
						double cuin = Converter.usGallonsToCuInches(scan.nextDouble());
						System.out.println("Your volume in inch is:  " + cuin +"\t"+"cu(in)");
						break;
						
					}
					
				}
				break;
			case 4:
				System.out.println("Quit");
				break;
			}
		
		}
	}
	
	//Methods declarations

	private static double usGallonsToCuInches(double usgallons) {
		// TODO Auto-generated method stub
		
		double cuin = usgallons * 231;
		return cuin;
	}

	private static double usGallonsToCubicFeet(double usgallons) {
		// TODO Auto-generated method stub
		
		double cuft = usgallons * 0.133681;
		return cuft;
	}

	private static double usGallonsToLiter(double usgallons) {
		// TODO Auto-generated method stub
		double liters = usgallons * 3.78541;
		return liters;
	}

	private static double poundToGram(double pound) {
		// TODO Auto-generated method stub
		
		double gram = pound * 453.592;
		return gram;
	}

	private static double poundToUsTon(double pound) {
		// TODO Auto-generated method stub
		
		double uston = pound * 0.0005;
		return uston;
	}

	private static double poundToKilogram(double pound) {
		// TODO Auto-generated method stub
		
		double kilogram = pound * 0.453592;
		return kilogram;
	}

	private static double milesToInches(double miles) {
		// TODO Auto-generated method stub
		
		double inches = miles * 63360;
		return inches;
	}

	private static double milesToYards(double miles) {
		// TODO Auto-generated method stub
		
		double yards = miles * 1760;
		return yards;
	}

	private static double milesToMeters(double  miles) {
		// TODO Auto-generated method stub
		
		double meters = miles * 1609.34;
		return meters;
	}

	public static double milesToKilometers(double miles) {
		
		double kilometers = miles * 1.60934;
		return kilometers;
	}
	
	public static double poundToOunce(double pound) {
		
		double ounce = pound * 16;
		return ounce;
	}
		
	public static double usGallonsToImperialGallons(double usgallons) {
		
		double imperialgallons = usgallons * 0.832674;
		return imperialgallons;
	}
	
	private static double milesToFeet(double miles) {
		// TODO Auto-generated method stub
		
		double feet = miles * 5280;
		return feet;
	}
}
