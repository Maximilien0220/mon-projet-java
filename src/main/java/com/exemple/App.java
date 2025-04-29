package com.exemple;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String mot = "bonjour";
        
        if (StringUtils.isNotBlank(mot)) {
            System.out.println("Le mot n'est pas vide : " + mot.toUpperCase());
        } else {
            System.out.println("Le mot est vide !");
        }
    }
}
