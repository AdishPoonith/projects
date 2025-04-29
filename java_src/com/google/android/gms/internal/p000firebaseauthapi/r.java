package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Type;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r  reason: invalid package */
/* loaded from: classes.dex */
public final class r {
    public static Object a(String str, Type type) {
        if (type != String.class) {
            if (type != Void.class) {
                try {
                    try {
                        return ((t) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                    } catch (Exception e10) {
                        throw new sx("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
                    }
                } catch (Exception e11) {
                    throw new sx("Instantiation of JsonResponse failed! ".concat(type.toString()), e11);
                }
            }
            return null;
        }
        try {
            l1 l1Var = new l1();
            l1Var.a(str);
            if (l1Var.c()) {
                return l1Var.b();
            }
            throw new sx("No error message: " + str);
        } catch (Exception e12) {
            throw new sx("Json conversion failed! ".concat(String.valueOf(e12.getMessage())), e12);
        }
    }
}
