# 🔐 Password Generator

A customizable password generator developed in Java that creates random passwords based on user-defined security requirements.

The application allows users to define password length and choose which character groups should be included:
uppercase letters, lowercase letters, numbers, and special characters.

This project was built to practice Java Core concepts, object-oriented programming, interfaces, abstraction, and clean code organization.

---

## ✨ Features

- Generate random passwords with customizable length
- Support uppercase letters
- Support lowercase letters
- Support numbers
- Support special characters
- Validate generated passwords against user requirements
- Prevent invalid generation when no character option is selected
- Separate user interaction from password generation logic

---

## 🛠️ Tech Stack

- Java 18+
- Java Standard Library
- Scanner API
- Random API
- StringBuilder

---

## 🏗️ Design Overview

The project follows a simple separation of responsibilities:

```
User Interface
      |
      ↓
Password Generator
      |
      ↓
Password Validation
```


### Main Components

### `UserInterface`

Defines the contract for user interaction.

Responsibilities:
- Receive user preferences
- Display generated password


### `TextbasedInterface`

Concrete implementation of `UserInterface`.

Responsibilities:
- Handle console input using `Scanner`
- Display output to the user


### `PasswordGenerator`

Responsible for:

- Creating the character pool
- Generating random passwords
- Validating password requirements


### `App`

Application entry point.

Responsibilities:
- Initialize components
- Coordinate application flow

---

## 📂 Project Structure

```
src/
│
├── App.java
├── UserInterface.java
├── TextbasedInterface.java
└── PasswordGenerator.java
```

---

## ▶️ How to Run

### Clone repository

```bash
git clone https://github.com/yourusername/password-generator.git
```

### Navigate to project directory

```bash
cd password-generator
```

### Compile

```bash
javac *.java
```

### Run

```bash
java App
```

---

## 💻 Example

Application flow:

```
Please enter the password length:
12

Would you like the password to have lowercase characters? (y/n):
y

Would you like the password to have uppercase characters? (y/n):
y

Would you like the password to have numerical characters? (y/n):
y

Would you like the password to have symbol characters? (y/n):
y


Here is the Password: aB7@kP92Lm#x
```

---

## 📚 Concepts Applied

This project demonstrates:

- Object-Oriented Programming (OOP)
- Interfaces
- Abstraction
- Encapsulation
- Method decomposition
- Input handling
- Validation logic
- Random data generation
- String manipulation

---

## 🚀 Future Improvements

- Replace `Random` with `SecureRandom` for cryptographic password generation
- Add password strength evaluation
- Add automated tests using JUnit
- Add graphical user interface
- Add configuration options through command-line arguments

---

## 👨‍💻 Author

**Marcel Nota**

Software Developer focused on Java Backend Development and Microservices.