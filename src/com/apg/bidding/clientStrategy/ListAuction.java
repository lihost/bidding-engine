package com.apg.bidding.clientStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.apg.bidding.BiddingHandler;
import com.apg.bidding.User;

public class ListAuction implements ClientOperationInterface {

	@Override
	public void execute(Scanner sc, User testUser) {
		// TODO Auto-generated method stub
		try {
			BiddingHandler bh = BiddingHandlerSingleton.getInstance();
			System.out.println(bh.getAuctionListAsString());
			
		} catch (InputMismatchException ime) {
			System.err.println("Input Mismatch!");
		}
		
	}

}
