package com.getjavajob.training.algo1702.gultiaeve.lesson09;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;
import com.getjavajob.training.algo1702.gultiaeve.lesson08.balanced.BalanceableTree;

/**
 * @author Vital Severyn
 * @since 05.08.15
 */

public class RedBlackTree<E> extends BalanceableTree<E> {

    @Override
    public Node<E> add(Node<E> n, E e) throws IllegalArgumentException {
        RBNode<E> castNode = (RBNode<E>) n;
        if (compare(castNode.getElement(), e) >= 0) {
            if (castNode.left == null) {
                afterElementAdded(addLeft(n, e));
            } else {
                afterElementAdded(add(castNode.left, e));
            }
        }
        if (compare(castNode.getElement(), e) < 0) {
            if (castNode.right == null) {
                afterElementAdded(addRight(n, e));
            } else {
                afterElementAdded(add(castNode.right, e));
            }
        }
        return castNode;
    }

    public E remove(Node<E> n) throws IllegalArgumentException {
        RBNode<E> removed;
        Node<E> tempNode = treeSearch(root, n.getElement());
        removed = (RBNode<E>) tempNode;
        if (removed == null) {
            return null;
        }
        E prev = removed.getElement();
        RBNode<E> temp = removed;
        boolean initColor = temp.color;
        RBNode<E> node;
        if (removed.left == nil) {
            node = (RBNode<E>) removed.right;
            changeReference(removed, (RBNode<E>) removed.right);
        } else if (removed.right == nil) {
            node = (RBNode<E>) removed.left;
            changeReference(removed, (RBNode<E>) removed.left);
        } else {
            temp = findLeastNode((RBNode<E>) removed.right);
            initColor = temp.color;
            node = (RBNode<E>) temp.right;
            if (temp.parent == removed) {
                node.parent = temp;
            } else {
                changeReference(temp, (RBNode<E>) temp.right);
                temp.right = removed.right;
                removed.right.parent = temp;
            }
            changeReference(removed, temp);
            temp.left = removed.left;
            removed.left.parent = temp;
            temp.color = removed.color;
        }
        if (initColor) {
            afterElementRemoved(node);
        }
        return prev;
    }

    private boolean isBlack(Node<E> n) {
        RBNode<E> result = (RBNode<E>) n;
        return result.color;
    }

    private boolean isRed(Node<E> n) {
        RBNode<E> result = (RBNode<E>) n;
        return !result.color;
    }

    private boolean colorOf(Node<E> n) {
        RBNode<E> result = (RBNode<E>) n;
        return n == null || result.color;
    }

    private void makeBlack(Node<E> n) {
        RBNode<E> castNode = (RBNode<E>) n;
        castNode.color = true;
    }

    private void makeRed(Node<E> n) {
        RBNode<E> castNode = (RBNode<E>) n;
        castNode.color = false;
    }


    protected void afterElementAdded(Node<E> n) {
        RBNode<E> node = (RBNode<E>) n;
        makeRed(node);
        while (isRed(node.parent)) {
            if (node.parent != null && node.parent.parent != null && node.parent == node.parent.parent.left) {
                NodeImpl<E> uncle = node.parent.parent.right;
                if (uncle != null && isRed(uncle)) {
                    makeBlack(node.parent);
                    makeBlack(uncle);
                    makeRed(node.parent.parent);
                    node = (RBNode<E>) node.parent.parent;
                } else if ((uncle == null || isBlack(uncle)) && isRed(node.parent)) {
                    if (node == node.parent.right) {
                        rotateLeftOrRight(node);
                    } else {
                        makeBlack(node.parent);
                        makeRed(node.parent.parent);
                        rotate(node);
                    }
                }
            } else {
                NodeImpl<E> uncle = node.parent.parent.left;
                if (uncle != nil && isRed(uncle)) {
                    makeBlack(node.parent);
                    makeBlack(uncle);
                    makeRed(node.parent.parent);
                    node = (RBNode<E>) node.parent.parent;
                } else if ((uncle == nil || isBlack(uncle)) && isRed(node.parent)) {
                    if (node == node.parent.left) {
                        rotateLeftOrRight(node);
                    } else {
                        makeBlack(node.parent);
                        makeRed(node.parent.parent);
                        rotate(node.parent);
                    }
                }
            }
        }
        makeBlack(root);
    }

    private void changeReference(RBNode<E> parent, RBNode<E> child) {
        if (parent.parent == nil) {
            root = child;
        } else if (parent == parent.parent.left) {
            parent.parent.left = child;
        } else {
            parent.parent.right = child;
        }
        child.parent = parent.parent;
    }

    private RBNode<E> findLeastNode(RBNode<E> node) {
        while (node.left != nil) {
            node = (RBNode<E>) node.left;
        }
        return node;
    }

    public static class RBNode<E> extends NodeImpl<E> implements Node<E> {
        public boolean color = true; //black - initial value

        public RBNode(E value) {
            super(value);
        }

        public RBNode(E value, boolean color) {
            super(value);
            this.color = color;
        }

        public RBNode(RBNode<E> left, RBNode<E> right, E val, boolean color) {
            super(left, right, val);
            this.color = color;
        }

        public RBNode(RBNode<E> parent, RBNode<E> left, RBNode<E> right, E value, boolean color) {
            super(parent, left, right, value);
            this.color = color;
        }
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/