package com.blogspot.javagamexyz.gamexyz.custom;

public class Pair {
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int x, y;
	
	public boolean equals(Pair p) {
		return ((this.x == p.x) && (this.y==p.y));
	}
}
