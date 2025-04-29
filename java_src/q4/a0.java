package q4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class a0 extends c4.h {
    private final s.g R;
    private final s.g S;
    private final s.g T;

    public a0(Context context, Looper looper, c4.e eVar, com.google.android.gms.common.api.internal.e eVar2, com.google.android.gms.common.api.internal.m mVar) {
        super(context, looper, 23, eVar, eVar2, mVar);
        this.R = new s.g();
        this.S = new s.g();
        this.T = new s.g();
    }

    private final boolean l0(b4.d dVar) {
        b4.d dVar2;
        b4.d[] j10 = j();
        if (j10 == null) {
            return false;
        }
        int length = j10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                dVar2 = null;
                break;
            }
            dVar2 = j10[i10];
            if (dVar.B().equals(dVar2.B())) {
                break;
            }
            i10++;
        }
        return dVar2 != null && dVar2.C() >= dVar.C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final String D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // c4.c
    protected final String E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // c4.c
    public final void L(int i10) {
        super.L(i10);
        synchronized (this.R) {
            this.R.clear();
        }
        synchronized (this.S) {
            this.S.clear();
        }
        synchronized (this.T) {
            this.T.clear();
        }
    }

    @Override // c4.c
    public final boolean Q() {
        return true;
    }

    @Override // c4.c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 11717000;
    }

    public final void k0(j.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.S) {
            y yVar = (y) this.S.remove(aVar);
            if (yVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            yVar.zzh();
            if (!z10) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (l0(t4.r.f18250j)) {
                ((b1) C()).X(b0.B(null, yVar, null, null), new q(this, Boolean.TRUE, taskCompletionSource));
            } else {
                ((b1) C()).n0(new f0(2, null, null, yVar, null, new r(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003b, B:12:0x0044, B:14:0x0080, B:13:0x0057, B:9:0x002e), top: B:19:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003b, B:12:0x0044, B:14:0x0080, B:13:0x0057, B:9:0x002e), top: B:19:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(q4.u r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.j r3 = r18.zza()
            com.google.android.gms.common.api.internal.j$a r4 = r3.b()
            r4.getClass()
            b4.d r5 = t4.r.f18250j
            boolean r5 = r1.l0(r5)
            s.g r6 = r1.S
            monitor-enter(r6)
            s.g r7 = r1.S     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L82
            q4.y r7 = (q4.y) r7     // Catch: java.lang.Throwable -> L82
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L28
            goto L2e
        L28:
            r7.H2(r3)     // Catch: java.lang.Throwable -> L82
            r13 = r7
            r7 = r8
            goto L3b
        L2e:
            q4.y r3 = new q4.y     // Catch: java.lang.Throwable -> L82
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L82
            s.g r9 = r1.S     // Catch: java.lang.Throwable -> L82
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L82
            r13 = r3
        L3b:
            r17.x()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r4.a()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            android.os.IInterface r4 = r17.C()     // Catch: java.lang.Throwable -> L82
            q4.b1 r4 = (q4.b1) r4     // Catch: java.lang.Throwable -> L82
            q4.b0 r3 = q4.b0.B(r7, r13, r8, r3)     // Catch: java.lang.Throwable -> L82
            q4.q r5 = new q4.q     // Catch: java.lang.Throwable -> L82
            r5.<init>(r1, r8, r2)     // Catch: java.lang.Throwable -> L82
            r4.T(r3, r0, r5)     // Catch: java.lang.Throwable -> L82
            goto L80
        L57:
            android.os.IInterface r4 = r17.C()     // Catch: java.lang.Throwable -> L82
            q4.b1 r4 = (q4.b1) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L82
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r5.f(r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch: java.lang.Throwable -> L82
            q4.d0 r11 = q4.d0.B(r8, r0)     // Catch: java.lang.Throwable -> L82
            q4.s r15 = new q4.s     // Catch: java.lang.Throwable -> L82
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L82
            q4.f0 r0 = new q4.f0     // Catch: java.lang.Throwable -> L82
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L82
            r4.n0(r0)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a0.m0(q4.u, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c4.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof b1 ? (b1) queryLocalInterface : new a1(iBinder);
    }

    @Override // c4.c
    public final b4.d[] u() {
        return t4.r.f18252l;
    }
}
