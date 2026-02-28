---

# 🏪 Store Management System

A Java Swing application for managing transactions, inventory, and sales logs across synchronized frames.

## Features

### Transaction Processing

* Select products: Rice, Sugar, Coffee, Milk
* Enter quantity to calculate total cost
* Automatically updates stock after purchase

### Inventory Tracking

* Real-time stock updates using `DataManager`
* Centralized storage with static global arrays
* Stock is reduced after every successful transaction

### Transaction History

* View processed sales data in `LogsFrame`
* Includes **Refresh** and **Show** buttons
* Displays complete transaction records

### Read-Only Displays

* `txtLogs` and `txtInventory` use:

```java
setEditable(false);
```

* Prevents modification of reports

### Custom Font Scaling

* Increased font sizes for improved readability
* Applied to text areas and display components

---

## Project Files

### DataManager.java

* Stores:

  * Product names
  * Prices
  * Stock quantities
  * Transaction logs
* Uses static global arrays for shared access

### TransactionFrame.java

* Main interface
* Handles:

  * Product selection
  * Quantity input
  * Total calculation
  * Purchase confirmation
  * Navigation to logs and inventory

### LogsFrame.java

* Displays all transaction records
* Includes refresh functionality

### InventoryFrame.java

* Displays current stock and pricing
* Read-only inventory view

---

## How to Run

1. Open the project in your IDE
2. Navigate to the `datamanager` package
3. Right-click `TransactionFrame.java`
4. Select **Run File**

---

## Configuration

* Language: Java
* GUI Library: Swing
* Data Storage: Static global arrays (in-memory)
* Security: `setEditable(false)` for reporting text areas

---
