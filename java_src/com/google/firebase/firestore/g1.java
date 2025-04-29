package com.google.firebase.firestore;

import com.google.firebase.firestore.n;
import com.google.protobuf.t1;
import d7.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f6754a;

    /* renamed from: b  reason: collision with root package name */
    private final n.a f6755b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6756a;

        static {
            int[] iArr = new int[n.a.values().length];
            f6756a = iArr;
            try {
                iArr[n.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6756a[n.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g1(FirebaseFirestore firebaseFirestore, n.a aVar) {
        this.f6754a = firebaseFirestore;
        this.f6755b = aVar;
    }

    private List<Object> a(d7.b bVar) {
        ArrayList arrayList = new ArrayList(bVar.n0());
        for (d7.b0 b0Var : bVar.o()) {
            arrayList.add(f(b0Var));
        }
        return arrayList;
    }

    private Object c(d7.b0 b0Var) {
        m6.f h10 = m6.f.h(b0Var.y0());
        m6.l k10 = m6.l.k(b0Var.y0());
        m6.f t10 = this.f6754a.t();
        if (!h10.equals(t10)) {
            q6.v.e("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", k10.r(), h10.k(), h10.i(), t10.k(), t10.i());
        }
        return new m(k10, this.f6754a);
    }

    private Object d(d7.b0 b0Var) {
        int i10 = a.f6756a[this.f6755b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return e(m6.v.a(b0Var));
        }
        d7.b0 b10 = m6.v.b(b0Var);
        if (b10 == null) {
            return null;
        }
        return f(b10);
    }

    private Object e(t1 t1Var) {
        return new w5.q(t1Var.j0(), t1Var.i0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> b(Map<String, d7.b0> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, d7.b0> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), f(entry.getValue()));
        }
        return hashMap;
    }

    public Object f(d7.b0 b0Var) {
        switch (m6.y.G(b0Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(b0Var.r0());
            case 2:
                return b0Var.B0().equals(b0.c.INTEGER_VALUE) ? Long.valueOf(b0Var.w0()) : Double.valueOf(b0Var.u0());
            case 3:
                return e(b0Var.A0());
            case 4:
                return d(b0Var);
            case 5:
                return b0Var.z0();
            case 6:
                return f.g(b0Var.s0());
            case 7:
                return c(b0Var);
            case 8:
                return new d0(b0Var.v0().i0(), b0Var.v0().j0());
            case 9:
                return a(b0Var.q0());
            case 10:
                return b(b0Var.x0().i0());
            default:
                throw q6.b.a("Unknown value type: " + b0Var.B0(), new Object[0]);
        }
    }
}
