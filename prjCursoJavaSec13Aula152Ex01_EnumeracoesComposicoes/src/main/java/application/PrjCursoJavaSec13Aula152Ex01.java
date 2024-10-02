package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec13Aula152Ex01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Post p1 = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!", 
        12);
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        
        Post p2 = new Post(
        sdf.parse("28/07/2018 23:14:19"),
        "Good Night guys",
        "See you tomorrow", 
        5);
        
        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("May the force be with you");
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        System.out.println(p1);
        System.out.println(p2);
        sc.close();
    }
}
