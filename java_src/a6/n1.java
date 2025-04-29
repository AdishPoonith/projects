package a6;

import com.google.android.gms.internal.p000firebaseauthapi.s2;
/* loaded from: classes.dex */
public final class n1 implements com.google.firebase.auth.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f260a;

    /* renamed from: b  reason: collision with root package name */
    private final String f261b;

    /* renamed from: c  reason: collision with root package name */
    private final String f262c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.auth.b f263d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public n1(s2 s2Var) {
        char c10;
        this.f261b = s2Var.g() ? s2Var.c() : s2Var.b();
        this.f262c = s2Var.b();
        com.google.firebase.auth.b bVar = null;
        if (!s2Var.h()) {
            this.f260a = 3;
            this.f263d = null;
            return;
        }
        String d10 = s2Var.d();
        switch (d10.hashCode()) {
            case -1874510116:
                if (d10.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1452371317:
                if (d10.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (d10.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (d10.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (d10.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 970484929:
                if (d10.equals("RECOVER_EMAIL")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        int i10 = c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? c10 != 5 ? 3 : 6 : 2 : 5 : 4 : 1 : 0;
        this.f260a = i10;
        if (i10 == 4 || i10 == 3) {
            this.f263d = null;
            return;
        }
        if (s2Var.f()) {
            bVar = new m1(s2Var.b(), g0.a(s2Var.a()));
        } else if (s2Var.g()) {
            bVar = new k1(s2Var.c(), s2Var.b());
        } else if (s2Var.e()) {
            bVar = new l1(s2Var.b());
        }
        this.f263d = bVar;
    }

    @Override // com.google.firebase.auth.d
    public final int a() {
        return this.f260a;
    }

    @Override // com.google.firebase.auth.d
    public final com.google.firebase.auth.b b() {
        return this.f263d;
    }
}
