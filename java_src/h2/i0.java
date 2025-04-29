package h2;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface i0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9232a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9233b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f9234c;

        public a(String str, int i10, byte[] bArr) {
            this.f9232a = str;
            this.f9233b = i10;
            this.f9234c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9235a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9236b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f9237c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f9238d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f9235a = i10;
            this.f9236b = str;
            this.f9237c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f9238d = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<i0> a();

        i0 b(int i10, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f9239a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9240b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9241c;

        /* renamed from: d  reason: collision with root package name */
        private int f9242d;

        /* renamed from: e  reason: collision with root package name */
        private String f9243e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f9239a = str;
            this.f9240b = i11;
            this.f9241c = i12;
            this.f9242d = Integer.MIN_VALUE;
            this.f9243e = "";
        }

        private void d() {
            if (this.f9242d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f9242d;
            this.f9242d = i10 == Integer.MIN_VALUE ? this.f9240b : i10 + this.f9241c;
            this.f9243e = this.f9239a + this.f9242d;
        }

        public String b() {
            d();
            return this.f9243e;
        }

        public int c() {
            d();
            return this.f9242d;
        }
    }

    void a(p3.a0 a0Var, int i10);

    void b();

    void c(p3.j0 j0Var, x1.n nVar, d dVar);
}
