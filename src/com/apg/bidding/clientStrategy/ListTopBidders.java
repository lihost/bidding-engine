package com.apg.bidding.clientStrategy;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.apg.bidding.BiddingHandler;
import com.apg.bidding.User;

public class ListTopBidders implements ClientOperationInterface {

	@Override
	public void execute(Scanner sc, User testUser) {
		// TODO Auto-generated method stub
		try {
		BiddingHandler bh = BiddingHandlerSingleton.getInstance();
		
		System.out.print("Insert auction id to list top 5 bidders\n >>>: ");
		long auctionId = sc.nextLong();
		
		System.out.println(bh.getTopBidders(auctionId));
		
		} catch (InputMismatchException ime) {
			System.err.println("Input Mismatch!");
		}
	}

}
