package com.google.android.play.integrity.internal;

import android.os.IBinder;
import java.util.List;
/* loaded from: classes.dex */
final class u extends o {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ IBinder f5922j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ x f5923k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(x xVar, IBinder iBinder) {
        this.f5923k = xVar;
        this.f5922j = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        List<Runnable> list;
        List list2;
        this.f5923k.f5925j.f5939m = j.p(this.f5922j);
        y.n(this.f5923k.f5925j);
        this.f5923k.f5925j.f5933g = false;
        list = this.f5923k.f5925j.f5930d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f5923k.f5925j.f5930d;
        list2.clear();
    }
}
