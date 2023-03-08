/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author nguye
 */
import java.util.Scanner;

public class TestUserprofile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, genre;
        
        System.out.println("Welcome to the userProfile creation process!");
        
        // get user's name
        System.out.print("Enter your name: ");
        userName = scanner.nextLine();
        
        // display available genres and get user's choice
        System.out.println("Please choose your favourite genre from the following options:");
        for (int i = 0; i < UserProfile.genres.length; i++) {
            System.out.println((i + 1) + ". " + UserProfile.genres[i]);
        }
        System.out.print("Enter the number of your favourite genre: ");
        int choice = scanner.nextInt();
        genre = UserProfile.genres[choice - 1];
        
        // create userProfile and display success message
        UserProfile userProfile = new UserProfile(userName, genre);
        System.out.println("Congratulations " + userName + ", your userProfile was created!");
    }
}