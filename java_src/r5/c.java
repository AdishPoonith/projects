package r5;

import g5.j;
import g5.t;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final r5.a f16694a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C0243c> f16695b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f16696c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<C0243c> f16697a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private r5.a f16698b = r5.a.f16691b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f16699c = null;

        private boolean c(int i10) {
            Iterator<C0243c> it = this.f16697a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b a(j jVar, int i10, t tVar) {
            ArrayList<C0243c> arrayList = this.f16697a;
            if (arrayList != null) {
                arrayList.add(new C0243c(jVar, i10, tVar));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public c b() {
            if (this.f16697a != null) {
                Integer num = this.f16699c;
                if (num == null || c(num.intValue())) {
                    c cVar = new c(this.f16698b, Collections.unmodifiableList(this.f16697a), this.f16699c);
                    this.f16697a = null;
                    return cVar;
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        public b d(r5.a aVar) {
            if (this.f16697a != null) {
                this.f16698b = aVar;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        public b e(int i10) {
            if (this.f16697a != null) {
                this.f16699c = Integer.valueOf(i10);
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    /* renamed from: r5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0243c {

        /* renamed from: a  reason: collision with root package name */
        private final j f16700a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16701b;

        /* renamed from: c  reason: collision with root package name */
        private final t f16702c;

        private C0243c(j jVar, int i10, t tVar) {
            this.f16700a = jVar;
            this.f16701b = i10;
            this.f16702c = tVar;
        }

        public int a() {
            return this.f16701b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0243c) {
                C0243c c0243c = (C0243c) obj;
                return this.f16700a == c0243c.f16700a && this.f16701b == c0243c.f16701b && this.f16702c.equals(c0243c.f16702c);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f16700a, Integer.valueOf(this.f16701b), Integer.valueOf(this.f16702c.hashCode()));
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, parameters='%s')", this.f16700a, Integer.valueOf(this.f16701b), this.f16702c);
        }
    }

    private c(r5.a aVar, List<C0243c> list, Integer num) {
        this.f16694a = aVar;
        this.f16695b = list;
        this.f16696c = num;
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f16694a.equals(cVar.f16694a) && this.f16695b.equals(cVar.f16695b) && Objects.equals(this.f16696c, cVar.f16696c);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f16694a, this.f16695b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f16694a, this.f16695b, this.f16696c);
    }
}
