str = input("Type something ")
str = str.lower()
# A String variable can be made upper or lower case given the following methods
# These commands turn the entire String to upper or lower case and stores it back in str

# The following loop goes through each letter in str one by one. 
# char becomes each letter for each loop!
Upper = 1
Lower = 1
count = 1
for char in str:
    if count <= Lower:
        print(char.lower(), end = "")
    else:
        print(char.upper(), end = "")
    if count >= (Lower+Upper):
        count = 1
    else:
        count += 1
print()