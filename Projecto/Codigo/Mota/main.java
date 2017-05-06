package VideoPoker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int argc = args.length;
		int bet = 5;
		
		if(argc==0){
			System.out.println("No arguments");
			System.exit(-1);
		}
	System.out.println(argc);
		switch(args[0])
		{
		
		case "-i": /** Interactive Mode */
			if(argc==2){			
				try{
					int playerCredits = Integer.parseInt(args[1]);
			
				//Catches all NumberFormatExceptions but not other errors
				} catch(NumberFormatException e) {
				//Handle error here
					System.out.println("Credits need to be a number");
					System.exit(-2);
			}//ELSE EXCEPTION
				Player player = new Player(Integer.parseInt(args[1]));
				Deck deck = new Deck();
				deck.shuffle();
				Hand hand = new Hand(deck.getDeck());
				Analyser analyser = new Analyser(hand.getHand());
				Prizes prizes = new Prizes();
				Statistic stats = new Statistic(player.getCredits());
				Strategy strategy = new Strategy();
				int reward;
				String handResult;
				
				String command;
				
				while(true){
					//String input = System.console().readLine();
					//String input = System.console().readLine();
					String input = "s";
					
					command = null; 
					
					if (input !=null)
					{
						command = input.substring(0,1);
					}
					else{
						//throw exception
					}
					
					if (command.equals("s") && input.length() == 1)
					{ /** We ask if the input is 1 to ensure that
					      the user don't put more arguments than what
					      is supposed */
						stats.printStats();
					}
					else if (command.equals("$") && input.length() == 1)
					{
						player.printCredits();
					}
					else if (command.equals("b"))
					{
						String[] inputArgs = input.split(" ");
						if (inputArgs.length>1){
							try{
								bet = Integer.parseInt(inputArgs[1]);
							//Catches all NumberFormatExceptions but not other errors
							} catch(NumberFormatException e) {
							//Handle error here
								System.out.println("Invalid bet value!");
							}
						}
						if (bet <= 5 && bet >= 1)
						{
							player.bet(bet);
							System.out.println("player is betting "+ bet);
						}
						else{
							System.out.println("b : illegal amount");
						}
					}
					else if (command.equals("a") && input.length() == 1)
					{
						//strategy.printAdvice();
					}
					else if (command.equals("d") && input.length() == 1)
					{
						hand.printHand();
					}
					else if (command.equals("h"))
					{
						String[] inputArgs = input.split(" ");
						for (int holdIterator = 0; holdIterator < inputArgs.length;holdIterator++)
						{
							hand.updateHold(Integer.parseInt(inputArgs[holdIterator]));
						}
						hand.updateHand();
						analyser.sorting();
						
						/** Gives the reward to the player*/
						reward = prizes.getRewardValue(bet, analyser.getCheckerResult(), analyser.getDraw());
						player.rewards(reward);
						hand.printHand();
						if (reward == 0)
						{
							System.out.println("player loses and his credit is "+ player.getCredits());
						}
						else {
							handResult = analyser.printHandResult();
							System.out.println("player wins with "+ handResult + " and his credit is "+ player.getCredits());
						}
						
						deck.shuffle();
						hand.renewHand(deck.getDeck());
					} 
					else if (command.equals("q") && input.length() == 1)
					{
						System.out.println("Final Stats"); System.out.println("");
						stats.printStats();
						
						System.out.println("Thank you come again!");
						System.exit(1);
					}
					else
					{
						//throw exception
					}
				}
			}
		break;
			
		case "-d": /** Debug mode */
			if(argc==4){
				try{
					int playerCredits = Integer.parseInt(args[1]);
				//Catches all NumberFormatExceptions but not other errors
				} catch(NumberFormatException e) {
				//Handle error here
					System.out.println("Credits need to be a number");
					System.exit(-2);
				}//ELSE EXCEPTION
			}
		break;
		
		case "-s":
		
			
		break;
		
		}
		
		}
			
	}