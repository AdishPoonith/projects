package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b0 implements w5.g, FirebaseFirestore.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, FirebaseFirestore> f6729a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final w5.f f6730b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6731c;

    /* renamed from: d  reason: collision with root package name */
    private final s6.a<a6.b> f6732d;

    /* renamed from: e  reason: collision with root package name */
    private final s6.a<z5.b> f6733e;

    /* renamed from: f  reason: collision with root package name */
    private final p6.g0 f6734f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Context context, w5.f fVar, s6.a<a6.b> aVar, s6.a<z5.b> aVar2, p6.g0 g0Var) {
        this.f6731c = context;
        this.f6730b = fVar;
        this.f6732d = aVar;
        this.f6733e = aVar2;
        this.f6734f = g0Var;
        fVar.h(this);
    }

    @Override // w5.g
    public synchronized void a(String str, w5.n nVar) {
        Iterator it = new ArrayList(this.f6729a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).N();
            q6.b.d(!this.f6729a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized FirebaseFirestore b(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = this.f6729a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.H(this.f6731c, this.f6730b, this.f6732d, this.f6733e, str, this, this.f6734f);
            this.f6729a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }

    @Override // com.google.firebase.firestore.FirebaseFirestore.a
    public synchronized void remove(String str) {
        this.f6729a.remove(str);
    }
}
