package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public class c0 extends IOException {

    /* renamed from: j  reason: collision with root package name */
    private s0 f6132j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6133k;

    /* loaded from: classes.dex */
    public static class a extends c0 {
        public a(String str) {
            super(str);
        }
    }

    public c0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f6132j = null;
    }

    public c0(String str) {
        super(str);
        this.f6132j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 b() {
        return new c0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 c() {
        return new c0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 d() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 f() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 g() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 h() {
        return new c0("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 i() {
        return new c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 k() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f6133k;
    }

    public c0 j(s0 s0Var) {
        this.f6132j = s0Var;
        return this;
    }
}
