symbol = input("What symbol would you like to use? ") 
width = int(input("What’s the width of your box? " ))
height = int(input("What’s the height of your box? "))
for h in range(0, height):
    for w in range(0, width):
        print(symbol, end = "")
    print()