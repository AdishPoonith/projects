package u3;

import android.os.Bundle;
import c4.q;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.a;
import z3.h;
/* loaded from: classes.dex */
public final class a {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<c> f19014a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<C0270a> f19015b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f19016c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final x3.a f19017d;

    /* renamed from: e  reason: collision with root package name */
    public static final v3.a f19018e;

    /* renamed from: f  reason: collision with root package name */
    public static final y3.a f19019f;

    /* renamed from: g  reason: collision with root package name */
    public static final a.g f19020g;

    /* renamed from: h  reason: collision with root package name */
    public static final a.g f19021h;

    /* renamed from: i  reason: collision with root package name */
    private static final a.AbstractC0085a f19022i;

    /* renamed from: j  reason: collision with root package name */
    private static final a.AbstractC0085a f19023j;

    @Deprecated
    /* renamed from: u3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0270a implements a.d {

        /* renamed from: m  reason: collision with root package name */
        public static final C0270a f19024m = new C0270a(new C0271a());

        /* renamed from: j  reason: collision with root package name */
        private final String f19025j = null;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f19026k;

        /* renamed from: l  reason: collision with root package name */
        private final String f19027l;

        @Deprecated
        /* renamed from: u3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0271a {

            /* renamed from: a  reason: collision with root package name */
            protected Boolean f19028a;

            /* renamed from: b  reason: collision with root package name */
            protected String f19029b;

            public C0271a() {
                this.f19028a = Boolean.FALSE;
            }

            public C0271a(C0270a c0270a) {
                this.f19028a = Boolean.FALSE;
                C0270a.b(c0270a);
                this.f19028a = Boolean.valueOf(c0270a.f19026k);
                this.f19029b = c0270a.f19027l;
            }

            public final C0271a a(String str) {
                this.f19029b = str;
                return this;
            }
        }

        public C0270a(C0271a c0271a) {
            this.f19026k = c0271a.f19028a.booleanValue();
            this.f19027l = c0271a.f19029b;
        }

        static /* bridge */ /* synthetic */ String b(C0270a c0270a) {
            String str = c0270a.f19025j;
            return null;
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f19026k);
            bundle.putString("log_session_id", this.f19027l);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0270a) {
                C0270a c0270a = (C0270a) obj;
                String str = c0270a.f19025j;
                return q.b(null, null) && this.f19026k == c0270a.f19026k && q.b(this.f19027l, c0270a.f19027l);
            }
            return false;
        }

        public int hashCode() {
            return q.c(null, Boolean.valueOf(this.f19026k), this.f19027l);
        }
    }

    static {
        a.g gVar = new a.g();
        f19020g = gVar;
        a.g gVar2 = new a.g();
        f19021h = gVar2;
        d dVar = new d();
        f19022i = dVar;
        e eVar = new e();
        f19023j = eVar;
        f19014a = b.f19030a;
        f19015b = new com.google.android.gms.common.api.a<>("Auth.CREDENTIALS_API", dVar, gVar);
        f19016c = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, gVar2);
        f19017d = b.f19031b;
        f19018e = new m4.e();
        f19019f = new h();
    }
}
