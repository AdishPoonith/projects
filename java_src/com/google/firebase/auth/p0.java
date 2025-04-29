package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.q0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f6578a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f6579b;

    /* renamed from: c  reason: collision with root package name */
    private final q0.b f6580c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f6581d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6582e;

    /* renamed from: f  reason: collision with root package name */
    private final Activity f6583f;

    /* renamed from: g  reason: collision with root package name */
    private final q0.a f6584g;

    /* renamed from: h  reason: collision with root package name */
    private final l0 f6585h;

    /* renamed from: i  reason: collision with root package name */
    private final t0 f6586i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f6587j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6588k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f6589a;

        /* renamed from: b  reason: collision with root package name */
        private String f6590b;

        /* renamed from: c  reason: collision with root package name */
        private Long f6591c;

        /* renamed from: d  reason: collision with root package name */
        private q0.b f6592d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f6593e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f6594f;

        /* renamed from: g  reason: collision with root package name */
        private q0.a f6595g;

        /* renamed from: h  reason: collision with root package name */
        private l0 f6596h;

        /* renamed from: i  reason: collision with root package name */
        private t0 f6597i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f6598j;

        public a(FirebaseAuth firebaseAuth) {
            this.f6589a = (FirebaseAuth) c4.s.j(firebaseAuth);
        }

        public p0 a() {
            boolean z10;
            String str;
            c4.s.k(this.f6589a, "FirebaseAuth instance cannot be null");
            c4.s.k(this.f6591c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            c4.s.k(this.f6592d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f6593e = this.f6589a.T();
            if (this.f6591c.longValue() < 0 || this.f6591c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            l0 l0Var = this.f6596h;
            if (l0Var == null) {
                c4.s.g(this.f6590b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                c4.s.b(!this.f6598j, "You cannot require sms validation without setting a multi-factor session.");
                c4.s.b(this.f6597i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (((a6.j) l0Var).F()) {
                    c4.s.f(this.f6590b);
                    z10 = this.f6597i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    c4.s.b(this.f6597i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z10 = this.f6590b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                c4.s.b(z10, str);
            }
            return new p0(this.f6589a, this.f6591c, this.f6592d, this.f6593e, this.f6590b, this.f6594f, this.f6595g, this.f6596h, this.f6597i, this.f6598j, null);
        }

        public a b(Activity activity) {
            this.f6594f = activity;
            return this;
        }

        public a c(q0.b bVar) {
            this.f6592d = bVar;
            return this;
        }

        public a d(q0.a aVar) {
            this.f6595g = aVar;
            return this;
        }

        public a e(t0 t0Var) {
            this.f6597i = t0Var;
            return this;
        }

        public a f(l0 l0Var) {
            this.f6596h = l0Var;
            return this;
        }

        public a g(String str) {
            this.f6590b = str;
            return this;
        }

        public a h(Long l10, TimeUnit timeUnit) {
            this.f6591c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    /* synthetic */ p0(FirebaseAuth firebaseAuth, Long l10, q0.b bVar, Executor executor, String str, Activity activity, q0.a aVar, l0 l0Var, t0 t0Var, boolean z10, p1 p1Var) {
        this.f6578a = firebaseAuth;
        this.f6582e = str;
        this.f6579b = l10;
        this.f6580c = bVar;
        this.f6583f = activity;
        this.f6581d = executor;
        this.f6584g = aVar;
        this.f6585h = l0Var;
        this.f6586i = t0Var;
        this.f6587j = z10;
    }

    public final Activity a() {
        return this.f6583f;
    }

    public final FirebaseAuth b() {
        return this.f6578a;
    }

    public final l0 c() {
        return this.f6585h;
    }

    public final q0.a d() {
        return this.f6584g;
    }

    public final q0.b e() {
        return this.f6580c;
    }

    public final t0 f() {
        return this.f6586i;
    }

    public final Long g() {
        return this.f6579b;
    }

    public final String h() {
        return this.f6582e;
    }

    public final Executor i() {
        return this.f6581d;
    }

    public final void j(boolean z10) {
        this.f6588k = true;
    }

    public final boolean k() {
        return this.f6588k;
    }

    public final boolean l() {
        return this.f6587j;
    }

    public final boolean m() {
        return this.f6585h != null;
    }
}
