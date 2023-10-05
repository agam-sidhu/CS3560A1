# CS3560A1
# iVote Simulator (Assignment 1)
---
## Introduction

The **iVote Simulator** is a Java-based simulation project that polls students for a given question. This program allows you to use different types of questions, receive student answers, and calculate the answer statistics.

### Problem Statement

In this project, I implemented

1. Build question types and student answers for two question types: single answer and multiple answer.
2. Allow students to submit answers, each with their own unique ID.
3. Create a Voting Service Object that can be altered based on question-answer type and start accepting students' answers.
4. Output answer stats to the console, showing the count for each answer.
5. Use a SimulationDriver to automate the entire process, including question configuration, student answer generation, submission, and result display.

## Features

- Configure multiple-choice and single-choice questions.
- Accept student submissions with unique IDs.
- Builds multiple student objects with unique answers to a given question
- Ensure that each student can at least submit one answer.
- Calculate and display student answer submission stats.
- Run the simulation process with the SimulationDriver.


### Prerequisites

Before running the program, make sure you have Java Development Kit (JDK) installed


## Usage

To use the Simulator, please do these steps:

1. Define question types (either Single or Multiple) and student answers in the `SimulationDriver` class.
2. Run the `SimulationDriver` class to start the simulation.

## Program Structure

The core classes and components of the Project:

1. **Student**: Represents a student with a unique ID and answers.

2. **Question**: An abstract class that defines question types and student answers.

3. **VotingService**: Manages submission, and calculation of the answers submitted.

4. **SimulationDriver**: A class holding the `main()` method to run the simulation.

5. **SingleAnswer**: A class that extends questions and is used for single-answer choice questions.

6. **MultipleAnswer**: A class that extends questions and is used for multiple-answer choice questions.

7. **UserGenerator**: A class that creates a random number of students from 1 to 50.

8. **Simulator**: A class that simulates answers chosen by the students.
