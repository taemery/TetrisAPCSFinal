package net.tyleremery.TetrisAPCSFinal;

import java.applet.*;
import java.awt.*;

public class EntryPoint extends Applet
{

	public void paint(Graphics g)
	{	
		
		Piece gamePieces[] = new Piece[10];
		
		gamePieces[0] = new IPiece(0,100);
		gamePieces[1] = new OPiece(50,100);
		gamePieces[2] = new SPiece(200,100);
		gamePieces[3] = new ZPiece(300,100);
		gamePieces[4] = new LPiece(450,100);
		gamePieces[5] = new JPiece(600,100);
		gamePieces[6] = new TPiece(650,100);
		for(int i = 0; i < 7; i++)
		{
			for(int a = 0; a < 30; a++)
			{
				gamePieces[i].render(g);
				delay(0.05);
				
				gamePieces[i].derender(g, getBackground());
				gamePieces[i].translate(0, 10);
				
				if(a == 29)
					gamePieces[i].render(g);
			}
		}
	}
	
	public static void delay(double seconds)
	{
		try
		{
			Thread.sleep((long) (seconds * 1000));
		} catch (InterruptedException e)
		{
			return;
		}
	}
}
