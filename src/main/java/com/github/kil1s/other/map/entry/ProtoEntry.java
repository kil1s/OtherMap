package com.github.kil1s.other.map.entry;

public abstract class ProtoEntry<K> implements MapEntry {
    public abstract K getKey();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntry<?, ?> that = (BaseEntry<?, ?>) o;
        return getKey().equals(that.getKey());
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + (getKey() == null ? 0 : getKey().hashCode());
        return hash;
    }
}
