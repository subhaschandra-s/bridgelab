/**
 Author:Subhas
 purpose:function for Tictac game program
 Filename:Tictac
 Date:19/11/19
 */
package com.bridgelab.Logical;

import com.bridgelab.Utility.utility;

public class Tic_tac_tio 
{
	public static int row,col;
	
	public static char[][] board=new char[3][3];
	public static char turn ='x';
	
	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]= '_';
			}
		}
		play();
		printBoard();
	}
	public static void play()
	{
		boolean playing=true;
		printBoard();
		while(playing) {
			System.out.println("please enter row and col");
			row=utility.readInt()-1;
			col=utility.readInt()-1;
			board[row][col]=turn;
			if(GameOver(row,col))
			{
				playing=false;
				System.out.println("Game over! player "+ turn +"wins! ");
			}
			printBoard();
			if(turn=='x')
			turn='o';
			else
				turn='x';
		}
	}
	
	public static void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				if(j==0)
					System.out.print("| ");
					System.out.print(board[i][j] + " | ");
			}
				
		}System.out.println();
	}
	public static boolean GameOver(int rmove,int cmove)
	{
		//check perpendicular victory
		if(board[0][cmove]==board[1][cmove] && board[0][cmove]==board[2][cmove])
			return true;
		if(board[rmove][0]==board[rmove][1]&& board[rmove][0]==board[rmove][2])
			return true;
		//check diagonal victory
		if(board[0][0]==board[1][1] &&board[0][0]== board[2][2] && board[1][1]!= '_')
			return true;
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!= '_')
			return true;
		return false;
	}

}