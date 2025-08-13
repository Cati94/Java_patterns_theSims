package theSims.flyweight;

import java.util.HashMap;
public class RoupaFactory {
    private static final HashMap<String, Roupa> roupas = new HashMap<>();
    public static Roupa getRoupa(String modelo) {
        roupas.putIfAbsent(modelo, new Roupa(modelo));
        return roupas.get(modelo);
    }
}