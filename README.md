# maze-algorithms

This Java project demonstrates the implementation of various maze-solving algorithms to find a direct path out of a 2D maze. The maze is represented as a 2D grid, where 'S' denotes the starting position, 'O' represents walkable slots, and 'X' denotes non-walkable slots. The objective is to determine if there is a direct path from the starting position 'S' to any edge of the maze.

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Algorithms Implemented](#algorithms-implemented)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project contains Java implementations of the following maze-solving algorithms:

1. Breadth-First Search (BFS)
2. Depth-First Search (DFS) - *to be implemented*
3. A* Search Algorithm - *to be implemented*

The BFS algorithm starts from the provided starting position 'S' and explores the maze in a breadth-first manner, searching for a direct path to any edge of the maze.

## Installation

1. Clone the repository to your local machine using the following command:

git clone https://github.com/camposcreate/maze-solving-algorithms.git

2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).

## Usage

To use the maze-solving algorithms, modify the `driver.java` file to define your 2D maze grid. The grid should be a 2D character array, where 'S' represents the starting position, 'O' represents walkable slots, and 'X' represents non-walkable slots. Update the `row` and `col` variables in the `main` method to specify the starting position.

Run the `main` method to see the output of the algorithm. The program will inform you if a direct path out of the maze is found or not.

## Algorithms Implemented

### 1. Breadth-First Search (BFS)

The BFS algorithm starts from the given starting position 'S' and explores the maze in a breadth-first manner. It uses a queue to store the cells to visit and an ArrayList to keep track of visited cells. If a direct path to any edge of the maze is found, the algorithm will print "Path found! There is a direct path out of the maze." Otherwise, it will print "Path not found!"

### 2. Depth-First Search (DFS) - *to be implemented*

The DFS algorithm explores the maze in a depth-first manner, trying to reach as far as possible along each branch before backtracking. It will be implemented soon.

### 3. A* Search Algorithm - *to be implemented*

The A* search algorithm uses a heuristic function to guide the search towards the goal. It will be implemented soon.

## Contributing

Contributions to this project are welcome! Feel free to add new algorithms or improve existing ones. To contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push the branch to your fork.
4. Open a pull request to this repository.

## License

None

