package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import c4.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class l implements a.f, ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    private static final String f3868u = l.class.getSimpleName();

    /* renamed from: j  reason: collision with root package name */
    private final String f3869j;

    /* renamed from: k  reason: collision with root package name */
    private final String f3870k;

    /* renamed from: l  reason: collision with root package name */
    private final ComponentName f3871l;

    /* renamed from: m  reason: collision with root package name */
    private final Context f3872m;

    /* renamed from: n  reason: collision with root package name */
    private final e f3873n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f3874o;

    /* renamed from: p  reason: collision with root package name */
    private final m f3875p;

    /* renamed from: q  reason: collision with root package name */
    private IBinder f3876q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3877r;

    /* renamed from: s  reason: collision with root package name */
    private String f3878s;

    /* renamed from: t  reason: collision with root package name */
    private String f3879t;

    private final void s() {
        if (Thread.currentThread() != this.f3874o.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean a() {
        s();
        return this.f3876q != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void b(c.InterfaceC0076c interfaceC0076c) {
        s();
        String.valueOf(this.f3876q);
        if (a()) {
            try {
                f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f3871l;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f3869j).setAction(this.f3870k);
            }
            boolean bindService = this.f3872m.bindService(intent, this, c4.i.b());
            this.f3877r = bindService;
            if (!bindService) {
                this.f3876q = null;
                this.f3875p.x(new b4.b(16));
            }
            String.valueOf(this.f3876q);
        } catch (SecurityException e10) {
            this.f3877r = false;
            this.f3876q = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void c(c4.k kVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void d(c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> e() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void f(String str) {
        s();
        this.f3878s = str;
        n();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean i() {
        s();
        return this.f3877r;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final b4.d[] j() {
        return new b4.d[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String k() {
        String str = this.f3869j;
        if (str != null) {
            return str;
        }
        c4.s.j(this.f3871l);
        return this.f3871l.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String m() {
        return this.f3878s;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void n() {
        s();
        String.valueOf(this.f3876q);
        try {
            this.f3872m.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f3877r = false;
        this.f3876q = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f3874o.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.w0
            @Override // java.lang.Runnable
            public final void run() {
                l.this.q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3874o.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.v0
            @Override // java.lang.Runnable
            public final void run() {
                l.this.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        this.f3877r = false;
        this.f3876q = null;
        this.f3873n.p(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f3877r = false;
        this.f3876q = iBinder;
        String.valueOf(iBinder);
        this.f3873n.M(new Bundle());
    }

    public final void r(String str) {
        this.f3879t = str;
    }
}
