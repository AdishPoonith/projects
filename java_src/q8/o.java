package q8;

import java.util.HashMap;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<Object> f16457a;

    public o(e8.a aVar) {
        this.f16457a = new r8.a<>(aVar, "flutter/system", r8.f.f16775a);
    }

    public void a() {
        d8.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f16457a.c(hashMap);
    }
}
