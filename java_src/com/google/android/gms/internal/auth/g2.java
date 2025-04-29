package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.e2;
import com.google.android.gms.internal.auth.g2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class g2<MessageType extends g2<MessageType, BuilderType>, BuilderType extends e2<MessageType, BuilderType>> extends a1<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected k4 zzc = k4.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g2 a(Class cls) {
        Map map = zzb;
        g2 g2Var = (g2) map.get(cls);
        if (g2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g2Var = (g2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (g2Var == null) {
            g2Var = (g2) ((g2) u4.e(cls)).g(6, null, null);
            if (g2Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, g2Var);
        }
        return g2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.g2 b(com.google.android.gms.internal.auth.g2 r3, byte[] r4) {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.w1 r1 = com.google.android.gms.internal.auth.w1.f4271b
            r2 = 0
            com.google.android.gms.internal.auth.g2 r3 = h(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.g(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            com.google.android.gms.internal.auth.p3 r1 = com.google.android.gms.internal.auth.p3.a()
            java.lang.Class r2 = r3.getClass()
            com.google.android.gms.internal.auth.s3 r1 = r1.b(r2)
            boolean r1 = r1.c(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.g(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.i4 r4 = new com.google.android.gms.internal.auth.i4
            r4.<init>(r3)
            com.google.android.gms.internal.auth.m2 r4 = r4.a()
            r4.e(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.g2.b(com.google.android.gms.internal.auth.g2, byte[]):com.google.android.gms.internal.auth.g2");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static j2 c() {
        return q3.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object d(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object e(g3 g3Var, String str, Object[] objArr) {
        return new r3(g3Var, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(Class cls, g2 g2Var) {
        zzb.put(cls, g2Var);
    }

    private static g2 h(g2 g2Var, byte[] bArr, int i10, int i11, w1 w1Var) {
        g2 g2Var2 = (g2) g2Var.g(4, null, null);
        try {
            s3 b10 = p3.a().b(g2Var2.getClass());
            b10.a(g2Var2, bArr, 0, i11, new d1(w1Var));
            b10.b(g2Var2);
            if (g2Var2.zza == 0) {
                return g2Var2;
            }
            throw new RuntimeException();
        } catch (i4 e10) {
            m2 a10 = e10.a();
            a10.e(g2Var2);
            throw a10;
        } catch (m2 e11) {
            e11.e(g2Var2);
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof m2) {
                throw ((m2) e12.getCause());
            }
            m2 m2Var = new m2(e12);
            m2Var.e(g2Var2);
            throw m2Var;
        } catch (IndexOutOfBoundsException unused) {
            m2 f10 = m2.f();
            f10.e(g2Var2);
            throw f10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return p3.a().b(getClass()).d(this, (g2) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object g(int i10, Object obj, Object obj2);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zza = p3.a().b(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return i3.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.g3
    public final /* synthetic */ f3 zzd() {
        e2 e2Var = (e2) g(5, null, null);
        e2Var.d(this);
        return e2Var;
    }

    @Override // com.google.android.gms.internal.auth.h3
    public final /* synthetic */ g3 zzh() {
        return (g2) g(6, null, null);
    }
}
