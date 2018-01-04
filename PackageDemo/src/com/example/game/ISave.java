package com.example.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duncan.macleod on 5/8/17.
 */
public interface ISave {

    List<String> write();
    void read(List<String> savedValues);
}
