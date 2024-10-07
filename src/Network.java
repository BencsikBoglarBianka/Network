/*
* File: Network.java
* Author: Bencsik Boglár Bianka
* Copyright: 2024, Bencsik Boglár Bianka
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/BencsikBoglarBianka/Network
* Licenc: GNU GPL
*/
class ConnectionManager {
    public void GoodConnection(String networkName) {
        System.out.println("Csatlakozás " + networkName + "..");
        
    }

    public void terminateConnection() {
        System.out.println("Szétkapcsolás..");
        
    }
}