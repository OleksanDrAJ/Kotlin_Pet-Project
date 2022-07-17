package messanger.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import messanger.project.service.ChatService

@RestController
class ChatController (
    @Autowired
    private val chatService: ChatService
){

}
