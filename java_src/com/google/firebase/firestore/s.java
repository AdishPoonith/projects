package com.google.firebase.firestore;

import j6.l;
import j6.q;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class s {

    /* loaded from: classes.dex */
    static class a extends s {

        /* renamed from: a  reason: collision with root package name */
        private final List<s> f6819a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f6820b;

        public a(List<s> list, l.a aVar) {
            this.f6819a = list;
            this.f6820b = aVar;
        }

        public List<s> m() {
            return this.f6819a;
        }

        public l.a n() {
            return this.f6820b;
        }
    }

    /* loaded from: classes.dex */
    static class b extends s {

        /* renamed from: a  reason: collision with root package name */
        private final q f6821a;

        /* renamed from: b  reason: collision with root package name */
        private final q.b f6822b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f6823c;

        public b(q qVar, q.b bVar, Object obj) {
            this.f6821a = qVar;
            this.f6822b = bVar;
            this.f6823c = obj;
        }

        public q m() {
            return this.f6821a;
        }

        public q.b n() {
            return this.f6822b;
        }

        public Object o() {
            return this.f6823c;
        }
    }

    public static s a(s... sVarArr) {
        return new a(Arrays.asList(sVarArr), l.a.AND);
    }

    public static s b(q qVar, Object obj) {
        return new b(qVar, q.b.ARRAY_CONTAINS, obj);
    }

    public static s c(q qVar, List<? extends Object> list) {
        return new b(qVar, q.b.ARRAY_CONTAINS_ANY, list);
    }

    public static s d(q qVar, Object obj) {
        return new b(qVar, q.b.EQUAL, obj);
    }

    public static s e(q qVar, Object obj) {
        return new b(qVar, q.b.GREATER_THAN, obj);
    }

    public static s f(q qVar, Object obj) {
        return new b(qVar, q.b.GREATER_THAN_OR_EQUAL, obj);
    }

    public static s g(q qVar, List<? extends Object> list) {
        return new b(qVar, q.b.IN, list);
    }

    public static s h(q qVar, Object obj) {
        return new b(qVar, q.b.LESS_THAN, obj);
    }

    public static s i(q qVar, Object obj) {
        return new b(qVar, q.b.LESS_THAN_OR_EQUAL, obj);
    }

    public static s j(q qVar, Object obj) {
        return new b(qVar, q.b.NOT_EQUAL, obj);
    }

    public static s k(q qVar, List<? extends Object> list) {
        return new b(qVar, q.b.NOT_IN, list);
    }

    public static s l(s... sVarArr) {
        return new a(Arrays.asList(sVarArr), l.a.OR);
    }
}
