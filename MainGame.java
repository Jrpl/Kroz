import java.util.Scanner;
import java.io.IOException;

public class MainGame
{
   public static GameSave GS = new GameSave();
   public static Scanner in = new Scanner(System.in);
   public static String question;
   public static String user = "";
    public static void main(String args[])
    {
      System.out.println("Welcome to Kroz a SCI-FI text based adventure!\nIf you need help at any point during the game simply type help to see commands.\nThe game will save automatically at certain points to allow you to go back to checkpoints.\nGood luck and have fun!");
      System.out.println();
      System.out.println("Dr.Richtofen through speakers:");
      System.out.println("Greetings doctor and welcome to the MYH16. We are pleased to see that you have decided to join us in our research.");
      System.out.println("Please head to the door. You can use your new ID Badge that we have given you in order to open the door.");
      System.out.println();
      System.out.println("You scan your ID Badge on the pad next to the door. It slides open and you step through.");
      System.out.println("You are now in a small corridor and ahead you can see it intersects multiple times.");
      System.out.println();
      System.out.println("Dr.Richtofen:");
      System.out.println("Now that you are through doctor, head down the corridor and take the first right. Your room is number 2.");
      System.out.println("After you have settled into your room please join me in the mess hall.");
      System.out.println();
      question = GS.LoadGame();
        while(true)
        {
            if(user.equalsIgnoreCase("exit"))
            {
                System.exit(0);
            }
            else if(user.equalsIgnoreCase("help"))
            {
                System.out.println("Help: Displays this screen.\nExit: Exits the game, progress will be saved.\nMap: Will display a map of the ship.\nTo exit the help screen and progress with the game, answer the question that was asked of you before you typed Help and then type your answer again to confirm it.");
                user = in.next();
            }
            else if(user.equalsIgnoreCase("map"))
            {
                try
                {
                  Runtime.getRuntime().exec(new String[] { "C:\\WINDOWS\\system32\\mspaint.exe", "E:\\Final Project\\MYH16.jpg"});
                  System.out.println("In order to continue with the game simply type your answer to the question you are on and then type it again to confirm your answer.");
                  user = in.next();
                }
                
                catch(IOException e)
                {
                    
                }
            }
            else if(user.equalsIgnoreCase("datapad"))
            {
                System.out.println("\nYou pull your datapad out of your lab coat pocket and see the note: Backup generator code is 1047 and the escape pod lever is the BLUE lever.\nRemember that At any point during the game when you are prompted to answer a question you can now type datapad to bring up the this new information.\nOnce you are done answer the question you are on and then confirm that answer by typing it again.");
                user = in.next();
            }
            else
            {
            switch(question) //If question is equal to...
            {
               case "0": //...this right here
               System.out.println("You feel a bit groggy since you just woke up from your long flight up to the MYH16.\nYour head is pounding and you can hardly even remember your name let alone the instructions that were given to you.\n\nWhat is your name?");
               question = "1";
               break;
                
               case "1":
               user = in.next();
               question = "1A";
               break;
                
               case "1A":
               System.out.println("\nAre you sure this is your name?\n[1]Yes\n[2]No");
               question = "2";
               break;
               
               case "2A":
               System.out.println("\nNow that you have that sorted do you want to go to your room?\n[1]Yes\n[2]No");
               question = "3";
               break;
               
               case "3A":
               System.out.println("\nYou head to your room and you noticed that the door is locked by a ID scanner.\nYou scan your ID and the door opens. You enter the room to see a clean and sorted room. Although it is compact it seems comfortable.\nYou set your bags on the chair to your right.\n\nGame Saved\n\nNow that you are settled would you like to examine the room or go to the mess hall?\n[1]Examine room\n[2]Go to mess hall");
               question = "4";
               GS.SaveGame("3A");
               break;
               
               case "3B":
               System.out.println("\nWould you like to walk around the ship? If you do you might be late to the meeting in the mess hall but you will gain a sense of direction on the ship.\n[1]Yes\n[2]No");
               question = "5";
               break;
               
               case "4A":
               System.out.println("\nYou take a closer look around the room. It is quite empty. There is nothing in any of the drawers.\nThe only items in the room are a small refrigerator, bed, nightstand, dresser, and chair. You do notice however a datapad lying on the nightstand.\nA note on the pad says: This datapad is for data collection and also to let you know the backup generator code is 1047 and the escape pod lever is the BLUE lever. You grab the pad and put it in your lab coat pocket.\n\nNew Item - Datapad\nAt any point during the game when you are prompted to answer a question you can now type datapad to bring up the this new information.\nOnce you are done answer the question you are on and then confirm that answer by typing it again.\n\nAfter finishing looking through your room you head to the mess hall.\n\nGame Saved\n");
               question = "5C";
               GS.SaveGame("4A");
               break;
               
               case "4B":
               System.out.println("\nYou make your way to the mess hall.\n\nGameSaved\n");
               question = "5C";
               GS.SaveGame("4B");
               break;
               
               case "5A":
               System.out.println("\nYou take a look around the ship. As you walk down the corridor past the rooms you enter a large room with glass cubes.\nInside the glass cubes are what seem to be experiment setups with beakers, test tubes, and other scientific devices.\nYou also note that on each side of the middle of the room is storage cabinets. On the other side of the room is the only door you see that might lead to another room.\nYou enter through the door after scanning your ID. There are 3 doors. The left says: ENGINEERING the right says: MESS HALL and the door in front of you says CONTROL ROOM.\nYou then look at your watch and notice that you may be running late to the meeting and decide to head into the mess hall.");
               question = "5D";
               break;
               
               case "5B":
               System.out.println("\nStill somewhat groggy from the flight and nervous at your new job you stand there somewhat dazed and you try to think on what to do.\nWhile in deep thought a fellow scientist sees you standing there. He doesn't recognize you and decides to start conversation.\nYou explain your situation to him and he understands that it can be overwhelming at first and decides to direct you to your room.\nAfter you enter the room and put away your bags he directs you to the mess hall.");
               question = "5C";
               break;
               
               case "5C":
               System.out.println("\nYou enter the mess hall to see the scientists sitting at a what looks to be a long lunch table.\nDr.Richtofen walks over to greet you: Hello doctor, nice to see you found your way here. Feel free to have something to eat.\nUnfortunately I will not be able to join you in this meal for I am on the verge of something... evolutionary.\nI guess I will see you tomorrow then. Have a good night.\nDr.Richtofen walks out the door. You sit down and have a meal that is rather undesirable but you need to eat something.\n\nGame Saved\n");
               question = "5F";
               GS.SaveGame("5C");
               break;
               
               case "5D":
               System.out.println("\nYou enter the mess hall to see the scientists sitting at a what looks to be a long lunch table.\nDr.Richtofen walks over to greet you: Hello doctor, nice to see you found your way here. Feel free to have something to eat.\nUnfortunately I will not be able to join you in this meal for I am on the verge of something... evolutionary.\nI guess I will see you tomorrow then. Have a good night.\nDr.Richtofen walks out the door. You sit down and have a meal that is rather undesirable but you need to eat something.\n\nGame Saved\n");
               question = "5E";
               GS.SaveGame("5C");
               break;
               
               case "5E":
               System.out.println("\nNow that you have eaten what would you like to do?\nYou only have enough time to do 1 activity before you need to hit the sack.\n[2]Go to Engineering\n[3]Go to Control Room\n[4]Go to your room\n[5]Look around the mess hall");
               question = "6";
               break;
               
               case "5F":
               System.out.println("\nNow that you have eaten what would you like to do?\nYou only have enough time to do 1 activity before you need to hit the sack.\n[1]Look around the main compartment of the ship\n[2]Go to Engineering\n[3]Go to Control Room\n[4]Go to your room\n[5]Look around the mess hall");
               question = "6";
               break;
               
               case "6A":
               System.out.println("\nYou awake in the middle of the night to alarms and yelling comming from outside your room. You decide to get dressed and investigate the situation.\nAs you leave your room you can see that the red emergency lights are on and its very dark. Obviously something is wrong and you need to get off this ship.\n\nGame Saved\n\nWhat do you want to do?\n[1]Go to the lab rooms\n[2]Go to engineering\n[3]Go to the control room\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
               question = "7";
               GS.SaveGame("6A");
               break;
               
               case "2":
               switch(user = in.next())
               {
                   case "1":
                   question = "2A";
                   break;
                    
                   case "2":
                   question = "0";
                   break;
                    
                   default:
                   System.out.println("\nI don't understand your request.");
                   question = "1A";
                   break;
               }
               break;
               
               case "3":
               switch(user = in.next())
               {
                   case "1":
                   question = "3A";
                   break;
                    
                   case "2":
                   question = "3B";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request.");
                   question = "2A";
                   break;
               }
               break;
               
               case "4":
               switch(user = in.next())
               {
                   case "1":
                   question = "4A";
                   break;
                   
                   case "2":
                   question = "4B";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request.");
                   question = "3A";
                   break;
               }
               break;
               
               case "5":
               switch(user = in.next())
               {
                   case "1":
                   question = "5A";
                   break;
                   
                   case "2":
                   question = "5B";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request.");
                   question = "3B";
                   break;
               }
               break;
               
               case "6":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou head to the main compartment. You enter a large room with glass cubes.\nInside the glass cubes are what seem to be experiment setups with beakers, test tubes, and other scientific devices.\nYou also note that on each side of the middle of the room is storage cabinets. On the other side of the room is the door you came through to get to the mess hall.\nYou enter through the door after scanning your ID. You take a left and head down to the second door on your right and scan your ID to go inside and take a good nights rest.");
                   question = "6A";
                   break;
                   
                   case "2":
                   System.out.println("\nYou head to the engineering room and as you approach the door a man walks out and notices you.\nEngineer: Hello there, aren't you the new feller that just came today? Well i'd like to let you know that the emergency power code if you'd ever need it is 1047.\nEveryone on the ship has to know it just in case something happens but i'm sure it'll be fine. I have to go, enjoy your time here doctor.\nThe engineer hurries off and leaves the door shut behind. You try your ID code to open the door but it remains locked so you head to your room for a good nights rest.");
                   question = "6A";
                   break;
                   
                   case "3":
                   System.out.println("\nYou head to the control room and as you approach the door a man walks out and notices you. He is in an official uniform of military standard.\nPilot: Hello there doctor, nice to meet you. I a'm the flight commander of the ship and it is my duty to have all the doctors know which lever is for the escape pod is.\nThe escape pod is the |BLUE lever. You won't need to worry about finding the pod as it will show you on the panel. Anyway doctor I must be off, enjoy your time on the ship.\nThe commander walks off. You attempt to open the door using your ID but it remains locked. You decide its time to head to bead for a good nights rest.");
                   question = "6A";
                   break;
                   
                   case "4":
                   System.out.println("\nYou decide its best to head to your room for a good nights rest.");
                   question = "6A";
                   break;
                   
                   case "5":
                   System.out.println("\nAs you stand near the door you take a look at the mess hall. Its a somewhat small room compared to what you thought it might be.\nIts a linear room with the large lunch table taking up most of the space and a kitchen near the end where the cooks are making and serving the food. Their is nothing really of value in this room except for the tools in the kitchen.\nYou head back to your room to take a good nights rest.");
                   question = "6A";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request. Please choose a given option.");
                   question = "6";
                   break;
               }
               break;
               
               case "7":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou head to the lab rooms. Everything is a mess from what you can see in the dark. Some of the containers are cracked and look like they're about to break.\nYou head in to the room nearest to you. Inside everything is a mess. Tables are flipped, beakers containing sodium chloride has been spilled, and glass is broken all over the floor.\nAmongst the mess you notice that the number 1 is written on the the glass wall in a black marker. What do you want to do?\n[1]Stay in the room to look around\n[2]Move on to the next glass room\n[3]Go to engineering\n[4]Go to control room\n[5]Check on of the storage cabinets\n[6]Go to the mess hall");
                   question = "7A";
                   break;
                   
                   case "2":
                   System.out.println("\nYou head to engineering to see that the door is wide open. You walk in to see that on the main panel it says that the main generator is failing which is disabling the escape pods.\nYou see that there is a 4 digit backup generator code that you can enter to turn it on.\n[1]I know the code/I want to guess the code\n[2]I don't know the code");
                   question = "7B";
                   break;
                   
                   case "3":
                   System.out.println("\nYou head to the control room to see that the door is wide open. You walk in to see that the escape pod is disabled due to a lack of power in the engineering room.\nYou also notice that in order to activate the pod you need to pull one of the two levers on the panel. Where do you want to go?\n[1]Go to one of the lab rooms\n[2]Go to engineering\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "4":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "5":
                   System.out.println("\nYou head to the mess hall to see if some of the scientist are in there. You enter the mess hall to find that its a complete mess. As you begin to walk around the room you slip and fall hurting your head and knocking you unconsious.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\n[3]Load last checkpoint");
                   question = "7E";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request.");
                   question = "6A";
                   break;
               }
               break;
               
               case "7A":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou decide to stay in the lab room hopeing to find something useful. As your searching around you hear something dash across the room. It knocks over a table and a glass breaks releasing a sleeping gas and you fall asleep.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   case "2":
                   System.out.println("\nYou head to another one of the glass lab rooms and it has similar destruction inside but this time the number on the wall is 0. What would you like to do now?\n[1]Stay in the room to look around\n[2]Move on to the next glass room\n[3]Go to engineering\n[4]Go to control room\n[5]Check one of the storage cabinets\n[6]Go to the mess hall");
                   question = "7F";
                   break;
                   
                   case "3":
                   System.out.println("\nYou head to engineering to see that the door is wide open. You walk in to see that on the main panel it says that the main generator is failing which is disabling the escape pods.\nYou see that there is a 4 digit backup generator code that you can enter to turn it on.\n[1]I know the code/I want to guess the code\n[2]I don't know the code");
                   question = "7B";
                   break;
                   
                   case "4":
                   System.out.println("\nYou head to the control room to see that the door is wide open. You walk in to see that the escape pod is disabled due to a lack of power in the engineering room.\nYou also notice that in order to activate the pod you need to pull one of the two levers on the panel. Where do you want to go?\n[1]Go to one of the lab rooms\n[2]Go to engineering\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "5":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "6":
                   System.out.println("\nYou head to the mess hall to see if some of the scientist are in there. You enter the mess hall to find that its a complete mess. As you begin to walk around the room you slip and fall hurting your head and knocking you unconsious.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please choose a given option.");
                   question = "7A";
                   break;
               }
               break;
               
               case "7B":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nPlease enter the code. If you do not know the code enter 2.");
                   question = "7BB";
                   break;
                   
                   case "2":
                   System.out.println("\nWhat do you want to do?\n[1]Go to one of the lab rooms\n[3]Go to the control room\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please try again.");
                   question = "7B";
                   break;
               }
               break;
               
               case "7BB":
               switch(user = in.next())
               {
                   case "1047":
                   System.out.println("\nBackup generator is now online. You then make an immediate rush to the control room and now it is time to pull the lever but which one?\n[1]Pull the RED lever\n[2]Pull the BLUE lever");
                   question = "7C";
                   break;
                   
                   case "2":
                   System.out.println("\nWhere do you want to go?\n[1]Go to one of the lab rooms\n[3]Go to the control room\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please try again.");
                   question = "7BB";
                   break;
               }
               break;
               
               case "7C":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou pull the RED lever and and activate the cryogenic sleep chamber. You enter a deep sleep.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   case "2":
                   System.out.println("\nYou pull the BLUE lever and activate the escape pod. You enter the pod and are then launched on a course directly to Earth along with a tracking beacon on in order for the agency to locate you.\n\nCongratulations you've completed the game! Thanks for playing Kroz!\n[1]Play again?\n[2]Exit");
                   question = "8";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please choose a given option.");
                   question = "7C";
                   break;
               }
               break;
               
               case "7E":
               switch(user = in.next())
               {
                   case "1":
                   question = "0";
                   break;
                   
                   case "2":
                   System.exit(0);
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request.");
                   question = "7B";
                   break;
               }
               break;
               
               case "7F":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou decide to stay in the lab room hopeing to find something useful. As your searching around you hear something dash across the room. It knocks over a table and a glass breaks releasing a sleeping gas and you fall asleep.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   case "2":
                   System.out.println("\nYou head to another one of the glass lab rooms and it has similar destruction inside but this time the number on the wall is 4. What would you like to do now?\n[1]Stay in the room to look around\n[2]Move on to the next glass room\n[3]Go to engineering\n[4]Go to control room\n[5]Check one of the storage cabinets\n[6]Go to the mess hall");
                   question = "7G";
                   break;
                   
                   case "3":
                   System.out.println("\nYou head to engineering to see that the door is wide open. You walk in to see that on the main panel it says that the main generator is failing which is disabling the escape pods.\nYou see that there is a 4 digit backup generator code that you can enter to turn it on.\n[1]I know the code/I want to guess the code\n[2]I don't know the code");
                   question = "7B";
                   break;
                   
                   case "4":
                   System.out.println("\nYou head to the control room to see that the door is wide open. You walk in to see that the escape pod is disabled due to a lack of power in the engineering room.\nYou also notice that in order to activate the pod you need to pull one of the two levers on the panel. Where do you want to go?\n[1]Go to one of the lab rooms\n[2]Go to engineering\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "5":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "6":
                   System.out.println("\nYou head to the mess hall to see if some of the scientist are in there. You enter the mess hall to find that its a complete mess. As you begin to walk around the room you slip and fall hurting your head and knocking you unconsious.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\n[3]Load last checkpoint");
                   question = "7E";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please choose a given option.");
                   question = "7F";
                   break;
               }
               break;
               
               case "7G":
               switch(user = in.next())
               {
                   case "1":
                   System.out.println("\nYou decide to stay in the lab room hopeing to find something useful. As your searching around you hear something dash across the room. It knocks over a table and a glass breaks releasing a sleeping gas and you fall asleep.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   case "2":
                   System.out.println("\nYou head to another one of the glass lab rooms and it has similar destruction inside but this time the number on the wall is 7. What would you like to do now?\n[2]Go to engineering\n[3]Go to control room\n[4]Check one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7H";
                   break;
                   
                   case "3":
                   System.out.println("\nYou head to engineering to see that the door is wide open. You walk in to see that on the main panel it says that the main generator is failing which is disabling the escape pods.\nYou see that there is a 4 digit backup generator code that you can enter to turn it on.\n[1]I know the code/I want to guess the code\n[2]I don't know the code");
                   question = "7B";
                   break;
                   
                   case "4":
                   System.out.println("\nYou head to the control room to see that the door is wide open. You walk in to see that the escape pod is disabled due to a lack of power in the engineering room.\nYou also notice that in order to activate the pod you need to pull one of the two levers on the panel. Where do you want to go?\n[1]Go to one of the lab rooms\n[2]Go to engineering\n[4]Go to one of the storage cabinets\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "5":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "6":
                   System.out.println("\nYou head to the mess hall to see if some of the scientist are in there. You enter the mess hall to find that its a complete mess. As you begin to walk around the room you slip and fall hurting your head and knocking you unconsious.\n\nThank you for playing Kroz! Would you like to play again?\n[1]Yes\n[2]No\nTo load the last checkpoint simply restart the exit the game and start it again.");
                   question = "7E";
                   break;
                   
                   default:
                   System.out.println("\nI do not understand your request. Please choose a given option.");
                   question = "7G";
                   break;
               }
               break;
               
               case "7H":
               switch(user = in.next())
               {
                   case "3":
                   question = "7B";
                   break;
                   
                   case "4":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "5":
                   System.out.println("\nYou head to one of the storage cabinets in the main room. Inside is mostly useless junk but you do notice a note from the flight commander inside that says: REMIND NEW GUY ABOUT THE BLUE LEVER\nWhere do you want to go?\n[1]One of the glass rooms\n[2]Go to engineering\n[3]Go to the control room\n[5]Go to the mess hall");
                   question = "7";
                   break;
                   
                   case "6":
                   question = "7E";
                   break;
                   
                   default:
                   System.out.println("\nI don't understand your request. Please choose a given option.");
                   question = "7H";
                   break;
               }
               break;
               
               case "8":
               switch(user = in.next())
               {
                   case "1":
                   question = "0";
                   break;
                   
                   case "2":
                   System.exit(0);
                   break;
               }
               break;
            }
         }
      }
   }
}