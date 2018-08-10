package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragonite to take its treasure!", "Dragonite Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHp = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int bossHp = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int bossAttack = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHp>0 && bossHp>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
	String attack =	JOptionPane.showInputDialog("Will you spark or bash?");
		// 9. If they typed in "yell":
	int stun = new Random().nextInt(2);
	if(attack.equalsIgnoreCase("spark")) {
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			 bossAttack = new Random().nextInt(11)+10;
			//-- Subtract that number from the dragon's health variable 
		bossHp-=bossAttack;
		}
		// 10. If they typed in "kick":
	else if(attack.equalsIgnoreCase("bash")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			bossAttack = new Random().nextInt(21)+10;
			//-- Subtract that number from the dragon's health variable
			bossHp-=bossAttack;
			
	}
		
		
		JOptionPane.showMessageDialog(null, "You attack! "+bossAttack+" damage!");
		
		
		// 13. If the user's health is less than or equal to 0
		
		// 14. Else if the dragon's health is less than or equal to 0
		 if(bossHp<0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		JOptionPane.showMessageDialog(null, "YOU WIN! You got 300 gold and 500 exp!");	
		}
		if(attack.equalsIgnoreCase("bash")||stun==1) {
		JOptionPane.showMessageDialog(null, "Dragonite attacks! "+playerAttack+" damage!");
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
					playerAttack = new Random().nextInt(36)+10;
					// 12. Subtract this number from the player's health
					playerHp-=playerAttack;
		}
		else if(attack.equalsIgnoreCase("spark")&&stun==0) {
			JOptionPane.showMessageDialog(null, "Dragonite is unable to move!");
			
		}
		if(playerHp<0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "You got hurt and collapsed...");
		}
		
		
		//  15.  Else
		else {
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			JOptionPane.showMessageDialog(null, "Your hp:"+playerHp+"  Boss hp:"+bossHp);
		}
		System.out.println("You have "+playerHp+" Hp.");
		System.out.println("You take "+playerAttack+" damage!");
		
		System.out.println(bossHp);
		}
		}
}
