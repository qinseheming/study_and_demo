package com.yangmao.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yang
 */
public class MyAggregate<String> {

    private List<String> list = new ArrayList<>();

    public void add(String data) {
        list.add(data);
    }

    public void remove(String data) {
        list.remove(data);
    }


    private class ConcreteIterator implements MyIterator<String> {

        private int cursor = 0;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void last() {
            cursor = list.size() - 1;
        }

        @Override
        public String next() {
            String result = list.get(cursor);
            cursor++;
            return result;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size() - 1;
        }
    }
}
