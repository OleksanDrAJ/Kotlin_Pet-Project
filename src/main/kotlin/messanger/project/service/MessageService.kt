package messanger.project.service

import messanger.project.model.Message

interface MessageService {

    fun sendMessage(messageText: String?, userId: String, chatId: String)

    fun deleteMessage(messageId: String)

    fun editMessage(message: Message): Message

    fun findMessage(text: String): List<Message?>
}