package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
import s9.u;
/* loaded from: classes.dex */
public abstract class zzbd implements InvocationHandler {
    private final Object zza;

    public zzbd(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (l.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (l.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (l.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0 && objArr[0].hashCode() == obj.hashCode()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else if (zza(obj, method, objArr)) {
            if ((this.zza == null && l.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && l.a(zzeg.zza(obj2.getClass()), zzeg.zza(method.getReturnType())))) {
                Object obj3 = this.zza;
                return obj3 == null ? u.f17878a : obj3;
            }
            Object obj4 = this.zza;
            Class<?> returnType = method.getReturnType();
            throw new IllegalArgumentException(obj4 + " cannot be returned from method with return type " + returnType);
        } else {
            return u.f17878a;
        }
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
