package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class b4 implements Iterator {

    /* renamed from: j  reason: collision with root package name */
    private int f4023j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4024k;

    /* renamed from: l  reason: collision with root package name */
    private Iterator f4025l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ f4 f4026m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ b4(f4 f4Var, a4 a4Var) {
        this.f4026m = f4Var;
    }

    private final Iterator a() {
        Map map;
        if (this.f4025l == null) {
            map = this.f4026m.f4052l;
            this.f4025l = map.entrySet().iterator();
        }
        return this.f4025l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f4023j + 1;
        list = this.f4026m.f4051k;
        if (i10 >= list.size()) {
            map = this.f4026m.f4052l;
            return !map.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f4024k = true;
        int i10 = this.f4023j + 1;
        this.f4023j = i10;
        list = this.f4026m.f4051k;
        if (i10 < list.size()) {
            list2 = this.f4026m.f4051k;
            next = list2.get(this.f4023j);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f4024k) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f4024k = false;
        this.f4026m.n();
        int i10 = this.f4023j;
        list = this.f4026m.f4051k;
        if (i10 >= list.size()) {
            a().remove();
            return;
        }
        f4 f4Var = this.f4026m;
        int i11 = this.f4023j;
        this.f4023j = i11 - 1;
        f4Var.l(i11);
    }
}
