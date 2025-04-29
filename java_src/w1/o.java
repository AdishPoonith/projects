package w1;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import w1.w;
/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: j  reason: collision with root package name */
        public final int f19735j;

        public a(Throwable th, int i10) {
            super(th);
            this.f19735j = i10;
        }
    }

    a a();

    boolean b();

    Map<String, String> c();

    void d(w.a aVar);

    UUID e();

    void f(w.a aVar);

    boolean g(String str);

    int getState();

    v1.b h();
}
