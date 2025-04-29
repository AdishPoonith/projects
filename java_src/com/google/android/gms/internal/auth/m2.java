package com.google.android.gms.internal.auth;

import java.io.IOException;
/* loaded from: classes.dex */
public final class m2 extends IOException {

    /* renamed from: j  reason: collision with root package name */
    private g3 f4172j;

    public m2(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f4172j = null;
    }

    public m2(String str) {
        super(str);
        this.f4172j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m2 a() {
        return new m2("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m2 b() {
        return new m2("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m2 c() {
        return new m2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m2 d() {
        return new m2("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m2 f() {
        return new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final m2 e(g3 g3Var) {
        this.f4172j = g3Var;
        return this;
    }
}
