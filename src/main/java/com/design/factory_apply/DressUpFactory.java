package com.design.factory_apply;

import com.design.decorator_apply.*;

public class DressUpFactory {

    public DressUp getDressUp(boolean top, boolean bottom, boolean shoes, boolean outwear) {
        DressUp dressUp = new TopDressUp();

        if(bottom) dressUp = new BottomDressUp(dressUp);
        if(shoes) dressUp = new ShoesDressUp(dressUp);
        if(outwear) dressUp = new OutwearDressUp(dressUp);

        return dressUp;
    }
}
