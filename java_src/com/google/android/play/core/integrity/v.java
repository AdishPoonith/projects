package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes.dex */
public final class v implements com.google.android.play.integrity.internal.b {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5902a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5903b;

    public v(com.google.android.play.integrity.internal.d dVar, com.google.android.play.integrity.internal.d dVar2) {
        this.f5902a = dVar;
        this.f5903b = dVar2;
    }

    @Override // com.google.android.play.integrity.internal.d
    public final /* bridge */ /* synthetic */ Object a() {
        return new t((Context) this.f5902a.a(), (com.google.android.play.integrity.internal.n) this.f5903b.a());
    }
}
