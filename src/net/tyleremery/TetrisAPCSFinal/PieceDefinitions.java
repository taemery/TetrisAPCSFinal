package net.tyleremery.TetrisAPCSFinal;

import java.awt.*;

class OPiece extends Piece
{
	public OPiece(int x, int y)
	{
		super(Color.YELLOW, x, y);   
		squares[0] = new Square(0, 0);
		squares[1] = new Square(0, 50);
		squares[2] = new Square(50, 50);
		squares[3] = new Square(50, 0);
	}
	
	@Override
	public void rotate()
	{
	}
}

class IPiece extends Piece
{
	public IPiece(int x, int y)
	{
		super(Color.CYAN, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(0, 50);
		squares[2] = new Square(0, 100);
		squares[3] = new Square(0, 150);
	}
	
	@Override
	public void rotate()
	{
		if(direction == 1)
		{
			squares[0].x -= 75;
			squares[0].y += 75;
			
			squares[1].x -= 25;
			squares[1].y += 25;
			
			squares[2].x += 25;
			squares[2].y -= 25;
			
			squares[3].x += 75;
			squares[3].y -= 75;
			
			direction = 2;
		} else {
			squares[0].x += 75;
			squares[0].y += -75;
			
			squares[1].x += 25;
			squares[1].y += -25;
			
			squares[2].x += -25;
			squares[2].y += 25;
			
			squares[3].x += -75;
			squares[3].y += 75;
			
			direction = 1;
		}	
	}
}

class ZPiece extends Piece
{
	public ZPiece(int x, int y)
	{
		super(Color.GREEN, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(50, 0);
		squares[2] = new Square(50, 50);
		squares[3] = new Square(100, 50);
	}

	@Override
	public void rotate()
	{		
	}
}

class SPiece extends Piece
{
	public SPiece(int x, int y)
	{
		super(Color.RED, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(50, 0);
		squares[2] = new Square(0, 50);
		squares[3] = new Square(-50, 50);
	}

	@Override
	public void rotate()
	{		
	}
}

class LPiece extends Piece
{
	public LPiece(int x, int y)
	{
		super(Color.ORANGE, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(0, 50);
		squares[2] = new Square(0, 100);
		squares[3] = new Square(50, 100);
	}

	@Override
	public void rotate()
	{		
	}
}

class JPiece extends Piece
{
	public JPiece(int x, int y)
	{
		super(Color.PINK, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(0, 50);
		squares[2] = new Square(0, 100);
		squares[3] = new Square(-50, 100);
	}

	@Override
	public void rotate()
	{		
	}
}

class TPiece extends Piece
{
	public TPiece(int x, int y)
	{
		super(Color.MAGENTA, x, y);	
		squares[0] = new Square(0, 0);
		squares[1] = new Square(50, 0);
		squares[2] = new Square(100, 0);
		squares[3] = new Square(50, 50);
	}

	@Override
	public void rotate()
	{		
	}
}
