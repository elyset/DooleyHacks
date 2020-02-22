import java.util.*;
public class GenerationalTranslator {

    public static String change(String m) {
        String n = m.toLowerCase();

        n = n.replaceAll("lol", "laughing out loud");
        n = n.replaceAll("tht", "that");
        n = n.replaceAll("lmao", "laughing my a** off");
        n = n.replaceAll("lmfao", "laughing my f**ing a** off");
        n = n.replaceAll("lmk", "let me know");
        n = n.replaceAll("omw", "on my way");
        n = n.replaceAll("tbh", "to be honest");
        n = n.replaceAll("tnite", "tonight");
        n = n.replaceAll("wyd", "what are you doing");
        n = n.replaceAll("hbu", "how about you");
        n = n.replaceAll("brb", "be right back");
        n = n.replaceAll("ttyl", "talk to you later");
        n = n.replaceAll("imysm", "I miss you so much");
        n = n.replaceAll("imy", "I miss you");
        n = n.replaceAll("hmu", "hit me up");
        n = n.replaceAll("thx", "thanks");
        n = n.replaceAll("ilysm", "I love you so much");
        n = n.replaceAll("ily", "I love you");
        n = n.replaceAll("awks", "awkward");
        n = n.replaceAll("dip", "leave");
        n = n.replaceAll("on fleek", "flawless");
        n = n.replaceAll("shook", "surprised");
        n = n.replaceAll("yolo", "you only live once");
        n = n.replaceAll("tysm", "thank you so much");
        n = n.replaceAll("smh", "shake my head");
        n = n.replaceAll("rofl", "rolling on floor laughing");
        n = n.replaceAll("gr8", "great");
        n = n.replaceAll("ikr", "I know right");
        n = n.replaceAll("receipts", "evidence");
        n = n.replaceAll("wtf", "what the f**k");
        n = n.replaceAll("nvm", "nevermind");
        n = n.replaceAll("tea", "gossip");
        n = n.replaceAll("ofc", "of course");
        n = n.replaceAll("diy", "do it yourself");
        n = n.replaceAll("af", "as f**k");
        n = n.replaceAll("loml", "love of my life");
        n = n.replaceAll("tgif", "thank god it’s friday");
        n = n.replaceAll("bae", "baby");
        n = n.replaceAll("l8r", "later");
        n = n.replaceAll("ltr", "later");
        n = n.replaceAll("goat", "greatest of all time");
        n = n.replaceAll("idc", "I don’t care");
        n = n.replaceAll("idk", "I don’t know");
        n = n.replaceAll("kk", "okay");
        n = n.replaceAll("hbd", "happy birthday");
        n = n.replaceAll("lit", "cool");
        n = n.replaceAll("otp", "one true pair");
        n = n.replaceAll("wya", "where you at");
        n = n.replaceAll("ty", "thank you");
        n = n.replaceAll("snatched", "flawless");
        n = n.replaceAll("omfg", "oh my f**ing gosh");
        n = n.replaceAll("omg", "oh my gosh");
        n = n.replaceAll("turn up", "get excited");
        n = n.replaceAll("turnt", "excited");
        n = n.replaceAll("woke", "knowledgeable");
        n = n.replaceAll("tf", "the f**k");
        n = n.replaceAll("abt", "about");
        n = n.replaceAll("emory", "Harvard of the South");
        n = n.replaceAll("tbh", "to be honest");
        n = n.replaceAll("yas", "yes");
        n = n.replaceAll("aka", "as known as");
        n = n.replaceAll("gucci", "good");
        n = n.replaceAll("ratchet", "obnoxious");
        n = n.replaceAll("bc", "because");
        n = n.replaceAll("wdym", "what do you mean");
        n = n.replaceAll("fomo", "fear of missing out");
        n = n.replaceAll("thicc", "thick");
        n = n.replaceAll("nbd", "no big deal");
        n = n.replaceAll("irl", "in real life");
        n = n.replaceAll("bday","birthday");
        n = n.replaceAll("hangry", "hungry and angry");
        n = n.replaceAll("cray", "crazy");
        n = n.replaceAll("brd", "bored");
        n = n.replaceAll("btw", "by the way");
        n = n.replaceAll("bd", "birthday");
        n = n.replaceAll("my boo", "my baby");
        n = n.replaceAll("byob","bring your own bottle");
        n = n.replaceAll("sus", "suspicious");
        n = n.replaceAll("flex", "show off");
        n = n.replaceAll("cya", "see ya");
        n = n.replaceAll("cmon", "come on");
        n = n.replaceAll("bruh", "brother");
        n = n.replaceAll("dafaq", "the f**k");
        n = n.replaceAll("netflix and chill", "hookup");
        n = n.replaceAll("dgaf", "don’t give a f**k");
        n = n.replaceAll("legit", "legitimate");
        n = n.replaceAll("tbd", "to be decided");
        n = n.replaceAll("tmi", "too much information");
        n = n.replaceAll("fyi", "for your information");
        n = n.replaceAll("adorbs","adorable");
        n = n.replaceAll("kween", "queen");
        n = n.replaceAll("sry", "sorry");
        n = n.replaceAll("rn", "right now");
        n = n.replaceAll("imo", "in my opinion");
        n = n.replaceAll("imma", "I am going to");
        n = n.replaceAll("gtg", "got to go");
        n = n.replaceAll("wanna", "want to");
        n = n.replaceAll("gotta", "got to");
        n = n.replaceAll("gimme", "give me");
        n = n.replaceAll("y'all", "you all");
        n = n.replaceAll("yall", "you all");
        n = n.replaceAll("pepsi", "coke");
        n = n.replaceAll("bschool", "snake");
        n = n.replaceAll("eagle", "Dooley");

        return n;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println();
        System.out.println("Hello! Welcome to the Generational Translator!");
        System.out.println();

        System.out.println("These are the words that you can translate:");
        System.out.println("     lol, tht, lmao, lmfao, lmk, omw, tbh, tnite, wyd, hbu, brb, ttyl, imysm, imy, hmu, thx" +
                "ilysm, ily, awks, imma, awk, dip, on fleek, shook, yolo, tysm, smh");
        System.out.println("     rofl, gr8, ikr, receipts, wtf, nvm, tea, ofc, diy, af, loml, tgif, bae, bb, ltr, l8r, " +
                "ltr, goat, idc, idk, kk, hbd, lit, otp, wya, ty, snatched," + "omfg, omg");
        System.out.println("     turn up, turnt, woke, tf, abt, emory, tbh, yas, aka, gucci, ratchet, bc, wdym, fomo, thicc, nbd, irl" +
                "bday, hangry, cray, brd, btw, bd, my boo, byob, sus");
        System.out.println("     flex, cya, cmon, bruh, dafaq, netflix and chill," + "dgaf, legit, tbd,  tmi, rn, fyi, adorbs, kween, sry");

        System.out.println();
        System.out.println("Type the message you want translated:");
        System.out.println("(If you are done translating, type 'exit')");
        System.out.println();

        while (myObj.hasNextLine()) {
            String input = myObj.nextLine();  // Read user input
            System.out.println("Translation: ");
            System.out.println(change(input)); // Output user input
            System.out.println();
            if (input.equals("exit")) {
                break;
            }
        }
    }
}