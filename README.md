# Table of Contents
- [Repository Description](#repository-description)
- [Cloning the Repository](#cloning-the-repository)
  - [Downside of `ZIP`](#downside-of-zip)
  - [Cloning via `HTTPS`](#cloning-via-https)
  - [Cloning via `SSH`](#cloning-via-ssh)
  - [Usage of Git](#usage-of-git)
  - [Downloading as `ZIP`](#downloading-as-zip)
- [How to Use Repository](#how-to-use-repository)
- [Updating the Branch](#updating-the-branch)
- [Repository Structure](#repository-structure)
  - [Tutorial 1](#tutorial-1)
  - [Tutorial 2](#tutorial-2)
  - [Tutorial 3](#tutorial-3)
  - [Tutorial 4](#tutorial-4)
  - [Tutorial 5](#tutorial-5)
- [Author](#author)

# Repository Description

The goal of this repository is to make the code examples, written in the programming
tutorials, achievable and downloadable by others. The repository can also be used
by others for educational purposes or as an example to the tasks, that may be
used while teaching.

# Cloning the Repository

Cloning this repository can be done in three common ways:
- With `HTTPS` cloning
- With `SSH` cloning
- Downloading the `ZIP` file

## Downside of `ZIP`

Before we jump into cloning; you should note that if cloned via `ZIP`, you
won't be able to update the repository on each change. You will have to
download the repository manually each time there is a change. Which i
strongly do **not** recommend.

## Cloning via `HTTPS`

This is a fairly simple process. If you are not too eager to use Git that often
you might want to clone via `HTTPS`. Here are the steps:

1. Click inside of GitHub, on the **green** `<> code` button
2. Select `HTTPS`
3. Copy the given web URL
4. [Use Git to clone](#usage-of-git)

## Cloning via `SSH`

If you already have a `SSH` setup, jump to 10

1. Create `SSH` key: [Creating SSH Key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)
2. Find your generated **public** key
3. Open it using a text editor
4. Copy the key
5. Go into GitHub
6. Go into Settings > SSH and GPG keys
7. Select `New SSH Key`
8. Enter a title and select `Authentication` for key type
9. Paste your public key
10. Go to the GitHub page of this repository
11. Click inside of GitHub, on the **green** `<> code` button
12. Select `SSH`
13. Copy the URL
14. [Use Git to clone](#usage-of-git)

## Usage of Git

### Intellij

[How to clone a GitHub Project into Intellij](https://blog.jetbrains.com/idea/2020/10/clone-a-project-from-github/)

1. Open Intellij
2. If you already have a project open on IntelliJ:
   1. Click on the `File` tab
   2. Select `New`
   3. Select `Project from Version Control`
3. Else if no project is currently open:
   1. Click on `Get from VCS`
4. Enter the copied URL
5. Hit `clone`


### Local

[How to clone a GitHub Project](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)

1. Open the folder you want to set the repo in
2. Right click inside the folder
3. Select `Open Git GUI here`
4. Click `Clone Existing Repository`
5. Enter the URL in `Source Location`
6. Choose the folder you want in `Target Directory`
7. At the end of your selected `Target Directory`, add `/tut-exercises`.
This will create a new folder inside your directory as `tut-exercises`
8. Select `Recurisvely clone submodules`
9. Hit `clone`

### Eclipse

TODO: I'll try to add

## Downloading as `ZIP`

This is simply downloading the project without using Git at all.
As mentioned [above](#downside-of-zip) you will have to manually 
download the project after each change in the repo.

1. Click inside of GitHub, on the **green** `<> code` button
2. Click at the bottom on `Download ZIP`
3. Go into your `Downloads`
4. Right click on `ZIP`
5. Select `Extract all`
6. Enter the location you want
7. Open the project in your IDE

# How to Use Repository

Basically the repository can be used in any way necessary.
Opening other branches for expansion is allowed. And after a
review may be merged.

The recommended usage is as follows:
1. Clone the repository in to your IDE
2. Go through the exercises and read the `Task.md` file
3. Try to solve the tasks by yourself
4. You can find the solutions under `/solution`
5. After each tutorial, the solutions to the already uploaded tasks
will be shared. Try to [update](#updating-the-branch) your branch regularly

# Updating the Branch

Given that you want to update your local `main` branch, you have to:
1. Fetch the updates
    ```bash
    git fetch --all
    ```
2. Merge the changes into your branch
    ```bash
    git merge origin/main
    ```
3. If necessary solve conflicts


# Repository Structure

Here is an overview of the exercises by topics:

| Topics                  | Tutorial Nr. | Exercises  |
|-------------------------|--------------|------------|
| Main                    | T1           | T1.DEMO    |
| OOP                     | T1           | T1.1, T1.2 |
| Data Types              | T1, T2       | T2.1       |
| Control Structures      | T2           | T2.2, T2.3 |
| Scanner                 | T3           | T3.1       |
| Methods & Overloading   | T3           | T3.2       |
| Constructors            | T3           | T3.2       |
| Arrays                  | T4           | T4.1       |
| Multidimensional Arrays | T4           | T2.3       |
| Modifiers               | T4           | T4.2       |
| Encapsulation           | T4           | T4.2       |
| Equals method           | T5           | T5.1       |
| Lists                   | T5           | T5.2       |
| Abstract Data Types     | T5           | T5.2       |
| Linked List             | T5           | T5.3       |


## Tutorial 1

First tutorial was an introduction to java. 

Topics discussed:
- Main Program
- Objects & Classes (OOP)
- Data Types

### Demo
This is a demo program of how the `main` methods are used and which
commands are required for running an example program.

### Exercise 1
This exercise is beginner-friendly. It uses the basics of OOP concept
& a couple of data types.

### Exercise 2
This one was a bit more challenging task. Which requires a better
understanding of the OOP concept. This task also demonstrates
how a game could be written in an OOP environment.

## Tutorial 2

Started diving into general java structure.

Topics discussed:
- Data Types
- `If` Statements
- `Switch` Cases
- `For` Loops
- `While` Loops
- `do-While` Loops

### Exercise 1
A short code inspection task. It requires deeper knowledge on how
some data type operators function. 

### Exercise 2
This task is again beginner-friendly and requires only fair bit of knowledge on
differences between loop types.

### Exercise 3
This task requires understanding how the control structures can be used
together and how they will be implemented in real life situations.

## Tutorial 3

Talked about `Java.util.Scanner` inputs and how methods in java work.

Topics discussed:
- `instanceof` & type casting
- `Scanner`
- Methods
- Method Overloading
- Constructors
- Static Methods
- JavaDocs

### Exercise 1
A homework-similar task on how to work with `Scanner`. Creating a command-input
structure that is later on used in various programs for I/O.

### Exercise 2
A general modelling task for practicing method implementations and
method overloading. This task also contains a basic OOP implementation.

## Tutorial 4

New data structure: Arrays. Also explained access modifiers and
encapsulation principle.

Topics:
- Arrays
- Multidimensional Arrays
- Packages
- Encapsulation Principle
- Access Modifiers

### Exercise 1
Array iteration tasks. How to go through arrays and how to make use of them.

### Exercise 2
This exercise is a static one. No coding. Just analyzing.
Exercise is for repeating the encapsulation principle and testing the
current understanding of java modifiers.

## Tutorial 5

New data structure: Lists. Talked about abstract data types and
base operations of lists.

Topics:
- `equals` & `hashCode`
- `toString`
- Abstract Data Types
- Lists
- Iterator

### Exercise 1
How to implement the common `equals`, `hashCode` and `toString`
methods for classes.

### Exercise 2
Revisited the pool service implementation from [tutorial 3](#tutorial-3).
This time instead of arrays, the service was to be implemented using
the lists.

### Exercise 3
This is a common data structure exercise, where you have to
implement the necessary methods for a (singly-) linked list.
The exercise is to help understand how the common data structures
are implemented in programming languages.


# Author

This repository was put together by [@SadSpongeBob](https://github.com/SadSpongeBob).
