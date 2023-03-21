package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.link.GitHub_Link;
import ru.tinkoff.edu.java.link_parser.link.Parser_Link;

import java.util.Arrays;

public class Github extends Abstract {
    public Github(Abstract nextParser) {
        super(nextParser);
    }

    @Override
    public Parser_Link parser_Link(String url) {
        if (url == null) return null;
        String toParse = tweakUrl(url);
        String[] tokens = toParse.split("/");

        System.out.println(Arrays.toString(tokens));

        if (tokens.length >= 1 && tokens[0].equals("github.com")) {
            if (tokens.length >= 3) {
                return new GitHub_Link(tokens[1], tokens[2]);
            } else return null;
        }


        if (nextParser != null) return nextParser.parser_Link(url);

        return null;
    }
}