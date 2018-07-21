package com.javachobo.book;

public class das {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
	class SutdaCard {
		
			int num = 3;
			boolean isKwang;
			
			void isKwang() {isKwang = !isKwang;}
			
		}
	}

