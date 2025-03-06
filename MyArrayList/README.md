# Nodes, Arrays, and Lists in Java

![Java](https://img.shields.io/badge/Language-Java-orange)
![License](https://img.shields.io/github/license/MarinoBaric/Nodes-Arrays-and-Lists)
![Last Commit](https://img.shields.io/github/last-commit/MarinoBaric/Nodes-Arrays-and-Lists)

## 📚 Introduction

This repository contains Java implementations of fundamental data structures: arrays, nodes, and various types of lists. It serves as both a learning resource and a reference guide for understanding these critical programming concepts.

## 🧩 Data Structures Covered

### Arrays
Arrays are fixed-size sequential collections of elements of the same type stored in contiguous memory locations. This repository demonstrates:

- Array creation and initialization
- Basic operations (insertion, deletion, traversal)
- Multi-dimensional arrays
- Common array algorithms

### Nodes
Nodes are the fundamental building blocks for linked data structures. In this repository, you'll find:

- Node class implementation
- Node linking techniques
- Node manipulation operations

### Lists
Lists are dynamic data structures that can grow and shrink during program execution. Implementations include:

- Singly Linked Lists
- Doubly Linked Lists
- Circular Linked Lists
- Array Lists

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code with Java extensions)

### Installation

1. Clone this repository:
```bash
git clone https://github.com/MarinoBaric/Nodes-Arrays-and-Lists.git
```

2. Navigate to the project directory:
```bash
cd Nodes-Arrays-and-Lists
```

3. Compile and run the example programs:
```bash
javac ExampleProgram.java
java ExampleProgram
```

## 🔍 Code Examples

### Basic Node Implementation
```java
public class Node {
    private int data;
    private Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    
    // Getters and setters
    public int getData() { return data; }
    public void setData(int data) { this.data = data; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
```

### Singly Linked List Example
```java
public class SinglyLinkedList {
    private Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }
    
    // Display list contents
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    
    // Additional methods like insert at end, delete, search, etc.
}
```

## 📋 Features

- **Comprehensive Implementations**: Complete, working implementations of arrays, nodes, and different types of lists
- **Detailed Comments**: Well-commented code explaining the logic and operation of each component
- **Performance Analysis**: Time and space complexity analyses for operations on each data structure
- **Practical Examples**: Real-world usage scenarios demonstrating when to use each data structure

## 📘 Learning Outcomes

By exploring this repository, you'll gain an understanding of:

- How arrays store and organize data in memory
- The role of nodes in creating dynamic data structures
- Differences between array-based and linked implementations of lists
- Advantages and disadvantages of each data structure
- When to use specific data structures for optimal performance

## 🛠️ Usage Guidelines

This repository is designed primarily for learning purposes. Feel free to:

- Explore the code to understand implementation details
- Run the examples to see the data structures in action
- Modify the code to experiment with different approaches
- Use the implementations as a foundation for your own projects

## 📝 Contributing

Contributions are welcome! If you'd like to add improvements or additional implementations:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Acknowledgments

- Data Structures and Algorithms textbooks and courses that inspired these implementations
- The Java community for continuous support and knowledge sharing

---

Created with ❤️ by [Marino Baric](https://github.com/MarinoBaric)
