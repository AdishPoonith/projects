package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z5  reason: invalid package */
/* loaded from: classes.dex */
public class z5 extends IOException {

    /* renamed from: j  reason: collision with root package name */
    private w6 f5754j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5755k;

    public z5(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f5754j = null;
    }

    public z5(String str) {
        super(str);
        this.f5754j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y5 a() {
        return new y5("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 b() {
        return new z5("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 c() {
        return new z5("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 d() {
        return new z5("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 e() {
        return new z5("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 f() {
        return new z5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 g() {
        return new z5("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 i() {
        return new z5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z5 j() {
        return new z5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final z5 h(w6 w6Var) {
        this.f5754j = w6Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f5755k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.f5755k;
    }
}
