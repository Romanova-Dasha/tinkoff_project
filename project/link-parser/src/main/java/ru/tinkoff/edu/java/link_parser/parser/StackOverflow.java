package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.link.Parser_Link;
import ru.tinkoff.edu.java.link_parser.link.StackOverflow_Link;

public class StackOverflow extends Abstract {
    public StackOverflow(Abstract nextParser) {
        super(nextParser);
    }

    @Override
    public Parser_Link parser_Link(String url) {

        if (url == null) return null;
        String toParse = tweakUrl(url);
        String[] tokens = toParse.split("/");

        if (tokens.length >= 1 && tokens[0].equals("stackoverflow.com")) {
            if (tokens.length >= 2 && tokens[1].equals("questions")) {
                if (tokens.length >= 3) {
                    try {
                        return new StackOverflow_Link(Long.parseLong(tokens[2]));
                    } catch (NumberFormatException e) {
                        return null;
                    }
                }
            } else return null;
        }

        if (nextParser != null) return nextParser.parser_Link(url);

        return null;
    }
}