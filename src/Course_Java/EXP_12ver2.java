package Course_Java;

public class EXP_12ver2 {

    public static void main(String[] args) {

        String line = "I write a word word word what ??";
        String l = "letter";

        if (line.indexOf("word") != -1){
            String line_FINAL = line.replace("word", l);
            System.out.print (line_FINAL);
        } else {
            System.out.print ("not have");
        }
    }
}
