package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.o5;
import com.google.android.gms.internal.p000firebaseauthapi.r5;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r5  reason: invalid package */
/* loaded from: classes.dex */
public abstract class r5<MessageType extends r5<MessageType, BuilderType>, BuilderType extends o5<MessageType, BuilderType>> extends v3<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected e8 zzc = e8.c();

    /* JADX INFO: Access modifiers changed from: protected */
    public static r5 A(r5 r5Var, InputStream inputStream, e5 e5Var) {
        q4 q4Var = new q4(inputStream, 4096, null);
        r5 y10 = r5Var.y();
        try {
            j7 b10 = e7.a().b(y10.getClass());
            b10.c(y10, t4.l(q4Var), e5Var);
            b10.zzf(y10);
            r(y10);
            return y10;
        } catch (c8 e10) {
            z5 a10 = e10.a();
            a10.h(y10);
            throw a10;
        } catch (z5 e11) {
            e = e11;
            if (e.l()) {
                e = new z5(e);
            }
            e.h(y10);
            throw e;
        } catch (IOException e12) {
            if (e12.getCause() instanceof z5) {
                throw ((z5) e12.getCause());
            }
            z5 z5Var = new z5(e12);
            z5Var.h(y10);
            throw z5Var;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof z5) {
                throw ((z5) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static r5 B(r5 r5Var, byte[] bArr, e5 e5Var) {
        r5 s10 = s(r5Var, bArr, 0, bArr.length, e5Var);
        r(s10);
        return s10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static w5 g() {
        return f7.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static w5 h(w5 w5Var) {
        int size = w5Var.size();
        return w5Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object i(Method method, Object obj, Object... objArr) {
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
    public static Object j(w6 w6Var, String str, Object[] objArr) {
        return new g7(w6Var, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void m(Class cls, r5 r5Var) {
        r5Var.l();
        zzb.put(cls, r5Var);
    }

    private final int q(j7 j7Var) {
        if (j7Var == null) {
            return e7.a().b(getClass()).zza(this);
        }
        return j7Var.zza(this);
    }

    private static r5 r(r5 r5Var) {
        if (r5Var == null || r5Var.o()) {
            return r5Var;
        }
        z5 a10 = new c8(r5Var).a();
        a10.h(r5Var);
        throw a10;
    }

    private static r5 s(r5 r5Var, byte[] bArr, int i10, int i11, e5 e5Var) {
        r5 y10 = r5Var.y();
        try {
            j7 b10 = e7.a().b(y10.getClass());
            b10.a(y10, bArr, 0, i11, new y3(e5Var));
            b10.zzf(y10);
            return y10;
        } catch (c8 e10) {
            z5 a10 = e10.a();
            a10.h(y10);
            throw a10;
        } catch (z5 e11) {
            e = e11;
            if (e.l()) {
                e = new z5(e);
            }
            e.h(y10);
            throw e;
        } catch (IOException e12) {
            if (e12.getCause() instanceof z5) {
                throw ((z5) e12.getCause());
            }
            z5 z5Var = new z5(e12);
            z5Var.h(y10);
            throw z5Var;
        } catch (IndexOutOfBoundsException unused) {
            z5 j10 = z5.j();
            j10.h(y10);
            throw j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r5 x(Class cls) {
        Map map = zzb;
        r5 r5Var = (r5) map.get(cls);
        if (r5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r5Var = (r5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (r5Var == null) {
            r5Var = (r5) ((r5) o8.j(cls)).t(6, null, null);
            if (r5Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, r5Var);
        }
        return r5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static r5 z(r5 r5Var, m4 m4Var, e5 e5Var) {
        s4 q10 = m4Var.q();
        r5 y10 = r5Var.y();
        try {
            j7 b10 = e7.a().b(y10.getClass());
            b10.c(y10, t4.l(q10), e5Var);
            b10.zzf(y10);
            try {
                q10.A(0);
                r(y10);
                return y10;
            } catch (z5 e10) {
                e10.h(y10);
                throw e10;
            }
        } catch (c8 e11) {
            z5 a10 = e11.a();
            a10.h(y10);
            throw a10;
        } catch (z5 e12) {
            e = e12;
            if (e.l()) {
                e = new z5(e);
            }
            e.h(y10);
            throw e;
        } catch (IOException e13) {
            if (e13.getCause() instanceof z5) {
                throw ((z5) e13.getCause());
            }
            z5 z5Var = new z5(e13);
            z5Var.h(y10);
            throw z5Var;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof z5) {
                throw ((z5) e14.getCause());
            }
            throw e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.v3
    public final int b(j7 j7Var) {
        if (p()) {
            int q10 = q(j7Var);
            if (q10 >= 0) {
                return q10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + q10);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int q11 = q(j7Var);
        if (q11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | q11;
            return q11;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + q11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w6
    public final /* synthetic */ v6 c() {
        return (o5) t(5, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w6
    public final void d(z4 z4Var) {
        e7.a().b(getClass()).b(this, a5.l(z4Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return e7.a().b(getClass()).d(this, (r5) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x6
    public final /* synthetic */ w6 f() {
        return (r5) t(6, null, null);
    }

    public final int hashCode() {
        if (p()) {
            return u();
        }
        int i10 = this.zza;
        if (i10 == 0) {
            int u10 = u();
            this.zza = u10;
            return u10;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        e7.a().b(getClass()).zzf(this);
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean o() {
        byte byteValue = ((Byte) t(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e10 = e7.a().b(getClass()).e(this);
        t(2, true != e10 ? null : this, null);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object t(int i10, Object obj, Object obj2);

    public final String toString() {
        return y6.a(this, super.toString());
    }

    final int u() {
        return e7.a().b(getClass()).zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o5 v() {
        return (o5) t(5, null, null);
    }

    public final o5 w() {
        o5 o5Var = (o5) t(5, null, null);
        o5Var.i(this);
        return o5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r5 y() {
        return (r5) t(4, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w6
    public final int zzs() {
        int i10;
        if (p()) {
            i10 = q(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = q(null);
                if (i10 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
            }
        }
        return i10;
    }
}
