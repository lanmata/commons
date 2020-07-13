package com.prx.commons.util;

import com.prx.commons.enums.keys.SizeKey;
import com.prx.commons.pojo.SizeDescriptor;

public class FileUtil {

    /**
     * Retona el peso de un archivo
     *
     * @param ordinalSize Objeto de tipo int
     * @param size Objeto de tipo long
     * @return Objeto de tipo {@link SizeDescriptor}
     */
    public static SizeDescriptor getSizeDescriptor(int ordinalSize, long size){
        long result = size / 1024L;
        SizeDescriptor sizeDescriptor;

        if(result > 8L){
            sizeDescriptor = getSizeDescriptor((ordinalSize+1), result);
        }else {
            sizeDescriptor = new SizeDescriptor(SizeKey.values()[ordinalSize], size);

        }

        return sizeDescriptor;
    }
}
