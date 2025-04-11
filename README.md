### 1. **Project Title**
- **Cucumber BDD Framework**

### 2. **Project Description**
- This project implements a **Cucumber** framework for Behavior-Driven Development (BDD) in Java. It leverages the **Cucumber** library along with **JUnit** for running BDD-style tests, where the test scenarios are written in human-readable Gherkin syntax. This project is designed to support teams using Cucumber to write clear and executable specifications for automated acceptance tests.

### 3. **Technologies & Tools Used**
- **Programming Language**: Java  
- **Testing Framework**: JUnit  
- **BDD Framework**: Cucumber  
- **Gherkin Syntax**: Feature files for writing test scenarios  
- **Build Tool**: Maven  
- **Version Control**: Git & GitHub  

### 4. **Project Structure**


### 5. **Installation & Setup**
- **Prerequisites:**
  - Java 8 or later  
  - Maven installed  

- **Steps to Set Up the Project:**
  1. Clone the repository:
     ```sh
     git clone https://github.com/MarwanSultan/Cucumber.git
     ```
  2. Navigate to the project directory:
     ```sh
     cd Cucumber
     ```
  3. Install dependencies:
     ```sh
     mvn clean install
     ```
  4. Run tests:
     ```sh
     mvn test
     ```

### 6. **How to Use**
- Modify or add new `.feature` files inside the `resources/features` directory, writing your scenarios in Gherkin syntax.  
- Implement the corresponding step definitions in the `stepdefinitions` directory.  
- Run the tests using Maven:
  ```sh
  mvn test

7. Contributing
Fork the repository

Create a feature branch (feature-branch-name)

Commit your changes and push them

Create a Pull Request

8. License
This project is licensed under the MIT License

9. Author
Marwan Sultan

LinkedIn: linkedin.com/in/marwansultan

Email: marwan.sultan@gmail.com
