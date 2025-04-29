package com.google.firebase.firestore;

import j6.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class w0 implements Iterable<v0> {

    /* renamed from: j  reason: collision with root package name */
    private final u0 f6841j;

    /* renamed from: k  reason: collision with root package name */
    private final y1 f6842k;

    /* renamed from: l  reason: collision with root package name */
    private final FirebaseFirestore f6843l;

    /* renamed from: m  reason: collision with root package name */
    private List<h> f6844m;

    /* renamed from: n  reason: collision with root package name */
    private n0 f6845n;

    /* renamed from: o  reason: collision with root package name */
    private final z0 f6846o;

    /* loaded from: classes.dex */
    private class a implements Iterator<v0> {

        /* renamed from: j  reason: collision with root package name */
        private final Iterator<m6.i> f6847j;

        a(Iterator<m6.i> it) {
            this.f6847j = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public v0 next() {
            return w0.this.e(this.f6847j.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6847j.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(u0 u0Var, y1 y1Var, FirebaseFirestore firebaseFirestore) {
        this.f6841j = (u0) q6.x.b(u0Var);
        this.f6842k = (y1) q6.x.b(y1Var);
        this.f6843l = (FirebaseFirestore) q6.x.b(firebaseFirestore);
        this.f6846o = new z0(y1Var.j(), y1Var.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 e(m6.i iVar) {
        return v0.h(this.f6843l, iVar, this.f6842k.k(), this.f6842k.f().contains(iVar.getKey()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return this.f6843l.equals(w0Var.f6843l) && this.f6841j.equals(w0Var.f6841j) && this.f6842k.equals(w0Var.f6842k) && this.f6846o.equals(w0Var.f6846o);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f6843l.hashCode() * 31) + this.f6841j.hashCode()) * 31) + this.f6842k.hashCode()) * 31) + this.f6846o.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<v0> iterator() {
        return new a(this.f6842k.e().iterator());
    }

    public List<h> k() {
        return l(n0.EXCLUDE);
    }

    public List<h> l(n0 n0Var) {
        if (n0.INCLUDE.equals(n0Var) && this.f6842k.b()) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f6844m == null || this.f6845n != n0Var) {
            this.f6844m = Collections.unmodifiableList(h.a(this.f6843l, n0Var, this.f6842k));
            this.f6845n = n0Var;
        }
        return this.f6844m;
    }

    public List<n> m() {
        ArrayList arrayList = new ArrayList(this.f6842k.e().size());
        Iterator<m6.i> it = this.f6842k.e().iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next()));
        }
        return arrayList;
    }

    public z0 p() {
        return this.f6846o;
    }
}
