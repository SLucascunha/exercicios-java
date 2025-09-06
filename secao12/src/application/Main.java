package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date momentPost1 = sdf.parse("21/06/2018 13:05:44");
        Date momentPost2 = sdf.parse("28/07/2018 23:14:19");

        Comment post1Comment1 = new Comment("Have a nice trip!");
        Comment post1Comment2 = new Comment("Wow that's awesome!");
        Comment post2Comment1 = new Comment("Good Night!");
        Comment post2Comment2 = new Comment("May the Force be with you!");

        Post post1 = new Post(momentPost1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        Post post2 = new Post(momentPost2, "Good Night Guys!", "See you tomorrow!", 5);

        post1.addComment(post1Comment1);
        post1.addComment(post1Comment2);
        post2.addComment(post2Comment1);
        post2.addComment(post2Comment2);

        System.out.println(post1.toString());
        System.out.println();
        System.out.println(post2.toString());

    }

}