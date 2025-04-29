package z1;

import p3.a0;
import p3.n0;
import p3.r;
/* loaded from: classes.dex */
final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f20698a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20699b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20700c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20701d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20702e;

    /* renamed from: f  reason: collision with root package name */
    public final int f20703f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f20698a = i10;
        this.f20699b = i11;
        this.f20700c = i12;
        this.f20701d = i13;
        this.f20702e = i14;
        this.f20703f = i15;
    }

    public static d d(a0 a0Var) {
        int t10 = a0Var.t();
        a0Var.U(12);
        int t11 = a0Var.t();
        int t12 = a0Var.t();
        int t13 = a0Var.t();
        a0Var.U(4);
        int t14 = a0Var.t();
        int t15 = a0Var.t();
        a0Var.U(8);
        return new d(t10, t11, t12, t13, t14, t15);
    }

    @Override // z1.a
    public int a() {
        return 1752331379;
    }

    public long b() {
        return n0.N0(this.f20702e, this.f20700c * 1000000, this.f20701d);
    }

    public int c() {
        int i10 = this.f20698a;
        if (i10 != 1935960438) {
            if (i10 != 1935963489) {
                if (i10 != 1937012852) {
                    r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f20698a));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }
}
