package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class g1 extends i1 {

    /* renamed from: j  reason: collision with root package name */
    private int f4058j = 0;

    /* renamed from: k  reason: collision with root package name */
    private final int f4059k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ q1 f4060l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(q1 q1Var) {
        this.f4060l = q1Var;
        this.f4059k = q1Var.k();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4058j < this.f4059k;
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final byte zza() {
        int i10 = this.f4058j;
        if (i10 < this.f4059k) {
            this.f4058j = i10 + 1;
            return this.f4060l.e(i10);
        }
        throw new NoSuchElementException();
    }
}
