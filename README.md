# Tic-Tac-Toe
Tic Tac Toe Game

Tic Tac Toe, X's and O's or CROSS and NOUGHTS is a game for two players, X and O, who take turns marking the spaces in a
3X3 matrix as depicted below. The player who places three of their marks in a horizontal, vertical, or diagonal
row [either from right top to left bottom or left top to right bottom ] is the winner. Game result will be declared as '
Tie' when all the positions in game board are marked.

```
1  2  3
4  5  6
7  8  9
```

![](https://raw.githubusercontent.com/stephane-genicot/katas/master/images/Kata_TicTacToe.png)

## **Game Rules**

The rules are described below :

- X always goes first
- Players cannot play on a played position
- Players alternate placing X’s and O’s on the board until either:
    - One player has three in a row, horizontally, vertically or diagonally
    - All nine squares are filled
- If a player is able to draw three X’s or three O’s in a row, that player wins
- If all nine squares are filled and neither player has three in a row, the game is a draw

## **Purpose**
Develop a simple Tic Tac Toe game written in Java and Spring Boot using Test Driven Development (TDD) process.

## **Prerequisites**
- Java 17
- Spring Boot 2.7.5
- Maven

## **How to build the application**
1. Clone this repository ```https://github.com/aayushi2702/Tic-Tac-Toe.git```
2. You can build the project and run the tests by running ```maven clean build```

## **How to run the application**
- By default, the application will start on port 8080. If you want the application to run on different port 8081, you can pass additional parameter --server.port=8082 while starting the application
- Once successfully built, you can run the service by using one of below commands:

```
  java -jar build/libs/TicTacToe.jar
                    or 
                    
  java -jar build/libs/TicTacToe.jar --server.port=8081
```
