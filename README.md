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
## 💻 Used Technologies
| Technology | Version      | Description |
| :--- |:-------------| :--- |
| **Java** | **[24.0.1]** | Language and environment for development. |
| **Gradle** | **[9.2.0]**  | Build automation and project management tool. |

## 📋 Requirements
* Operating System: Windows/macOS/Linux.
* Java Development Kit (JDK): Minimum version **openjdk-24**.
* **Gradle:** Installed and configured in the system PATH.

## 🛠️ Installation
1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/Rafadicandia/Tasca-S3.01--Patterns-1.git
    ```
2.  **IDE Configuration:**
    Open the folder as a **Gradle** project in your IDE (e.g., IntelliJ IDEA, VS Code). The IDE should automatically synchronize the project and download dependencies defined in the `build.gradle` or `build.gradle.kts` file.

3.  **Build the Project:**
    To ensure all dependencies are resolved and the project compiles correctly, use the *Gradle Wrapper* by running the following command in the terminal from the project root:
    ```bash
    ./gradlew build
    # Or on Windows:
    # gradlew build
    ```

## ▶️ Execution
Execute the main class (`Main`) for each level to see the design patterns in action. You can do this from your IDE or by using the Gradle `run` command (if a `main` task is configured):

```bash
./gradlew run
```

## 🤝 Contributions
Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.