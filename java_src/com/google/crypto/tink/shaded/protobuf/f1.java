package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f6180a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6181b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f6182c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6183d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.f6180a = s0Var;
        this.f6181b = str;
        this.f6182c = objArr;
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
        this.f6183d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean a() {
        return (this.f6183d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public c1 b() {
        return (this.f6183d & 1) == 1 ? c1.PROTO2 : c1.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public s0 c() {
        return this.f6180a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.f6182c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f6181b;
    }
}
