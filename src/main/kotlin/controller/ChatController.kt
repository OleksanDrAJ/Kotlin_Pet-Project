package controller

import dto.ChatDto
import dto.UserDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import service.ChatService

@RestController
@RequestMapping("/chat")
class ChatController (
    @Autowired
    private val chatService: ChatService){

    //    @PostMapping("/messages")
    //    @ResponseStatus(HttpStatus.CREATED)
    //    public void addMessageToTheChat(@RequestBody Message message, Chat chat) {
    //
    //        chatService.addMessageToTheChat(message, chat);
    //    }
    @GetMapping("/findAllChats")
    fun findByChatTopic(): ResponseEntity<List<ChatDto>?>? {
        val chats: List<ChatDto> = chatService.findAll()
        return if (chats.isEmpty()) {
            ResponseEntity<List<ChatDto>?>(HttpStatus.NO_CONTENT)
        } else ResponseEntity<List<ChatDto>?>(chats, HttpStatus.OK)
    }

    @PostMapping
    fun createChat(): List<UserDto> = chatService.createChat()
}
