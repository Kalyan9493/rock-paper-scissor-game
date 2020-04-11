import java.util.Random;

enum Choice{
	rock,paper,scissor;
}

public class Game {
	
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	Player p4=new Player();
	
	public void randomChoice() {
		for(int i=0;i<11;i++) {
			for(int j=0;j<4;j++) {
				Random rand = new Random();
				int result=rand.nextInt(3);
				if(j==0) {
					
					p1.setChoice(Choice.values()[result].toString());
					
				}
				else if(j==1) {
					p2.setChoice(Choice.values()[result].toString());
				}
				else if(j==2) {
					p3.setChoice(Choice.values()[result].toString());
				}
				else if(j==3){
					p4.setChoice(Choice.values()[result].toString());
				}
				else {
					System.out.println("INVALID");
				}
			}
			
			System.out.println("Player1		player2		player3		player4");
			System.out.println(p1.getChoice()+"		"+p2.getChoice()+"		"+p3.getChoice()+"		"+p4.getChoice());
			System.out.println();
			
			compare(p1.getChoice(),p2.getChoice(),p3.getChoice(),p4.getChoice());
		
	}

	}
	
	private void compare(String p1, String p2, String p3, String p4) {
		String[] choices = {p1,p2,p3,p4};
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					continue;
				}else {
					if(choices[i]=="paper" && choices[j] == "rock") {
						 System.out.println("Player"+(i+1)+" :"+choices[i]);
						 System.out.println("Player"+(j+1)+" :"+choices[j]);
						 System.out.println("Player"+(i+1)+" Wins");
						 System.out.println();
						 String p="player"+(i+1);
						 printPoints(p);
						 
					}else if(choices[i]=="rock" && choices[j] == "scissor") {
						 System.out.println("Player"+(i+1)+" :"+choices[i]);
						 System.out.println("Player"+(j+1)+" :"+choices[j]);
						 System.out.println("Player"+(i+1)+" Wins");
						 String p="player"+(i+1);
						 printPoints(p);
						 System.out.println();
					}else if(choices[i]=="scissor" && choices[j] == "paper") {
						 System.out.println("Player"+(i+1)+" :"+choices[i]);
						 System.out.println("Player"+(j+1)+" :"+choices[j]);
						 System.out.println("Player"+(i+1)+" Wins");
						 String p="player"+(i+1);
						 printPoints(p);
						 System.out.println();
						 
					}
					
				}
			
			}
		}
	}

	public void printPoints(String p) {
		if(p.equalsIgnoreCase("player1")) {
			p1.setPoints(p1.getPoints()+1);
		}else if(p.equalsIgnoreCase("player2")) {
			p2.setPoints(p2.getPoints()+1);
		}else if(p.equalsIgnoreCase("player3")) {
			p3.setPoints(p3.getPoints()+1);
		}else if(p.equalsIgnoreCase("player4")) {
			p4.setPoints(p4.getPoints()+1);
		}
		
		System.out.println("Points :\n  Player1		player2		player3		player4");
		System.out.println("	"+p1.getPoints()+"		"+p2.getPoints()+"		"+p3.getPoints()+"		"+p4.getPoints());
		
	}

	public static void main(String[] args) {
		Game game=new Game();
		game.randomChoice();
	}
}
