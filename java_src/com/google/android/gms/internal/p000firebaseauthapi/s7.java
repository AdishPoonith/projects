package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s7  reason: invalid package */
/* loaded from: classes.dex */
final class s7 implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    private int f5334j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5335k;

    /* renamed from: l  reason: collision with root package name */
    private Iterator f5336l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ w7 f5337m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s7(w7 w7Var, r7 r7Var) {
        this.f5337m = w7Var;
    }

    private final Iterator a() {
        Map map;
        if (this.f5336l == null) {
            map = this.f5337m.f5581l;
            this.f5336l = map.entrySet().iterator();
        }
        return this.f5336l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f5334j + 1;
        list = this.f5337m.f5580k;
        if (i10 >= list.size()) {
            map = this.f5337m.f5581l;
            return !map.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f5335k = true;
        int i10 = this.f5334j + 1;
        this.f5334j = i10;
        list = this.f5337m.f5580k;
        if (i10 < list.size()) {
            list2 = this.f5337m.f5580k;
            next = list2.get(this.f5334j);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f5335k) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f5335k = false;
        this.f5337m.n();
        int i10 = this.f5334j;
        list = this.f5337m.f5580k;
        if (i10 >= list.size()) {
            a().remove();
            return;
        }
        w7 w7Var = this.f5337m;
        int i11 = this.f5334j;
        this.f5334j = i11 - 1;
        w7Var.l(i11);
    }
}
