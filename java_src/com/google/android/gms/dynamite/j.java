package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
final class j implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0088b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0088b c0088b = new DynamiteModule.b.C0088b();
        int a10 = aVar.a(context, str);
        c0088b.f3990a = a10;
        int i10 = 0;
        int b10 = a10 != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0088b.f3991b = b10;
        int i11 = c0088b.f3990a;
        if (i11 != 0) {
            i10 = i11;
        } else if (b10 == 0) {
            c0088b.f3992c = 0;
            return c0088b;
        }
        if (b10 >= i10) {
            c0088b.f3992c = 1;
        } else {
            c0088b.f3992c = -1;
        }
        return c0088b;
    }
}
