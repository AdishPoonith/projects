package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.h0;
import com.google.protobuf.v.b;
import com.google.protobuf.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f7320d = new v(true);

    /* renamed from: a  reason: collision with root package name */
    private final q1<T, Object> f7321a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7322b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7323c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7324a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7325b;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7325b = iArr;
            try {
                iArr[b2.b.f7051l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7325b[b2.b.f7052m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7325b[b2.b.f7053n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7325b[b2.b.f7054o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7325b[b2.b.f7055p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7325b[b2.b.f7056q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7325b[b2.b.f7057r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7325b[b2.b.f7058s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7325b[b2.b.f7060u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7325b[b2.b.f7061v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7325b[b2.b.f7059t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7325b[b2.b.f7062w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7325b[b2.b.f7063x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7325b[b2.b.f7065z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7325b[b2.b.A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7325b[b2.b.B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7325b[b2.b.C.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7325b[b2.b.f7064y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[b2.c.values().length];
            f7324a = iArr2;
            try {
                iArr2[b2.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7324a[b2.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7324a[b2.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7324a[b2.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7324a[b2.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7324a[b2.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7324a[b2.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7324a[b2.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7324a[b2.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int a();

        boolean c();

        b2.b d();

        b2.c e();

        boolean f();

        v0.a j(v0.a aVar, v0 v0Var);
    }

    private v() {
        this.f7321a = q1.q(16);
    }

    private v(q1<T, Object> q1Var) {
        this.f7321a = q1Var;
        u();
    }

    private v(boolean z10) {
        this(q1.q(0));
        u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(l lVar, b2.b bVar, int i10, Object obj) {
        if (bVar == b2.b.f7060u) {
            lVar.A0(i10, (v0) obj);
            return;
        }
        lVar.W0(i10, m(bVar, false));
        B(lVar, bVar, obj);
    }

    static void B(l lVar, b2.b bVar, Object obj) {
        switch (a.f7325b[bVar.ordinal()]) {
            case 1:
                lVar.r0(((Double) obj).doubleValue());
                return;
            case 2:
                lVar.z0(((Float) obj).floatValue());
                return;
            case 3:
                lVar.H0(((Long) obj).longValue());
                return;
            case 4:
                lVar.a1(((Long) obj).longValue());
                return;
            case 5:
                lVar.F0(((Integer) obj).intValue());
                return;
            case 6:
                lVar.x0(((Long) obj).longValue());
                return;
            case 7:
                lVar.v0(((Integer) obj).intValue());
                return;
            case 8:
                lVar.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                lVar.C0((v0) obj);
                return;
            case 10:
                lVar.J0((v0) obj);
                return;
            case 11:
                if (!(obj instanceof i)) {
                    lVar.V0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    lVar.m0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                lVar.Y0(((Integer) obj).intValue());
                return;
            case 14:
                lVar.N0(((Integer) obj).intValue());
                return;
            case 15:
                lVar.P0(((Long) obj).longValue());
                return;
            case 16:
                lVar.R0(((Integer) obj).intValue());
                return;
            case 17:
                lVar.T0(((Long) obj).longValue());
                return;
            case 18:
                lVar.t0(obj instanceof d0.c ? ((d0.c) obj).a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        lVar.p0((i) obj);
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(b2.b bVar, int i10, Object obj) {
        int V = l.V(i10);
        if (bVar == b2.b.f7060u) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(b2.b bVar, Object obj) {
        switch (a.f7325b[bVar.ordinal()]) {
            case 1:
                return l.k(((Double) obj).doubleValue());
            case 2:
                return l.s(((Float) obj).floatValue());
            case 3:
                return l.z(((Long) obj).longValue());
            case 4:
                return l.Z(((Long) obj).longValue());
            case 5:
                return l.x(((Integer) obj).intValue());
            case 6:
                return l.q(((Long) obj).longValue());
            case 7:
                return l.o(((Integer) obj).intValue());
            case 8:
                return l.f(((Boolean) obj).booleanValue());
            case 9:
                return l.u((v0) obj);
            case 10:
                return obj instanceof h0 ? l.C((h0) obj) : l.H((v0) obj);
            case 11:
                return obj instanceof i ? l.i((i) obj) : l.U((String) obj);
            case 12:
                return obj instanceof i ? l.i((i) obj) : l.g((byte[]) obj);
            case 13:
                return l.X(((Integer) obj).intValue());
            case 14:
                return l.M(((Integer) obj).intValue());
            case 15:
                return l.O(((Long) obj).longValue());
            case 16:
                return l.Q(((Integer) obj).intValue());
            case 17:
                return l.S(((Long) obj).longValue());
            case 18:
                return obj instanceof d0.c ? l.m(((d0.c) obj).a()) : l.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        b2.b d10 = bVar.d();
        int a10 = bVar.a();
        if (bVar.c()) {
            int i10 = 0;
            List<Object> list = (List) obj;
            if (bVar.f()) {
                for (Object obj2 : list) {
                    i10 += e(d10, obj2);
                }
                return l.V(a10) + i10 + l.X(i10);
            }
            for (Object obj3 : list) {
                i10 += d(d10, a10, obj3);
            }
            return i10;
        }
        return d(d10, a10, obj);
    }

    public static <T extends b<T>> v<T> h() {
        return f7320d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.e() != b2.c.MESSAGE || key.c() || key.f()) {
            return f(key, value);
        }
        boolean z10 = value instanceof h0;
        int a10 = entry.getKey().a();
        return z10 ? l.A(a10, (h0) value) : l.E(a10, (v0) value);
    }

    static int m(b2.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e() == b2.c.MESSAGE) {
            boolean c10 = key.c();
            Object value = entry.getValue();
            if (c10) {
                for (Object obj : (List) value) {
                    if (!r(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return r(value);
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof w0) {
            return ((w0) obj).j();
        }
        if (obj instanceof h0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(b2.b bVar, Object obj) {
        d0.a(obj);
        switch (a.f7324a[bVar.b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof d0.c);
            case 9:
                return (obj instanceof v0) || (obj instanceof h0);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        q1<T, Object> q1Var;
        Object c10;
        Object i10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof h0) {
            value = ((h0) value).f();
        }
        if (key.c()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i11).add(c(obj));
            }
            this.f7321a.put(key, i11);
            return;
        }
        if (key.e() != b2.c.MESSAGE || (i10 = i(key)) == null) {
            q1Var = this.f7321a;
            c10 = c(value);
        } else {
            c10 = key.j(((v0) i10).d(), (v0) value).b();
            q1Var = this.f7321a;
        }
        q1Var.put(key, c10);
    }

    public static <T extends b<T>> v<T> x() {
        return new v<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.a()), t10.d().b(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (!t10.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t10, obj);
        Object i10 = i(t10);
        if (i10 == null) {
            list = new ArrayList();
            this.f7321a.put(t10, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> x10 = x();
        for (int i10 = 0; i10 < this.f7321a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f7321a.j(i10);
            x10.y(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f7321a.m()) {
            x10.y(entry.getKey(), entry.getValue());
        }
        x10.f7323c = this.f7323c;
        return x10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f7321a.equals(((v) obj).f7321a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.f7323c ? new h0.c(this.f7321a.h().iterator()) : this.f7321a.h().iterator();
    }

    public int hashCode() {
        return this.f7321a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f7321a.get(t10);
        return obj instanceof h0 ? ((h0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7321a.k(); i11++) {
            i10 += k(this.f7321a.j(i11));
        }
        for (Map.Entry<T, Object> entry : this.f7321a.m()) {
            i10 += k(entry);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7321a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f7321a.j(i11);
            i10 += f(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f7321a.m()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f7321a.isEmpty();
    }

    public boolean o() {
        return this.f7322b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f7321a.k(); i10++) {
            if (!q(this.f7321a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f7321a.m()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.f7323c ? new h0.c(this.f7321a.entrySet().iterator()) : this.f7321a.entrySet().iterator();
    }

    public void u() {
        if (this.f7322b) {
            return;
        }
        for (int i10 = 0; i10 < this.f7321a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f7321a.j(i10);
            if (j10.getValue() instanceof z) {
                ((z) j10.getValue()).P();
            }
        }
        this.f7321a.p();
        this.f7322b = true;
    }

    public void v(v<T> vVar) {
        for (int i10 = 0; i10 < vVar.f7321a.k(); i10++) {
            w(vVar.f7321a.j(i10));
        }
        for (Map.Entry<T, Object> entry : vVar.f7321a.m()) {
            w(entry);
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.c()) {
            z(t10, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                z(t10, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof h0) {
            this.f7323c = true;
        }
        this.f7321a.put(t10, obj);
    }
}
