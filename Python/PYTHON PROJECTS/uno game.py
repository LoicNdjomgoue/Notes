import random  # Needed to shuffle deck and pick random cards

# Card setup: colors and numbers
colors = ["Red", "Green", "Blue", "Yellow"]
numbers = ["0","1","2","3","4","5","6","7","8","9"]

# Function to create a full Uno deck
def createDeck():
    deck = []
    # Each color has one 0, and two of each number 1-9
    for color in colors:
        deck.append(color+"0")  # One zero per color
        for num in numbers[1:]:  # Numbers 1-9
            deck.append(color+num)  # Two copies of each number
            deck.append(color+num)
    random.shuffle(deck)  # Shuffle deck
    return deck

# Deal 7 cards to each player
def dealHands(deck, numPlayers):
    hands = [[] for _ in range(numPlayers)]  # Create empty hands
    for _ in range(7):  # Each player gets 7 cards
        for hand in hands:
            hand.append(deck.pop())  # Take card from deck
    return hands

# Show a player's hand
def showHand(playerHand):
    print("Your hand: " + ", ".join(playerHand))

# Return a list of valid cards the player can play
def validPlays(hand, middle):
    # A card is valid if color matches (card[0]) or number matches (card[1:])
    return [card for card in hand if card[0]==middle[0] or card[1:]==middle[1:]]

# Simulate a single player's turn
def playTurn(playerNum, hand, deck, middle):
    print(f"\nPlayer {playerNum+1}'s turn. Middle card: {middle}")
    showHand(hand)  # Display player's hand

    plays = validPlays(hand, middle)  # Check which cards are playable

    if plays:
        print("Valid plays: " + ", ".join(plays))
        while True:
            choice = input("Choose a card to play: ")
            if choice in plays:
                hand.remove(choice)  # Remove card from hand
                middle = choice      # Update middle card
                print(f"Player {playerNum+1} played {choice}")
                break
            else:
                print("Invalid choice. Pick a valid card.")
    else:
        # No playable card, player draws one from the deck
        print("No valid cards. Drawing a card...")
        if deck:
            new_card = deck.pop()  # Take top card from deck
            hand.append(new_card)
            print(f"Drew {new_card}")
        else:
            print("Deck empty. Skipping turn.")
    return middle  # Return updated middle card

# Main game function
def main():
    print("Welcome to Uno!")
    # Ask for number of players (1-4)
    while True:
        numPlayers = int(input("Number of players (1-4): "))
        if 1 <= numPlayers <=4:
            break

    deck = createDeck()          # Create and shuffle deck
    hands = dealHands(deck, numPlayers)  # Deal starting hands
    middleCard = deck.pop()      # First card in middle pile
    turn = 0                     # Starting with first player

    # Game loop: keep going until someone wins
    while True:
        middleCard = playTurn(turn, hands[turn], deck, middleCard)  # Player takes turn

        # Check if current player won
        if len(hands[turn]) == 0:
            print(f"Player {turn+1} wins!")
            break

        # Move to next player
        turn = (turn + 1) % numPlayers

# Run the game
if __name__ == "__main__":
    main()
