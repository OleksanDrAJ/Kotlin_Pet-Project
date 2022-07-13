package dto

import org.springframework.data.mongodb.core.mapping.DBRef
import javax.persistence.Id

data class UserDto(
    @Id
    private val userId: Int,
    private val userName: String,
    private val phoneNumber: String,
    private val bio: String,
    @DBRef
    private val chat: List<ChatDto>
)