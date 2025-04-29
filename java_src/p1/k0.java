package p1;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import java.util.List;
import p1.c;
import p1.f0;
import p1.u;
/* loaded from: classes.dex */
public abstract class k0 extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final p0.h f15157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15157m = p0.h.FACEBOOK_APPLICATION_WEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15157m = p0.h.FACEBOOK_APPLICATION_WEB;
    }

    private final void C(u.f fVar) {
        if (fVar != null) {
            d().j(fVar);
        } else {
            d().M();
        }
    }

    private final boolean J(Intent intent) {
        p0.f0 f0Var = p0.f0.f14852a;
        List<ResolveInfo> queryIntentActivities = p0.f0.l().getPackageManager().queryIntentActivities(intent, 65536);
        kotlin.jvm.internal.l.d(queryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !queryIntentActivities.isEmpty();
    }

    private final void K(final u.e eVar, final Bundle bundle) {
        if (bundle.containsKey("code")) {
            f1.l0 l0Var = f1.l0.f8470a;
            if (!f1.l0.X(bundle.getString("code"))) {
                p0.f0 f0Var = p0.f0.f14852a;
                p0.f0.t().execute(new Runnable() { // from class: p1.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        k0.L(k0.this, eVar, bundle);
                    }
                });
                return;
            }
        }
        I(eVar, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(k0 this$0, u.e request, Bundle extras) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(request, "$request");
        kotlin.jvm.internal.l.e(extras, "$extras");
        try {
            this$0.I(request, this$0.p(request, extras));
        } catch (p0.h0 e10) {
            p0.v c10 = e10.c();
            this$0.H(request, c10.d(), c10.c(), String.valueOf(c10.b()));
        } catch (p0.s e11) {
            this$0.H(request, null, e11.getMessage(), null);
        }
    }

    protected String D(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error");
        if (string == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString("error_type");
        }
        return string;
    }

    protected String E(Bundle bundle) {
        String string = bundle == null ? null : bundle.getString("error_message");
        if (string == null) {
            if (bundle == null) {
                return null;
            }
            return bundle.getString("error_description");
        }
        return string;
    }

    public p0.h F() {
        return this.f15157m;
    }

    protected void G(u.e eVar, Intent data) {
        Object obj;
        kotlin.jvm.internal.l.e(data, "data");
        Bundle extras = data.getExtras();
        String D = D(extras);
        String str = null;
        if (extras != null && (obj = extras.get("error_code")) != null) {
            str = obj.toString();
        }
        f1.h0 h0Var = f1.h0.f8445a;
        C(kotlin.jvm.internal.l.a(f1.h0.c(), str) ? u.f.f15252r.c(eVar, D, E(extras), str) : u.f.f15252r.a(eVar, D));
    }

    protected void H(u.e eVar, String str, String str2, String str3) {
        boolean m10;
        boolean m11;
        if (str == null || !kotlin.jvm.internal.l.a(str, "logged_out")) {
            f1.h0 h0Var = f1.h0.f8445a;
            m10 = t9.x.m(f1.h0.d(), str);
            if (!m10) {
                m11 = t9.x.m(f1.h0.e(), str);
                C(m11 ? u.f.f15252r.a(eVar, null) : u.f.f15252r.c(eVar, str, str2, str3));
                return;
            }
        } else {
            c.b bVar = c.f15088t;
            c.f15089u = true;
        }
        C(null);
    }

    protected void I(u.e request, Bundle extras) {
        kotlin.jvm.internal.l.e(request, "request");
        kotlin.jvm.internal.l.e(extras, "extras");
        try {
            f0.a aVar = f0.f15128l;
            C(u.f.f15252r.b(request, aVar.b(request.x(), extras, F(), request.a()), aVar.d(extras, request.s())));
        } catch (p0.s e10) {
            C(u.f.c.d(u.f.f15252r, request, null, e10.getMessage(), null, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean M(Intent intent, int i10) {
        androidx.activity.result.c<Intent> N1;
        if (intent == null || !J(intent)) {
            return false;
        }
        Fragment p10 = d().p();
        s9.u uVar = null;
        y yVar = p10 instanceof y ? (y) p10 : null;
        if (yVar != null && (N1 = yVar.N1()) != null) {
            N1.a(intent);
            uVar = s9.u.f17878a;
        }
        return uVar != null;
    }

    @Override // p1.f0
    public boolean m(int i10, int i11, Intent intent) {
        u.f d10;
        u.e z10 = d().z();
        if (intent != null) {
            if (i11 == 0) {
                G(z10, intent);
            } else if (i11 != -1) {
                d10 = u.f.c.d(u.f.f15252r, z10, "Unexpected resultCode from authorization.", null, null, 8, null);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C(u.f.c.d(u.f.f15252r, z10, "Unexpected null from returned authorization data.", null, null, 8, null));
                    return true;
                }
                String D = D(extras);
                Object obj = extras.get("error_code");
                String obj2 = obj == null ? null : obj.toString();
                String E = E(extras);
                String string = extras.getString("e2e");
                f1.l0 l0Var = f1.l0.f8470a;
                if (!f1.l0.X(string)) {
                    k(string);
                }
                if (D == null && obj2 == null && E == null && z10 != null) {
                    K(z10, extras);
                } else {
                    H(z10, D, E, obj2);
                }
            }
            return true;
        }
        d10 = u.f.f15252r.a(z10, "Operation canceled");
        C(d10);
        return true;
    }
}
