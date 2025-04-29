package com.google.protobuf;

import com.google.protobuf.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7280b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile q f7281c;

    /* renamed from: d  reason: collision with root package name */
    static final q f7282d = new q(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, z.e<?, ?>> f7283a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f7284a;

        /* renamed from: b  reason: collision with root package name */
        private final int f7285b;

        a(Object obj, int i10) {
            this.f7284a = obj;
            this.f7285b = i10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f7284a == aVar.f7284a && this.f7285b == aVar.f7285b;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7284a) * 65535) + this.f7285b;
        }
    }

    q() {
        this.f7283a = new HashMap();
    }

    q(boolean z10) {
        this.f7283a = Collections.emptyMap();
    }

    public static q b() {
        q qVar = f7281c;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = f7281c;
                if (qVar == null) {
                    qVar = f7280b ? p.a() : f7282d;
                    f7281c = qVar;
                }
            }
        }
        return qVar;
    }

    public <ContainingType extends v0> z.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (z.e<ContainingType, ?>) this.f7283a.get(new a(containingtype, i10));
    }
}
