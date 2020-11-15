package org.bing.learn.数据结构.集合;

public interface Map<K,V> {
    boolean isEmpty();
    int getSize();
    boolean contains(K key);
    void put(K key, V value);
    void set(K key, V value);
    V get(K key);
    V remove(K key);
}
