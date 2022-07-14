package service

import dto.UserDto
import org.apache.catalina.User
import org.springframework.stereotype.Service

@Service
interface UserService {

    fun createUser(userDto: UserDto)

    fun deleteUser(id: String)

    fun updateUser(userDto: UserDto)
//
 //   fun findUserByPhoneNumber(phoneNumber: String): UserDto

    fun findUserByUserName(userName: String): List<UserDto>

    fun findByUserId(id: String): UserDto?
}