package com.prx.commons.pojo;

import static com.prx.commons.util.JsonUtil.toJson;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public class SocialContact {
    
    @Override
    public String toString(){
        return toJson(this);
    }
}
