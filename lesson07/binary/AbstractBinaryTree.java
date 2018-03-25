package com.getjavajob.training.algo1702.gultiaeve.lesson07.binary;


import com.getjavajob.training.algo1702.gultiaeve.lesson07.AbstractTree;
import com.getjavajob.training.algo1702.gultiaeve.lesson07.Node;

import java.util.ArrayList;
import java.util.Collection;

import static com.getjavajob.training.algo1702.gultiaeve.lesson07.binary.LinkedBinaryTree.nil;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

    @Override
    public Node<E> sibling(Node<E> n) throws IllegalArgumentException {
        if (root().equals(n)) {
            throw new IllegalArgumentException();
        }
        Node<E> parent = parent(n);
        if (childrenNumber(parent) > 1) {
            if (left(parent).equals(n)) {
                return right(parent);
            } else {
                return left(parent);
            }
        }
        return null;
    }

    @Override
    public Collection<Node<E>> children(Node<E> n) throws IllegalArgumentException {
        Collection<Node<E>> result = new ArrayList<>();
        if (left(n) != null && left(n) != nil) {
            result.add(left(n));
        }
        if (right(n) != null && right(n) != nil) {
            result.add(right(n));
        }
        return result;
    }

    @Override
    public int childrenNumber(Node<E> n) throws IllegalArgumentException {
        int result = 0;
        if (left(n) != null && left(n) != nil) {
            result++;
        }
        if (right(n) != null && right(n) != nil) {
            result++;
        }
        return result;
    }

    /**
     * @return an iterable collection of nodes of the tree in inorder
     */
    public Collection<Node<E>> inOrder() {
        Collection result = new ArrayList();
        recursiveInOrder(root(), result);
        return result;
    }

    private void recursiveInOrder(Node<E> node, Collection<Node<E>> collection) {
        if (node instanceof ArrayBinaryTree.NodeImpl) {
            if (node != null && node != nil) {
                recursiveInOrder(left(node), collection);
                collection.add(node);
                recursiveInOrder(right(node), collection);
            }
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