package f2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f8605a;

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0141a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f8606b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f8607c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C0141a> f8608d;

        public C0141a(int i10, long j10) {
            super(i10);
            this.f8606b = j10;
            this.f8607c = new ArrayList();
            this.f8608d = new ArrayList();
        }

        public void d(C0141a c0141a) {
            this.f8608d.add(c0141a);
        }

        public void e(b bVar) {
            this.f8607c.add(bVar);
        }

        public C0141a f(int i10) {
            int size = this.f8608d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0141a c0141a = this.f8608d.get(i11);
                if (c0141a.f8605a == i10) {
                    return c0141a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f8607c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f8607c.get(i11);
                if (bVar.f8605a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // f2.a
        public String toString() {
            return a.a(this.f8605a) + " leaves: " + Arrays.toString(this.f8607c.toArray()) + " containers: " + Arrays.toString(this.f8608d.toArray());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final a0 f8609b;

        public b(int i10, a0 a0Var) {
            super(i10);
            this.f8609b = a0Var;
        }
    }

    public a(int i10) {
        this.f8605a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f8605a);
    }
}
