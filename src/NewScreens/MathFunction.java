package NewScreens;

import java.awt.Graphics2D;

public interface MathFunction {
	public void drawFrame(Graphics2D g, int timeStep);
	public int getRadius();
	public void setRadius(int r);
}
