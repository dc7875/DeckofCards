package com.bridgelabz.deckofcards;

import java.util.*;

/* Welcome on Program
  Program Name :- Deck of Cards
  logic of generating unique cards 
 */
public class DeckofCards {
	private String rank;
	private String suit;

	public static void main(String[] args) {
		System.out.println("$$ Welcome in the Game: Deck of Cards $$");
		DeckofCards cards = new DeckofCards();
		cards.startGame();
	}

// initialization of Game with Deck of cards
	public void startGame() {
		int[] card = new int[52];
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		for (int i = 0; i < card.length; i++) {
			card[i] = i;
		}

// for getting unique card
		for (int i = 0; i < card.length; i++) {
			int index = (int) (Math.random() * card.length);
			card[i] = card[index];
		}

// for Displaying card
		for (int i = 0; i < 52; i++) {
			String suit = suits[card[i] / 13];
			String rank = ranks[card[i] % 13];
			System.out.println(rank + "of" + suit);

		}
	}
}
