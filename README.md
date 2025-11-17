📄 Description - Exercise Statement

### Level 1: Singleton
Create a class that replicates the functionality of the **'Undo'** command. This class will be used by the Main class, which must allow options to be entered via the console.

* The 'Undo' class must store the most recent commands entered.
* It must allow adding or removing commands, as well as listing the latest commands entered (similar to the 'history' command in Linux).
* The 'Undo' class **must strictly implement a Singleton pattern**.

---

### Level 2: Abstract Factory
Create a small manager for international addresses and phone numbers.

* The application must allow the user to add international addresses and phone numbers to the address book.
* Taking into account the different formats used in different countries, build the address book, addresses, and phone numbers by **implementing an Abstract Factory pattern**.

---

### Level 3: Command
Design a parking lot for 4 vehicles: a car, a bicycle, a plane, and a boat.

* Demonstrate how the **Command pattern** works by implementing the methods **start**, **accelerate**, and **brake** for each type of vehicle.

***


💻 Used Technologies
Technology	Version	Description
Java	24 (OpenJDK)	Language and environment for development.
Apache Maven	3.9.6 (or higher)	Build automation and project management tool.


📋 Requirements
Operating System: Windows/macOS/Linux.

Java Development Kit (JDK): Version 24.0.1 (or higher). It is recommended to use an OpenJDK distribution.

Apache Maven: Installed and configured in the system PATH.

Integrated Development Environment (IDE): IntelliJ IDEA (recommended) or any other IDE with Maven support.

🛠️ Installation
Clone the Repository:

git clone https://github.com/Rafadicandia/Tasca-S3.01--Patterns-1.git
IDE Configuration:

Open the folder as a Maven project in your IDE. The IDE should automatically download the necessary dependencies (JUnit 5) defined in the pom.xml file.

Build the Project:

To ensure all dependencies are resolved and the project compiles correctly, you can run the following command in the terminal from the project root:

mvn clean install
▶️ Execution
⚙️ Execute from the IDE

🤝 Contributions
Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.