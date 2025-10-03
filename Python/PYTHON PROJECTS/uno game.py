import random
 
numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9","0"]
colors = ["Red", "Green", "Blue", "Yellow"]
 
def welcomeScreen():
    print("Welcome to Uno!")
 
def getNumberPlayers():
    while True:
        numberPlayers = int(input("How many players are playing? (1-4): "))
        if (numberPlayers <= 4 and numberPlayers >= 1):
            return numberPlayers
 
def getCard():
    randomColor = random.choice(colors)
    randomNumber = random.choice(numbers)
    return randomColor + randomNumber
 
def generateDeck():
    startingCardCount = 7
    deck = []
 
    for index in range(startingCardCount):
        deck.append(getCard())
    return deck
 
def printCardInMiddle(cardInMiddle):
    print("The card in the middle is: " + cardInMiddle)
 
def doesPlayerHaveValidCard(playerDeck, cardInMiddle):
    validCard = False
 
    for card in playerDeck:
        # checking the colors
        if card[0] == cardInMiddle[0]:
            validCard = True
   
        # checking if we have a valid number
        if card[1] == cardInMiddle[1]:
            validCard = True
    return validCard
 
def givePlayerCard(playerDeck):
    playerDeck.append(getCard())
 
def simulatePlayerTurn(playerNumber, playerDeck, cardInMiddle):
    print("")
    print("Player's deck: " + str(playerDeck))
    print("It is player " + str(playerNumber + 1) + "'s Turn! Card in middle: " + str(cardInMiddle))
 
    hasValidCard = doesPlayerHaveValidCard(playerDeck, cardInMiddle)
    if hasValidCard:
        playerInput = input("What card would you like to play?: ")
       
    else:
        print("You drew a card!")
        givePlayerCard(playerDeck)
   
if __name__ == '__main__':
    # game loop
    welcomeScreen()
 
    while True:
        numberPlayers = getNumberPlayers()
       
        playerDecks = []
        for num in range(0, numberPlayers):
            playerDecks.append(generateDeck())
 
        cardInMiddle = getCard()
        playerTurn = random.randint(1, numberPlayers) - 1
 
        while True:
            playersDeckTurn = playerDecks[playerTurn]
            simulatePlayerTurn(playerTurn, playersDeckTurn, cardInMiddle)
 
            # player has won
            if len(playersDeckTurn) == 0:
                print("player has won!")
           
            playerTurn += 1
            if playerTurn == numberPlayers:
                playerTurn = 0
 
            print("")
