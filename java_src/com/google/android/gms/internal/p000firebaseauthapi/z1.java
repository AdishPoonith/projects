package com.google.android.gms.internal.p000firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import c4.s;
import com.google.firebase.auth.a2;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z1  reason: invalid package */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private String f5736a;

    /* renamed from: b  reason: collision with root package name */
    private String f5737b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5738c;

    /* renamed from: d  reason: collision with root package name */
    private String f5739d;

    /* renamed from: e  reason: collision with root package name */
    private String f5740e;

    /* renamed from: f  reason: collision with root package name */
    private p2 f5741f;

    /* renamed from: g  reason: collision with root package name */
    private String f5742g;

    /* renamed from: h  reason: collision with root package name */
    private String f5743h;

    /* renamed from: i  reason: collision with root package name */
    private long f5744i;

    /* renamed from: j  reason: collision with root package name */
    private long f5745j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5746k;

    /* renamed from: l  reason: collision with root package name */
    private a2 f5747l;

    /* renamed from: m  reason: collision with root package name */
    private List f5748m;

    public z1() {
        this.f5741f = new p2();
    }

    public z1(String str, String str2, boolean z10, String str3, String str4, p2 p2Var, String str5, String str6, long j10, long j11, boolean z11, a2 a2Var, List list) {
        this.f5736a = str;
        this.f5737b = str2;
        this.f5738c = z10;
        this.f5739d = str3;
        this.f5740e = str4;
        this.f5741f = p2.b(p2Var);
        this.f5742g = str5;
        this.f5743h = str6;
        this.f5744i = j10;
        this.f5745j = j11;
        this.f5746k = false;
        this.f5747l = null;
        this.f5748m = list;
    }

    public final long a() {
        return this.f5744i;
    }

    public final long b() {
        return this.f5745j;
    }

    public final Uri c() {
        if (TextUtils.isEmpty(this.f5740e)) {
            return null;
        }
        return Uri.parse(this.f5740e);
    }

    public final a2 d() {
        return this.f5747l;
    }

    public final z1 e(a2 a2Var) {
        this.f5747l = a2Var;
        return this;
    }

    public final z1 f(String str) {
        this.f5739d = str;
        return this;
    }

    public final z1 g(String str) {
        this.f5737b = str;
        return this;
    }

    public final z1 h(boolean z10) {
        this.f5746k = z10;
        return this;
    }

    public final z1 i(String str) {
        s.f(str);
        this.f5742g = str;
        return this;
    }

    public final z1 j(String str) {
        this.f5740e = str;
        return this;
    }

    public final z1 k(List list) {
        s.j(list);
        p2 p2Var = new p2();
        this.f5741f = p2Var;
        p2Var.c().addAll(list);
        return this;
    }

    public final p2 l() {
        return this.f5741f;
    }

    public final String m() {
        return this.f5739d;
    }

    public final String n() {
        return this.f5737b;
    }

    public final String o() {
        return this.f5736a;
    }

    public final String p() {
        return this.f5743h;
    }

    public final List q() {
        return this.f5748m;
    }

    public final List r() {
        return this.f5741f.c();
    }

    public final boolean s() {
        return this.f5738c;
    }

    public final boolean t() {
        return this.f5746k;
    }
}
