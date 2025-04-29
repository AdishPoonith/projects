package o5;

import g5.t;
import g5.x;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final Map<d, o5.c<?, ?>> f14666a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<c, o5.b<?>> f14667b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<d, j<?, ?>> f14668c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<c, i<?>> f14669d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<d, o5.c<?, ?>> f14670a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<c, o5.b<?>> f14671b;

        /* renamed from: c  reason: collision with root package name */
        private final Map<d, j<?, ?>> f14672c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<c, i<?>> f14673d;

        public b() {
            this.f14670a = new HashMap();
            this.f14671b = new HashMap();
            this.f14672c = new HashMap();
            this.f14673d = new HashMap();
        }

        public b(o oVar) {
            this.f14670a = new HashMap(oVar.f14666a);
            this.f14671b = new HashMap(oVar.f14667b);
            this.f14672c = new HashMap(oVar.f14668c);
            this.f14673d = new HashMap(oVar.f14669d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public o e() {
            return new o(this);
        }

        public <SerializationT extends n> b f(o5.b<SerializationT> bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (this.f14671b.containsKey(cVar)) {
                o5.b<?> bVar2 = this.f14671b.get(cVar);
                if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f14671b.put(cVar, bVar);
            }
            return this;
        }

        public <KeyT extends g5.f, SerializationT extends n> b g(o5.c<KeyT, SerializationT> cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f14670a.containsKey(dVar)) {
                o5.c<?, ?> cVar2 = this.f14670a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f14670a.put(dVar, cVar);
            }
            return this;
        }

        public <SerializationT extends n> b h(i<SerializationT> iVar) {
            c cVar = new c(iVar.c(), iVar.b());
            if (this.f14673d.containsKey(cVar)) {
                i<?> iVar2 = this.f14673d.get(cVar);
                if (!iVar2.equals(iVar) || !iVar.equals(iVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f14673d.put(cVar, iVar);
            }
            return this;
        }

        public <ParametersT extends t, SerializationT extends n> b i(j<ParametersT, SerializationT> jVar) {
            d dVar = new d(jVar.b(), jVar.c());
            if (this.f14672c.containsKey(dVar)) {
                j<?, ?> jVar2 = this.f14672c.get(dVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f14672c.put(dVar, jVar);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends n> f14674a;

        /* renamed from: b  reason: collision with root package name */
        private final v5.a f14675b;

        private c(Class<? extends n> cls, v5.a aVar) {
            this.f14674a = cls;
            this.f14675b = aVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f14674a.equals(this.f14674a) && cVar.f14675b.equals(this.f14675b);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f14674a, this.f14675b);
        }

        public String toString() {
            return this.f14674a.getSimpleName() + ", object identifier: " + this.f14675b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f14676a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<? extends n> f14677b;

        private d(Class<?> cls, Class<? extends n> cls2) {
            this.f14676a = cls;
            this.f14677b = cls2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                return dVar.f14676a.equals(this.f14676a) && dVar.f14677b.equals(this.f14677b);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f14676a, this.f14677b);
        }

        public String toString() {
            return this.f14676a.getSimpleName() + " with serialization type: " + this.f14677b.getSimpleName();
        }
    }

    private o(b bVar) {
        this.f14666a = new HashMap(bVar.f14670a);
        this.f14667b = new HashMap(bVar.f14671b);
        this.f14668c = new HashMap(bVar.f14672c);
        this.f14669d = new HashMap(bVar.f14673d);
    }

    public <SerializationT extends n> g5.f e(SerializationT serializationt, x xVar) {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f14667b.containsKey(cVar)) {
            return this.f14667b.get(cVar).d(serializationt, xVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }
}
