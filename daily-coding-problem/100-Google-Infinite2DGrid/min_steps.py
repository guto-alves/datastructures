"""
You are in an infinite 2D grid where you can move in any of the 8 directions:

 (x,y) to
    (x+1, y),
    (x - 1, y),
    (x, y+1),
    (x, y-1),
    (x-1, y-1),
    (x+1,y+1),
    (x-1,y+1),
    (x+1,y-1)

You are given a sequence of points and the order in which you need to cover
the points. Give the minimum number of steps in which you can achieve it. You
start from the first point.

Example:
Input: [(0, 0), (1, 1), (1, 2)]

Output: 2

It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move
from (1, 1) to (1, 2).
"""


def min_steps(sequence):
    steps = 0

    for index in range(len(sequence) - 1):
        steps += shortest_path(sequence[index], sequence[index + 1])

    return steps

def shortest_path(point1, point2):
    x1, y1 = point1
    x2, y2 = point2
    return max(abs(x2 - x1), abs(y2 - y1))


assert min_steps([(0, 0), (1, 1), (1, 2)]) == 2
assert min_steps([(4, 6), (1, 2), (10, 12)]) == 14
























