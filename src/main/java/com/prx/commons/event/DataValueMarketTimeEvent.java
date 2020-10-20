/*
 *  @(#)DataValueMarketTimeEvent.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.commons.event;

import com.prx.commons.pojo.DataValueMarket;
import java.util.List;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

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
