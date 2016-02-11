package net.tyleremery.TetrisAPCSFinal;

import java.awt.*;

public class Square
{
	protected int x, y, width, height;
	
	public Square(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.width = 48;
		this.height = 48;
	}
	
	public void render(Graphics g, int overallX, int overallY)
	{
		g.fillRect(x + overallX, y + overallY, width, height);
	}
}
