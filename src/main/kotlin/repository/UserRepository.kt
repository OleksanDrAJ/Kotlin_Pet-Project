package repository

import dto.UserDto
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface UserRepository: MongoRepository<UserDto, String> {

    fun findByUserName(userName: String?): List<UserDto>

    fun findByPhoneNumber(phoneNumber: String?): UserDto?

    fun findByUserId(id: String): UserDto?
}