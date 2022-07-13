package dto

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id

@Document
data class ChatDto(
    @Id
    private val chatId: Int,
    private val chatTopic: String,

    @DBRef
    private val message: List<MessageDto>,
    @DBRef
    private val user: List<UserDto>
)
