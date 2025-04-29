package p0;

import f1.n;
import java.util.Random;
/* loaded from: classes.dex */
public class s extends RuntimeException {

    /* renamed from: j  reason: collision with root package name */
    public static final a f15017j = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public s() {
    }

    public s(final String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            f0 f0Var = f0.f14852a;
            if (!f0.F() || random.nextInt(100) <= 50) {
                return;
            }
            f1.n nVar = f1.n.f8481a;
            f1.n.a(n.b.ErrorReport, new n.a() { // from class: p0.r
                @Override // f1.n.a
                public final void a(boolean z10) {
                    s.b(str, z10);
                }
            });
        }
    }

    public s(String str, Throwable th) {
        super(str, th);
    }

    public s(Throwable th) {
        super(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                l1.e eVar = l1.e.f13048a;
                l1.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
