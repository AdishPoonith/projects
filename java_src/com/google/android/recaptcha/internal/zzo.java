package com.google.android.recaptcha.internal;

import da.p;
import kotlin.coroutines.jvm.internal.l;
import la.k0;
import s9.o;
import s9.u;
import v9.d;
/* loaded from: classes.dex */
final class zzo extends l implements p {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(d dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzo(dVar);
    }

    @Override // da.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        return new zzo((d) obj2).invokeSuspend(u.f17878a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w9.d.c();
        o.b(obj);
        Thread.currentThread().setPriority(8);
        return u.f17878a;
    }
}
