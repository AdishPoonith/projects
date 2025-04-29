package io.grpc.internal;

import i9.m0;
import i9.y0;
import io.grpc.internal.a;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class u0 extends a.c {

    /* renamed from: w  reason: collision with root package name */
    private static final m0.a<Integer> f11671w;

    /* renamed from: x  reason: collision with root package name */
    private static final y0.g<Integer> f11672x;

    /* renamed from: s  reason: collision with root package name */
    private i9.j1 f11673s;

    /* renamed from: t  reason: collision with root package name */
    private i9.y0 f11674t;

    /* renamed from: u  reason: collision with root package name */
    private Charset f11675u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11676v;

    /* loaded from: classes.dex */
    class a implements m0.a<Integer> {
        a() {
        }

        @Override // i9.y0.j
        /* renamed from: c */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, i9.m0.f9986a));
        }

        @Override // i9.y0.j
        /* renamed from: d */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f11671w = aVar;
        f11672x = i9.m0.b(":status", aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u0(int i10, i2 i2Var, o2 o2Var) {
        super(i10, i2Var, o2Var);
        this.f11675u = b5.d.f2950c;
    }

    private static Charset O(i9.y0 y0Var) {
        String str = (String) y0Var.g(r0.f11580j);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return b5.d.f2950c;
    }

    private i9.j1 Q(i9.y0 y0Var) {
        i9.j1 j1Var = (i9.j1) y0Var.g(i9.o0.f10006b);
        if (j1Var != null) {
            return j1Var.q((String) y0Var.g(i9.o0.f10005a));
        }
        if (this.f11676v) {
            return i9.j1.f9925h.q("missing GRPC status in response");
        }
        Integer num = (Integer) y0Var.g(f11672x);
        return (num != null ? r0.l(num.intValue()) : i9.j1.f9937t.q("missing HTTP status code")).e("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(i9.y0 y0Var) {
        y0Var.e(f11672x);
        y0Var.e(i9.o0.f10006b);
        y0Var.e(i9.o0.f10005a);
    }

    private i9.j1 V(i9.y0 y0Var) {
        Integer num = (Integer) y0Var.g(f11672x);
        if (num == null) {
            return i9.j1.f9937t.q("Missing HTTP status code");
        }
        String str = (String) y0Var.g(r0.f11580j);
        if (r0.m(str)) {
            return null;
        }
        i9.j1 l10 = r0.l(num.intValue());
        return l10.e("invalid content-type: " + str);
    }

    protected abstract void P(i9.j1 j1Var, boolean z10, i9.y0 y0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(v1 v1Var, boolean z10) {
        i9.j1 j1Var = this.f11673s;
        if (j1Var != null) {
            this.f11673s = j1Var.e("DATA-----------------------------\n" + w1.e(v1Var, this.f11675u));
            v1Var.close();
            if (this.f11673s.n().length() > 1000 || z10) {
                P(this.f11673s, false, this.f11674t);
            }
        } else if (!this.f11676v) {
            P(i9.j1.f9937t.q("headers not received before payload"), false, new i9.y0());
        } else {
            int c10 = v1Var.c();
            D(v1Var);
            if (z10) {
                this.f11673s = i9.j1.f9937t.q(c10 > 0 ? "Received unexpected EOS on non-empty DATA frame from server" : "Received unexpected EOS on empty DATA frame from server");
                i9.y0 y0Var = new i9.y0();
                this.f11674t = y0Var;
                N(this.f11673s, false, y0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    public void T(i9.y0 y0Var) {
        b5.n.o(y0Var, "headers");
        i9.j1 j1Var = this.f11673s;
        if (j1Var != null) {
            this.f11673s = j1Var.e("headers: " + y0Var);
            return;
        }
        try {
            if (this.f11676v) {
                i9.j1 q10 = i9.j1.f9937t.q("Received headers twice");
                this.f11673s = q10;
                if (q10 != null) {
                    this.f11673s = q10.e("headers: " + y0Var);
                    this.f11674t = y0Var;
                    this.f11675u = O(y0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) y0Var.g(f11672x);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                i9.j1 j1Var2 = this.f11673s;
                if (j1Var2 != null) {
                    this.f11673s = j1Var2.e("headers: " + y0Var);
                    this.f11674t = y0Var;
                    this.f11675u = O(y0Var);
                    return;
                }
                return;
            }
            this.f11676v = true;
            i9.j1 V = V(y0Var);
            this.f11673s = V;
            if (V != null) {
                if (V != null) {
                    this.f11673s = V.e("headers: " + y0Var);
                    this.f11674t = y0Var;
                    this.f11675u = O(y0Var);
                    return;
                }
                return;
            }
            R(y0Var);
            E(y0Var);
            i9.j1 j1Var3 = this.f11673s;
            if (j1Var3 != null) {
                this.f11673s = j1Var3.e("headers: " + y0Var);
                this.f11674t = y0Var;
                this.f11675u = O(y0Var);
            }
        } catch (Throwable th) {
            i9.j1 j1Var4 = this.f11673s;
            if (j1Var4 != null) {
                this.f11673s = j1Var4.e("headers: " + y0Var);
                this.f11674t = y0Var;
                this.f11675u = O(y0Var);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(i9.y0 y0Var) {
        b5.n.o(y0Var, "trailers");
        if (this.f11673s == null && !this.f11676v) {
            i9.j1 V = V(y0Var);
            this.f11673s = V;
            if (V != null) {
                this.f11674t = y0Var;
            }
        }
        i9.j1 j1Var = this.f11673s;
        if (j1Var == null) {
            i9.j1 Q = Q(y0Var);
            R(y0Var);
            F(y0Var, Q);
            return;
        }
        i9.j1 e10 = j1Var.e("trailers: " + y0Var);
        this.f11673s = e10;
        P(e10, false, this.f11674t);
    }

    @Override // io.grpc.internal.a.c, io.grpc.internal.l1.b
    public /* bridge */ /* synthetic */ void e(boolean z10) {
        super.e(z10);
    }
}
