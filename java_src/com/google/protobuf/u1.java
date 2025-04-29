package com.google.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public class u1 extends RuntimeException {

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f7319j;

    public u1(v0 v0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f7319j = null;
    }

    public e0 a() {
        return new e0(getMessage());
    }
}
