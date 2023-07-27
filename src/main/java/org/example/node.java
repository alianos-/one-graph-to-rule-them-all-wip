package org.example;

import java.util.ArrayList;
import java.util.List;

public class node {
    private final String id;
    private List<node> children;

    public node(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addChild(node child){
        this.children = new ArrayList<>();
        children.add(child);
    }

    public List<node> getChildren(){
        return children;
    }

    public List<node> getDescendants(){
        throw new UnsupportedOperationException("WIP: Not yet implemented");
    }

}
