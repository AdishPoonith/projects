package f1;

import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class x extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8599c = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.l.e(action, "action");
            if (kotlin.jvm.internal.l.a(action, "oauth")) {
                l0 l0Var = l0.f8470a;
                h0 h0Var = h0.f8445a;
                return l0.g(h0.k(), "oauth/authorize", bundle);
            }
            l0 l0Var2 = l0.f8470a;
            h0 h0Var2 = h0.f8445a;
            String k10 = h0.k();
            StringBuilder sb = new StringBuilder();
            p0.f0 f0Var = p0.f0.f14852a;
            sb.append(p0.f0.w());
            sb.append("/dialog/");
            sb.append(action);
            return l0.g(k10, sb.toString(), bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String action, Bundle bundle) {
        super(action, bundle);
        kotlin.jvm.internal.l.e(action, "action");
        b(f8599c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
