def countingValleys(n, s):
    seaLevel = 0
    valleysCount = 0
    inValley = False

    for step in s:
        if step == 'U':
            seaLevel += 1
        else:
            seaLevel -= 1

        if seaLevel < 0 and not inValley:
            valleysCount += 1
            inValley = True
        elif seaLevel == 0:
            inValley = False
        
    return valleysCount


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)
    print(result)
    
    # fptr.write(str(result) + '\n')
    # fptr.close()