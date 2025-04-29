package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f6358d = new v(true);

    /* renamed from: a  reason: collision with root package name */
    private final k1<T, Object> f6359a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6360b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6361c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6362a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6363b;

        static {
            int[] iArr = new int[u1.b.values().length];
            f6363b = iArr;
            try {
                iArr[u1.b.f6330l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6363b[u1.b.f6331m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6363b[u1.b.f6332n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6363b[u1.b.f6333o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6363b[u1.b.f6334p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6363b[u1.b.f6335q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6363b[u1.b.f6336r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6363b[u1.b.f6337s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6363b[u1.b.f6339u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6363b[u1.b.f6340v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6363b[u1.b.f6338t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6363b[u1.b.f6341w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6363b[u1.b.f6342x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6363b[u1.b.f6344z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6363b[u1.b.A.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6363b[u1.b.B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6363b[u1.b.C.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6363b[u1.b.f6343y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[u1.c.values().length];
            f6362a = iArr2;
            try {
                iArr2[u1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6362a[u1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6362a[u1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6362a[u1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6362a[u1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6362a[u1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6362a[u1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6362a[u1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6362a[u1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int a();

        boolean c();

        u1.b d();

        u1.c e();

        boolean f();

        s0.a m(s0.a aVar, s0 s0Var);
    }

    private v() {
        this.f6359a = k1.q(16);
    }

    private v(k1<T, Object> k1Var) {
        this.f6359a = k1Var;
        s();
    }

    private v(boolean z10) {
        this(k1.q(0));
        s();
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

    static int d(u1.b bVar, int i10, Object obj) {
        int U = l.U(i10);
        if (bVar == u1.b.f6339u) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(u1.b bVar, Object obj) {
        switch (a.f6363b[bVar.ordinal()]) {
            case 1:
                return l.j(((Double) obj).doubleValue());
            case 2:
                return l.r(((Float) obj).floatValue());
            case 3:
                return l.y(((Long) obj).longValue());
            case 4:
                return l.Y(((Long) obj).longValue());
            case 5:
                return l.w(((Integer) obj).intValue());
            case 6:
                return l.p(((Long) obj).longValue());
            case 7:
                return l.n(((Integer) obj).intValue());
            case 8:
                return l.e(((Boolean) obj).booleanValue());
            case 9:
                return l.t((s0) obj);
            case 10:
                return obj instanceof e0 ? l.B((e0) obj) : l.G((s0) obj);
            case 11:
                return obj instanceof i ? l.h((i) obj) : l.T((String) obj);
            case 12:
                return obj instanceof i ? l.h((i) obj) : l.f((byte[]) obj);
            case 13:
                return l.W(((Integer) obj).intValue());
            case 14:
                return l.L(((Integer) obj).intValue());
            case 15:
                return l.N(((Long) obj).longValue());
            case 16:
                return l.P(((Integer) obj).intValue());
            case 17:
                return l.R(((Long) obj).longValue());
            case 18:
                return obj instanceof b0.c ? l.l(((b0.c) obj).a()) : l.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u1.b d10 = bVar.d();
        int a10 = bVar.a();
        if (bVar.c()) {
            int i10 = 0;
            List<Object> list = (List) obj;
            if (bVar.f()) {
                for (Object obj2 : list) {
                    i10 += e(d10, obj2);
                }
                return l.U(a10) + i10 + l.J(i10);
            }
            for (Object obj3 : list) {
                i10 += d(d10, a10, obj3);
            }
            return i10;
        }
        return d(d10, a10, obj);
    }

    public static <T extends b<T>> v<T> h() {
        return f6358d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.e() != u1.c.MESSAGE || key.c() || key.f()) {
            return f(key, value);
        }
        boolean z10 = value instanceof e0;
        int a10 = entry.getKey().a();
        return z10 ? l.z(a10, (e0) value) : l.D(a10, (s0) value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e() == u1.c.MESSAGE) {
            boolean c10 = key.c();
            Object value = entry.getValue();
            if (c10) {
                for (s0 s0Var : (List) value) {
                    if (!s0Var.j()) {
                        return false;
                    }
                }
            } else if (!(value instanceof s0)) {
                if (value instanceof e0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((s0) value).j()) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(u1.b bVar, Object obj) {
        b0.a(obj);
        switch (a.f6362a[bVar.b().ordinal()]) {
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
                return (obj instanceof Integer) || (obj instanceof b0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void u(Map.Entry<T, Object> entry) {
        k1<T, Object> k1Var;
        Object c10;
        Object i10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).f();
        }
        if (key.c()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i11).add(c(obj));
            }
            this.f6359a.put(key, i11);
            return;
        }
        if (key.e() != u1.c.MESSAGE || (i10 = i(key)) == null) {
            k1Var = this.f6359a;
            c10 = c(value);
        } else {
            c10 = key.m(((s0) i10).d(), (s0) value).b();
            k1Var = this.f6359a;
        }
        k1Var.put(key, c10);
    }

    public static <T extends b<T>> v<T> v() {
        return new v<>();
    }

    private void x(T t10, Object obj) {
        if (!q(t10.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.a()), t10.d().b(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (!t10.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        x(t10, obj);
        Object i10 = i(t10);
        if (i10 == null) {
            list = new ArrayList();
            this.f6359a.put(t10, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> v10 = v();
        for (int i10 = 0; i10 < this.f6359a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f6359a.j(i10);
            v10.w(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6359a.m()) {
            v10.w(entry.getKey(), entry.getValue());
        }
        v10.f6361c = this.f6361c;
        return v10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f6359a.equals(((v) obj).f6359a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.f6361c ? new e0.c(this.f6359a.h().iterator()) : this.f6359a.h().iterator();
    }

    public int hashCode() {
        return this.f6359a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f6359a.get(t10);
        return obj instanceof e0 ? ((e0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6359a.k(); i11++) {
            i10 += k(this.f6359a.j(i11));
        }
        for (Map.Entry<T, Object> entry : this.f6359a.m()) {
            i10 += k(entry);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6359a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f6359a.j(i11);
            i10 += f(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6359a.m()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f6359a.isEmpty();
    }

    public boolean n() {
        return this.f6360b;
    }

    public boolean o() {
        for (int i10 = 0; i10 < this.f6359a.k(); i10++) {
            if (!p(this.f6359a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f6359a.m()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        return this.f6361c ? new e0.c(this.f6359a.entrySet().iterator()) : this.f6359a.entrySet().iterator();
    }

    public void s() {
        if (this.f6360b) {
            return;
        }
        this.f6359a.p();
        this.f6360b = true;
    }

    public void t(v<T> vVar) {
        for (int i10 = 0; i10 < vVar.f6359a.k(); i10++) {
            u(vVar.f6359a.j(i10));
        }
        for (Map.Entry<T, Object> entry : vVar.f6359a.m()) {
            u(entry);
        }
    }

    public void w(T t10, Object obj) {
        if (!t10.c()) {
            x(t10, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                x(t10, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.f6361c = true;
        }
        this.f6359a.put(t10, obj);
    }
}
