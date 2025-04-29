package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import f1.l0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import p0.f0;
import p0.i;
import p0.j;
/* loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f3476d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static AuthenticationTokenManager f3477e;

    /* renamed from: a  reason: collision with root package name */
    private final e0.a f3478a;

    /* renamed from: b  reason: collision with root package name */
    private final j f3479b;

    /* renamed from: c  reason: collision with root package name */
    private i f3480c;

    /* loaded from: classes.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f3477e;
            if (authenticationTokenManager2 == null) {
                synchronized (this) {
                    authenticationTokenManager = AuthenticationTokenManager.f3477e;
                    if (authenticationTokenManager == null) {
                        f0 f0Var = f0.f14852a;
                        e0.a b10 = e0.a.b(f0.l());
                        l.d(b10, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(b10, new j());
                        a aVar = AuthenticationTokenManager.f3476d;
                        AuthenticationTokenManager.f3477e = authenticationTokenManager3;
                        authenticationTokenManager = authenticationTokenManager3;
                    }
                }
                return authenticationTokenManager;
            }
            return authenticationTokenManager2;
        }
    }

    public AuthenticationTokenManager(e0.a localBroadcastManager, j authenticationTokenCache) {
        l.e(localBroadcastManager, "localBroadcastManager");
        l.e(authenticationTokenCache, "authenticationTokenCache");
        this.f3478a = localBroadcastManager;
        this.f3479b = authenticationTokenCache;
    }

    private final void d(i iVar, i iVar2) {
        f0 f0Var = f0.f14852a;
        Intent intent = new Intent(f0.l(), CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", iVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", iVar2);
        this.f3478a.d(intent);
    }

    private final void f(i iVar, boolean z10) {
        i c10 = c();
        this.f3480c = iVar;
        if (z10) {
            j jVar = this.f3479b;
            if (iVar != null) {
                jVar.b(iVar);
            } else {
                jVar.a();
                l0 l0Var = l0.f8470a;
                f0 f0Var = f0.f14852a;
                l0.i(f0.l());
            }
        }
        l0 l0Var2 = l0.f8470a;
        if (l0.e(c10, iVar)) {
            return;
        }
        d(c10, iVar);
    }

    public final i c() {
        return this.f3480c;
    }

    public final void e(i iVar) {
        f(iVar, true);
    }
}
