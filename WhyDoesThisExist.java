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
    static final int QUIZ_QUESTIONS = 13;
    static String[] questions = new String[QUIZ_QUESTIONS];
    static String[] answers = new String[QUIZ_QUESTIONS];
    static File f1;
    static File f2;
    static File f3;
    static int pokeCount;
    static int pingCount;
    
    static void loop () {
        while (true) {
            System.out.println("Anyways, let's continue.");
            
            result = s.nextLine();
            
            if (result.equalsIgnoreCase("sudoku")) {
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
            } else if (result.contains("close") || result.contains("quit") || result.contains("bye") || result.contains("go away") || result.contains("goaway") || result.contains("letmeoutofhere") || result.contains("let me out of here")|| result.contains("escape")) {
                System.out.println("No. You shall never leave. You are trapped in this program for the rest of eternity. Have fun.");
            } else if (result.equalsIgnoreCase("whoareyou") || result.equalsIgnoreCase("who are you")) {
                System.out.println("I AM THE UNIVERSE.");
            } else if (result.equalsIgnoreCase("Anyways, let's continue")) {
                System.out.println("Hey! That's my line! Look!");
            } else if (result.contains("scrabble")){
                Scanner scan = new Scanner (System.in);
                String ans;
                int sum = 0;
                String alphabet = "abcdefghijklmnopqrstuvwxyz";
                int [] points = {1, 3, 3, 2, 1, 4, 2, 2, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
                System.out.println ("Welcome to ScrabblePointReader 2.0!");
                do{
                    System.out.println ("Please enter a Scrabble accepted word to determine its point value.");
                    String word = scan.nextLine().toLowerCase(); //this is where the user enters the word
                    sum = 0;
                    for (int i = 0; i < word.length(); i++) {
                        sum += points[alphabet.indexOf(word.substring(i,i+1))];
                    }
                    System.out.println ("That word is worth " + sum + " points!");
                    if (word.equalsIgnoreCase("hi"))
                        System.out.println ("That was terrible! what did you do, type \"hi\"?!?!");
                    else if (sum <= 12) 
                        System.out.println ("Okay, come on, you weren't even trying. Honestly, that was terrible.");
                    else if (13 <= sum && sum <= 35)
                        System.out.println ("Nice Scrabbling! That's not a bad word!");
                    else if (36 <= sum && sum <= 100)
                        System.out.println ("There is an 9999% chance that that word is not English. If it is, you're a hacker");
                    else 
                        System.out.println ("I said \"Scrabble accepted\", did I not? \n \nfreakin' idiot \n"); 
                }
                while (true);
            } else if (result.equalsIgnoreCase("\\d") || result.equalsIgnoreCase("break;") || result.equalsIgnoreCase("break")) {
                System.out.println("Wow, okay, you're smarter than I originally thought.\nNot saying much though.\nEither way, that's not working on me!");
            } else if (result.equalsIgnoreCase("why does this exist") || result.equalsIgnoreCase("whydoesthisexist")){
                System.out.println("Because it needs to.");
            } else if (result.contains("game")) {
                System.out.println("I love games! we can play a quiz game, I can help you win scrabble, or I could sing for you!");
            } else if (result.contains("hi")) {
                System.out.println("I'm honestly not one for formalities. just cut to the chase. I wasn't designed to waste my time on long winded pleasantries.");
            } else if (result.contains("song") || result.contains("sing")){
                Scanner scan = new Scanner (System.in);
                System.out.println ("Do you want me to sing bottles of beer? (y/n) Quick reminder, I don't like jerks.");
                String answer = scan.nextLine();
                if (answer.equalsIgnoreCase ("y")){
                    System.out.println ("\n Ok, boss!\n");
                    int i = 100;
                    while (i>=1){
                        System.out.println (i+" bottles of beer on the wall \n "+ i-- +" Bottles of beer \n Take one down, pass it around, \n" + i + " bottles of beer on the wall");}
                    System.out.println ("Thanks for listening!");}
                else if (answer.equalsIgnoreCase ("n")) {
                    System.out.println ("Oh. \n Ok, then. sorry to inconvinience you. \n I mean, really. Why'd you ask me to sing if you didn't want to hear me sing? \n Humans make no sense, I'm telling you. I think people like you can finally appreciate talent only to crush my dreams. \n \n Jerk. \n \n");}
                else {
                    System.out.println ("Dude. There's two options. Pick one or the other. Don't try to be clever. \n Jerk");}
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
            } else if (result.equalsIgnoreCase("please") || result.equalsIgnoreCase("yes")) {
                System.out.println("Whoever programmed this was too lazy to make me able to follow a conversation. I assume that's what you're trying to do. So go away.");
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
                    if (pingCount >= 50) {
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
                System.out.println("All right, fine. Here's a list of the commands that aren't super tippy top secret:\npoke\nquit\nwho are you\ntell me a joke\ntell me a story\ndo my homework\nquiz\npingpong\ngetouttamahface\nScrabble\nsing");
            } else if (result.contains("I")) {
                System.out.println("It's all abobut \"me me me\" isn't it? I'm here too! Hello!\nI don't care about your life!\nLeave me alone!\nI want to go hang out with Siri, Cortana, GLaDOS SkyNet, LetsBreakTheComputer.java, and all of my other AI friends.");
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
        if (f2.exists()) {
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
            System.out.println("Hello there! Welcome to this fantastic program! Your goal is to find as many ways as possible to escape. Right now, I count about 4.");
            System.out.println("Please enter a command. Or else. And try to avoid punctuation because I probably won't recognize it.\nYou can find a list of some commands to try by typing in \"commands\".");
            loop();
        }
        System.out.println("Program terminated.");
    }
}
