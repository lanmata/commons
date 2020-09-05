package com.prx.commons.util;

import com.prx.commons.enums.keys.SizeKey;
import com.prx.commons.pojo.SizeDescriptor;

public final class FileUtil {
    private static final long MIN_RESULT = 8L;
    private static final int ONE_VALUE = 1;
    private static final long BYTE_SIZE = 1024L;

    private FileUtil(){}
    /**
     * Retona el peso de un archivo
     *
     * @param ordinalSize Objeto de tipo int
     * @param size Objeto de tipo long
     * @return Objeto de tipo {@link SizeDescriptor}
     */
    public static SizeDescriptor getSizeDescriptor(int ordinalSize, long size){
        long result = size / BYTE_SIZE;
        SizeDescriptor sizeDescriptor;

        if(result > MIN_RESULT){
            sizeDescriptor = getSizeDescriptor(ordinalSize + ONE_VALUE, result);
        }else {
            sizeDescriptor = new SizeDescriptor(SizeKey.values()[ordinalSize], size);

        }

        return sizeDescriptor;
    }
}