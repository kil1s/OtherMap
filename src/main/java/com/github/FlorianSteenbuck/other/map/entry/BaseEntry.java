package com.github.FlorianSteenbuck.other.map.entry;

public abstract class BaseEntry<K, V> extends ProtoEntry<K> {
    public abstract V getValue();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntry<?, ?> that = (BaseEntry<?, ?>) o;
        return getKey().equals(that.getKey()) &&
                getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + (getKey() == null ? 0 : getKey().hashCode());
        hash = hash * 31 + (getValue() == null ? 0 : getValue().hashCode());
        return hash;
    }
}
