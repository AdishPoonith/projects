package com.google.protobuf;

import com.google.protobuf.b2;
/* loaded from: classes.dex */
public class o0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f7266a;

    /* renamed from: b  reason: collision with root package name */
    private final K f7267b;

    /* renamed from: c  reason: collision with root package name */
    private final V f7268c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final b2.b f7269a;

        /* renamed from: b  reason: collision with root package name */
        public final K f7270b;

        /* renamed from: c  reason: collision with root package name */
        public final b2.b f7271c;

        /* renamed from: d  reason: collision with root package name */
        public final V f7272d;

        public a(b2.b bVar, K k10, b2.b bVar2, V v10) {
            this.f7269a = bVar;
            this.f7270b = k10;
            this.f7271c = bVar2;
            this.f7272d = v10;
        }
    }

    private o0(b2.b bVar, K k10, b2.b bVar2, V v10) {
        this.f7266a = new a<>(bVar, k10, bVar2, v10);
        this.f7267b = k10;
        this.f7268c = v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k10, V v10) {
        return v.d(aVar.f7269a, 1, k10) + v.d(aVar.f7271c, 2, v10);
    }

    public static <K, V> o0<K, V> d(b2.b bVar, K k10, b2.b bVar2, V v10) {
        return new o0<>(bVar, k10, bVar2, v10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void e(l lVar, a<K, V> aVar, K k10, V v10) {
        v.A(lVar, aVar.f7269a, 1, k10);
        v.A(lVar, aVar.f7271c, 2, v10);
    }

    public int a(int i10, K k10, V v10) {
        return l.V(i10) + l.D(b(this.f7266a, k10, v10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f7266a;
    }
}
