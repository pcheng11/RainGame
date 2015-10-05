//UIUC CS125 FALL 2014 MP. File: RainGame.java, CS125 Project: PairProgramming, Version: 2015-09-28T22:31:40-0500.300040764
/**
 * @author pcheng11, lerb2
 */
public class RainGame {

	public static void main(String[] args) {
		// To get points type your netids above (CORRECTLY-Please double check your partner correctly spells your netid correctly!!)
		// Your netid is the unique part of your @illinois email address
		// Do not put your name or your UIN. 
		// REMEMBER TO COMMIT this file...
	
		
		
		
		Zen.setColor(255, 255, 255); 
		Zen.setFont("Times-60");
		Zen.drawText("Welcome to the game!", 50, 240);
		Zen.sleep(1000);
		Zen.setFont("Times-30");
		Zen.drawText("Please Click the screen to start", 120, 400);
		
		Zen.waitForClick();
		
		
		
		
		
		int x=0, y=0, dx=0, dy=0, score = -1, level = 1,life = 5;
		String text1 = "";
		
		boolean zenIsRunning = true;
		
		Zen.setFont("Times-38");
		while (Zen.isRunning() && zenIsRunning) {
             if (score >=0)
				  level=score/5+1;
			if (text1.length() == 0) {
				x = Zen.getZenWidth()/2;
				y = 0;
				dx = 0;
				dy = 10+ 4*(Math.abs(level));
				text1 = "" + (int) (Math.random() * 999);
			score++;
			 }
		  
			Zen.setColor(250, 100, 0);
			Zen.fillRect(100, 0, Zen.getZenWidth(), Zen.getZenHeight());
			Zen.setColor(0,0,150);
			Zen.fillRect(0, 0, Zen.getZenWidth()/2, Zen.getZenHeight());
			Zen.setColor(250,100, 0);
			Zen.fillRect(0, 0, Zen.getZenWidth()/2, Zen.getZenHeight()/2);
			Zen.setColor(0,0, 150);
			Zen.fillRect(320, 0, Zen.getZenWidth()/2, Zen.getZenHeight()/2);
			Zen.setColor(250,250, 250);
			
			
			
			Zen.drawText(text1, x, y);
			
			Zen.drawText("Level: " + level, 5,50);
			Zen.drawText("Score: " + score, 5,100);
			Zen.drawText("Life: " + life,5,150);
			x += dx;
			y += dy;
			 if (y >= Zen.getZenHeight())
			 { 
			 life --;
			
			 score --;
			
			
			 
			 if (life == 0 )
			 {    
				 Zen.setColor(0,0,0);
				 Zen.fillRect(0,0, Zen.getZenWidth(),Zen.getZenHeight());
				 Zen.setColor(250,250,250);
				 Zen.drawText("You Lose!", 250, 280);
				 zenIsRunning = false;
			 }
			 if (score < 0)
			 {
				level=1; 
				 
			 }
			 text1 = "";
	
			 
			 }
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
			
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text1.charAt(0)&& text1.length()> 0)
					text1 = text1.substring(1,text1.length()); // all except first character
			}
			
			Zen.flipBuffer();
			Zen.sleep(90);// sleep for 90 milliseconds

		}
}
}
