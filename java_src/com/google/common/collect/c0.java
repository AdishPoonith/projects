package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class c0 {

    /* loaded from: classes.dex */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: o  reason: collision with root package name */
        transient b5.t<? extends List<V>> f5955o;

        a(Map<K, Collection<V>> map, b5.t<? extends List<V>> tVar) {
            super(map);
            this.f5955o = (b5.t) b5.n.n(tVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f5955o = (b5.t) objectInputStream.readObject();
            v((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f5955o);
            objectOutputStream.writeObject(o());
        }

        @Override // com.google.common.collect.f
        Map<K, Collection<V>> c() {
            return r();
        }

        @Override // com.google.common.collect.f
        Set<K> d() {
            return s();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d
        /* renamed from: z */
        public List<V> p() {
            return this.f5955o.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(z<?, ?> zVar, Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof z) {
            return zVar.a().equals(((z) obj).a());
        }
        return false;
    }

    public static <K, V> v<K, V> b(Map<K, Collection<V>> map, b5.t<? extends List<V>> tVar) {
        return new a(map, tVar);
    }
}
