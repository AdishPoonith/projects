package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.firebase.auth.o0;
import f4.a;
import j4.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e1  reason: invalid package */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: d  reason: collision with root package name */
    private static final a f4522d = new a("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4523a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f4524b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f4525c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f4523a = context;
        this.f4524b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(e1 e1Var, String str) {
        c1 c1Var = (c1) e1Var.f4525c.get(str);
        if (c1Var == null || d1.d(c1Var.f4421d) || d1.d(c1Var.f4422e) || c1Var.f4419b.isEmpty()) {
            return;
        }
        for (g gVar : c1Var.f4419b) {
            gVar.p(o0.G(c1Var.f4421d, c1Var.f4422e));
        }
        c1Var.f4425h = true;
    }

    private static String l(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(xi.f5664c));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            f4522d.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            f4522d.c("NoSuchAlgorithm: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String str) {
        c1 c1Var = (c1) this.f4525c.get(str);
        if (c1Var == null || c1Var.f4425h || d1.d(c1Var.f4421d)) {
            return;
        }
        f4522d.h("Timed out waiting for SMS.", new Object[0]);
        for (g gVar : c1Var.f4419b) {
            gVar.a(c1Var.f4421d);
        }
        c1Var.f4426i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void g(String str) {
        c1 c1Var = (c1) this.f4525c.get(str);
        if (c1Var == null) {
            return;
        }
        if (!c1Var.f4426i) {
            m(str);
        }
        i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        try {
            String packageName = this.f4523a.getPackageName();
            String l10 = l(packageName, (Build.VERSION.SDK_INT < 28 ? c.a(this.f4523a).c(packageName, 64).signatures : c.a(this.f4523a).c(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (l10 != null) {
                return l10;
            }
            f4522d.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f4522d.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(g gVar, String str) {
        c1 c1Var = (c1) this.f4525c.get(str);
        if (c1Var == null) {
            return;
        }
        c1Var.f4419b.add(gVar);
        if (c1Var.f4424g) {
            gVar.b(c1Var.f4421d);
        }
        if (c1Var.f4425h) {
            gVar.p(o0.G(c1Var.f4421d, c1Var.f4422e));
        }
        if (c1Var.f4426i) {
            gVar.a(c1Var.f4421d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str) {
        c1 c1Var = (c1) this.f4525c.get(str);
        if (c1Var == null) {
            return;
        }
        ScheduledFuture scheduledFuture = c1Var.f4423f;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            c1Var.f4423f.cancel(false);
        }
        c1Var.f4419b.clear();
        this.f4525c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(final String str, g gVar, long j10, boolean z10) {
        this.f4525c.put(str, new c1(j10, z10));
        h(gVar, str);
        c1 c1Var = (c1) this.f4525c.get(str);
        long j11 = c1Var.f4418a;
        if (j11 <= 0) {
            f4522d.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        c1Var.f4423f = this.f4524b.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.y0
            @Override // java.lang.Runnable
            public final void run() {
                e1.this.g(str);
            }
        }, j11, TimeUnit.SECONDS);
        if (!c1Var.f4420c) {
            f4522d.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        b1 b1Var = new b1(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        o9.j(this.f4523a.getApplicationContext(), b1Var, intentFilter);
        w3.a.a(this.f4523a).z().addOnFailureListener(new z0(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(String str) {
        return this.f4525c.get(str) != null;
    }
}
