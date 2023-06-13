package br.edu.fescfafic.poo.Utils;

import br.edu.fescfafic.poo.Interface.InterfaceVerificar;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

public abstract class Mapeamento {
    public static <T extends InterfaceVerificar> T mapeador(Map<String, Object> dados, Class<T> tipoObjeto, UUID idObjeto) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        T objeto = tipoObjeto.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entrada : dados.entrySet()) {
            String key = entrada.getKey();
            Object valor = entrada.getValue();
            System.out.println(key);
            if (key.equals("id")){
                System.out.println("Entando aquo");
                valor = idObjeto;
            }

            try {
                java.lang.reflect.Field campo = tipoObjeto.getDeclaredField(key);
                campo.setAccessible(true);
                campo.set(objeto, valor);
            } catch (NoSuchFieldException e) {
                System.err.println(e.getMessage());
            }
        }

        objeto.setId(idObjeto);

        return objeto;
    }
}

