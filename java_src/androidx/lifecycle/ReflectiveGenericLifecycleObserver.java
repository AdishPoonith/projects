package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: j  reason: collision with root package name */
    private final Object f2512j;

    /* renamed from: k  reason: collision with root package name */
    private final a.C0038a f2513k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2512j = obj;
        this.f2513k = a.f2519c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void q(i iVar, e.a aVar) {
        this.f2513k.a(iVar, aVar, this.f2512j);
    }
}
