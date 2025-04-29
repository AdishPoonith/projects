package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.j;
/* loaded from: classes.dex */
public class k {
    public static <L> j<L> a(L l10, Looper looper, String str) {
        c4.s.k(l10, "Listener must not be null");
        c4.s.k(looper, "Looper must not be null");
        c4.s.k(str, "Listener type must not be null");
        return new j<>(looper, l10, str);
    }

    public static <L> j.a<L> b(L l10, String str) {
        c4.s.k(l10, "Listener must not be null");
        c4.s.k(str, "Listener type must not be null");
        c4.s.g(str, "Listener type must not be empty");
        return new j.a<>(l10, str);
    }
}
