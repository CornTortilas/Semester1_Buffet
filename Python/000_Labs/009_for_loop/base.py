length = int(input("Please enter line length: "))
cality = input("Do you want a horizontal or vertical line? ")
if cality == "horizontal" or cality == "Horizontal":
    for x in range(0, length):
        print("*", end = "")
elif cality == "vertical" or cality == "Vertical":
    for x in range(0, length):
        print("*")