package NewScreens;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class CurveViewer extends ScreenLogic {
	
	private MathFunction func;
	
	
	CurveViewer(int points, double stepScale, int radius){
		func = new Cardioid(points, stepScale, radius);
	}
	
	@Override
	public ScreenLogic InterperetUserInput(KeyEvent ke, MouseEvent me) {
		return null;
	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
