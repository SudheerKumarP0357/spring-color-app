package com.example.colorapp.service;

import org.springframework.stereotype.Service;
import java.util.Random;
import java.awt.Color;

@Service
public class ColorService {
    private static final String HEX_CHARS = "0123456789ABCDEF";
    private final Random random = new Random();

    public String getRandomColorHex() {
        StringBuilder hexColor = new StringBuilder("#");
        for (int i = 0; i < 6; i++) {
            hexColor.append(HEX_CHARS.charAt(random.nextInt(HEX_CHARS.length())));
        }
        return hexColor.toString();
    }

    public String getRandomColorName() {
        String hex = getRandomColorHex();
        return findClosestColorName(hex);
    }

    public String findClosestColorName(String hex) {
        return hex.substring(1);
    }

    public String getColorNameFromHex(String hex) {
        return findClosestColorName(hex);
    }
}