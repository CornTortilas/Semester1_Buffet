lastNum = int(input("Please enter a number: "))
sums = 0
for x in range(0,lastNum):
    sums = sums + (x+1)
print("The sum of 1 to " + str(lastNum) + " is: " + str(sums))