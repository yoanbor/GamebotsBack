package co.simplon.gamebotsback.persistance.entity;

import jakarta.persistence.*;

import java.util.Date;

/**
 * Represents an Image entity in the persistence layer.
 * This class is mapped to the "images" table in the database.
 */
@Entity
@Table(name = "images")
public class Image {

        @Id
        @Column(name = "id_images")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idImage;

        @Basic
        @Column(name = "name")
        private String name;

        @Basic
        @Column(name = "source")
        private String source;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "creation_date")
        private Date creationDate;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "modification_date")
        private Date modificationDate;

        @ManyToOne
        @JoinColumn(name = "id_games")
        private Game game;

        @ManyToOne
        @JoinColumn(name = "id_type_images")
        private TypeImage typeImage;

    /**
     * Retrieves the ID of the Image.
     * @return The ID of the Image.
     */
    public int getIdImage() {
        return idImage;
    }

    /**
     * Sets the ID of the Image.
     * @param idImage The ID of the Image to set.
     */
    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    /**
     * Retrieves the name of the Image.
     * @return The name of the Image.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Image.
     * @param name The name of the Image to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the source of the Image.
     * @return The source of the Image.
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the source of the Image.
     * @param source The source of the Image to set.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Retrieves the creation date of the Image.
     * @return The creation date of the Image.
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the creation date of the Image.
     * @param creationDate The creation date of the Image to set.
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Retrieves the modification date of the Image.
     * @return The modification date of the Image.
     */
    public Date getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the modification date of the Image.
     * @param modificationDate The modification date of the Image to set.
     */
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * Retrieves the game associated with the Image.
     * @return The game associated with the Image.
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets the game associated with the Image.
     * @param game The game to set.
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * Retrieves the type of image associated with the Image.
     * @return The type of image associated with the Image.
     */
    public TypeImage getTypeImage() {
        return typeImage;
    }

    /**
     * Sets the type of image associated with the Image.
     * @param typeImage The type of image to set.
     */
    public void setTypeImage(TypeImage typeImage) {
        this.typeImage = typeImage;
    }
}