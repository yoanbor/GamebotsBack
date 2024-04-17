/**
 * Repository interface for managing Image entities in the persistence layer.
 * This interface extends JpaRepository, providing access to basic CRUD (Create, Read, Update, Delete) operations
 * and additional methods for querying and manipulating Image entities.
 *
 * @param <Image>   The type of entity managed by this repository, which is Image.
 * @param <Integer> The type of the identifier property of the Image entity, which is Integer.
 *                  This represents the type of the primary key.
 */
package co.simplon.gamebotsback.persistance.repository.image;

import co.simplon.gamebotsback.persistance.entity.Image;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IImageRepository extends JpaRepository<Image, Integer> {

    /**
     * Retrieves the images associated with a user by user ID.
     *
     * @param userId The ID of the user whose images are to be retrieved.
     * @return The image associated with the specified user.
     */
    @Query(ImageQueries.FIND_IMAGE_BY_USERID)
    Image getImagesByUserIdAndImageType(final int userId);

    /**
     * Retrieves the banner image associated with a game by game ID.
     *
     * @param gameId The ID of the game whose banner image is to be retrieved.
     * @return The banner image associated with the specified game.
     */
    @Query(ImageQueries.FIND_IMAGE_BANNER_BY_GAMEID)
    Image getImagesBannerByGameIdAndImageType(final int gameId);

    /**
     * Retrieves all images associated with a game by game ID.
     *
     * @param gameId The ID of the game whose images are to be retrieved.
     * @return A list of all images associated with the specified game.
     */
    @Query(ImageQueries.FIND_ALL_IMAGES_BY_GAMEID)
    List<Image> getAllImagesByGameId(final int gameId);

}
