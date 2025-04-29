package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k1 implements t0 {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f7223a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7224b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f7225c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7226d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(v0 v0Var, String str, Object[] objArr) {
        char charAt;
        this.f7223a = v0Var;
        this.f7224b = str;
        this.f7225c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 13;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                charAt = str.charAt(i12);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
            charAt2 = i10 | (charAt << i11);
        }
        this.f7226d = charAt2;
    }

    @Override // com.google.protobuf.t0
    public boolean a() {
        return (this.f7226d & 2) == 2;
    }

    @Override // com.google.protobuf.t0
    public h1 b() {
        return (this.f7226d & 1) == 1 ? h1.PROTO2 : h1.PROTO3;
    }

    @Override // com.google.protobuf.t0
    public v0 c() {
        return this.f7223a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f7225c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f7224b;
    }
}
