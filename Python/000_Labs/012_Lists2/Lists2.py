import random
numofnums = int(input("how many random numbers would you like: "))
randList = []
randomnum = 0
for x in range(0,numofnums):
    randomnum = random.randrange(0,10)
    randList.append(randomnum)
print("your numbers are :")
for x in range(0, numofnums):
    print(str(randList[x]), end = ", ")
    