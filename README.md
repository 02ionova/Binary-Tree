# Binary Tree

This project implements a simple binary tree in Java as part of the assignment. The goal is to create a binary tree structure based on a given array of integers, where the tree is built according to the specified rules and can be printed in a structured format.

## Structure

- `TreeImpl.java` — Implementation of the `Tree` interface.
- `NodeImpl.java` — Implementation of the `Node` interface.
- Package: `cz.cvut.fel.pjv.impl`

## Interfaces

The interfaces `Tree` and `Node` are provided and must not be changed. They define the following:

### `Tree`

- `void setTree(int[] values)`  
  Builds the binary tree from the provided array.
  
- `Node getRoot()`  
  Returns the root node of the tree.
  
- `String toString()`  
  Returns a string representation of the tree, where:
  - Each value is on a separate line.
  - The depth of the node is represented by spaces and a dash: `' - '`.
  - The left subtree is printed before the right subtree.
  - Each line ends with a newline character `\n`.

### `Node`

- Represents a single node in the binary tree, containing an integer value and references to its left and right children.

## Rules for Building the Tree

When building the tree using `setTree(int[] values)`:

- If the array length is odd, the root is the **middle** element.
- If the array length is even, the root is the **first number after the middle**.
- The left subtree is built from the elements before the root in the array.
- The right subtree is built from the elements after the root in the array.
- These rules are applied recursively to construct the entire tree.


## Requirements

- Use only standard Java (no external libraries or Java collections).
- Store data only using the input array.
- Follow the naming conventions and method requirements as stated.
- Do not modify the provided interfaces.

## Usage

To run and test the implementation:

1. Place the implementation files in the correct package: `cz.cvut.fel.pjv.impl`.
2. Use the `setTree()` method to build the tree from an array.
3. Call `toString()` to get the printable representation of the tree.
4. Use `getRoot()` to access the root node if needed.



