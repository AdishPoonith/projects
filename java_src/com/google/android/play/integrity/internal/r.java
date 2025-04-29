package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ o f5919j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ y f5920k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, TaskCompletionSource taskCompletionSource, o oVar) {
        super(taskCompletionSource);
        this.f5920k = yVar;
        this.f5919j = oVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        y.m(this.f5920k, this.f5919j);
    }
}
