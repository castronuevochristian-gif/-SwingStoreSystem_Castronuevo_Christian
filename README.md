Store Management System
A Java Swing application for managing transactions, inventory, and sales logs across synchronized frames.

Features
Transaction Processing: Select products (Rice, Sugar, Coffee, Milk) and calculate totals based on quantity.

Inventory Tracking: Real-time stock updates in DataManager following each purchase.

Transaction History: View historical sales data in LogsFrame with Refresh and Show capabilities.

Read-Only Displays: txtLogs and txtInventory are set to non-editable to ensure data integrity.

Custom Font Scaling: Increased font sizes for better visibility in text areas.

Project Files
DataManager.java: Stores static arrays for products, prices, stock levels, and transaction logs.

TransactionFrame.java: The main interface for making purchases and accessing logs/inventory.

LogsFrame.java: Displays all processed transaction data.

InventoryFrame.java: Displays current stock and pricing information.

How to Run
Open the project in the IDE.

Navigate to the datamanager package.

Right-click TransactionFrame.java and select Run File.

Configuration
Language: Java

Library: Swing (GUI)

Persistence: Static Global Arrays

Security: setEditable(false) for reporting text areas
