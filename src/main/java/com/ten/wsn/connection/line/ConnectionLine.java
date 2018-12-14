package com.ten.wsn.connection.line;

import com.ten.wsn.connection.calculate.NRMValue;

import java.util.ArrayList;

/**
 * N曲线的集合：N曲线本身为ArrayList类型
 */
public class ConnectionLine extends ArrayList<NRMValue> {
    //所有n的连通率曲线集合
    private static ArrayList<ConnectionLine> r_list = new ArrayList<ConnectionLine>();

    public ConnectionLine() {
        r_list.add(this);
    }

    public static ArrayList<ConnectionLine> getrList() {
        return r_list;
    }
}
