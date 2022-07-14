package service.Impl

import dto.ChatDto
import dto.UserDto
import repository.ChatRepository
import service.ChatService

class ChatServiceImpl : ChatService {
    val chatRepository: ChatRepository
        get() {
            return chatRepository
        }


//    override fun createChat(users: List<UserDto?>?): ChatDto {
//        val chat = ChatDto()
//        chat.setUsers(HashSet<Any?>(users))
//        return chatRepository.save(chat)
//    }


    override fun findAll(): List<ChatDto> {
        return chatRepository.findAll()
    }
}