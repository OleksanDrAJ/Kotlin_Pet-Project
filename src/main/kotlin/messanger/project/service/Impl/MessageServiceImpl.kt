package messanger.project.service.Impl

import messanger.project.model.Message
import org.springframework.beans.factory.annotation.Autowired
import messanger.project.repository.MessageRepository
import messanger.project.service.MessageService

class MessageServiceImpl(
    @Autowired
    val messageRepository: MessageRepository
): MessageService {

    override fun sendMessage(messageText: String?, userId: String, chatId: String) {

    }

    override fun deleteMessage(messageId: String) {
        val message: Message = messageRepository.findMessageById(messageId)
        messageRepository.delete(message)
    }

    override fun editMessage(message: Message): Message {
        val messageUpdate: Message = messageRepository.findMessageById(message.id)
        messageUpdate.text=message.text
        messageUpdate.datetime=message.datetime
        return messageRepository.save(messageUpdate)
    }

    override fun findMessage(text: String): List<Message?> {
        return listOf(messageRepository.findMessageByText(text))
    }


}