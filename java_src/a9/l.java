package a9;

import a9.c;
import a9.l;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import i8.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import r8.k;
import r8.o;
/* loaded from: classes.dex */
public class l implements k.c, i8.a, j8.a {

    /* renamed from: j  reason: collision with root package name */
    private a f371j;

    /* renamed from: k  reason: collision with root package name */
    private r8.k f372k;

    /* renamed from: l  reason: collision with root package name */
    private j8.c f373l;

    /* loaded from: classes.dex */
    public static class a implements r8.m {

        /* renamed from: j  reason: collision with root package name */
        private final Context f374j;

        /* renamed from: k  reason: collision with root package name */
        private o f375k;

        /* renamed from: l  reason: collision with root package name */
        private Activity f376l;

        /* renamed from: m  reason: collision with root package name */
        private final c f377m = new c(1);

        /* renamed from: n  reason: collision with root package name */
        private final m f378n;

        /* renamed from: o  reason: collision with root package name */
        private com.google.android.gms.auth.api.signin.b f379o;

        /* renamed from: p  reason: collision with root package name */
        private List<String> f380p;

        /* renamed from: q  reason: collision with root package name */
        private C0004a f381q;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a9.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0004a {

            /* renamed from: a  reason: collision with root package name */
            final String f382a;

            /* renamed from: b  reason: collision with root package name */
            final k.d f383b;

            /* renamed from: c  reason: collision with root package name */
            final Object f384c;

            C0004a(String str, k.d dVar, Object obj) {
                this.f382a = str;
                this.f383b = dVar;
                this.f384c = obj;
            }
        }

