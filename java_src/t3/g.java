package t3;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f18213a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f18214b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, Bundle bundle) {
        this.f18213a = str;
        this.f18214b = bundle;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: t3.i.f(java.lang.Object):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    @Override // t3.h
    public final /* bridge */ /* synthetic */ java.lang.Object a(android.os.IBinder r3) {
        /*
            r2 = this;
            com.google.android.gms.internal.auth.l2 r3 = com.google.android.gms.internal.auth.l1.x(r3)
            java.lang.String r0 = r2.f18213a
            android.os.Bundle r1 = r2.f18214b
            android.os.Bundle r3 = r3.V0(r0, r1)
            t3.i.f(r3)
            java.lang.String r0 = "Error"
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = "booleanResult"
            boolean r3 = r3.getBoolean(r1)
            if (r3 == 0) goto L1f
            r3 = 0
            return r3
        L1f:
            t3.a r3 = new t3.a
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.g.a(android.os.IBinder):java.lang.Object");
    }
}
