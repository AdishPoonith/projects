package com.google.android.gms.common.api;
/* loaded from: classes.dex */
public final class o extends UnsupportedOperationException {

    /* renamed from: j  reason: collision with root package name */
    private final b4.d f3970j;

    public o(b4.d dVar) {
        this.f3970j = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3970j));
    }
}
