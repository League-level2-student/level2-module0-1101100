package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int n;
	static int u;
	static int d;
	static int t;
	static int q;
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot[] bots = new Robot[5];	
	//3. use a for loop to initialize the robots.
	for (int i=0; i<5; i++) {
		bots[i] = new Robot();
		bots[i].miniaturize();
		bots[i].setSpeed(10);
		bots[i].moveTo(100*i+100, 500);
		bots[i].penDown();
		//4. make each robot start at the bottom of the screen, side by side, facing up
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	for (int i = 500; i > 0; i--){
		for (int x=0; x<5; x++) {
			Random gen = new Random();
			int er = gen.nextInt(50)+1;
			bots[x].move(er);
			n = bots[0].getY();
			u = bots[1].getY();
			d = bots[2].getY();
			t = bots[3].getY();
			q = bots[4].getY();
			if (n<=50) {
				JOptionPane.showMessageDialog(null, "N has won!");
				System.exit(0);
			}
			else if (u<=50) {
				JOptionPane.showMessageDialog(null, "U has won!");
				System.exit(0);
			}
			else if (d<=50) {
				JOptionPane.showMessageDialog(null, "D has won!");
				System.exit(0);
			}
			else if (t<=50) {
				JOptionPane.showMessageDialog(null, "T has won!");
				System.exit(0);
			}
			else if (q<=50) {
				JOptionPane.showMessageDialog(null, "Q has won!");
				System.exit(0);
			}
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
	}
	
}
