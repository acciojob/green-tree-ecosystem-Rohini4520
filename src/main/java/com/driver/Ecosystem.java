package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
	private List<Tree> trees;

    public Ecosystem() {
        // your code goes here
        this.trees = new ArrayList<>();
    }

    public void addTree(Tree tree) {

        // your code goes here
        trees.add(tree);
    }

    public List<Tree> getTrees() {

        return trees;
    }
    
    public String displayEcosystem() {
        StringBuilder result = new StringBuilder();
        for (Tree tree : trees){
            //your code goes here
            result.append("Tree: ").append(tree.getName()).append("\n");

        for (Branch branch : tree.getBranches()) {
            result.append("Branch Length: ").append(branch.getLength()).append("\n");
            result.append("Leaf Shape: ").append(branch.getLeaf().getShape()).append("\n");
            result.append("------------------\n");
        }
    }
    return result.toString();
    }
}
