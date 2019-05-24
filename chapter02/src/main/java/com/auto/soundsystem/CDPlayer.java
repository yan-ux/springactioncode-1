package com.auto.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Autowired可以在构造体中，也可以在set方法上，或其他任意方法上；
 *
 * @author dongmei.gao
 * @date 2019/5/21 10:55
 */
@Component
public class CDPlayer implements MediaPlayer{
    /** CDPlayer依赖另外一个属性要注入 **/
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void player() {
      cd.play();
    }

    public CompactDisc getCd() {
        return cd;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
