package com.google.firebase.firestore;

import com.google.firebase.firestore.a;
import com.google.firebase.firestore.n;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f6739a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, d7.b0> f6740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar, Map<String, d7.b0> map) {
        q6.x.b(cVar);
        this.f6739a = cVar;
        this.f6740b = map;
    }

    private <T> T a(Object obj, a aVar, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("AggregateField '" + aVar.b() + "' is not a " + cls.getName());
    }

    private Object d(a aVar) {
        if (this.f6740b.containsKey(aVar.b())) {
            return new g1(this.f6739a.c().f6832b, n.a.f6804m).f(this.f6740b.get(aVar.b()));
        }
        throw new IllegalArgumentException("'" + aVar.d() + "(" + aVar.c() + ")' was not requested in the aggregation query.");
    }

    private <T> T f(a aVar, Class<T> cls) {
        return (T) a(d(aVar), aVar, cls);
    }

    public long b(a.b bVar) {
        Long e10 = e(bVar);
        if (e10 != null) {
            return e10.longValue();
        }
        throw new IllegalArgumentException("RunAggregationQueryResponse alias " + bVar.b() + " is null");
    }

    public long c() {
        return b(a.a());
    }

    public Long e(a aVar) {
        Number number = (Number) f(aVar, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f6739a.equals(dVar.f6739a) && this.f6740b.equals(dVar.f6740b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f6739a, this.f6740b);
    }
}
