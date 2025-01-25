package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private String name;
    private List<Branch> branches;

    public Tree(String name) {
        // your code goes here
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(int length, Leaf leaf) {
        // your code goes here
        branches.add(new Branch(length,leaf));
    }

    public List<Branch> getBranches() {
    	// your code goes here
        return branches;
    }
    
    public String getName() {
    	// your code goes here
    	return name;
    }
}
