package com.bridgelabz.deckofcards;

import java.util.*;

/* Welcome on Program
  Program Name :- Deck of Cards
  logic of unique cards 
 */
public class DeckofCards {
	private int rank;
	private int suit;

	public DeckofCards(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String s = ranks[this.rank] + " of " + suits[this.suit];
		return s;
	}

	public static void main(String[] args) {
		DeckofCards card = new DeckofCards(13, 1);
		{
			System.out.println(card);
		}

	}
}
