package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l implements DynamiteModule.b.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f3994a;

    public l(int i10, int i11) {
        this.f3994a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return this.f3994a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z10) {
        return 0;
    }
}
