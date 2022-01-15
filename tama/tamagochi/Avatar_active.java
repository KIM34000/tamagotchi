package tamagochi;

import java.util.Scanner;

public class Avatar_active {
// this is the starting methode of my tamagotchi
	public void fillAvata() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please fill in information for your tamgochi");
		//I create object from AVATAR class
		AVATAR avatar = new AVATAR();		
		// seting strarting energy and weight of the tamagotchi obj
		avatar.setEnergy(3);
		avatar.setWeight(3); 
		System.out.println("Please enter your avatar name: ");
		avatar.setNom(scanner.nextLine()); 
// I calling action_choice methode passing on the tamagochi obj
		action_choice(avatar);
	}

	public void action_choice(AVATAR a) {
		//setting string action to "temp" in order to use do while loop
		String action = "temp";
		Scanner scanner = new Scanner(System.in);
		//do while for checking correct input from user
		do {
			System.out.println("What would you like to do? (play / eat / sleep) ");
			action = scanner.nextLine();
		} while (!action.equals("play")&& !action.equals("eat")&& !action.equals("sleep"));
		//if else will call the methode corresponding to the user choice
		//the tamagochi obj is pass on to the methode
		
		if(action.equals("play")) {
			play(a);
		}else if(action.equals("eat")) {
			eat(a);
		}else {
			sleep(a);
		}
	}
		// "AVATAR a" for use tamagochi obj
	public void sleep(AVATAR a) {		
		int tempEnergy = a.getEnergy();
		tempEnergy++;
		a.setEnergy(tempEnergy);
		System.out.println("energy level is " + a.getEnergy());
		System.out.println("weight is " + a.getWeight() + "kg");
		//if else to check energy level of the tamagochi
		// if 0 energy then tamagochi is died
		// if more then 20kg tamagochi is died
		// if 0kg tamagochi is died
		// if 20 energy then tamagochi is died
		if(a.getEnergy() ==0) {
			System.out.println(a.getNom() + " died");
		}
		else if(a.getEnergy() < 5) {
			System.out.println(a.getNom() + " is sleepy");
		}else if(a.getEnergy() < 10) {
			System.out.println(a.getNom() + " is happy");
		}else if(a.getEnergy() < 15) {
			System.out.println(a.getNom() + " is bored");
		}else { System.out.println(a.getNom() + " is restless"); }
			
		if(a.getEnergy() > 18){
		System.out.println(a.getNom() + " is about to explode, please play with him");
		}
		// I calling action_choice methode passing on the tamagochi obj
		action_choice(a);
		}
	
	public void play(AVATAR a) {
		//get energy then decrease energy then set energy
		int tempEnergy = a.getEnergy();
		tempEnergy--;
		a.setEnergy(tempEnergy);
		int tempWeight = a.getWeight();
		tempWeight--;
		a.setWeight(tempWeight);
		System.out.println("energy level is " + a.getEnergy());
		System.out.println("weight is " + a.getWeight() + "kg");
		if(a.getEnergy() ==0) {
			System.out.println(a.getNom() + " died");
		}
		else if(a.getEnergy() < 5) {
			System.out.println(a.getNom() + " is sleepy");
		}else if(a.getEnergy() < 10) {
			System.out.println(a.getNom() + " is happy");
		}else if(a.getEnergy() < 15) {
			System.out.println(a.getNom() + " is bored");
		}else { System.out.println(a.getNom() + " is restless"); }
			
		if(a.getEnergy() > 18){
		System.out.println(a.getNom() + " is about to explode, please play with him");
		}
		if(a.getEnergy() > 20) {System.out.println(a.getNom() + " exploded"); 
		}
		if(a.getEnergy() ==0) {
			System.out.println(a.getNom() + " died");
		}
		else if(a.getWeight() < 5) {
			System.out.println(a.getNom() + " is hungry");
		}else if(a.getWeight() < 10) {
			System.out.println(a.getNom() + " is content");
		}else if(a.getWeight() < 15) {
			System.out.println(a.getNom() + " is full");
		}else if(a.getWeight() < 20){
		System.out.println(a.getNom() + " is sick");
		}
		if(a.getWeight() > 18){			
		System.out.println(a.getNom() + " has eaten too much, please play with him");
		}
		if(a.getWeight() > 20){			
			System.out.println(a.getNom() + " died");
		}
		// I calling action_choice methode passing on the tamagochi obj
		action_choice(a);
		}
	
	public void eat(AVATAR a) {
		int tempWeight = a.getWeight();
		tempWeight++;
		a.setWeight(tempWeight);
		System.out.println("energy level is " + a.getEnergy());
		System.out.println("weight is " + a.getWeight() + "kg");
		if(a.getWeight() ==0) {
			System.out.println(a.getNom() + " died");
		}
		else if(a.getWeight() < 5) {
			System.out.println(a.getNom() + " is hungry");
		}else if(a.getWeight() < 10) {
			System.out.println(a.getNom() + " is content");
		}else if(a.getWeight() < 15) {
			System.out.println(a.getNom() + " is full");
		}else if(a.getWeight() < 20){
		System.out.println(a.getNom() + " is sick");
		}
		if(a.getWeight() > 18){			
		System.out.println(a.getNom() + " has eaten too much, please play with him");
		}
		if(a.getWeight() == 20){			
			System.out.println(a.getNom() + " died");
		}
		// I calling action_choice methode passing on the tamagochi obj
		action_choice(a);
	}
}
