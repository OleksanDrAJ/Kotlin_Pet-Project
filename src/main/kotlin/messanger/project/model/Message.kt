package messanger.project.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

@Document("messages")
data class Message(
    @MongoId(value = FieldType.OBJECT_ID)
    val id: String= "",
    var datetime: String = "",
    var text: String = "",
    val messageChatId: Int = -1,
    val messageUserId: Int= -1
)
