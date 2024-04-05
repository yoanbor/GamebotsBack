/**
 * Repository interface for managing Message entities in the persistence layer.
 * This interface extends JpaRepository, providing access to basic CRUD (Create, Read, Update, Delete) operations
 * and additional methods for querying and manipulating Message entities.
 *
 * @param <Message>  The type of entity managed by this repository, which is Message.
 * @param <Integer>  The type of the identifier property of the Message entity, which is Integer.
 *                   This represents the type of the primary key.
 */

package co.simplon.gamebotsback.persistance.repository.message;

import co.simplon.gamebotsback.persistance.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMessageRepository extends JpaRepository<Message, Integer> {
}