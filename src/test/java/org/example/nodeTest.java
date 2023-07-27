package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class nodeTest {
    @Test
    public void testAddChild() {
        node parent = new node("parent");
        node child = new node("child");
        parent.addChild(child);

        assertTrue(parent.getChildren().contains(child));
    }

    @Test
    public void testGetDescendants() {
        node parent = new node("parent");
        node child = new node("child");
        node grandchild = new node("grandchild");

        parent.addChild(child);
        child.addChild(grandchild);

        assertTrue(parent.getDescendants().containsAll(List.of(child, grandchild)));
    }
}
