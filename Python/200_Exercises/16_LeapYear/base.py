year = int(input("Please enter the year you would like to check! "))
if year % 100 == 0 and year >= 100:
    if year % 400 == 0 and year >= 400:
        print(str(year) + " is a leap year!")
    else:
        print(str(year) + " is not a leap year")
elif year % 4 == 0 and year > 4:
    print(str(year) + " is a leap year!")
else:
    print(str(year) + " is not a leap year!")