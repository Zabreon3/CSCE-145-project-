// Zabreon Robinson 
import java.util.Random;
import java.util.Scanner;
public class homework02 {

	public static void main(String[] args) { }
		// TODO Auto-generated method stub
		static Scanner sc = new Scanner(System.in); {
		int userWins=0,computerWins=0;
		while (true) {
		for(int i=1;i<=3;i++)
		{
		char user = selection();
		if(user=='r')
		{
		System.out.print("You played Rock.");
		}
		else if(user=='p')
		{
		System.out.print("You played paper.");
		}
		else if(user=='s')
		{
		System.out.print("You played Scissors.");
		}

		char computer = CP();
		if(computer=='r')
		{
		System.out.print("The Computer played Rock.\n");
		}
		else if(computer=='p')
		{
		System.out.print("The Computer played paper.\n");
		}
		else if(computer=='s')
		{
		System.out.print("The Computer played Scissors.\n");
		}

		int res=winner(user, computer);
		if(res==1)
		{
		userWins++;
		}
		else if(res==2)
		{
		computerWins++;
		}
		}

		System.out.println("You won "+userWins+" round(s).The computer won "+computerWins+" round(s).");
		if(userWins>computerWins)
		{
		System.out.println("Yippiee! You won the game.");
		}
		else if(userWins<computerWins)
		{
		System.out.println("Rats! The Computer won the game.");
		}
		else
		{
		System.out.println("The game ended in a tie.");
		}

		boolean b = Repeat();
		if (b)
		continue;
		else
		break;
		}




		}
		private static boolean Repeat() {
		// Getting the character from the user 'Y' or 'y' or 'N' or 'n'
		System.out.print("Do you want to Play again (Y/N) ?");
		char ch = sc.next(".").charAt(0);
		if(ch=='y' || ch=='Y')
		return true;
		else
		return false;
		}
		private static int winner(char user, char computer) {
		String winner = "";
		int res=0;
		/*
		* Based on user and computer selected numbers the corresponding block
		* will get executed
		*/
		if (user == 'r' && computer == 's') {
		winner = "Yippie! You won the round.";
		res=1;
		} else if (user == 's' && computer == 'r') {
		winner = "Yippie! You won the round.";
		res=1;
		} else if (user == 'r' && computer == 'p') {
		winner = "Rats! The computer won the round.";
		res=2;
		} else if (user == 'p' && computer == 'r') {
		winner = "Yippie! You won the round.";
		res=1;
		} else if (user == 'p' && computer == 's') {
		winner = "Rats! The computer won the round.";
		res=2;
		} else if (user == 's' && computer == 'p') {
		winner = "Yippie! You won the round.";
		res=1;
		} else {
		if (user == 'r' && computer == 'r') {
		
		winner = "The round ended in a Tie";
		} else if (user == 'p' && computer == 'p') {
		winner = "The round ended in a Tie";
		} else if (user == 's' && computer == 's') {
		winner = "The round ended in a Tie";
		}
		res=0;
		}
		System.out.println(winner);
		return res;
		}
		private static char CP() {
		char comp = 0;
		// Creating an random class object
		Random r = new Random();
		int num = r.nextInt((3 - 1) + 1) + 1;
		if (num == 1)
		comp = 'r';
		else if (num == 2)
		comp = 'p';
		else if (num == 3)
		comp = 's';
		return comp;
		}
		private static char selection() {
		char user;
		System.out.print("Enter Choice Rock 'r',Paper 'p', Scissors 's' :");
		do {

		user = sc.next(".").toLowerCase().charAt(0);
		if (user != 'r' && user != 'p' && user != 's')
		System.out.print("Invalid answer. Re-type R,P Or S:");
		}while(user!='R' && user!='P' && user!='S' && user!='r' && user!='p' && user!='s');

		if(user>='A' && user<='Z')
		{
		user+=32;
		}
		return user;
		}
		{

	}

}
