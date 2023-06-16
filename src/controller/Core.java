package controller;

import java.awt.Color;

public class Core {
	private int posX;
	private int posY;
	private int force = 100;
	private int size = 40;
	private Color color = Color.black;
	
	public Core(int x, int y) {
		this.posX=x;
		this.posY=y;
	}
}
