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
	
		int x=0, y=0, dx=0, dy=0, score = -1, level = 0;
		String text = "";
	
		
		Zen.setFont("Helvetica-64");
		while (Zen.isRunning()) {
			  level=score/10+1;
			if (text.length() == 0) {
				x = Zen.getZenWidth()/2;
				y = 0;
				dx = 0;
				dy = 10 + 10*level;
				text = "" + (int) (Math.random() * 999);
			score++;
			}
		  
			Zen.setColor(200, 250, 100);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());

			Zen.setColor(250, 0, 250);
			Zen.drawText(text, x, y);
			
			Zen.drawText("Level: " + level, 10,50);
			Zen.drawText("Score: " + score, 10,120);
			
			x += dx;
			y += dy;
			 if (y > Zen.getZenHeight()) {
				 score -= 2;
				 text = "";
			 }
			// Find out what keys the user has been pressing.
			String user = Zen.getEditText();
			// Reset the keyboard input to an empty string
			
			// So next iteration we will only get the most recently pressed keys.
			Zen.setEditText("");
			
			for(int i=0;i < user.length();i++) {
				char c = user.charAt(i);
				if(c == text.charAt(0)&& text.length()> 0)
					text = text.substring(1,text.length()); // all except first character
			}
			Zen.flipBuffer();
			Zen.sleep(90);// sleep for 90 milliseconds

		}
	}

}
