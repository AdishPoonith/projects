package io.grpc.internal;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f11706a = new ArrayList<>();

    public x0 a(Object obj) {
        this.f11706a.add(String.valueOf(obj));
        return this;
    }

    public x0 b(String str, Object obj) {
        ArrayList<String> arrayList = this.f11706a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f11706a.toString();
    }
}
