package com.itxiaoqiang.arithmetic;

import java.util.HashMap;

public class demo02 {

    abstract class flywei {
    }

    public class Flyweight extends flywei {
        Object obj;

        public Flyweight(Object obj) {
            this.obj = obj;
        }
    }

    class FlyweightFactory {
        private HashMap<Object, Flyweight> data;

        public FlyweightFactory() {
            data = new HashMap<>();
        }

        public Flyweight getFlyweight(Object object) {
            if (data.containsKey(object)) {
                return data.get(object);
            } else {
                Flyweight flyweight = new Flyweight(object);
                data.put(object, flyweight);
                return flyweight;
            }
        }
    }


}
