package me.csdad.lagtopia.corelib.Chat;

import org.bukkit.ChatColor;

/**
 * Utility class meant to handle any type of color, text, or chat message formatting.
 */
public class Color {

    /**
     * Method that will translate color codes in an input string to spigot cc literals.
     * @param message The message to translate
     * @return Translated "colorified" message
     */
    public static String translate(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    /**
     * Method that will strip color codes from an input string
     * @param message The message to strip
     * @return Translated stripped message
     */
    public static String strip(String message) {
        return ChatColor.stripColor(message);
    }

    /**
     * Method that will strip color codes from a string, and then convert the string to an array.
     * Takes a specified regex split definition.
     * @param message Message to split
     * @param regex Regex to split on
     * @return split message
     */
    public static String[] splice(String message, String regex) {

        return strip(message).split(regex);

    }
}
