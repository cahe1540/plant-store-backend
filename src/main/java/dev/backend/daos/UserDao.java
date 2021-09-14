package dev.backend.daos;

import dev.backend.models.User;

import java.util.List;

public interface UserDao {
    // Crud operations

    /**
     * Creates a User and adds it to the database
     * @param firstName The first name of the user
     * @param lastName The last name of the user
     * @param emailAddress The email address of the user
     * @param username The username of the user
     * @param password The password of the user
     * @param role The corresponding name of the user's roles
     * @return The user created from this information
     */
    public User createUser(String firstName, String lastName, String emailAddress, String username, String password, String role);

    /**
     * Deletes a user based on their unique ID.
     * @param userId The userId of the user you wish to delete.
     * @return True if the user is deleted successfully, or raises an error
     */
    public void deleteUser(int userId);

    /**
     * Updates a users information based on their unique ID
     * @param userId The userId of the user you're trying to update
     * @param firstName The first name of the user
     * @param lastName The last name of the user
     * @param emailAddress The email address of the user
     * @param username The username of the user
     * @param password The password of the user
     * @param role The corresponding name of the user's roles
     * @return The updated User object.
     */
    public User updateUser(int userId, String firstName, String lastName, String emailAddress, String username, String password, String role);

    /**
     * Gets the user corresponding to the ID specified
     * @param userId The userID of the user you're accessing
     * @return The user object of the user you're accessing
     */
    public User getUser(int userId);

    /**
     * Gets the list of users
     * @return All users
     */
    public List<User> getUsers();
}
