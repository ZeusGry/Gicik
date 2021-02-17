package kolekcje.listy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");
        lista.add("ble ble ble");


    }

    public static void zduplikowane(List<String> lista) {
        List<String> tempList = new ArrayList<>();
        for (String s : lista) {
            if(lista.indexOf(s) != lista.lastIndexOf(s) && !tempList.contains(s)) {
                tempList.add(s);
            }
        }
        for (String s : tempList) {
            System.out.println(s);
        }
    }



    public static void usunZduplikowane(List<String> lista) {
        for (int i = lista.size()-1; i >=0; i--) {
            if (lista.indexOf(lista.get(i)) != i) {
                lista.remove(i);
            }
        }
    }

}