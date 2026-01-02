# Refurbished Apple Store

A Java-based management system for tracking refurbished Apple products in a store inventory. This application allows you to manage product entries with details like serial numbers, models, finishes, storage capacity, connectivity options, and pricing.

## Features

- **Product Management**: Store and manage refurbished Apple product information
- **Serial Number Tracking**: Each product entry has a unique serial number
- **Product Details**: Track model, finish, storage, cellular connectivity, original price, and discount
- **Search Capabilities**: 
  - Find products by serial number
  - Filter products by Space Grey finish or Pro models
  - Filter products that are both Space Grey and Pro
- **Entry System**: Organize products as entries in the store inventory
- **Capacity Management**: Store maintains a maximum capacity of 5 entries

## Project Structure

```
AppleShop 3/
├── src/
│   ├── model/
│   │   ├── Product.java          # Product class with attributes (model, finish, storage, etc.)
│   │   ├── Entry.java            # Entry class linking serial numbers to products
│   │   └── RefurbishedStore.java # Store management class (collection of entries)
│   ├── console_apps/
│   │   └── ProductApp.java       # Console application for product management
│   └── junit_tests/
│       ├── TestProduct.java      # Unit tests for Product class
│       ├── TestEntry.java        # Unit tests for Entry class
│       └── TestRefurbishedStore.java # Unit tests for RefurbishedStore class
└── bin/
    └── [compiled classes]
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- JUnit 4 for running tests
  - Download from [JUnit 4](https://github.com/junit-team/junit4/wiki/Download-and-Install)
  - Or use Maven/Gradle to manage dependencies
- Hamcrest (required by JUnit for assertions)
  - Usually bundled with JUnit or download from [Hamcrest](http://hamcrest.org/)

## Compilation

To compile the project, navigate to the `AppleShop 3` directory and use:

```bash
javac -d bin src/model/*.java src/console_apps/*.java
```

For compiling tests (requires JUnit and Hamcrest JAR files in the project directory):

```bash
# On Unix/Linux/Mac:
javac -cp .:junit.jar -d bin src/model/*.java src/junit_tests/*.java

# On Windows:
javac -cp .;junit.jar -d bin src/model/*.java src/junit_tests/*.java
```

**Note**: Place `junit.jar` and `hamcrest.jar` files in the `AppleShop 3` directory before compiling and running tests.

## Running the Application

To run the console application:

```bash
cd "AppleShop 3"
java -cp bin console_apps.ProductApp
```

The application will prompt you to enter product information and display product details.

## Running Tests

To run the JUnit tests:

```bash
cd "AppleShop 3"

# On Unix/Linux/Mac:
java -cp bin:junit.jar:hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestProduct
java -cp bin:junit.jar:hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestEntry
java -cp bin:junit.jar:hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestRefurbishedStore

# On Windows:
java -cp bin;junit.jar;hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestProduct
java -cp bin;junit.jar;hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestEntry
java -cp bin;junit.jar;hamcrest.jar org.junit.runner.JUnitCore junit_tests.TestRefurbishedStore
```

## Usage Example

### Creating a Product

```java
// Create a product with model and original price
Product p = new Product("iPad Pro 12.9", 1289.00);

// Set additional attributes
p.setFinish("Space Grey");
p.setStorage(256);
p.setHasCellularConnectivity(true);
p.setDiscountValue(200.00);

// Get the discounted price
double price = p.getPrice(); // Returns 1089.00
```

### Managing the Store

```java
// Create a refurbished store
RefurbishedStore store = new RefurbishedStore();

// Add entries to the store
store.addEntry("F9FDN4NKQ1GC", "iPad Pro 12.9", 1289.00);
store.addEntry("ABC123XYZ789", "MacBook Pro", 2399.00);

// Retrieve a product by serial number
Product product = store.getProduct("F9FDN4NKQ1GC");

// Get all Space Grey or Pro products
String[] spaceGreyOrPro = store.getSpaceGreyOrPro();

// Get products that are both Space Grey and Pro
String[] spaceGreyPro = store.getSpaceGreyPro();
```

## Product Attributes

| Attribute | Type | Description | Example |
|-----------|------|-------------|---------|
| model | String | Product model name | "iPad Pro 12.9" |
| finish | String | Product color/finish | "Silver", "Space Grey" |
| storage | int | Storage capacity in GB | 256, 512, 1000 |
| hasCellularConnectivity | boolean | WiFi + Cellular capability | true/false |
| originalPrice | double | Original retail price | 1289.00 |
| discountValue | double | Discount amount | 200.00 |

## License

This project is available for educational purposes.