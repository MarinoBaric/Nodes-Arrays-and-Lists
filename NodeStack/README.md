<div align="center">

# 🔄 NodeStack

*An elegant Node-based Stack implementation in Java*

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)
![Last Updated](https://img.shields.io/badge/Last%20Updated-March%202025-brightgreen?style=for-the-badge)

</div>

<p align="center">
  <a href="#-introduction">Introduction</a> •
  <a href="#-features">Features</a> •
  <a href="#-visualization">Visualization</a> •
  <a href="#-implementation">Implementation</a> •
  <a href="#-usage">Usage</a> •
  <a href="#-performance">Performance</a> •
  <a href="#-applications">Applications</a> •
  <a href="#-contribute">Contribute</a>
</p>

## 🚀 Introduction

**NodeStack** is a high-performance implementation of the Stack data structure using linked nodes in Java. Following the Last-In-First-Out (LIFO) principle, NodeStack offers a memory-efficient alternative to array-based stacks with dynamic sizing capabilities.

<div align="center">

```
       ┌─────────┐
       │ PUSH(x) │
       └────┬────┘
            ▼
┌───┐     ┌───┐     ┌───┐
│ x │ ──▶ │ y │ ──▶ │ z │ ──▶ null
└───┘     └───┘     └───┘
  ▲
  │
  │
 TOP
```

</div>

## ✨ Features

- **🔄 Dynamic Sizing** — Grows and shrinks automatically with usage
- **⚡ Constant-Time Operations** — O(1) complexity for all basic operations
- **🧩 Generic Implementation** — Works with any data type
- **🛡️ Robust Error Handling** — Comprehensive exception management
- **📝 Well-Documented** — Clear documentation and examples
- **🧪 Thoroughly Tested** — Reliable and stable implementation

## 📊 Visualization

<div align="center">

### Stack Operations Animation

```
  PUSH OPERATION                POP OPERATION
  ─────────────                 ────────────

  ┌───────┐                     ┌───────┐
  │       │                     │  40   │
  │       │                     │  30   │
  │       │                     │  20   │
  └───────┘                     └───────┘

      ⬇                             ⬆

  ┌───────┐                     ┌───────┐
  │       │                     │  30   │
  │  20   │                     │  20   │
  │       │                     │       │
  └───────┘                     └───────┘

      ⬇                             ⬆

  ┌───────┐                     ┌───────┐
  │  30   │                     │  20   │
  │  20   │                     │       │
  │       │                     │       │
  └───────┘                     └───────┘

      ⬇                             ⬆

  ┌───────┐                     ┌───────┐
  │  40   │                     │       │
  │  30   │                     │       │
  │  20   │                     │       │
  └───────┘                     └───────┘
```

</div>

## 💻 Implementation

The NodeStack is implemented with two main classes:

### Node Class

```java
public class Node<T> {
    private T data;           // The data stored in this node
    private Node<T> next;     // Reference to the next node
    
    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
    // Getters and setters
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    public Node<T> getNext() { return next; }
    public void setNext(Node<T> next) { this.next = next; }
}
```

### NodeStack Class

```java
public class NodeStack<T> {
    private Node<T> top;      // Reference to the top node
    private int size;         // Number of elements in the stack
    
    // Constructor
    public NodeStack() {
        this.top = null;
        this.size = 0;
    }
    
    // Add an element to the top of the stack
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
    
    // Remove and return the top element
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
    
    // Look at the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getData();
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    
    // Get the number of elements in the stack
    public int size() {
        return size;
    }
    
    // Remove all elements
    public void clear() {
        top = null;
        size = 0;
    }
}
```

## 🔍 Usage

### Basic Usage

```java
// Create a new stack
NodeStack<String> browserHistory = new NodeStack<>();

// Add pages to history
browserHistory.push("https://github.com");
browserHistory.push("https://github.com/MarinoBaric");
browserHistory.push("https://github.com/MarinoBaric/Nodes-Arrays-and-Lists");

// Get current page
System.out.println("Current page: " + browserHistory.peek());

// Go back
String previousPage = browserHistory.pop();
System.out.println("Going back to: " + browserHistory.peek());

// Check history size
System.out.println("History entries: " + browserHistory.size());
```

### Advanced Usage: Expression Evaluation

```java
public static boolean areBalancedParentheses(String expression) {
    NodeStack<Character> stack = new NodeStack<>();
    
    for (char c : expression.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (stack.isEmpty()) {
                return false;
            }
            
            char top = stack.pop();
            if ((c == ')' && top != '(') || 
                (c == ']' && top != '[') || 
                (c == '}' && top != '{')) {
                return false;
            }
        }
    }
    
    return stack.isEmpty();
}
```

## ⚡ Performance

| Operation | Time Complexity | Description |
|-----------|----------------|-------------|
| **push(e)** | O(1) | Add element to top of stack |
| **pop()** | O(1) | Remove element from top of stack |
| **peek()** | O(1) | Examine top element without removal |
| **isEmpty()** | O(1) | Check if stack has no elements |
| **size()** | O(1) | Count number of elements |
| **clear()** | O(1) | Remove all elements |

<div align="center">

```
Performance Comparison (Operation Time)
─────────────────────────────────────────────────────

Operation │ Array-based Stack │ Node-based Stack
──────────┼──────────────────┼─────────────────
push      │ O(1)*            │ O(1)
pop       │ O(1)             │ O(1)
peek      │ O(1)             │ O(1)
isEmpty   │ O(1)             │ O(1)

* Amortized O(1), can be O(n) when resizing is needed
```

</div>

## 🧠 Applications

NodeStack can be used for various applications:

- 🔙 **Browser History Management**
- 🧮 **Expression Evaluation**
- ↩️ **Undo Mechanisms**
- 📝 **Syntax Parsing**
- 📊 **Depth-First Graph Traversal**
- 🧩 **Solving Maze Problems**
- 📑 **Function Call Management**

## 🤝 Contribute

Contributions are welcome! Here's how you can help:

1. **Fork** the repo
2. Create a **new branch** (`git checkout -b feature/amazing-feature`)
3. Make your **changes**
4. **Commit** your changes (`git commit -m 'Add some amazing feature'`)
5. **Push** to the branch (`git push origin feature/amazing-feature`)
6. Open a **Pull Request**

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

<div align="center">

---

```
    _   __          __     _____ __             __  
   / | / /___  ____/ /__  / ___// /_____ ______/ /__
  /  |/ / __ \/ __  / _ \ \__ \/ __/ __ `/ ___/ //_/
 / /|  / /_/ / /_/ /  __/___/ / /_/ /_/ / /__/ ,<   
/_/ |_/\____/\__,_/\___//____/\__/\__,_/\___/_/|_|  
                                                    
```

Created with ❤️ by [Marino Baric](https://github.com/MarinoBaric) | Last Updated: March 11, 2025

</div>
