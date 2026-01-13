num1 = int(input("Please enter a number: "))
oper = input("Please enter an operation: ") 
num2 = int(input("Please enter another number: "))

if oper == ("+"):
    sum = num1+num2
    print(str(num1) + " + " + str(num2) + " = " + str(sum))
elif oper == ("-"):
    sum = num1-num2
    print(str(num1) + " - " + str(num2) + " = " + str(sum))
elif oper == ("*"):
    sum = num1*num2
    print(str(num1) + " * " + str(num2) + " = " + str(sum))
elif oper == ("/"):
    sum = num1/num2
    print(str(num1) + " / " + str(num2) + " = " + str(sum))
else:
    print("Error: rough operator")