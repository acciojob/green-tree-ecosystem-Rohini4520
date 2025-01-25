package com.driver;

public class Branch {
	private int length;
    private Leaf leaf;

    public Branch(int length, Leaf leaf) {
      // your code goes here
        this.length = length;
        this.leaf = leaf;
    }

    public int getLength() {
    	// your code goes here
        return length;
    }

    public Leaf getLeaf() {
    	// your code goes here
        return leaf;
    }
}
