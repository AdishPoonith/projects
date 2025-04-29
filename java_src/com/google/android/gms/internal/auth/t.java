package com.google.android.gms.internal.auth;

import android.os.Binder;
/* loaded from: classes.dex */
public final /* synthetic */ class t {
    public static Object a(u uVar) {
        try {
            return uVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return uVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
