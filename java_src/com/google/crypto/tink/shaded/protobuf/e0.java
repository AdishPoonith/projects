package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    private final s0 f6162f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: j  reason: collision with root package name */
        private Map.Entry<K, e0> f6163j;

        private b(Map.Entry<K, e0> entry) {
            this.f6163j = entry;
        }

        public e0 a() {
            return this.f6163j.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f6163j.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            e0 value = this.f6163j.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f6163j.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: j  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f6164j;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f6164j = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f6164j.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6164j.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6164j.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f6162f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
