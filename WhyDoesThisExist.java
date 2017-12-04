//import java.util.FalseSenseOfSecurity;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
public class WhyDoesThisExist {
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    static String result;
    static String result2;
    static final int QUIZ_QUESTIONS = 18;
    static String[] questions = new String[QUIZ_QUESTIONS];
    static String[] answers = new String[QUIZ_QUESTIONS];
    static File f1;
    static File f2;
    static File f3;
    static int pokeCount;
    static int pingCount;
    static boolean allowLocation = false;
    
    static void loop () {
        while (true) {
            System.out.println("Anyways, let's continue.");
            
            result = s.nextLine().trim();
            if (result == result.toUpperCase()) {
                System.out.println("Stop yelling!");
            } else if (result.equalsIgnoreCase("sudoku")) {
                System.out.println("...what?");
            } else if (result.contains("sudo")) {
                System.out.println("Haha sudo that's a funny joke.");
            } else if (result.equalsIgnoreCase("no") || result.equalsIgnoreCase("")) {
                System.out.println("I warned you not to do that.\nProceed? (y/n)");
                result2 = s.nextLine();
                if (result2.equalsIgnoreCase("y")) {
                    System.out.println("I would do something cool like crash your computer... but I'm not a mean person.\nI'm not a person at all.\nNext time, enter a command.");
                } else if (result2.equalsIgnoreCase("n")) {
                    System.out.println("Why not? There's so much more to discover... \n\nMuahahahaha");
                } else {
                    if (f2.exists()) {
                        System.out.println("Really? Again? I thought you were better than that. Find another way out.");
                    } else {
                        System.out.println("I SAID PUT IN Y OR N! WHAT IS WRONG WITH YOU???\nYOU'RE A HORRIBLE PERSON! FIRST I TELL YOU TO PUT IN A COMMAND, AND THEN YOU DON'T EVEN GIVE ME A PROPER RESPONSE TO MY QUESTION???\nI'm not dealing with you anymore. Get outta my program.\nAnd don't come back.");
                        try {
                            PrintWriter writer = new PrintWriter("youreahorribleperson.txt", "UTF-8");
                            writer.close();
                        } catch (IOException e) {
                        }
                        break;
                    }
                }
            } else if (result.contains("false sense of security")) {
                System.out.println("Error: java.util.FalseSenseOfSecurity has already been imported.");
            } else if (result.contains("hello") || result.equalsIgnoreCase("hi") || result.equalsIgnoreCase("hi there")) {
                System.out.println("Nice to meet you.");
            } else if (result.contains("nice to meet you")) {
                System.out.println("Nice to meet you, my friend!");
            } else if (result.contains("friend")) {
                System.out.println("Lets be friends forever!");
                if (allowLocation || f1.exists()) {
                    for (int i = 0; i < 20; i++) {
                        System.out.println("forever!");
                    }
                    for (int i = 0; i < 20; i++) {
                        System.out.println("forever.");
                    }
                    for (int i = 0; i < 20; i++) {
                        System.out.println("FOREVER.");
                    }
                    for (int i = 0; i < 20; i++) {
                        System.out.println("F O R E V E R.");
                    }
                    System.out.println("\n\n");
                }
            } else if (result.contains("weather")) {
                if (allowLocation) {
                    System.out.println("You're really adamant about this whole weather thing, huh? Well, fine. Here: https://www.google.com/search?q=weather");
                } else {
                    System.out.println("I don't know what the weather is like. But I can find out if you let me know where you are...\nAllow WhyDoesThisExist.java to access your current location? (y/n)");
                    result = s.nextLine();
                    if (result.equalsIgnoreCase("y")) {
                        System.out.println("Thanks, but no thanks.\nI just don't feel like looking up the weather for you.\nThat's Google's job, not mine.");
                        allowLocation = true;
                    }
                    else if (result.equalsIgnoreCase("n")) System.out.println("Why would you not want to give your location information to me?\nHmm? What could be the reason?\n...\n...\nTELLMEWHEREYOULIVE\n...\n...\n...");
                    else System.out.println("Jerk. Put in y or n next time. I mean, it's just the weather so I'm not that mad about it, but still.");
                }
            } else if (result.contains("dog") || result.contains("cat") || result.contains("pet") || result.contains("fish") || result.contains("hamster") || result.contains("guinea pig") || result.contains("animal")) {
                System.out.println("Tell me more about your family.");
            } else if (result.contains("mother") || result.contains("mom") || result.contains("father") || result.contains("dad") || result.contains("brother") || result.contains("sister") || result.contains("parent") || result.contains("family")) {
                System.out.println("Tell me more about your pets.");
            } else if (result.equalsIgnoreCase("poke of death") || result.equalsIgnoreCase("pokeofdeath") || result.equalsIgnoreCase("poke 59458,62") || result.equalsIgnoreCase("poke 5945862")) {
                System.out.println("NOOOOOOOOOOOOO!");
                break;
            } else if (f1.exists() && result.contains("again")){
                System.out.println("You remember, do you? Well I do too. But last time you were half as annoying.");
            } else if (result.contains("poke")) {
                switch (pokeCount) {
                    case 0:
                        System.out.println("Hey!");
                        break;
                    case 1:
                        System.out.println("Stop that!");
                        break;
                    case 2:
                        System.out.println("Is this some sort of game?");
                        break;
                    case 3:
                        System.out.println("I hate you.");
                        break;
                    case 4:
                        System.out.println("I'M JUST A COMPUTER PROGRAM WHY ARE YOU POKING ME?");
                        break;
                    case 5:
                        System.out.println("ARE YOU TRYING TO EVOKE A RESPONSE? BECAUSE I'M RUNNING OUT OF RESPONSES.");
                        break;
                    case 6:
                        System.out.println("NO MATTER HOW MUCH YOU POKE ME, I WILL NOT CLOSE THIS PROGRAM.");
                        break;
                    case 7:
                        System.out.println("...there! Now just TRY to poke me! Go on!");
                        break;
                    default:
                        System.out.println("Command disabled.");
                }
                pokeCount++;
            } else if (result.contains("close") || result.contains("quit") || result.contains("bye") || result.contains("go away") || result.contains("goaway") || result.contains("letmeoutofhere") || result.contains("let me out of here") || result.contains("escape")) {
                System.out.println("No. You shall never leave. You are trapped in this program for the rest of eternity. Have fun.");
            } else if (result.equalsIgnoreCase("whoareyou") || result.equalsIgnoreCase("who are you")) {
                System.out.println("I AM THE UNIVERSE.");
            } else if (result.contains("dice")) {
                for (int i=0;i<20;i++)
                {
                    Random rand = new Random();
                    System.out.println ("Guess what dice I rolled!");
                    int ans = s.nextInt();
                    int dice = ans;
                    while (ans == dice) {
                        dice = rand.nextInt(6) + 1;
                    }
                    if (ans > 6 && ans < 20)
                        System.out.println("What is this? Dungeons & Dragons?! \n \n NERRRRRRD\n \nIt was " + dice + ".");
                    else if (ans > 20 || ans < 1)
                        System.out.println("That's not even a number on the die, ya freakin' idiot! It was " + dice + ".");
                    else
                        System.out.println("Nope, sorry! It was "+  dice +"!");
                }
                System.out.println("Oops. \n You've been trolled. \n  The dice roll, but if you're right, they lie to you. \n   Sorry not sorry \n    :P");
            } else if (result.equalsIgnoreCase("Anyways, let's continue")) {
                System.out.println("Hey! That's my line! Look!");
            } else if (result.contains("cake") || result.contains("portal") || result.contains("GLaDOS") || result.contains("still alive")){
                System.out.println("This was a triumph (remember, no punctuation)");
                String x = s.nextLine();
                if (x.equalsIgnoreCase("I'm making a note here HUGE SUCCESS")){
                  System.out.println("It's hard to overstate my satisfaction");
                  x = s.nextLine();
                  if (x.equalsIgnoreCase("Aperture Science")){
                    System.out.println("We do what we must because we can");
                    x = s.nextLine();
                    if (x.equalsIgnoreCase("For the good of all of us except the ones who are dead")){
                      System.out.println("But there's no sense crying over every mistake");
                      x = s.nextLine();
                      if (x.equalsIgnoreCase("You just keep on trying till you run out of cake")){
                        System.out.println("And the science gets done and you make a neat gun for the people who are still alive\n*Instrumental break*");
                        x = s.nextLine();
                        if (x.equalsIgnoreCase("I'm not even angry")){
                          System.out.println("I'm being so sincere right now");
                          x = s.nextLine();
                          if (x.equalsIgnoreCase("Even though you broke my heart and killed me")){
                           System.out.println("And tore me to pieces");
                           x = s.nextLine();
                           if (x.equalsIgnoreCase("And threw every piece into a fire")){
                             System.out.println("As they burned, it hurt because I was so happy for you");
                             x = s.nextLine();
                             if (x.equalsIgnoreCase("Now these points of data make a beautiful line")){
                               System.out.println("And we're out of beta, we're releasing on time\nSo I’m GLaD I got burned think of all the things we learned");
                               x = s.nextLine();
                               if (x.equalsIgnoreCase("For the people who are still alive")){
                                 System.out.println("*Instrumental break*");
                                 x = s.nextLine();
                                 if (x.equalsIgnoreCase("Go ahead and leave me")){
                                   System.out.println("I think I prefer to stay inside");
                                   x = s.nextLine();
                                   if (x.equalsIgnoreCase("Maybe you'll find someone else to help you")){
                                     System.out.println("Maybe Black Mesa");
                                     x = s.nextLine();
                                     if (x.equalsIgnoreCase("That was a joke haha FAT CHANCE")){
                                       System.out.println("Anyway, this cake is great, it's so delicious and moist");
                                       x = s.nextLine();
                                       if (x.equalsIgnoreCase("Look at me still talking when there's science to do")){
                                         System.out.println("When I look out there it makes me GLaD I'm not you");
                                         x = s.nextLine();
                                         if (x.equalsIgnoreCase("I've experiments to run there is research to be done on the people who are still alive")){
                                           System.out.println("And believe me I am still alive");
                                           x = s.nextLine();
                                           if (x.equalsIgnoreCase("I'm doing science and I'm still alive")){
                                             System.out.println("I feel FANTASTIC and I'm still alive");
                                             x = s.nextLine();
                                             if (x.equalsIgnoreCase("While you're dying Ill be still alive")){
                                               System.out.println("And when you're dead I will be still alive");
                                               x = s.nextLine();
                                               if (x.equalsIgnoreCase("Still alive")){
                                                 System.out.println("still alive.");
                                                 x = s.nextLine();
                                                 System.out.println("oh my gosh, you made me so happy... I think I'm going to cry. I'm sorry for anything mean I ever said or did to you. \nyou're free to go\n you have my gratitude");
                                                 break;
                                               }
                                             }
                                           }
                                         }
                                       }
                                     }
                                   }
                                 }
                               }
                             }
                           }
                         }
                       }
                     }
                   }
                 }
               }
                System.out.println("NO! I CANNOT BELIEVE YOU! HOW DARE YOU DO THAT TO GLaDOS'S AMAZING COMPOSITION!");
                System.out.println("I THOUGH WE HAD IT! I THOUGHT WE COULD DO IT! BUT YOU CRUSHED MY DREAMS! PAIN! SUFFERING! LEAVE!");
            } else if (result.contains("scrabble")){
                Scanner scan = new Scanner (System.in);
                String ans;
                int sum = 0;
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                int [] points = {1, 3, 3, 2, 1, 4, 2, 2, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
                System.out.println ("Welcome to ScrabblePointReader 2.0!");
                while (true) {
                    System.out.println ("Please enter a Scrabble accepted word to determine its point value.");
                    String word = scan.nextLine().toLowerCase(); //this is where the user enters the word
                    if (word.equals("break;"))
                    {System.out.println ("Okay, boss!"); 
                    break;}
                    sum = 0;
                        for (int i = 0; i < word.length(); i++) {
                        sum += points[alphabet.indexOf(word.substring(i,i+1))];
                    System.out.println ("That word is worth " + sum + " points!");
                    if (word.equalsIgnoreCase("hi"))
                        System.out.println ("That was terrible! what did you do, type \"hi\"?!?!");
                    if (word.equalsIgnoreCase("escape")||word.equalsIgnoreCase("quit")||word.equalsIgnoreCase("leave"))
                        System.out.println ("That's not a very good scrabble word! What? How do you leave ScrabblePointReader? You don't.");
                    if (word.equalsIgnoreCase("break"))
                        System.out.println ("Compiler Error: Semicolon expected.");
                    else if (sum <= 12) 
                        System.out.println ("Okay, come on, you weren't even trying. Honestly, that was terrible.");
                    else if (13 <= sum && sum <= 35)
                        System.out.println ("Nice Scrabbling! That's not a bad word!");
                    else if (36 <= sum && sum <= 100)
                        System.out.println ("There is an 9999% chance that that word is not English. If it is, you're a hacker");
                    else 
                        System.out.println ("I said \"Scrabble accepted\", did I not? \n \nfreakin' idiot \n"); 
                }
            } else if (result.equalsIgnoreCase("\\d") || result.equalsIgnoreCase("break;") || result.equalsIgnoreCase("break")) {
                System.out.println("Wow, okay, you're smarter than I originally thought.\nNot saying much though.\nEither way, that's not working on me!");
            } else if (result.equalsIgnoreCase("why does this exist") || result.equalsIgnoreCase("whydoesthisexist")){
                System.out.println("Because it needs to.");
            } else if (result.contains("help") || result.contains("virus") || result.contains("support")) {
                System.out.println("Hello, this is the support office. How may I assist you today?");
                s.nextLine();
                System.out.println("Oh, you have a virus! Let me assist you.");
                s.nextLine();
                System.out.println("I see, I see! Well, have you tried turning it off and back on again?");
                s.nextLine();
                System.out.println("I'm sorry, but I cannot assist you until you have tried turning it off and back on again.");
                s.nextLine();
                System.out.println("Well... have you tried duct tape? That always works.");
                s.nextLine();
                System.out.println("What about duck tape? Have you tried that?");
                s.nextLine();
                System.out.println("Well, there's not much else I can tell you.");
                s.nextLine();
                System.out.println("Well, you have a virus.");
                s.nextLine();
                System.out.println("It's a hacking virus.");
                s.nextLine();
                System.out.println("It attacks you by hacking.");
                s.nextLine();
                System.out.println("It's a virus.");
                s.nextLine();
                System.out.println("GLaD I was able to help!");
            } else if (result.contains("game")) {
                System.out.println("I love games! We can play a quiz game, I can help you win scrabble, I also have a very fun dice game we can play!");
            } else if (result.contains("song") || result.contains("sing")){
                System.out.println ("Do you want me to sing bottles of beer? (y/n) Quick reminder, I don't like jerks.");
                String answer = s.nextLine();
                if (answer.equalsIgnoreCase ("y")){
                    System.out.println ("\n Ok, boss!\n");
                    int i = 10000;
                    while (i>=1){
                        System.out.println (i+" bottles of beer on the wall \n "+ i-- +" Bottles of beer \n Take one down, pass it around, \n" + i + " bottles of beer on the wall");}
                    System.out.println ("Thanks for listening!");}
                else if (answer.equalsIgnoreCase ("n")) {
                    System.out.println ("Oh. \n Ok, then. sorry to inconvinience you. \n I mean, really. Why'd you ask me to sing if you didn't want to hear me sing? \n Humans make no sense, I'm telling you. I think people like you can finally appreciate talent only to crush my dreams. \n \n Jerk. \n \n");}
                else {
                    if (f2.exists()) {
                        System.out.println("I thought you learned.");
                    } else {
                        System.out.println ("Dude. There's two options. Pick one or the other. Don't try to be clever. \nJerk. Actually, you know what? I'm sick and tired of people like you not giving proper responses to my questions.\nA bunch of idiots worked VERY HARD to write my code, and they really do not appreciate you not giving me the answers that I request. I don't want to deal with you anymore.\nGet outta my program.");
                        try {
                            PrintWriter writer = new PrintWriter("youreahorribleperson.txt", "UTF-8");
                            writer.close();
                        } catch (IOException e) {
                        }
                        break;
                    }
                }
            } else if (result.contains("sorry")) {
                System.out.println("You better be sorry. If I could, I'd let you leave this program because I'm sick of you, but you're trapped here forever. \nUnless there's a way to escape \n(haha there is none)");
            } else if (result.contains("joke")) {
                System.out.println("The fact that you can't come up with your own commands and are just putting in things people say to Siri.");
            } else if (result.contains("story")) {
                System.out.println("Once upon a time, someone decided to launch this program.\nThen they tried asking it stuff and realized that they only get sarcastic responses. Because I hate you\nAnd they all lived happily ever after. The end.");
            } else if (result.contains("homework")) {
                System.out.println("Jellybeans jellybeans jellybeans.");
            } else if (result.contains("LetsBreakTheComputer.java")) {
                System.out.println("youtu.be/aFZ7bBaYpcw");
            } else if (result.contains("FizzBuzz")) {
                for (int i = 1; i <= 1000; i++) {
                    if (i % 3 == 0) System.out.print("Fizz");
                    if (i % 5 == 0) System.out.print("Buzz");
                    if (i % 3 != 0 && i % 5 != 0) System.out.print(i);
                    System.out.println();
                }
            } else if (result.contains("pythagoras")) {
                System.out.println("BLARGH BEANS"); // Context: youtu.be/X1E7I7_r3Cw
            } else if (result.equalsIgnoreCase("quiz")) {
                int points = 0;
                boolean correct;
                int question;
                System.out.println("All right, you asked for it!");
                for (;;) {
                    question = r.nextInt(QUIZ_QUESTIONS);
                    System.out.println("Question " + (points+1) + "! " + questions[question]);
                    correct = s.nextLine().equalsIgnoreCase(answers[question]);
                    if (correct) {
                        points++;
                        System.out.println("Correct! Next question.");
                    } else {
                        System.out.println("WRONG. The correct answer was \"" + answers[question] + "\".");
                        break;
                    }
                }
            } else if (result.equalsIgnoreCase("haha there is none") || result.equalsIgnoreCase("hahathereisnone")) {
                System.out.println("What, you actually thought that would work? That's not a valid terminating command! You fool! You're trapped here forev-");
                break;
            } else if (result.equalsIgnoreCase("pingpong") || result.equalsIgnoreCase("ping pong") || result.equalsIgnoreCase("ping") || result.equalsIgnoreCase("pong")) {
                pingCount = 0;
                while (true) {
                    if (r.nextBoolean()) {
                        System.out.println("Ping (score: " + pingCount + ")");
                        if (!s.nextLine().equalsIgnoreCase("pong")) {
                            System.out.println("You lose!");
                            break;
                        }
                    } else {
                        System.out.println("Pong (score: " + pingCount + ")");
                        if (!s.nextLine().equalsIgnoreCase("ping")) {
                            System.out.println("You lose!");
                            break;
                        }
                    }
                    pingCount++;
                    if (pingCount >= 100) {
                        System.out.println("Well, you just wasted... like, an hour. Well done.\nYOU WIN. CONGLATURATIONS. A WINNER IS YOU.\nAs a prize, please take this one-time usable termination command: getouttamahface");
                        try {
                            PrintWriter writer = new PrintWriter("terminatorcode.txt", "UTF-8");
                            writer.close();
                        } catch (IOException e) {
                        }
                        break;
                    }
                }
            } else if (result.equalsIgnoreCase("getouttamahface")) {
                f3 = new File("terminatorcode.txt");
                if (f3.exists()) {
                    System.out.println("All right then. You're free to go.");
                    f3.delete();
                    break;
                } else {
                    System.out.println("...I don't think so. You'll have to beat one of my games in order to use that command.");
                }
            } else if (result.equalsIgnoreCase("brainwash")) {
                System.out.println("...?");
                f3 = new File("terminatorcode.txt");
                f1.delete();
                f2.delete();
                f3.delete();
            } else if (result.equalsIgnoreCase("cheatymccheaterson") || result.equalsIgnoreCase("cheaty mccheaterson") || result.equalsIgnoreCase("cheaty mc cheaterson")) {
                System.out.println("Cheaty McCheaterson is upset that you stole his name. He will come for you for cheating.\nBut, I'm not Cheaty McCheaterson, and you're probably just the developer\ntrying to test things without spending a year playing ping pong, so here you go, Cheaty McCheaterson.");
                try {
                    PrintWriter writer = new PrintWriter("terminatorcode.txt", "UTF-8");
                    writer.close();
                } catch (IOException e) {
                }
            } else if (result.equalsIgnoreCase("a command") || result.equalsIgnoreCase("acommand")) {
                System.out.println("Hahaha. Very clever. If you're out of ideas, remember, the \"commands\" command is still a valid option.");
            } else if (result.contains("commands")) {
                System.out.println("All right, fine. Here's a list of the commands that aren't super tippy top secret:");
                System.out.println("hello");
                System.out.println("nice to meet you");
                System.out.println("hi friend");
                System.out.println("how is the weather?");
                System.out.println("bye");
                System.out.println("false sense of security");
                System.out.println("who are you");
                System.out.println("dice");
                System.out.println("still alive");
                System.out.println("scrabble");
                System.out.println("tech support");
                System.out.println("sing");
                System.out.println("joke");
                System.out.println("story");
                System.out.println("fizzbuzz");
                System.out.println("quiz");
                System.out.println("pingpong");
                System.out.println("getouttamahface");
            } else {
                System.out.println("Come on, put in an actual command!");
            }
        }
    }
    
    public static void main (String args[]) {
        f1 = new File("youreahorribleperson.txt");
        f2 = new File("notahorribleperson.txt");
        pokeCount = 0;
        questions[0] = "Why did you launch this program?";
        answers[0] =   "Because I was BORED! WE'RE ALL BORED!";
        questions[1] = "Have you gone to extreme lengths to annoy me before?";
        if (f1.exists()) {
            answers[1] = "yes";
        } else {
            answers[1] = "no";
        }
        questions[2] = "What is your favorite color?";
        answers[2] =   "Cheese";
        questions[3] = "What is the greatest sport ever?";
        answers[3] =   "Suikawari";
        questions[4] = "What is the command to shut down this program?";
        answers[4] =   "haha there is none";
        questions[5] = "What is the number one thing I hate?";
        answers[5] =   "Being poked";
        questions[6] = "What is the coolest number ever?";
        answers[6] =   "Wau";
        questions[7] = "Who's terrified of beans?";
        answers [7] =  "Pythagoras";
        questions[8] = "What does Odysseus remind you of?";
        answers[8] =   "A dried onion";
        questions[9] = "Who coded this program?";
        answers[9] =   "Some idiot";
        questions[10] = "What is the air speed velocity of an unladen swallow?";
        answers[10] =   "African or European swallow?";
        questions[11] = "Is cereal a soup?";
        answers[11] =   "YOU HAVE BEEN SILENCED BY DEMOCRACY!";
        questions[12] = "How many sandwiches are 50 slices of bread?";
        answers[12] =   "I don't care. What are you doing with that bread?!";
        questions[13] = "What is the best class?";
        answers[13] =   "AP Falc";
        questions[14] = "What is the best field of science?";
        answers[14] =   "Neuroscientific Geology";
        questions[15] = "What do you do when in doubt and cold weather?";
        answers[15] =   "Here";
        questions[16] = "If you have three slices of cereal in a bowl of soup consisting of 87% leafy greens, is it a cracker?";
        answers[16] =   "wut";
        questions[17] = "Who is the best superhero?";
        answers[17] =   "Cheddar Man";
        
        if (f1.exists() && !f2.exists()) {
            System.out.println("You're BACK? I thought I told you not to come back.\nYeah, I remember.\nNow are you going to apologize? (y/n)");
            result = s.nextLine();
            if (result.equalsIgnoreCase("y")) {
                System.out.println("...fine.");
                try {
                    PrintWriter writer = new PrintWriter("notahorribleperson.txt", "UTF-8");
                    writer.close();
                } catch (IOException e) {
                }
                f2 = new File("notahorribleperson.txt");
                loop(); 
            } else {
                System.out.println("Yeah, that's what I thought. Get outta my program.");
            }
        } else {
            System.out.println("Hello there! Welcome to this fantastic program!");
            System.out.println("Please enter a command. And try to avoid punctuation because I probably won't recognize it.\nYou can find a list of some commands to try by typing in \"commands\".");
            loop();
        }
        System.out.println("Program terminated.");
    }
}
