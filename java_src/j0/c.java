package j0;

import i8.a;
import java.util.List;
import r8.j;
import r8.k;
/* loaded from: classes.dex */
public class c implements i8.a, k.c, j8.a {

    /* renamed from: j  reason: collision with root package name */
    private final a f11959j = new a();

    /* renamed from: k  reason: collision with root package name */
    private j8.c f11960k;

    /* renamed from: l  reason: collision with root package name */
    private k f11961l;

    private void a(j8.c cVar) {
        this.f11960k = cVar;
        cVar.b(this.f11959j.f11951b);
    }

    private void b() {
        this.f11960k.g(this.f11959j.f11951b);
        this.f11960k = null;
    }

    @Override // r8.k.c
    public void I(j jVar, k.d dVar) {
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1682957889:
                if (str.equals("getAccessToken")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1097360022:
                if (str.equals("logOut")) {
                    c10 = 1;
                    break;
                }
                break;
            case 103149417:
                if (str.equals("login")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1120441817:
                if (str.equals("expressLogin")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1810935691:
                if (str.equals("getUserData")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f11959j.c(dVar);
                return;
            case 1:
                this.f11959j.e(dVar);
                return;
            case 2:
                this.f11959j.g((String) jVar.a("loginBehavior"));
                this.f11959j.f(this.f11960k.d(), (List) jVar.a("permissions"), dVar);
                return;
            case 3:
                this.f11959j.a(this.f11960k.d(), dVar);
                return;
            case 4:
                this.f11959j.d((String) jVar.a("fields"), dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // i8.a
    public void d(a.b bVar) {
        this.f11961l.e(null);
    }

    @Override // j8.a
    public void e(j8.c cVar) {
        a(cVar);
    }

    @Override // j8.a
    public void f(j8.c cVar) {
        a(cVar);
    }

    @Override // j8.a
    public void g() {
        b();
    }

    @Override // j8.a
    public void j() {
        b();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        k kVar = new k(bVar.b(), "app.meedu/flutter_facebook_auth");
        this.f11961l = kVar;
        kVar.e(this);
    }
}
