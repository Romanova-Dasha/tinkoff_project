package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.link.Parser_Link;

public abstract class Abstract {

    Abstract nextParser;

    public Abstract(Abstract nextParser) {
        this.nextParser = nextParser;
    }

    public abstract Parser_Link parser_Link(String url);

    public final String tweakUrl(String url) {
        url = url.replaceAll("\\s", "");
        if (url.startsWith("https://")) {
            return url.substring(8);
        } else if (url.startsWith("http://")) {
            return url.substring(7);
        } else {
            return url;
        }
    }
}