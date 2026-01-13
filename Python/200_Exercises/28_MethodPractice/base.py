#-------------Methods-------------
# This method should return the largest of 3 integers
def largestOfThree(x, y, z):
    if x > y and x > z:
        return(str(x))
    elif y > z and y > x:
        return(str(y))
    else:
        return(str(z))
    # Code here
    
# This method should combine all the words in the list into a sentence with spaces between
def formSentence(wordList):
    sentence = ""
    for item in wordList:
        sentence = sentence + item + " "
    return(sentence)
# This method should combine all the words in the list in reverse into a sentence with spaces between
def reverseSentence(wordList):
    sentence = ""
    for item in wordList:
        sentence = item + " " + sentence
    return(sentence)
        # Code here

#--------------Code--------------
a = int(input("Enter a number: "))
b = int(input("Enter another number: "))
c = int(input("Enter another number: "))

ans = largestOfThree(a, b, c)
print("The largest of the three numbers is " + str(ans))
print()

words = ["This", "will", "become", "the", "coolest", "sentence", "yahoo"]
sentence = formSentence(words)
print(sentence)

print()
print("The same sentence backwards!")
sentence = reverseSentence(words)
print(sentence)