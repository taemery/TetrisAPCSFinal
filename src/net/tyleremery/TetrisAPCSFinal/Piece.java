package net.tyleremery.TetrisAPCSFinal;

import java.awt.*;

abstract class Piece
{
	protected Color color;
	protected int direction, x, y;
	protected Square squares[];
	
	public Piece(Color color, int x, int y)
	{
		this.color = color;
		this.x = x;
		this.y = y;
		this.direction = 1;
		squares = new Square[4];
	}
	
	public void render(Graphics g)
	{
		g.setColor(color);
		for(int i = 0; i < 4; i++)
			squares[i].render(g, x, y);
	}
	
	public void derender(Graphics g, Color background)
	{
		g.setColor(background);
		for(int i = 0; i < 4; i++)
			squares[i].render(g, x, y);
	}
	
	public abstract void rotate();
	
	public void translate(int x, int y){
		this.x += x;
		this.y += y;
	}
}
