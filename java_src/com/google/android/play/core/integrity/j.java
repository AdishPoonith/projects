package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.c0;
/* loaded from: classes.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    private final j f5878a = this;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5879b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5880c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5881d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.d f5882e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j(Context context, i iVar) {
        p pVar;
        com.google.android.play.integrity.internal.b b10 = com.google.android.play.integrity.internal.c.b(context);
        this.f5879b = b10;
        pVar = o.f5888a;
        com.google.android.play.integrity.internal.d b11 = c0.b(pVar);
        this.f5880c = b11;
        com.google.android.play.integrity.internal.d b12 = c0.b(new v(b10, b11));
        this.f5881d = b12;
        this.f5882e = c0.b(new n(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f5882e.a();
    }
}
