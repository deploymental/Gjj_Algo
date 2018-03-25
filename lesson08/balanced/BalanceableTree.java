package com.getjavajob.training.algo1702.gultiaeve.lesson08.balanced;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson08.BinarySearchTree;

public abstract class BalanceableTree<E> extends BinarySearchTree<E> {

    /**
     * Sets new relationship between parent and child. This method is used by
     * {@link #rotate(com.getjavajob.training.init.severynv.algo.tree.Node)} for node and its grandparent,
     * node and its parent, node's child and node's parent relinking.
     *
     * @param parent        new parent
     * @param child         new child
     * @param makeLeftChild whether new child must be left or right
     */
    private void relink(NodeImpl<E> parent, NodeImpl<E> child, boolean makeLeftChild) {
        Boolean left = null;
        NodeImpl<E> grandParent = parent.parent;
        if (grandParent.left != null && grandParent.left.equals(parent)) {
            left = true;
        } else if (grandParent.right != null && grandParent.right.equals(parent)) {
            left = false;
        }
        NodeImpl<E> temp;
        if (makeLeftChild) {
            if (parent == root) {
                child.parent = null;
                root = child;
            } else {
                temp = child.left;
                child.left = parent;
                child.parent = parent.parent;
                parent.right = temp;
                parent.parent = child;
                if (left != null && left && grandParent != null) {
                    grandParent.left = child;
                } else if (left != null && !left && grandParent != null) {
                    grandParent.right = child;
                }
            }
        } else {
            if (parent == root) {
                child.parent = null;
                root = child;
            } else {
                temp = child.right;
                child.right = parent;
                child.parent = parent.parent;
                parent.left = temp;
                parent.parent = child;
                if (left != null && left) {
                    grandParent.left = child;
                } else if (left != null && !left) {
                    grandParent.right = child;
                }
            }
        }
    }

    /**
     * Rotates n with it's parent.
     *
     * @param n node to rotate above its parent
     */
    protected void rotate(Node<E> n) {
        NodeImpl<E> parent = (NodeImpl<E>) parent(n);
        if (parent.left != nil && parent.left == n) {
            relink(parent, (NodeImpl<E>) n, false);
        } else if (parent.right != nil && parent.right == n) {
            relink(parent, (NodeImpl<E>) n, true);
        }
    }

    /**
     * Performs one rotation of <i>n</i>'s parent node or two rotations of <i>n</i> by the means of
     * {@link #rotate(com.getjavajob.training.init.severynv.algo.tree.Node)} to reduce the height of subtree rooted at <i>n1</i>
     * <p>
     * <pre>
     *     n1         n2           n1           n
     *    /          /  \         /            / \
     *   n2    ==>  n   n1  or  n2     ==>   n2   n1
     *  /                         \
     * n                           n
     * </pre>
     * <p>
     * Similarly for subtree with right side children.
     *
     * @param n grand child of subtree root node
     * @return new subtree root
     */
    protected Node<E> reduceSubtreeHeight(Node<E> n) {
        NodeImpl<E> result = null;
        NodeImpl<E> h = (NodeImpl<E>) n;
        NodeImpl<E> n2 = h.parent;
        NodeImpl<E> n1 = n2.parent;

        if (n1.left.getElement() != null && n2.left.getElement() != null && n1.left == n2 && n2.left == n) {
            rotate(n2);
            result = n2;
            return result;
        } else if (n1.left.getElement() != null && n2.right.getElement() != null && n1.left == n2 && n2.right == n) {
            rotate(h);
            rotate(h);
            result = h;
            return result;
        } else if (n1.right.getElement() != null && n2.right.getElement() != null && n1.right == n2 && n2.right == n) {
            rotate(n2);
            result = n2;
            return result;
        } else if (n1.right.getElement() != null && n2.left.getElement() != null && n1.right == n2 && n2.left == n) {
            rotate(h);
            rotate(h);
            result = h;
            return result;
        }
        return result;
    }

    public Node<E> rotateLeftOrRight(Node<E> n) {
        NodeImpl<E> node = (NodeImpl<E>) n;
        if (node.parent != nil && node.parent.parent != nil) {
            boolean left = compare(n.getElement(), node.parent.getElement()) < 0;
            boolean leftRight = compare(node.parent.getElement(), node.parent.parent.getElement()) < 0;
            relink(node.parent, node, left);
            System.out.println(node.parent.parent);
            relink(node.parent, node, leftRight);
        }
        return null;
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - found
Violation 7(static import) - not found
*/