package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0088b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0088b c0088b = new DynamiteModule.b.C0088b();
        int b10 = aVar.b(context, str, true);
        c0088b.f3991b = b10;
        if (b10 != 0) {
            c0088b.f3992c = 1;
        } else {
            int a10 = aVar.a(context, str);
            c0088b.f3990a = a10;
            if (a10 != 0) {
                c0088b.f3992c = -1;
            }
        }
        return c0088b;
    }
}
