package repository;

import dto.ChatDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<ChatDto, Integer> {

}
