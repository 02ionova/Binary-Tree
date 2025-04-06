package cz.cvut.fel.pjv.impl;

import cz.cvut.fel.pjv.Tree;
import cz.cvut.fel.pjv.Node;

public class TreeImpl implements Tree {
    private Node root;

    public TreeImpl() {
        this.root = null;
    }

    @Override
    public void setTree(int[] values) {
        if (values == null || values.length == 0) {
            root = null;
            return;
        }
        root = buildTree(values, 0, values.length - 1);
    }

    private Node buildTree(int[] values, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        if ((right - left + 1) % 2 == 0) {
            mid++;
        }

        NodeImpl node = new NodeImpl(values[mid]);
        node.setLeft(buildTree(values, left, mid - 1));
        node.setRight(buildTree(values, mid + 1, right));

        return node;
    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        buildString(root, 0, sb);
        return sb.toString();
    }

    private void buildString(Node node, int depth, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(" ".repeat(depth)).append("- ").append(node.getValue()).append("\n");
        buildString(node.getLeft(), depth + 1, sb);
        buildString(node.getRight(), depth + 1, sb);
    }
}
