package j0;

import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p0.j0;
import p0.n;
import p0.o0;
import p0.s0;
import p1.e0;
import p1.t;
import r8.k;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f11950a;

    /* renamed from: b  reason: collision with root package name */
    j0.b f11951b;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0177a implements s0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f11952a;

        C0177a(k.d dVar) {
            this.f11952a = dVar;
        }

        @Override // p0.s0
        public void a() {
            this.f11952a.b("CANCELLED", "User has cancelled login with facebook", null);
        }

        @Override // p0.s0
        public void b(Exception exc) {
            this.f11952a.b("FAILED", exc.getMessage(), null);
        }

        @Override // p0.s0
        public void c(p0.a aVar) {
            this.f11952a.a(a.b(aVar));
        }
    }

    /* loaded from: classes.dex */
    class b implements j0.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f11954a;

        b(k.d dVar) {
            this.f11954a = dVar;
        }

        @Override // p0.j0.d
        public void a(JSONObject jSONObject, o0 o0Var) {
            try {
                this.f11954a.a(jSONObject.toString());
            } catch (Exception e10) {
                this.f11954a.b("FAILED", e10.getMessage(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends HashMap<String, Object> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p0.a f11956j;

        c(p0.a aVar) {
            this.f11956j = aVar;
            put("token", aVar.s());
            put("userId", aVar.x());
            put("expires", Long.valueOf(aVar.k().getTime()));
            put("applicationId", aVar.c());
            put("lastRefresh", Long.valueOf(aVar.m().getTime()));
            put("isExpired", Boolean.valueOf(aVar.z()));
            put("grantedPermissions", new ArrayList(aVar.p()));
            put("declinedPermissions", new ArrayList(aVar.f()));
            put("dataAccessExpirationTime", Long.valueOf(aVar.e().getTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        e0 j10 = e0.j();
        this.f11950a = j10;
        n a10 = n.a.a();
        j0.b bVar = new j0.b(a10);
        this.f11951b = bVar;
        j10.s(a10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, Object> b(p0.a aVar) {
        return new c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Activity activity, k.d dVar) {
        e0.j().w(activity, new C0177a(dVar));
    }

    public void c(k.d dVar) {
        p0.a d10 = p0.a.d();
        dVar.a(d10 != null && !d10.z() ? b(p0.a.d()) : null);
    }

    public void d(String str, k.d dVar) {
        j0 B = j0.B(p0.a.d(), new b(dVar));
        Bundle bundle = new Bundle();
        bundle.putString("fields", str);
        B.H(bundle);
        B.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(k.d dVar) {
        if (p0.a.d() != null) {
            this.f11950a.o();
        }
        dVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Activity activity, List<String> list, k.d dVar) {
        if (p0.a.d() != null) {
            this.f11950a.o();
        }
        if (this.f11951b.g(dVar)) {
            this.f11950a.m(activity, list);
        }
    }

    public void g(String str) {
        t tVar;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2088866749:
                if (str.equals("DIALOG_ONLY")) {
                    c10 = 0;
                    break;
                }
                break;
            case -361463084:
                if (str.equals("NATIVE_ONLY")) {
                    c10 = 1;
                    break;
                }
                break;
            case 93577687:
                if (str.equals("WEB_ONLY")) {
                    c10 = 2;
                    break;
                }
                break;
            case 639074801:
                if (str.equals("DEVICE_AUTH")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1052231445:
                if (str.equals("KATANA_ONLY")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                tVar = t.DIALOG_ONLY;
                break;
            case 1:
                tVar = t.NATIVE_ONLY;
                break;
            case 2:
                tVar = t.WEB_ONLY;
                break;
            case 3:
                tVar = t.DEVICE_AUTH;
                break;
            case 4:
                tVar = t.KATANA_ONLY;
                break;
            default:
                tVar = t.NATIVE_WITH_FALLBACK;
                break;
        }
        this.f11950a.A(tVar);
    }
}
