package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public class n1 extends RuntimeException {

    /* renamed from: j  reason: collision with root package name */
    private final List<String> f6276j;

    public n1(s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f6276j = null;
    }

    public c0 a() {
        return new c0(getMessage());
    }
}
