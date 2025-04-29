package o3;

import java.io.IOException;
/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14434a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14435b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14436c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14437d;

        public a(int i10, int i11, int i12, int i13) {
            this.f14434a = i10;
            this.f14435b = i11;
            this.f14436c = i12;
            this.f14437d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f14434a - this.f14435b <= 1) {
                    return false;
                }
            } else if (this.f14436c - this.f14437d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14438a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14439b;

        public b(int i10, long j10) {
            p3.a.a(j10 >= 0);
            this.f14438a = i10;
            this.f14439b = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final u2.n f14440a;

        /* renamed from: b  reason: collision with root package name */
        public final u2.q f14441b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f14442c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14443d;

        public c(u2.n nVar, u2.q qVar, IOException iOException, int i10) {
            this.f14440a = nVar;
            this.f14441b = qVar;
            this.f14442c = iOException;
            this.f14443d = i10;
        }
    }

    void a(long j10);

    long b(c cVar);

    b c(a aVar, c cVar);

    int d(int i10);
}
