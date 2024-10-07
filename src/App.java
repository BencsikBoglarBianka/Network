/*
* File: App.java
* Author: Bencsik Boglár Bianka
* Copyright: 2024, Bencsik Boglár Bianka
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/BencsikBoglarBianka/Network
* Licenc: GNU GPL
*/
public class App {
    public static void main(String[] args) throws Exception {
        ConnectionManager manager = new ConnectionManager();
        manager.GoodConnection("Network");
        manager.terminateConnection();
    }
}