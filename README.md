# Picking Teams – an Algorithm Exercise

* A group of children are picking teams for a game of soccer. The way they pick teams is to line up all the players and select one person at a time from that line. Starting from the first player in line, the person to be selected will always be X people down the line from the last player picked. When the end of the line is reached, counting resumes from the start of the line.
* The program will return a list of players in the order they get selected to play.
* **Input:** 2 comma-separated positive integers X and Y, where X is the number of people in line and Y is how many people to count when selecting the next player.
* **Output:** Print out the index of all the players (space delimited) in the order they will be selected.
* Example:
  * Input: 10,3
  * Output: 2 5 8 1 6 0 7 4 9 3