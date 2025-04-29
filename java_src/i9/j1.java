package i9;

import b5.h;
import i9.y0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f9921d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final List<j1> f9922e = f();

    /* renamed from: f  reason: collision with root package name */
    public static final j1 f9923f = b.OK.g();

    /* renamed from: g  reason: collision with root package name */
    public static final j1 f9924g = b.CANCELLED.g();

    /* renamed from: h  reason: collision with root package name */
    public static final j1 f9925h = b.UNKNOWN.g();

    /* renamed from: i  reason: collision with root package name */
    public static final j1 f9926i = b.INVALID_ARGUMENT.g();

    /* renamed from: j  reason: collision with root package name */
    public static final j1 f9927j = b.DEADLINE_EXCEEDED.g();

    /* renamed from: k  reason: collision with root package name */
    public static final j1 f9928k = b.NOT_FOUND.g();

    /* renamed from: l  reason: collision with root package name */
    public static final j1 f9929l = b.ALREADY_EXISTS.g();

    /* renamed from: m  reason: collision with root package name */
    public static final j1 f9930m = b.PERMISSION_DENIED.g();

    /* renamed from: n  reason: collision with root package name */
    public static final j1 f9931n = b.UNAUTHENTICATED.g();

    /* renamed from: o  reason: collision with root package name */
    public static final j1 f9932o = b.RESOURCE_EXHAUSTED.g();

    /* renamed from: p  reason: collision with root package name */
    public static final j1 f9933p = b.FAILED_PRECONDITION.g();

    /* renamed from: q  reason: collision with root package name */
    public static final j1 f9934q = b.ABORTED.g();

    /* renamed from: r  reason: collision with root package name */
    public static final j1 f9935r = b.OUT_OF_RANGE.g();

    /* renamed from: s  reason: collision with root package name */
    public static final j1 f9936s = b.UNIMPLEMENTED.g();

    /* renamed from: t  reason: collision with root package name */
    public static final j1 f9937t = b.INTERNAL.g();

    /* renamed from: u  reason: collision with root package name */
    public static final j1 f9938u = b.UNAVAILABLE.g();

    /* renamed from: v  reason: collision with root package name */
    public static final j1 f9939v = b.DATA_LOSS.g();

    /* renamed from: w  reason: collision with root package name */
    static final y0.g<j1> f9940w = y0.g.g("grpc-status", false, new c());

    /* renamed from: x  reason: collision with root package name */
    private static final y0.j<String> f9941x;

    /* renamed from: y  reason: collision with root package name */
    static final y0.g<String> f9942y;

    /* renamed from: a  reason: collision with root package name */
    private final b f9943a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9944b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f9945c;

    /* loaded from: classes.dex */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f9961j;

        /* renamed from: k  reason: collision with root package name */
        private final byte[] f9962k;

        b(int i10) {
            this.f9961j = i10;
            this.f9962k = Integer.toString(i10).getBytes(b5.d.f2948a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] i() {
            return this.f9962k;
        }

        public j1 g() {
            return (j1) j1.f9922e.get(this.f9961j);
        }

        public int h() {
            return this.f9961j;
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements y0.j<j1> {
        private c() {
        }

        @Override // i9.y0.j
        /* renamed from: c */
        public j1 b(byte[] bArr) {
            return j1.i(bArr);
        }

        @Override // i9.y0.j
        /* renamed from: d */
        public byte[] a(j1 j1Var) {
            return j1Var.m().i();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements y0.j<String> {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f9963a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, b5.d.f2948a), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i10]);
                i10++;
            }
            return new String(allocate.array(), 0, allocate.position(), b5.d.f2950c);
        }

        private static byte[] g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[((bArr.length - i10) * 3) + i10];
            if (i10 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i11 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (c(b10)) {
                    bArr2[i11] = 37;
                    byte[] bArr3 = f9963a;
                    bArr2[i11 + 1] = bArr3[(b10 >> 4) & 15];
                    bArr2[i11 + 2] = bArr3[b10 & 15];
                    i11 += 3;
                } else {
                    bArr2[i11] = b10;
                    i11++;
                }
                i10++;
            }
            return Arrays.copyOf(bArr2, i11);
        }

        @Override // i9.y0.j
        /* renamed from: d */
        public String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // i9.y0.j
        /* renamed from: f */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(b5.d.f2950c);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (c(bytes[i10])) {
                    return g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        d dVar = new d();
        f9941x = dVar;
        f9942y = y0.g.g("grpc-message", false, dVar);
    }

    private j1(b bVar) {
        this(bVar, null, null);
    }

    private j1(b bVar, String str, Throwable th) {
        this.f9943a = (b) b5.n.o(bVar, "code");
        this.f9944b = str;
        this.f9945c = th;
    }

    private static List<j1> f() {
        b[] values;
        j1 j1Var;
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            if (((j1) treeMap.put(Integer.valueOf(bVar.h()), new j1(bVar))) != null) {
                throw new IllegalStateException("Code value duplication between " + j1Var.m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(j1 j1Var) {
        if (j1Var.f9944b == null) {
            return j1Var.f9943a.toString();
        }
        return j1Var.f9943a + ": " + j1Var.f9944b;
    }

    public static j1 h(int i10) {
        if (i10 >= 0) {
            List<j1> list = f9922e;
            if (i10 <= list.size()) {
                return list.get(i10);
            }
        }
        j1 j1Var = f9925h;
        return j1Var.q("Unknown code " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j1 i(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] == 48) ? f9923f : j(bArr);
    }

    private static j1 j(byte[] bArr) {
        int i10;
        int length = bArr.length;
        char c10 = 1;
        if (length != 1) {
            i10 = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
            j1 j1Var = f9925h;
            return j1Var.q("Unknown code " + new String(bArr, b5.d.f2948a));
        }
        c10 = 0;
        if (bArr[c10] >= 48 && bArr[c10] <= 57) {
            int i11 = i10 + (bArr[c10] - 48);
            List<j1> list = f9922e;
            if (i11 < list.size()) {
                return list.get(i11);
            }
        }
        j1 j1Var2 = f9925h;
        return j1Var2.q("Unknown code " + new String(bArr, b5.d.f2948a));
    }

    public static j1 k(Throwable th) {
        for (Throwable th2 = (Throwable) b5.n.o(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof k1) {
                return ((k1) th2).a();
            }
            if (th2 instanceof l1) {
                return ((l1) th2).a();
            }
        }
        return f9925h.p(th);
    }

    public k1 c() {
        return new k1(this);
    }

    public l1 d() {
        return new l1(this);
    }

    public j1 e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f9944b == null) {
            return new j1(this.f9943a, str, this.f9945c);
        }
        b bVar = this.f9943a;
        return new j1(bVar, this.f9944b + "\n" + str, this.f9945c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable l() {
        return this.f9945c;
    }

    public b m() {
        return this.f9943a;
    }

    public String n() {
        return this.f9944b;
    }

    public boolean o() {
        return b.OK == this.f9943a;
    }

    public j1 p(Throwable th) {
        return b5.j.a(this.f9945c, th) ? this : new j1(this.f9943a, this.f9944b, th);
    }

    public j1 q(String str) {
        return b5.j.a(this.f9944b, str) ? this : new j1(this.f9943a, str, this.f9945c);
    }

    public String toString() {
        h.b d10 = b5.h.c(this).d("code", this.f9943a.name()).d("description", this.f9944b);
        Throwable th = this.f9945c;
        String str = th;
        if (th != null) {
            str = b5.u.e(th);
        }
        return d10.d("cause", str).toString();
    }
}
