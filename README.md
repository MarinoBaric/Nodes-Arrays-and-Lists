<div align="center">
  
# 🔄 Nodes, Arrays & Lists in Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg?style=for-the-badge)](https://github.com/MarinoBaric/Nodes-Arrays-and-Lists/graphs/commit-activity)
[![Contributions](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=for-the-badge)](https://github.com/MarinoBaric/Nodes-Arrays-and-Lists/issues)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

<p align="center">
  <img src="https://raw.githubusercontent.com/MarinoBaric/Nodes-Arrays-and-Lists/main/assets/data-structures-animation.gif" alt="Data Structures Animation" width="500"/>
</p>

**Interactive exploration of fundamental Java data structures with visual examples and practical implementations**

[Key Features](#key-features) • [Getting Started](#getting-started) • [Data Structures](#data-structures) • [Contributing](#contributing) • [License](#license)

</div>

## 🚀 Overview

This repository serves as a comprehensive resource for understanding the core foundations of Java data structures: nodes, arrays, and lists. Whether you're a beginner learning these concepts for the first time or an experienced developer looking to refresh your knowledge, this project provides clear explanations, visual representations, and practical implementations.

<details>
<summary>Why Study These Data Structures?</summary>

- **Foundation for Advanced Concepts**: Understanding nodes, arrays, and lists is essential for mastering more complex data structures and algorithms
- **Optimization Skills**: Learn how to select the right data structure for different scenarios
- **Interview Preparation**: These topics are frequently asked in technical interviews
- **Better Code Design**: Create more efficient and maintainable Java applications

</details>

## ✨ Key Features

- **Interactive Examples**: Run and modify code to see concepts in action
- **Visual Explanations**: Diagrams and animations that illustrate how data structures work
- **Performance Analysis**: Time and space complexity comparisons
- **Practical Use Cases**: Real-world applications for each data structure
- **Progressive Learning Path**: Structured from basic to advanced concepts

## 🏁 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Basic understanding of Java programming

### Installation

```bash
# Clone the repository
git clone https://github.com/MarinoBaric/Nodes-Arrays-and-Lists.git

# Navigate to the project directory
cd Nodes-Arrays-and-Lists

# Compile and run an example
javac examples/ArrayExample.java
java examples.ArrayExample
```

## 📊 Data Structures

### 1. Nodes

<p align="center">
  <img src="https://raw.githubusercontent.com/MarinoBaric/Nodes-Arrays-and-Lists/main/assets/node-diagram.png" alt="Node Diagram" width="400"/>
</p>

The fundamental building block for many data structures. This section covers:

- Node implementation in Java
- Memory allocation and references
- Creating chains of nodes
- Practical applications

<details>
<summary>Example Node Implementation</summary>

```java
public class Node<T> {
    private T data;
    private Node<T> next;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
    // Getters and setters...
}
```
</details>

### 2. Arrays

<p align="center">
  <img src="https://raw.githubusercontent.com/MarinoBaric/Nodes-Arrays-and-Lists/main/assets/array-visualization.png" alt="Array Visualization" width="400"/>
</p>

Fixed-size collections of elements with contiguous memory allocation. This section covers:

- Static arrays in Java
- Multi-dimensional arrays
- Array manipulation algorithms
- Time complexity analysis

<details>
<summary>Common Array Operations</summary>

| Operation | Time Complexity | Example |
|-----------|----------------|---------|
| Access    | O(1)           | `array[i]` |
| Search    | O(n)           | Linear search |
| Insertion | O(n)           | Shift elements |
| Deletion  | O(n)           | Shift elements |

</details>

### 3. Lists

<p align="center">
  <img src="https://raw.githubusercontent.com/MarinoBaric/Nodes-Arrays-and-Lists/main/assets/list-types.png" alt="List Types" width="500"/>
</p>

Dynamic data structures that grow and shrink as needed. This section covers:

- ArrayList implementation and usage
- LinkedList (Singly and Doubly)
- Custom list implementations
- Comparing list performance

<details>
<summary>List Types Comparison</summary>

| List Type | Advantages | Disadvantages | Best For |
|-----------|------------|--------------|----------|
| ArrayList | Fast access, compact | Slow insertions/deletions | Random access, fixed size |
| LinkedList | Fast insertions/deletions | Slow random access | Frequent modifications |
| Custom List | Tailored to specific needs | Implementation overhead | Specialized applications |

</details>

## 🧪 Examples & Exercises

Each data structure includes:

1. **Basic Implementation**: Core Java code showing the fundamental structure
2. **Interactive Examples**: Runnable demonstrations of key operations
3. **Practice Problems**: Exercises with varying difficulty levels
4. **Solutions**: Detailed explanations of optimal approaches

## 👥 Contributing

Contributions are warmly welcomed! This project is designed to be a collaborative learning resource.

### How to Contribute

1. **Fork** the repository
2. **Create** a feature branch
3. **Implement** your contribution (new examples, visualizations, exercises)
4. **Test** your changes
5. **Submit** a pull request

Please see our [Contributing Guidelines](CONTRIBUTING.md) for more details.

### Areas for Contribution

- Additional examples and implementations
- Improved visualizations or animations
- Documentation enhancements
- Performance optimizations
- New exercises and solutions

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

- Computer science educators and authors who have shared their knowledge
- Open-source contributors who provided feedback and improvements
- Everyone who uses this repository to learn and grow

---

<div align="center">
  
[![GitHub stars](https://img.shields.io/github/stars/MarinoBaric/Nodes-Arrays-and-Lists?style=social)](https://github.com/MarinoBaric/Nodes-Arrays-and-Lists/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/MarinoBaric/Nodes-Arrays-and-Lists?style=social)](https://github.com/MarinoBaric/Nodes-Arrays-and-Lists/network/members)
[![GitHub watchers](https://img.shields.io/github/watchers/MarinoBaric/Nodes-Arrays-and-Lists?style=social)](https://github.com/MarinoBaric/Nodes-Arrays-and-Lists/watchers)

**Created with ❤️ by [Marino Baric](https://github.com/MarinoBaric)**

</div>