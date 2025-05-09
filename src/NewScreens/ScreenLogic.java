package NewScreens;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.Timer;

public abstract class ScreenLogic extends JComponent{

	public static int fps = 60;
	public static Timer timer = null;
	private int timeStep;
	
	/*
	 * This returns what screen should be switched to, should return self when nothing needs to be updated
	 * If it does need to switch screens, then it will self populate the screen data.
	 */
	public abstract ScreenLogic InterperetUserInput(KeyEvent ke, MouseEvent me);
	
	
	/*
	 * This should be self contained and need no outside paramiters to work. it is allowed to use class fields to works
	 */
	@Override
	protected abstract void paintComponent(Graphics g);
	
	
	public void startTimer() {
		if(timer == null) {
			timeStep = 0;
			timer = new Timer(1000/fps, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					repaint();
					timeStep ++;
				}
			});
			timer.start();
		}
	}
	
	public void endTimer() {
		if(timer != null) {
			timer.stop();
		}
	}
}
