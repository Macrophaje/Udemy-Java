package com.company;

/**
 * Created by duncan.macleod on 1/2/18.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void trasverse (ListItem root);
}
