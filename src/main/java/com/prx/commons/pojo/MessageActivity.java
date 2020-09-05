package com.prx.commons.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 * Se utiliza para describir las acciones o ejecuciones realizadas y el resultado de ellas para informar a los componentes
 * que lo requieran
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageActivity implements Serializable {
    /**
     * Campo conpuesto por clave-valor, donde la clave es el codigo y valor es el mensaje que se informa
     */
    private Map<Integer, String> messages = new ConcurrentHashMap<>();
    /**
     * Objeto respuesta esperado
     */
    private Object objectResponse;

    public String toString(){
        return toJson(this);
    }
}
