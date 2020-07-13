package com.prx.commons.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Definicion de clase abstracta para conversion entre dos tipos de objetos
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 * @param <P>
 * @param <R>
 */
public abstract class Converter<P, R> {

    protected Function<P, R> fromPojo;
    protected Function<R, P> fromDO;

    protected abstract void initFunction();

    protected void setFunction(final Function<P, R> fromPojo, final Function<R, P> fromDO) {
        this.fromPojo = fromPojo;
        this.fromDO = fromDO;
    }

    public final P convertFromDataObject(final R dataObject) {
        return fromDO.apply(dataObject);
    }

    public final R convertFromPojo(final P pojo) {
        return fromPojo.apply(pojo);
    }

    public final List<P> createFromDataObject(final Collection<R> dataObjects) {
        return dataObjects.stream().map(this::convertFromDataObject).collect(Collectors.toList());
    }

    public final List<R> createFromPojo(final Collection<P> pojos) {
        return pojos.stream().map(this::convertFromPojo).collect(Collectors.toList());
    }

}
