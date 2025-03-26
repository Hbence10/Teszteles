package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        * 3 szetvalasztott resz: Web Pages, Page Objects, Test Scripts
        * Object Model = Design Pattern --> componentkent van hasznalva (hasonlo angularhoz)
        * AUT --> application under test
        * Object Modelnel taroljuk az oldal elemeit valtozok formajaban, a functionnok meg a valtozokkal fognak majd dolgozni
        *
        * Elonyok:
        *       - reusability
        *       - readability
        *       - maintainability
        *
        * A test scriptekbe nem szabad lennie WebDriver API-oknak, viszont az assertionoket a test scriptbe kell irni
        * A Test scriptet ellenorizzuk es nem a Page Object-eket
        * */
        System.out.println("Hello, World!");
    }
}