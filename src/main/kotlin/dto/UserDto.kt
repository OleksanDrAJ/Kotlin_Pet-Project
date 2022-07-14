package dto

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId



data class UserDto(
    @MongoId(value = FieldType.OBJECT_ID) val id: String,
    private val name: String,
    private val phoneNumber: String,
    private val bio: String,
    @DBRef
    private val chat: List<ChatDto>,
    @DBRef
    private val message: List<MessageDto>
)