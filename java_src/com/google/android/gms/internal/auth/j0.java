package com.google.android.gms.internal.auth;

import android.net.Uri;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    final String f4117a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f4118b;

    /* renamed from: c  reason: collision with root package name */
    final String f4119c;

    /* renamed from: d  reason: collision with root package name */
    final String f4120d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f4121e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4122f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4123g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4124h;

    /* renamed from: i  reason: collision with root package name */
    final r0 f4125i;

    public j0(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private j0(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, r0 r0Var) {
        this.f4117a = null;
        this.f4118b = uri;
        this.f4119c = "";
        this.f4120d = "";
        this.f4121e = z10;
        this.f4122f = false;
        this.f4123g = z12;
        this.f4124h = false;
        this.f4125i = null;
    }

    public final j0 a() {
        return new j0(null, this.f4118b, this.f4119c, this.f4120d, this.f4121e, false, true, false, null);
    }

    public final j0 b() {
        if (this.f4119c.isEmpty()) {
            return new j0(null, this.f4118b, this.f4119c, this.f4120d, true, false, this.f4123g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final n0 c(String str, double d10) {
        return new h0(this, str, Double.valueOf(0.0d), true);
    }

    public final n0 d(String str, long j10) {
        return new f0(this, str, Long.valueOf(j10), true);
    }

    public final n0 e(String str, boolean z10) {
        return new g0(this, str, Boolean.valueOf(z10), true);
    }

    public final n0 f(String str, Object obj, g5 g5Var) {
        return new i0(this, "getTokenRefactor__blocked_packages", obj, true, g5Var, null);
    }
}
