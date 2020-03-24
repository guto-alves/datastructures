def diagonalDifference(arr):
    sum_left_to_right = 0
    sum_right_to_left = 0

    n = len(arr)

    for row in range(n):
        for column in range(n):
            if row == column:
                sum_left_to_right += arr[row][column]

            if row + column == n - 1:
                sum_right_to_left += arr[row][column]

    return abs(sum_left_to_right - sum_right_to_left)

n = int(input().strip())

arr = []

for i in range(n):
    arr.append(list(map(int, input().rstrip().split())))

print(diagonalDifference(arr))