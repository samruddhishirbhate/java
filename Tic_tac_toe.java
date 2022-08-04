package game;

import java.util.Scanner;

public class Tic_tac_toe {

	public static void main(String[] args) {
		//keep track of what character in each square.
		char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		//scanner
		Scanner sc=new Scanner(System.in);
		//create a variable to hold what user types in
		int input;
		//tell's whose turn is it
		char turn='X';
		//to check if full
		int currentturn=1;
		
		while(true) {
			//to fix position
			do {
				
		//ask user to enter the position
		System.out.println("Enter the position:");
		input=sc.nextInt();
	}while(pos[input-1]=='X'||pos[input-1]=='O');
			
		pos[input-1]=turn;
		//concatinating element
		System.out.println(" "+pos[6]+" | "+pos[7]+" | "+pos[8]);
		System.out.println("---+---+---");
		System.out.println(" "+pos[3]+" | "+pos[4]+" | "+pos[5]);
		System.out.println("---+---+---");
		System.out.println(" "+pos[0]+" | "+pos[1]+" | "+pos[2]);
		
		//winner check
		if(pos[0]==turn && pos[1]==turn && pos[2]==turn 
				|| pos[3]==turn && pos[4]==turn && pos[5]==turn
				|| pos[6]==turn && pos[7]==turn && pos[8]==turn
		        || pos[0]==turn && pos[3]==turn && pos[6]==turn
		        || pos[1]==turn && pos[4]==turn && pos[7]==turn
		        || pos[2]==turn && pos[5]==turn && pos[8]==turn
		        || pos[0]==turn && pos[4]==turn && pos[8]==turn
		        || pos[6]==turn && pos[4]==turn && pos[2]==turn){
			System.out.println(turn+" is the winner!");
			break;
		}
		//turn shifting
		if(turn == 'X') {
			turn ='O';
		}
		else if(turn == 'O') {
			turn='X';
		}
		//to check if draw
		currentturn++;
		if(currentturn>9) {
			System.out.println("Draw");
			break;
		}
	}
		
		

	}

}
