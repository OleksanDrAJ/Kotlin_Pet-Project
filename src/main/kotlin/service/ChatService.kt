package service

import dto.ChatDto
import dto.UserDto

interface ChatService {

    fun createChat(users: List<UserDto?>?): ChatDto

    fun findAll(): List<ChatDto>



}