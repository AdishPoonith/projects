package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wa  reason: invalid package */
/* loaded from: classes.dex */
public final class wa {

    /* renamed from: a  reason: collision with root package name */
    private final Class f5586a;

    /* renamed from: d  reason: collision with root package name */
    private xa f5589d;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentMap f5587b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final List f5588c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private an f5590e = an.f4357b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wa(Class cls, va vaVar) {
        this.f5586a = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.p000firebaseauthapi.wa e(java.lang.Object r13, java.lang.Object r14, com.google.android.gms.internal.p000firebaseauthapi.is r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.wa.e(java.lang.Object, java.lang.Object, com.google.android.gms.internal.firebase-auth-api.is, boolean):com.google.android.gms.internal.firebase-auth-api.wa");
    }

    public final wa a(Object obj, Object obj2, is isVar) {
        e(obj, obj2, isVar, false);
        return this;
    }

    public final wa b(Object obj, Object obj2, is isVar) {
        e(obj, obj2, isVar, true);
        return this;
    }

    public final wa c(an anVar) {
        if (this.f5587b != null) {
            this.f5590e = anVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final bb d() {
        ConcurrentMap concurrentMap = this.f5587b;
        if (concurrentMap != null) {
            bb bbVar = new bb(concurrentMap, this.f5588c, this.f5589d, this.f5590e, this.f5586a, null);
            this.f5587b = null;
            return bbVar;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
