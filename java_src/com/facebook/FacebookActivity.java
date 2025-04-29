package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import d1.b;
import d1.c;
import f1.e0;
import f1.i;
import f1.l0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import p0.f0;
import p0.s;
import p1.y;
/* loaded from: classes.dex */
public class FacebookActivity extends e {
    public static final a J = new a(null);
    private static final String K = FacebookActivity.class.getName();
    private Fragment I;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final void Q() {
        Intent requestIntent = getIntent();
        e0 e0Var = e0.f8417a;
        l.d(requestIntent, "requestIntent");
        s q10 = e0.q(e0.u(requestIntent));
        Intent intent = getIntent();
        l.d(intent, "intent");
        setResult(0, e0.m(intent, null, q10));
        finish();
    }

    public final Fragment O() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.d, androidx.fragment.app.Fragment, f1.i] */
    protected Fragment P() {
        y yVar;
        Intent intent = getIntent();
        n supportFragmentManager = F();
        l.d(supportFragmentManager, "supportFragmentManager");
        Fragment j02 = supportFragmentManager.j0("SingleFragment");
        if (j02 == null) {
            if (l.a("FacebookDialogFragment", intent.getAction())) {
                ?? iVar = new i();
                iVar.E1(true);
                iVar.U1(supportFragmentManager, "SingleFragment");
                yVar = iVar;
            } else {
                y yVar2 = new y();
                yVar2.E1(true);
                supportFragmentManager.m().b(b.com_facebook_fragment_container, yVar2, "SingleFragment").f();
                yVar = yVar2;
            }
            return yVar;
        }
        return j02;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            l.e(prefix, "prefix");
            l.e(writer, "writer");
            n1.a a10 = n1.a.f14050a.a();
            if (l.a(a10 == null ? null : Boolean.valueOf(a10.a(prefix, writer, strArr)), Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        l.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.I;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        f0 f0Var = f0.f14852a;
        if (!f0.F()) {
            l0 l0Var = l0.f8470a;
            l0.e0(K, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            l.d(applicationContext, "applicationContext");
            f0.M(applicationContext);
        }
        setContentView(c.com_facebook_activity_layout);
        if (l.a("PassThrough", intent.getAction())) {
            Q();
        } else {
            this.I = P();
        }
    }
}
