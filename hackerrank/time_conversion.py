def timeConversion(s):
    hour = s[:2]
    
    if s[-2:] == 'AM' and s[:2] == '12':
        hour = '00'
    elif s[-2:] == 'PM' and s[:2] != '12':
        hour = str(int(hour) + 12)
    
    return hour + s[2:-2]

assert timeConversion('12:05:45AM') == '00:05:45'
assert timeConversion('01:05:45AM') == '01:05:45'
assert timeConversion('12:05:45PM') == '12:05:45'
assert timeConversion('01:05:45PM') == '13:05:45'
assert timeConversion('09:05:45PM') == '21:05:45'