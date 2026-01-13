import requests

#joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
numOfJokes = int(input("How many jokes do you want? "))
for x in range (0, numOfJokes):
    print("joke " + str((x+1)) + ": ")
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,sexist,explicit&type=twopart").json()
    print(joke["setup"])
    print(joke["delivery"])

# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

