"""
Given a 2D board of characters and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where
"adjacent" cells are those horizontally or vertically neighboring. The same
letter cell may not be used more than once.

For example, given the following board:
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

exists(board, "ABCCED") returns true,
exists(board, "SEE") returns true,
exists(board, "ABCB") returns false.
"""

def exists(board, word):
    rows = len(board)

    cells_visited = [[False] * len(row) for row in board]

    for row in range(rows):
        for column in range(len(board[row])):
            if search(board, cells_visited, word, row, column, 0):
                return True

    return False

def search(board, cells_visited, word, row, column, letter_position):
    if letter_position == len(word):
        return True

    if(row < 0 or column < 0 or
       row >= len(board) or column >= len(board[row]) or
       cells_visited[row][column]):
        return False

    cells_visited[row][column] = True

    if board[row][column] == word[letter_position]:
        if (search(board, cells_visited, word, row + 1, column, letter_position + 1) or
        search(board, cells_visited, word, row - 1, column, letter_position + 1) or
        search(board, cells_visited, word, row, column + 1, letter_position + 1) or
        search(board, cells_visited, word, row, column - 1, letter_position + 1)):
            return True

    return False

board = [
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

assert exists(board, 'ABCCED') == True
assert exists(board, 'SEE') == True
assert exists(board, 'ABCB') == False

