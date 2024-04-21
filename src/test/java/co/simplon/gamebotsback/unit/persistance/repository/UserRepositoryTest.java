/**
 * This class represents a unit test for the UserRepository class.
 * It tests the functionality of finding a user by username.
 */
package co.simplon.gamebotsback.unit.persistance.repository;

import co.simplon.gamebotsback.persistance.entity.User;
import co.simplon.gamebotsback.persistance.repository.user.IUserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserRepositoryTest {

    /**
     * Mock object representing the IUserRepository interface.
     */
    @Mock
    private IUserRepository userRepository;

    /**
     * Test method for finding a user by username.
     */
    @Test
    @DisplayName("Test Find By Username")
    void testFindByUsername() {

        when(userRepository.findByUsername("Ylorklan")).thenReturn(Optional.of(new User()));

        Optional<User> user = userRepository.findByUsername("Ylorklan");

        verify(userRepository, times(1)).findByUsername("Ylorklan");

        assert user.isPresent();
    }
}
