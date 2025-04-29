package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.na  reason: invalid package */
/* loaded from: classes.dex */
public final class na {

    /* renamed from: a  reason: collision with root package name */
    private final js f5059a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5060b;

    /* renamed from: c  reason: collision with root package name */
    private final an f5061c = an.f4357b;

    private na(js jsVar, List list) {
        this.f5059a = jsVar;
        this.f5060b = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final na a(js jsVar) {
        l(jsVar);
        return new na(jsVar, k(jsVar));
    }

    public static final na h(t9 t9Var, s9 s9Var) {
        byte[] bArr = new byte[0];
        qq a10 = t9Var.a();
        if (a10 == null || a10.F().k() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            js I = js.I(s9Var.a(a10.F().z(), bArr), e5.a());
            l(I);
            return a(I);
        } catch (z5 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static mk i(is isVar) {
        try {
            return mk.a(isVar.D().H(), isVar.D().G(), isVar.D().D(), isVar.G(), isVar.G() == ct.RAW ? null : Integer.valueOf(isVar.C()));
        } catch (GeneralSecurityException e10) {
            throw new wk("Creating a protokey serialization failed", e10);
        }
    }

    private static Object j(is isVar, Class cls) {
        try {
            vr D = isVar.D();
            int i10 = gb.f4622g;
            return gb.e(D.H(), D.G(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List k(js jsVar) {
        ia iaVar;
        ArrayList arrayList = new ArrayList(jsVar.C());
        for (is isVar : jsVar.J()) {
            int C = isVar.C();
            try {
                aa a10 = rj.b().a(i(isVar), hb.a());
                int L = isVar.L() - 2;
                if (L == 1) {
                    iaVar = ia.f4738b;
                } else if (L == 2) {
                    iaVar = ia.f4739c;
                } else if (L != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                    break;
                } else {
                    iaVar = ia.f4740d;
                }
                arrayList.add(new ma(a10, iaVar, C, C == jsVar.D(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void l(js jsVar) {
        if (jsVar == null || jsVar.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object m(aa aaVar, Class cls) {
        try {
            int i10 = gb.f4622g;
            return qj.a().c(aaVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final na b() {
        if (this.f5059a != null) {
            fs E = js.E();
            for (is isVar : this.f5059a.J()) {
                vr D = isVar.D();
                if (D.D() != ur.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                String H = D.H();
                m4 G = D.G();
                ba a10 = gb.a(H);
                if (!(a10 instanceof db)) {
                    throw new GeneralSecurityException("manager for key type " + H + " is not a PrivateKeyManager");
                }
                vr a11 = ((db) a10).a(G);
                String H2 = a11.H();
                gb.a(H2).e(a11.G());
                hs hsVar = (hs) isVar.w();
                hsVar.r(a11);
                E.s((is) hsVar.j());
            }
            E.t(this.f5059a.D());
            return a((js) E.j());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final js c() {
        return this.f5059a;
    }

    public final os d() {
        return ib.a(this.f5059a);
    }

    public final Object e(Class cls) {
        Class d10 = gb.d(cls);
        if (d10 != null) {
            js jsVar = this.f5059a;
            Charset charset = ib.f4742a;
            int D = jsVar.D();
            int i10 = 0;
            boolean z10 = false;
            boolean z11 = true;
            for (is isVar : jsVar.J()) {
                if (isVar.L() == 3) {
                    if (!isVar.K()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(isVar.C())));
                    }
                    if (isVar.G() == ct.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(isVar.C())));
                    }
                    if (isVar.L() == 2) {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(isVar.C())));
                    }
                    if (isVar.C() == D) {
                        if (z10) {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z10 = true;
                    }
                    z11 &= isVar.D().D() == ur.ASYMMETRIC_PUBLIC;
                    i10++;
                }
            }
            if (i10 != 0) {
                if (z10 || z11) {
                    wa waVar = new wa(d10, null);
                    waVar.c(this.f5061c);
                    for (int i11 = 0; i11 < this.f5059a.C(); i11++) {
                        is F = this.f5059a.F(i11);
                        if (F.L() == 3) {
                            Object j10 = j(F, d10);
                            Object m10 = this.f5060b.get(i11) != null ? m(((ma) this.f5060b.get(i11)).a(), d10) : null;
                            if (m10 == null && j10 == null) {
                                String obj = d10.toString();
                                String H = F.D().H();
                                throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + H);
                            } else if (F.C() == this.f5059a.D()) {
                                waVar.b(m10, j10, F);
                            } else {
                                waVar.a(m10, j10, F);
                            }
                        }
                    }
                    return qj.a().d(waVar.d(), cls);
                }
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final void f(qa qaVar, s9 s9Var) {
        byte[] bArr = new byte[0];
        js jsVar = this.f5059a;
        byte[] b10 = s9Var.b(jsVar.a(), bArr);
        try {
            if (!js.I(s9Var.a(b10, bArr), e5.a()).equals(jsVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            int length = b10.length;
            pq C = qq.C();
            C.r(m4.w(b10, 0, length));
            C.s(ib.a(jsVar));
            qaVar.b((qq) C.j());
        } catch (z5 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.internal.p000firebaseauthapi.qa r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.js r0 = r4.f5059a
            java.util.List r0 = r0.J()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.is r1 = (com.google.android.gms.internal.p000firebaseauthapi.is) r1
            com.google.android.gms.internal.firebase-auth-api.vr r2 = r1.D()
            com.google.android.gms.internal.firebase-auth-api.ur r2 = r2.D()
            com.google.android.gms.internal.firebase-auth-api.ur r3 = com.google.android.gms.internal.p000firebaseauthapi.ur.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.vr r2 = r1.D()
            com.google.android.gms.internal.firebase-auth-api.ur r2 = r2.D()
            com.google.android.gms.internal.firebase-auth-api.ur r3 = com.google.android.gms.internal.p000firebaseauthapi.ur.SYMMETRIC
            if (r2 == r3) goto L3b
            com.google.android.gms.internal.firebase-auth-api.vr r2 = r1.D()
            com.google.android.gms.internal.firebase-auth-api.ur r2 = r2.D()
            com.google.android.gms.internal.firebase-auth-api.ur r3 = com.google.android.gms.internal.p000firebaseauthapi.ur.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L3b
            goto La
        L3b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.vr r3 = r1.D()
            com.google.android.gms.internal.firebase-auth-api.ur r3 = r3.D()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.vr r1 = r1.D()
            java.lang.String r1 = r1.H()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L64:
            com.google.android.gms.internal.firebase-auth-api.js r0 = r4.f5059a
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.na.g(com.google.android.gms.internal.firebase-auth-api.qa):void");
    }

    public final String toString() {
        return ib.a(this.f5059a).toString();
    }
}
