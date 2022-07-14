package service

import dto.ChatDto
import dto.UserDto
import org.springframework.stereotype.Service

@Service
interface ChatService {

 //   fun createChat(userList: List<UserDto>): ChatDto
//    fun deleteChat(chatId: Int)
//
//    fun addUserToTheChat(chatDto: ChatDto, userDto: UserDto)

    fun findAll(): List<ChatDto>



}