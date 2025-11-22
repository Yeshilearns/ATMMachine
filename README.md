A simple ATM Machine project built in Java to demonstrate the State Design Pattern as part of a Software Engineering assignment.
The ATM changes behavior based on its current state — NoCard, HasCard, and Authenticated — following clean object-oriented design principles.

Features:

- Implements the State Pattern

- Three ATM states:

NoCardState

HasCardState

AuthenticatedState

- Context class (ATM.java) that delegates actions to states

- Supports operations:

Insert card

Enter PIN

Withdraw cash

- Includes unit tests and a simple star-pattern output utility

- Organized as one-class-per-file following Java coding conventions

State Design Pattern Overview:

This project demonstrates how behavior changes dynamically at runtime based on internal state.

State Pattern Benefits:

Removes large if-else / switch blocks

Each state encapsulates its own logic

Increases code readability

Easy to extend new states

📁 Project Structure
ATMMachine/
├── ATM.java                (Context class)
├── State.java              (Interface for common actions)
├── NoCardState.java        (State when no card is inserted)
├── HasCardState.java       (State when card is inserted)
├── AuthenticatedState.java (State after correct PIN)
├── ATMTests.java           (Unit tests)
├── StarPattern.java        (Simple star pattern output)
└── README.md               (Project description)

🧪 Unit Tests

Two lightweight tests validate:

✔ State transitions
✔ Action behavior under each state
✔ Star pattern generation (bonus test)
