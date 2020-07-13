package com.prx.commons.event;

import com.prx.commons.pojo.DataValueMarket;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * Clase para manejo de evento programado, realiza la obtención y procesamiento
 * de los datos pertenecientes a los valores publicados por el mercado
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
public class DataValueMarketTimeEvent extends ApplicationEvent {

    @Getter
    private final List<DataValueMarket> dataValueMarkets;

    /**
     *
     * @param source Objeto de tipo {@link Object}, referencia a la fuente o procedencia del evento.
     * @param dataValueMarkets Objeto de tipo {@link List}<{@link DataValueMarket}>. Contiene una lista de
     *                         con los valores de mercado.
     */
    public DataValueMarketTimeEvent(Object source, List<DataValueMarket> dataValueMarkets) {
        super(source);
        this.dataValueMarkets = dataValueMarkets;
    }

}
