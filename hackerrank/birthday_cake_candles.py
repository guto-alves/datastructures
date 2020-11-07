def birthdayCakeCandles(candles):
    return candles.count(max(candles))


def birthdayCakeCandles2(candles):
    count = 0
    tallest = candles[0]
    
    for i in candles:
        if i > tallest:
            tallest = i
            count = 1
        elif i == tallest:
            count += 1
        
    return count


candles = list(map(int, input().rstrip().split()))
result = birthdayCakeCandles2(candles)
print(result)

