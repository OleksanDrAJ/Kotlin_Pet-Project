package service.Impl

import dto.UserDto
import repository.UserRepository
import service.UserService
import java.util.*


class UserServiceImpl(val userRepository: UserRepository): UserService
{
    override fun createUser(userDto: UserDto) {
        userRepository.save(userDto)
    }

    override fun deleteUser(id: String) {
        val user: UserDto? = findByUserId(id)
        userRepository.delete(user!!)
    }

    override fun updateUser(userDto: UserDto) {
        val userToUpdate = userRepository.findById(userDto.id)
    }

//    override fun findUserByPhoneNumber(phoneNumber: String): UserDto {
//        return userRepository.findByPhoneNumber(phoneNumber)
//    }

    override fun findUserByUserName(userName: String): List<UserDto> {
        TODO("Not yet implemented")
    }

    override fun findByUserId(id: String): UserDto? {
        return userRepository.findById(id).orElseThrow { Exception() }
    }
}