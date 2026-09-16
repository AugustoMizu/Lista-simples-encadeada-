# Lista-simples-encadeada-
Singly linked list implementation in Java
# Singly Linked List - Professors (Java)

This repository contains a pedagogical implementation of a **Singly Linked List** in **Java**. The structure is designed to manage a simple registry of professors, where each record contains a unique `id` and a `name`.

## 🚀 Features

- **Insertion**: Adds new professors to the end of the list.
- **Display**: Iterates through and prints all registered professors to the console.
- **delete**: removes a professor from the end of the list.

## 🛠️ Project Structure

The project consists of three main components:
1. **`Celula` (Node)**: Represents the entity and the node of the list, holding the professor entity, and a reference to the next professor.
2. **`ListaEncadeada` (Linked List)**: Contains the chaining logic and the methods to manipulate the list.
3. **`ListaImplementação`**: The testing class responsible for running the demonstration.

## 💻 Code Snippet

```java
//public class Celula {
	private Professor professor;
	private Celula proximo;
	
	
	public Professor getProfessor() {
		return professor;
	}
}
```

## 📋 How to Run

1. Make sure you have **JDK 11 or higher** installed on your machine.
2. Clone this repository:
   ```bash
   git clone https://github.com/AugustoMizu/Lista-simples-encadeada-
   ```
3. Navigate to the project folder and compile the files:
   ```bash
   javac ListaImplementacao.java
   ```
4. Run the application:
   ```bash
   java Main
   ```

## ☕ Expected Console Output

```text
Professores inseridos 
__________________________
ID: 1 Nome: nome 1
ID: 2 Nome: nome 2
ID: 3 Nome: nome 3
ID: 4 Nome: nome 4
ID: 5 Nome: nome 5

Ultimo Professor excluido
__________________________
ID: 1 Nome: nome 1
ID: 2 Nome: nome 2
ID: 3 Nome: nome 3
ID: 4 Nome: nome 4
```

