package dto

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ChatDto(
    @Id
    //object id
    private val id: ObjectId,
    private val topic: String,
    // no need for chat name

    @DBRef
    private val message: List<MessageDto>,
    @DBRef
    private val user: List<UserDto>
)
