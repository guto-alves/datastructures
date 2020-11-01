def hourglassSum(arr):
    max_hourglass_sum = -63

    for l in range(4):
        for c in range(4):
           top = arr[l][c] + arr[l][c + 1] + arr[l][c + 2]
           middle = arr[l + 1][c + 1]
           bottom = arr[l + 2][c] + arr[l + 2][c + 1] + arr[l + 2][c + 2]
        
           hourglass_sum = top + middle + bottom

           if hourglass_sum > max_hourglass_sum:
                max_hourglass_sum = hourglass_sum

    return max_hourglass_sum