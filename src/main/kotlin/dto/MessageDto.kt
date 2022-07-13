package dto

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document
data class MessageDto(

    @Id
    private val messageId: Int,
    private val messageDatetime: String,
    private val messageText: String,
    private val messageChatId: Int,
    private val messageUserId: Int
)
