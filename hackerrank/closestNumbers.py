def closestNumbers(arr):
    arr.sort()

    smallest_diff = arr[1] - arr[0]
    prev = arr[1]

    for index in range(2, len(arr)):
        if arr[index] - prev < smallest_diff:
            smallest_diff = arr[index] - prev
        prev = arr[index]

    arr_result = []

    for index in range(0, len(arr)):
        if index + 1 < len(arr):
            if  arr[index + 1] - arr[index] <= smallest_diff:
                arr_result.append(arr[index])
                arr_result.append(arr[index + 1])

    return arr_result
