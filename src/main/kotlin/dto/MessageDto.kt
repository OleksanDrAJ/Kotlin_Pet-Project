package dto

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document
data class MessageDto(

    @Id
    private val id: ObjectId,
    private val datetime: String,
    private val text: String,
    private val messageChatId: Int,
    private val messageUserId: Int
)
