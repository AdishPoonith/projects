package fa;

import java.io.Serializable;
import kotlin.jvm.internal.g;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f8872j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private static final c f8873k = y9.b.f20628a.b();

    /* loaded from: classes.dex */
    public static final class a extends c implements Serializable {

        /* renamed from: fa.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0145a implements Serializable {

            /* renamed from: j  reason: collision with root package name */
            public static final C0145a f8874j = new C0145a();

            private C0145a() {
            }

            private final Object readResolve() {
                return c.f8872j;
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final Object writeReplace() {
            return C0145a.f8874j;
        }

        @Override // fa.c
        public int b(int i10) {
            return c.f8873k.b(i10);
        }

        @Override // fa.c
        public int c() {
            return c.f8873k.c();
        }

        @Override // fa.c
        public int d(int i10) {
            return c.f8873k.d(i10);
        }

        @Override // fa.c
        public int e(int i10, int i11) {
            return c.f8873k.e(i10, i11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public int e(int i10, int i11) {
        int c10;
        int i12;
        int i13;
        int c11;
        boolean z10;
        d.b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i13 = b(d.c(i14));
            } else {
                do {
                    c10 = c() >>> 1;
                    i12 = c10 % i14;
                } while ((c10 - i12) + (i14 - 1) < 0);
                i13 = i12;
            }
            return i10 + i13;
        }
        do {
            c11 = c();
            z10 = false;
            if (i10 <= c11 && c11 < i11) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return c11;
    }
}
