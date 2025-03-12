### **🚀 New Assignment: Implement a Sorted Multi-Set (Bag) Using a Linked List**  
This assignment is **totally different** from your previous ones and will require **more advanced list manipulations**.

---

## **📌 Assignment Instructions**
### **1️⃣ Overview**
- You will implement a **Sorted Multi-Set (Bag)** using a **linked list**.
- Unlike a normal set, a **multi-set allows duplicate values**.
- The **list must remain sorted** at all times when inserting elements.

---

### **2️⃣ Provided Interface**
You must implement the following interface:

```java
public interface SortedMultiSet<E extends Comparable<E>> {
    void insert(E value);   // Add an element in sorted order
    boolean remove(E value); // Remove one occurrence of value
    boolean contains(E value); // Check if value exists
    int count(E value);  // Count occurrences of value
    int size();  // Return total number of elements
}
```

---

### **3️⃣ Your Task: Implement `SortedLinkedBag.java`**
Create a class **`SortedLinkedBag`** that:
- Implements **`SortedMultiSet<Integer>`**.
- Uses a **Linked List (custom `Node` class) as the internal data structure**.
- **Inserts elements while maintaining sorted order**.

---

### **4️⃣ Requirements**
✅ **Insert (`insert(E value)`)**  
- Elements **must always be inserted in sorted order**.  
- **Allow duplicates** (e.g., inserting `5` twice means `5` appears twice in the list).  

✅ **Remove (`remove(E value)`)**  
- Removes **only one occurrence** of the value.  
- Returns `true` if an element was removed, otherwise `false`.

✅ **Contains (`contains(E value)`)**  
- Returns `true` if the value exists in the bag, otherwise `false`.

✅ **Count (`count(E value)`)**  
- Returns the **number of times** `value` appears in the bag.

✅ **Size (`size()`)**  
- Returns the **total number of elements**, including duplicates.

✅ **Main Method (For Testing)**  
- Insert **several integers** in random order.  
- Remove specific elements.  
- Print the **final bag contents** and count occurrences of a specific number.

---

### **5️⃣ Example Test Cases**
```java
SortedLinkedBag bag = new SortedLinkedBag();
bag.insert(5);
bag.insert(3);
bag.insert(7);
bag.insert(5); // Duplicate value allowed
bag.insert(2);

System.out.println(bag);  // Expected: [2, 3, 5, 5, 7] (always sorted)

System.out.println(bag.contains(5)); // Expected: true
System.out.println(bag.count(5)); // Expected: 2
System.out.println(bag.size());  // Expected: 5

bag.remove(5); // Remove only one occurrence of 5
System.out.println(bag);  // Expected: [2, 3, 5, 7]
```

---

### **6️⃣ JUnit Test (Bonus)**
Write a **JUnit test class** `SortedLinkedBagTest.java` that:
- Tests **inserting elements**.
- Tests **removing elements**.
- Ensures **elements are always sorted**.
- Ensures **counting works correctly**.

---

### **💡 Hints**
💡 **How to insert while maintaining sorted order?**
- If the list is empty, insert at the beginning.
- If `value` is **smaller than the head**, insert at the front.
- Otherwise, **find the correct position** in the list.

💡 **How to remove only one occurrence of a value?**
- Search for `value` in the list.
- Remove **only the first occurrence**.

💡 **How to count occurrences of a value?**
- Traverse the list and **count** how many times `value` appears.

---

### **🌟 Summary**
| Feature | **Normal Set** | **Multi-Set (Bag) Implementation** |
|---------|---------------|-----------------------------------|
| **Duplicates Allowed?** | ❌ No | ✅ Yes |
| **Sorting Required?** | ❌ No | ✅ Yes |
| **Insertion Order** | Random | Sorted |

This assignment **increases difficulty** and requires **linked list operations**, **sorting on insert**, and **duplicate management**. 🚀 Let me know if you need **more hints!** 😊