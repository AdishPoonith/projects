package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class h0 extends i0 {

    /* renamed from: f  reason: collision with root package name */
    private final v0 f7137f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: j  reason: collision with root package name */
        private Map.Entry<K, h0> f7138j;

        private b(Map.Entry<K, h0> entry) {
            this.f7138j = entry;
        }

        public h0 a() {
            return this.f7138j.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7138j.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            h0 value = this.f7138j.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof v0) {
                return this.f7138j.getValue().d((v0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: j  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f7139j;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f7139j = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f7139j.next();
            return next.getValue() instanceof h0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7139j.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7139j.remove();
        }
    }

    @Override // com.google.protobuf.i0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public v0 f() {
        return c(this.f7137f);
    }

    @Override // com.google.protobuf.i0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
