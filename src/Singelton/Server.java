package Singelton;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Server {
    INSTANCE;

    private Set<String> servers = new HashSet<>();

    public boolean dodaj(String nazwaSerwera){
        if (sprawdzSerwer(nazwaSerwera)) {
            return servers.add(nazwaSerwera);
        }
        return false;
    }

    private boolean sprawdzSerwer(String nazwaSerwera) {
        String nazwaSerweraTemp = nazwaSerwera.toLowerCase();
        if (!nazwaSerweraTemp.isEmpty()) {
            return nazwaSerweraTemp.startsWith("http") || nazwaSerweraTemp.startsWith("https");
        }
        return false;
    }

    private boolean isHttp(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("http");
    }

    private boolean isHttps(String nazwaSerwera) {
        return nazwaSerwera.toLowerCase().startsWith("https");
    }



    public Set<String> getHttpList() {
        Set<String> serversHttp = new HashSet<>();
        for (String server : servers) {
            if (!isHttps(server)) {
                serversHttp.add(server);
            }
        }
        return serversHttp;
    }

}
