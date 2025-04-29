package com.google.protobuf;

import com.google.protobuf.d0;
/* loaded from: classes.dex */
public enum e1 implements d0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: m  reason: collision with root package name */
    private static final d0.d<e1> f7103m = new d0.d<e1>() { // from class: com.google.protobuf.e1.a
        @Override // com.google.protobuf.d0.d
        /* renamed from: b */
        public e1 a(int i10) {
            return e1.b(i10);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f7105j;

    e1(int i10) {
        this.f7105j = i10;
    }

    public static e1 b(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // com.google.protobuf.d0.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f7105j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
