package ru.tinkoff.edu.java.scrapper.rest;

import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.scrapper.service.ChatService;
import ru.tinkoff.edu.java.scrapper.dto.UserAddDto;
import ru.tinkoff.edu.java.scrapper.model.User;

@RestController
@RequestMapping("/tg-chat")
public class ChatRestController {


    private final ChatService chatService;

    public ChatRestController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping(value = "{id}")
    public void registerChat(@PathVariable Long id, @RequestBody UserAddDto userAddDto) {
        System.out.println("Пришлё запрос на регистрацию чата "+userAddDto);
        chatService.register(new User(id, userAddDto.username(), userAddDto.firstName(), userAddDto.lastName()));
    }

    @DeleteMapping(value = "{id}")
    public void deleteChat(@PathVariable Long id) {
        chatService.unregister(id);
    }


}