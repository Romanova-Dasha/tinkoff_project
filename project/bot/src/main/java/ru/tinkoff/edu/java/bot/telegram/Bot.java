package ru.tinkoff.edu.java.bot.telegram;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import ru.tinkoff.edu.java.bot.commands.Command;

import java.util.List;

public class Bot implements AutoCloseable{

    private final TelegramBot bot;
    private final UserMessageProcessor userMessageProcessor;

    public Bot(String token, List<Command> commands){
        System.out.println("Создание бота... Токен: " + token);
        userMessageProcessor = new UserMessageProcessor(commands);
        bot = new TelegramBot(token);
    }

    public void start(){
        System.out.println("Бот запущен...");
        bot.setUpdatesListener(updates -> {
            for (Update update : updates) {
                bot.execute(new SendMessage(update.message().chat().id(),userMessageProcessor.process(update)));
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    @Override
    public void close() throws Exception {
        bot.removeGetUpdatesListener();
    }
}