        public a(Context context, m mVar) {
            this.f374j = context;
            this.f378n = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void A(Task<GoogleSignInAccount> task) {
            String runtimeException;
            String str;
            try {
                z(task.getResult(com.google.android.gms.common.api.b.class));
            } catch (com.google.android.gms.common.api.b e10) {
                str = m(e10.getStatusCode());
                runtimeException = e10.toString();
                n(str, runtimeException);
            } catch (RuntimeExecutionException e11) {
                runtimeException = e11.toString();
                str = "exception";
                n(str, runtimeException);
            }
        }

        private void i(String str, k.d dVar) {
            j(str, dVar, null);
        }

        private void j(String str, k.d dVar, Object obj) {
            if (this.f381q == null) {
                this.f381q = new C0004a(str, dVar, obj);
                return;
            }
            throw new IllegalStateException("Concurrent operations detected: " + this.f381q.f382a + ", " + str);
        }

        private String m(int i10) {
            return i10 != 4 ? i10 != 7 ? i10 != 12501 ? "sign_in_failed" : "sign_in_canceled" : "network_error" : "sign_in_required";
        }

        private void n(String str, String str2) {
            this.f381q.f383b.b(str, str2, null);
            this.f381q = null;
        }

        private void o(Object obj) {
            this.f381q.f383b.a(obj);
            this.f381q = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void t(String str) {
            t3.b.a(this.f374j, str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void u(k.d dVar, Future future) {
            try {
                dVar.a(future.get());
            } catch (InterruptedException e10) {
                dVar.b("exception", e10.getMessage(), null);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                dVar.b("exception", cause == null ? null : cause.getMessage(), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(Task task) {
            if (task.isSuccessful()) {
                o(null);
            } else {
                n("status", "Failed to disconnect.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String w(String str) {
            Account account = new Account(str, "com.google");
            return t3.b.b(this.f374j, account, "oauth2:" + b5.g.f(' ').d(this.f380p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(k.d dVar, boolean z10, String str, Future future) {
            String message;
            String str2 = "exception";
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("accessToken", (String) future.get());
                dVar.a(hashMap);
            } catch (InterruptedException e10) {
                dVar.b("exception", e10.getMessage(), null);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                if (e11.getCause() instanceof UserRecoverableAuthException) {
                    str2 = "user_recoverable_auth";
                    if (z10 && this.f381q == null) {
                        Activity p10 = p();
                        if (p10 != null) {
                            j("getTokens", dVar, str);
                            p10.startActivityForResult(((UserRecoverableAuthException) e11.getCause()).a(), 53294);
                            return;
                        }
                        message = "Cannot recover auth because app is not in foreground. " + e11.getLocalizedMessage();
                    } else {
                        message = e11.getLocalizedMessage();
                    }
                } else {
                    Throwable cause = e11.getCause();
                    message = cause == null ? null : cause.getMessage();
                }
                dVar.b(str2, message, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Task task) {
            if (task.isSuccessful()) {
                o(null);
            } else {
                n("status", "Failed to signout.");
            }
        }

        private void z(GoogleSignInAccount googleSignInAccount) {
            HashMap hashMap = new HashMap();
            hashMap.put("email", googleSignInAccount.s());
            hashMap.put("id", googleSignInAccount.E());
            hashMap.put("idToken", googleSignInAccount.F());
            hashMap.put("serverAuthCode", googleSignInAccount.H());
            hashMap.put("displayName", googleSignInAccount.x());
            if (googleSignInAccount.c() != null) {
                hashMap.put("photoUrl", googleSignInAccount.c().toString());
            }
            o(hashMap);
        }

        public void B(k.d dVar, List<String> list) {
            i("requestScopes", dVar);
            GoogleSignInAccount b10 = this.f378n.b(this.f374j);
            if (b10 == null) {
                n("sign_in_required", "No account to grant scopes.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Scope scope = new Scope(str);
                if (!this.f378n.c(b10, scope)) {
                    arrayList.add(scope);
                }
            }
            if (arrayList.isEmpty()) {
                o(Boolean.TRUE);
            } else {
                this.f378n.d(p(), 53295, b10, (Scope[]) arrayList.toArray(new Scope[0]));
            }
        }

        public void C(Activity activity) {
            this.f376l = activity;
        }

        public void D(k.d dVar) {
            if (p() == null) {
                throw new IllegalStateException("signIn needs a foreground activity");
            }
            i("signIn", dVar);
            p().startActivityForResult(this.f379o.z(), 53293);
        }

        public void E(k.d dVar) {
            i("signInSilently", dVar);
            Task<GoogleSignInAccount> C = this.f379o.C();
            if (C.isComplete()) {
                A(C);
            } else {
                C.addOnCompleteListener(new OnCompleteListener() { // from class: a9.i
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        l.a.this.A(task);
                    }
                });
            }
        }

        public void F(k.d dVar) {
            i("signOut", dVar);
            this.f379o.B().addOnCompleteListener(new OnCompleteListener() { // from class: a9.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    l.a.this.y(task);
                }
            });
        }

        @Override // r8.m
        public boolean b(int i10, int i11, Intent intent) {
            C0004a c0004a = this.f381q;
            if (c0004a == null) {
                return false;
            }
            switch (i10) {
                case 53293:
                    if (intent != null) {
                        A(com.google.android.gms.auth.api.signin.a.c(intent));
                    } else {
                        n("sign_in_failed", "Signin failed");
                    }
                    return true;
                case 53294:
                    if (i11 == -1) {
                        this.f381q = null;
                        q(c0004a.f383b, (String) c0004a.f384c, false);
                    } else {
                        n("failed_to_recover_auth", "Failed attempt to recover authentication");
                    }
                    return true;
                case 53295:
                    o(Boolean.valueOf(i11 == -1));
                    return true;
                default:
                    return false;
            }
        }

        public void k(final k.d dVar, final String str) {
            this.f377m.f(new Callable() { // from class: a9.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void t10;
                    t10 = l.a.this.t(str);
                    return t10;
                }
            }, new c.a() { // from class: a9.f
                @Override // a9.c.a
                public final void a(Future future) {
                    l.a.u(k.d.this, future);
                }
            });
        }

        public void l(k.d dVar) {
            i("disconnect", dVar);
            this.f379o.A().addOnCompleteListener(new OnCompleteListener() { // from class: a9.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    l.a.this.v(task);
                }
            });
        }

        public Activity p() {
            o oVar = this.f375k;
            return oVar != null ? oVar.a() : this.f376l;
        }

        public void q(final k.d dVar, final String str, final boolean z10) {
            this.f377m.f(new Callable() { // from class: a9.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String w10;
                    w10 = l.a.this.w(str);
                    return w10;
                }
            }, new c.a() { // from class: a9.e
                @Override // a9.c.a
                public final void a(Future future) {
                    l.a.this.x(dVar, z10, str, future);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
            if (r0 != 1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
            r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.a(com.google.android.gms.auth.api.signin.GoogleSignInOptions.f3695u).b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
            throw new java.lang.IllegalStateException("Unknown signInOption");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void r(r8.k.d r7, java.lang.String r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            /*
                r6 = this;
                r0 = -1
                r1 = 0
                int r2 = r8.hashCode()     // Catch: java.lang.Exception -> Lc0
                r3 = 849126666(0x329ca50a, float:1.8235841E-8)
                r4 = 0
                r5 = 1
                if (r2 == r3) goto L1d
                r3 = 2056100820(0x7a8d9bd4, float:3.676372E35)
                if (r2 == r3) goto L13
                goto L26
            L13:
                java.lang.String r2 = "SignInOption.standard"
                boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> Lc0
                if (r8 == 0) goto L26
                r0 = 1
                goto L26
            L1d:
                java.lang.String r2 = "SignInOption.games"
                boolean r8 = r8.equals(r2)     // Catch: java.lang.Exception -> Lc0
                if (r8 == 0) goto L26
                r0 = 0
            L26:
                if (r0 == 0) goto L3e
                if (r0 != r5) goto L36
                com.google.android.gms.auth.api.signin.GoogleSignInOptions$a r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$a     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f3695u     // Catch: java.lang.Exception -> Lc0
                r8.<init>(r0)     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.auth.api.signin.GoogleSignInOptions$a r8 = r8.b()     // Catch: java.lang.Exception -> Lc0
                goto L45
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lc0
                java.lang.String r9 = "Unknown signInOption"
                r8.<init>(r9)     // Catch: java.lang.Exception -> Lc0
                throw r8     // Catch: java.lang.Exception -> Lc0
            L3e:
                com.google.android.gms.auth.api.signin.GoogleSignInOptions$a r8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$a     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f3696v     // Catch: java.lang.Exception -> Lc0
                r8.<init>(r0)     // Catch: java.lang.Exception -> Lc0
            L45:
                boolean r0 = b5.s.b(r11)     // Catch: java.lang.Exception -> Lc0
                if (r0 != 0) goto L59
                boolean r0 = b5.s.b(r12)     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto L59
                java.lang.String r12 = "google_sign_in"
                java.lang.String r0 = "clientId is not supported on Android and is interpreted as serverClientId. Use serverClientId instead to suppress this warning."
                android.util.Log.w(r12, r0)     // Catch: java.lang.Exception -> Lc0
                goto L5a
            L59:
                r11 = r12
            L5a:
                boolean r12 = b5.s.b(r11)     // Catch: java.lang.Exception -> Lc0
                if (r12 == 0) goto L7c
                android.content.Context r12 = r6.f374j     // Catch: java.lang.Exception -> Lc0
                android.content.res.Resources r12 = r12.getResources()     // Catch: java.lang.Exception -> Lc0
                java.lang.String r0 = "default_web_client_id"
                java.lang.String r2 = "string"
                android.content.Context r3 = r6.f374j     // Catch: java.lang.Exception -> Lc0
                java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> Lc0
                int r12 = r12.getIdentifier(r0, r2, r3)     // Catch: java.lang.Exception -> Lc0
                if (r12 == 0) goto L7c
                android.content.Context r11 = r6.f374j     // Catch: java.lang.Exception -> Lc0
                java.lang.String r11 = r11.getString(r12)     // Catch: java.lang.Exception -> Lc0
            L7c:
                boolean r12 = b5.s.b(r11)     // Catch: java.lang.Exception -> Lc0
                if (r12 != 0) goto L88
                r8.d(r11)     // Catch: java.lang.Exception -> Lc0
                r8.g(r11, r13)     // Catch: java.lang.Exception -> Lc0
            L88:
                java.util.Iterator r11 = r9.iterator()     // Catch: java.lang.Exception -> Lc0
            L8c:
                boolean r12 = r11.hasNext()     // Catch: java.lang.Exception -> Lc0
                if (r12 == 0) goto La3
                java.lang.Object r12 = r11.next()     // Catch: java.lang.Exception -> Lc0
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.common.api.Scope r13 = new com.google.android.gms.common.api.Scope     // Catch: java.lang.Exception -> Lc0
                r13.<init>(r12)     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.common.api.Scope[] r12 = new com.google.android.gms.common.api.Scope[r4]     // Catch: java.lang.Exception -> Lc0
                r8.f(r13, r12)     // Catch: java.lang.Exception -> Lc0
                goto L8c
            La3:
                boolean r11 = b5.s.b(r10)     // Catch: java.lang.Exception -> Lc0
                if (r11 != 0) goto Lac
                r8.i(r10)     // Catch: java.lang.Exception -> Lc0
            Lac:
                r6.f380p = r9     // Catch: java.lang.Exception -> Lc0
                a9.m r9 = r6.f378n     // Catch: java.lang.Exception -> Lc0
                android.content.Context r10 = r6.f374j     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.auth.api.signin.GoogleSignInOptions r8 = r8.a()     // Catch: java.lang.Exception -> Lc0
                com.google.android.gms.auth.api.signin.b r8 = r9.a(r10, r8)     // Catch: java.lang.Exception -> Lc0
                r6.f379o = r8     // Catch: java.lang.Exception -> Lc0
                r7.a(r1)     // Catch: java.lang.Exception -> Lc0
                goto Lca
            Lc0:
                r8 = move-exception
                java.lang.String r8 = r8.getMessage()
                java.lang.String r9 = "exception"
                r7.b(r9, r8, r1)
            Lca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.l.a.r(r8.k$d, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean):void");
        }

        public void s(k.d dVar) {
            dVar.a(Boolean.valueOf(com.google.android.gms.auth.api.signin.a.b(this.f374j) != null));
        }
    }

    private void a(j8.c cVar) {
        this.f373l = cVar;
        cVar.b(this.f371j);
        this.f371j.C(cVar.d());
    }

    private void b() {
        this.f371j = null;
        this.f372k.e(null);
        this.f372k = null;
    }

    private void c() {
        this.f373l.g(this.f371j);
        this.f371j.C(null);
        this.f373l = null;
    }

    @Override // r8.k.c
    public void I(r8.j jVar, k.d dVar) {
        String str = jVar.f16777a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -902468670:
                if (str.equals("signIn")) {
                    c10 = 0;
                    break;
                }
                break;
            case -638267772:
                if (str.equals("signInSilently")) {
                    c10 = 1;
                    break;
                }
                break;
            case -481441621:
                if (str.equals("isSignedIn")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3237136:
                if (str.equals("init")) {
                    c10 = 3;
                    break;
                }
                break;
            case 24140525:
                if (str.equals("clearAuthCache")) {
                    c10 = 4;
                    break;
                }
                break;
            case 530405532:
                if (str.equals("disconnect")) {
                    c10 = 5;
                    break;
                }
                break;
            case 827828368:
                if (str.equals("getTokens")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1387660302:
                if (str.equals("requestScopes")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2088248401:
                if (str.equals("signOut")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f371j.D(dVar);
                return;
            case 1:
                this.f371j.E(dVar);
                return;
            case 2:
                this.f371j.s(dVar);
                return;
            case 3:
                String str2 = (String) jVar.a("signInOption");
                Objects.requireNonNull(str2);
                List<String> list = (List) jVar.a("scopes");
                Objects.requireNonNull(list);
                Boolean bool = (Boolean) jVar.a("forceCodeForRefreshToken");
                Objects.requireNonNull(bool);
                boolean booleanValue = bool.booleanValue();
                this.f371j.r(dVar, str2, list, (String) jVar.a("hostedDomain"), (String) jVar.a("clientId"), (String) jVar.a("serverClientId"), booleanValue);
                return;
            case 4:
                String str3 = (String) jVar.a("token");
                Objects.requireNonNull(str3);
                this.f371j.k(dVar, str3);
                return;
            case 5:
                this.f371j.l(dVar);
                return;
            case 6:
                String str4 = (String) jVar.a("email");
                Objects.requireNonNull(str4);
                Boolean bool2 = (Boolean) jVar.a("shouldRecoverAuth");
                Objects.requireNonNull(bool2);
                this.f371j.q(dVar, str4, bool2.booleanValue());
                return;
            case 7:
                List<String> list2 = (List) jVar.a("scopes");
                Objects.requireNonNull(list2);
                this.f371j.B(dVar, list2);
                return;
            case '\b':
                this.f371j.F(dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // i8.a
    public void d(a.b bVar) {
        b();
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
        c();
    }

    public void h(r8.c cVar, Context context, m mVar) {
        this.f372k = new r8.k(cVar, "plugins.flutter.io/google_sign_in_android");
        this.f371j = new a(context, mVar);
        this.f372k.e(this);
    }

    @Override // j8.a
    public void j() {
        c();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        h(bVar.b(), bVar.a(), new m());
    }
}
