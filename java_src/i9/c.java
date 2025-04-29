package i9;

import b5.h;
import i9.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: k  reason: collision with root package name */
    public static final c f9834k;

    /* renamed from: a  reason: collision with root package name */
    private final t f9835a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f9836b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9837c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.b f9838d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9839e;

    /* renamed from: f  reason: collision with root package name */
    private final Object[][] f9840f;

    /* renamed from: g  reason: collision with root package name */
    private final List<k.a> f9841g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f9842h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f9843i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f9844j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        t f9845a;

        /* renamed from: b  reason: collision with root package name */
        Executor f9846b;

        /* renamed from: c  reason: collision with root package name */
        String f9847c;

        /* renamed from: d  reason: collision with root package name */
        i9.b f9848d;

        /* renamed from: e  reason: collision with root package name */
        String f9849e;

        /* renamed from: f  reason: collision with root package name */
        Object[][] f9850f;

        /* renamed from: g  reason: collision with root package name */
        List<k.a> f9851g;

        /* renamed from: h  reason: collision with root package name */
        Boolean f9852h;

        /* renamed from: i  reason: collision with root package name */
        Integer f9853i;

        /* renamed from: j  reason: collision with root package name */
        Integer f9854j;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c b() {
            return new c(this);
        }
    }

    /* renamed from: i9.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0162c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f9855a;

        /* renamed from: b  reason: collision with root package name */
        private final T f9856b;

        private C0162c(String str, T t10) {
            this.f9855a = str;
            this.f9856b = t10;
        }

        public static <T> C0162c<T> b(String str) {
            b5.n.o(str, "debugString");
            return new C0162c<>(str, null);
        }

        public String toString() {
            return this.f9855a;
        }
    }

    static {
        b bVar = new b();
        bVar.f9850f = (Object[][]) Array.newInstance(Object.class, 0, 2);
        bVar.f9851g = Collections.emptyList();
        f9834k = bVar.b();
    }

    private c(b bVar) {
        this.f9835a = bVar.f9845a;
        this.f9836b = bVar.f9846b;
        this.f9837c = bVar.f9847c;
        this.f9838d = bVar.f9848d;
        this.f9839e = bVar.f9849e;
        this.f9840f = bVar.f9850f;
        this.f9841g = bVar.f9851g;
        this.f9842h = bVar.f9852h;
        this.f9843i = bVar.f9853i;
        this.f9844j = bVar.f9854j;
    }

    private static b k(c cVar) {
        b bVar = new b();
        bVar.f9845a = cVar.f9835a;
        bVar.f9846b = cVar.f9836b;
        bVar.f9847c = cVar.f9837c;
        bVar.f9848d = cVar.f9838d;
        bVar.f9849e = cVar.f9839e;
        bVar.f9850f = cVar.f9840f;
        bVar.f9851g = cVar.f9841g;
        bVar.f9852h = cVar.f9842h;
        bVar.f9853i = cVar.f9843i;
        bVar.f9854j = cVar.f9844j;
        return bVar;
    }

    public String a() {
        return this.f9837c;
    }

    public String b() {
        return this.f9839e;
    }

    public i9.b c() {
        return this.f9838d;
    }

    public t d() {
        return this.f9835a;
    }

    public Executor e() {
        return this.f9836b;
    }

    public Integer f() {
        return this.f9843i;
    }

    public Integer g() {
        return this.f9844j;
    }

    public <T> T h(C0162c<T> c0162c) {
        b5.n.o(c0162c, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f9840f;
            if (i10 >= objArr.length) {
                return (T) ((C0162c) c0162c).f9856b;
            }
            if (c0162c.equals(objArr[i10][0])) {
                return (T) this.f9840f[i10][1];
            }
            i10++;
        }
    }

    public List<k.a> i() {
        return this.f9841g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f9842h);
    }

    public c l(i9.b bVar) {
        b k10 = k(this);
        k10.f9848d = bVar;
        return k10.b();
    }

    public c m(t tVar) {
        b k10 = k(this);
        k10.f9845a = tVar;
        return k10.b();
    }

    public c n(Executor executor) {
        b k10 = k(this);
        k10.f9846b = executor;
        return k10.b();
    }

    public c o(int i10) {
        b5.n.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f9853i = Integer.valueOf(i10);
        return k10.b();
    }

    public c p(int i10) {
        b5.n.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f9854j = Integer.valueOf(i10);
        return k10.b();
    }

    public <T> c q(C0162c<T> c0162c, T t10) {
        b5.n.o(c0162c, "key");
        b5.n.o(t10, "value");
        b k10 = k(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f9840f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            } else if (c0162c.equals(objArr[i10][0])) {
                break;
            } else {
                i10++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f9840f.length + (i10 == -1 ? 1 : 0), 2);
        k10.f9850f = objArr2;
        Object[][] objArr3 = this.f9840f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            Object[][] objArr4 = k10.f9850f;
            int length = this.f9840f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = c0162c;
            objArr5[1] = t10;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = k10.f9850f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = c0162c;
            objArr7[1] = t10;
            objArr6[i10] = objArr7;
        }
        return k10.b();
    }

    public c r(k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f9841g.size() + 1);
        arrayList.addAll(this.f9841g);
        arrayList.add(aVar);
        b k10 = k(this);
        k10.f9851g = Collections.unmodifiableList(arrayList);
        return k10.b();
    }

    public c s() {
        b k10 = k(this);
        k10.f9852h = Boolean.TRUE;
        return k10.b();
    }

    public c t() {
        b k10 = k(this);
        k10.f9852h = Boolean.FALSE;
        return k10.b();
    }

    public String toString() {
        h.b d10 = b5.h.c(this).d("deadline", this.f9835a).d("authority", this.f9837c).d("callCredentials", this.f9838d);
        Executor executor = this.f9836b;
        return d10.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f9839e).d("customOptions", Arrays.deepToString(this.f9840f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f9843i).d("maxOutboundMessageSize", this.f9844j).d("streamTracerFactories", this.f9841g).toString();
    }
}
