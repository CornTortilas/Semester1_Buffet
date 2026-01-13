def add(x, y):
    return(x+y)
def mult(x, y):
    return(x * y)
def printList(lst):
    i = 1
    for item in lst:
        print(str(i)+ ". " + str(item))
        i += 1
def addUpList(lst):
    sum = 0
    for item in lst:
        sum += item
    print(str(sum))
#-----------------------------------------------------------------------------------------------------------------------------------------------------
sum = add(8, 3)
print(sum)

crimmasList = ["A big gun","LOG" ,"Sheet metal", "Food", "MORE FOOD", "a pc", "A snail", "A mcdonald's restaurant", "Apple, the company", "Every microcenter in North America"]
printList(crimmasList)
listFavNum = [67,43,41,21,27,2,6,7]
printList(listFavNum)
addUpList(listFavNum)