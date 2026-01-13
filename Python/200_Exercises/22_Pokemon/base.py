import requests
pokemonName = input("Which pokemon do you want? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + pokemonName).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(str(pokemon["name"]))
print(str(pokemon["height"]) + " feet")
print(str(pokemon["weight"]) + " pounds")
print("Ability: " + str(pokemon["abilities"][0]["ability"]["name"]))
print("Main Type" + str(pokemon["types"][0]["type"]["name"]))
