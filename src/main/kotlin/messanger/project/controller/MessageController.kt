package messanger.project.controller

import messanger.project.model.Message
import messanger.project.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(
    @Autowired
    val messageService: MessageService
) {
    @PostMapping("/messages-create")
    @ResponseStatus(HttpStatus.CREATED)
    fun sendMessage(@RequestBody messageText: String?, userId: String, chatId: String) {
        messageService.sendMessage(messageText, userId, chatId)
    }

    @PutMapping("/messages-edit")
    fun editMessage(@RequestBody message: Message) {
        messageService.editMessage(message)
    }

    @DeleteMapping("/messages-delete/{id}")
    fun delete(@PathVariable("id") id: String) {
        messageService.deleteMessage(id)
    }


    //not done

//    @GetMapping("/messages/by-id/{text}")
//    fun findMessage(@PathVariable("text") text: String): ResponseEntity<List<Message>?>? {
//        val messages: List<Message?> = messageService.findMessage(text)
//        return if (messages.isEmpty()) {
//            ResponseEntity<List<Message>?>(HttpStatus.NO_CONTENT)
//        } else ResponseEntity<List<Message>?>(messages, HttpStatus.OK)
//    }
}