package a3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s1.n1;
import w1.m;
/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f134n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f135d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f136e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f137f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f138g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f139h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f140i;

    /* renamed from: j  reason: collision with root package name */
    public final n1 f141j;

    /* renamed from: k  reason: collision with root package name */
    public final List<n1> f142k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f143l;

    /* renamed from: m  reason: collision with root package name */
    public final List<m> f144m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f145a;

        /* renamed from: b  reason: collision with root package name */
        public final n1 f146b;

        /* renamed from: c  reason: collision with root package name */
        public final String f147c;

        /* renamed from: d  reason: collision with root package name */
        public final String f148d;

        public a(Uri uri, n1 n1Var, String str, String str2) {
            this.f145a = uri;
            this.f146b = n1Var;
            this.f147c = str;
            this.f148d = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f149a;

        /* renamed from: b  reason: collision with root package name */
        public final n1 f150b;

        /* renamed from: c  reason: collision with root package name */
        public final String f151c;

        /* renamed from: d  reason: collision with root package name */
        public final String f152d;

        /* renamed from: e  reason: collision with root package name */
        public final String f153e;

        /* renamed from: f  reason: collision with root package name */
        public final String f154f;

        public b(Uri uri, n1 n1Var, String str, String str2, String str3, String str4) {
            this.f149a = uri;
            this.f150b = n1Var;
            this.f151c = str;
            this.f152d = str2;
            this.f153e = str3;
            this.f154f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new n1.b().U("0").M("application/x-mpegURL").G(), null, null, null, null);
        }

        public b a(n1 n1Var) {
            return new b(this.f149a, n1Var, this.f151c, this.f152d, this.f153e, this.f154f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, n1 n1Var, List<n1> list7, boolean z10, Map<String, String> map, List<m> list8) {
        super(str, list, z10);
        this.f135d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f136e = Collections.unmodifiableList(list2);
        this.f137f = Collections.unmodifiableList(list3);
        this.f138g = Collections.unmodifiableList(list4);
        this.f139h = Collections.unmodifiableList(list5);
        this.f140i = Collections.unmodifiableList(list6);
        this.f141j = n1Var;
        this.f142k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f143l = Collections.unmodifiableMap(map);
        this.f144m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f145a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<t2.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    t2.c cVar = list2.get(i12);
                    if (cVar.f18193k == i10 && cVar.f18194l == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f149a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // t2.a
    /* renamed from: c */
    public h a(List<t2.c> list) {
        return new h(this.f155a, this.f156b, d(this.f136e, 0, list), Collections.emptyList(), d(this.f138g, 1, list), d(this.f139h, 2, list), Collections.emptyList(), this.f141j, this.f142k, this.f157c, this.f143l, this.f144m);
    }
}
