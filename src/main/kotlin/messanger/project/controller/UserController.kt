package messanger.project.controller

import messanger.project.model.User
import messanger.project.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(

    val userService: UserService
) {

    @GetMapping("/users/{id}")
    fun findByUserId(@PathVariable("id") id: String): User? {
        return userService.findByUserId(id)
    }

    @GetMapping("/users/by-phone/{phoneNumber}")
    fun findByPhoneNumber(@PathVariable("phoneNumber") phoneNumber: String): User? {
        return userService.findUserByPhoneNumber(phoneNumber)
    }

    @GetMapping("/users/by-name/{userName}")
    fun findByUserName(@PathVariable("userName") userName: String): User? {
        return userService.findUserByUserName(userName)
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody user: User) {
        userService.createUser(user)
    }

    @PutMapping("/users")
    fun updateUser(@RequestBody user: User) {
        userService.updateUser(user)
    }

    @DeleteMapping("/users/{id}")
    fun delete(@PathVariable("id") id: String) {
        userService.deleteUser(id)
    }

}