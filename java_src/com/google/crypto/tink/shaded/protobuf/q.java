package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6286b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile q f6287c;

    /* renamed from: d  reason: collision with root package name */
    static final q f6288d = new q(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, z.e<?, ?>> f6289a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f6290a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6291b;

        a(Object obj, int i10) {
            this.f6290a = obj;
            this.f6291b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f6290a == aVar.f6290a && this.f6291b == aVar.f6291b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f6290a) * 65535) + this.f6291b;
        }
    }

    q() {
        this.f6289a = new HashMap();
    }

    q(boolean z10) {
        this.f6289a = Collections.emptyMap();
    }

    public static q b() {
        q qVar = f6287c;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f6287c;
                if (qVar == null) {
                    qVar = f6286b ? p.a() : f6288d;
                    f6287c = qVar;
                }
            }
        }
        return qVar;
    }

    public <ContainingType extends s0> z.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (z.e<ContainingType, ?>) this.f6289a.get(new a(containingtype, i10));
    }
}
