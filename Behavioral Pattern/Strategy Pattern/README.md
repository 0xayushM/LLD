# 🧠 Strategy Pattern

## 🧾 Definition

> The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from clients that use it.

---

## 🎯 When to Use

- You have **multiple ways** of performing an action (like different payment methods or sorting techniques).
- You want to **replace conditionals (`if-else`, `switch-case`)** with clean, maintainable code.
- You want to follow **Open/Closed Principle** – add new logic without modifying existing code.

---

## 🧱 Components

| Component | Role |
|----------|------|
| `Strategy` Interface | Declares common method for all algorithms |
| `ConcreteStrategy` Classes | Each implements a specific algorithm |
| `Context` | Accepts a strategy and uses it to perform the operation |

---

## 📂 Examples in This Folder

| Example | Description | Link |
|--------|-------------|------|
| 🛒 **Payment System** | Select between CreditCard, PayPal, UPI payments | [View Code](./payment-system) |
| 🧭 **Navigation App** | Switch between Bike, Car, Walk strategies | [View Code](./navigation-app) |
| 🔃 **Sorting Application** | Apply Bubble Sort, Quick Sort, etc dynamically | [View Code](./sorting-application) |

---

## 🧪 How to Run

```bash
cd path/to/pattern-directory
javac Client.java
java Client
```

---

## 📝 UML Diagrams

1. **Sorting Application**

![Sorting Application](./diagrams/sorting-app.drawio.png)


2. **Payment System**

![Payment System](./diagrams/payment-system.drawio.png)

3. **Navigation App**

![Navigation App](./diagrams/navigation-app.drawio.png)

