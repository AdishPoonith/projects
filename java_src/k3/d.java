package k3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import d3.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12527a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12528b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12529c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12530d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12531e;

    /* renamed from: f  reason: collision with root package name */
    public final g f12532f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f12533g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12534h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12535i;

    /* renamed from: j  reason: collision with root package name */
    public final d f12536j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f12537k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f12538l;

    /* renamed from: m  reason: collision with root package name */
    private List<d> f12539m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f12527a = str;
        this.f12528b = str2;
        this.f12535i = str4;
        this.f12532f = gVar;
        this.f12533g = strArr;
        this.f12529c = str2 != null;
        this.f12530d = j10;
        this.f12531e = j11;
        this.f12534h = (String) p3.a.e(str3);
        this.f12536j = dVar;
        this.f12537k = new HashMap<>();
        this.f12538l = new HashMap<>();
    }

    private void b(Map<String, g> map, b.C0115b c0115b, int i10, int i11, int i12) {
        g f10 = f.f(this.f12532f, this.f12533g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0115b.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c0115b.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f12536j, map, i12);
            if ("p".equals(this.f12527a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    c0115b.m((f10.k() * (-90.0f)) / 100.0f);
                }
                if (f10.m() != null) {
                    c0115b.p(f10.m());
                }
                if (f10.h() != null) {
                    c0115b.j(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        a[] aVarArr;
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f12527a);
        boolean equals2 = "div".equals(this.f12527a);
        if (z10 || equals || (equals2 && this.f12535i != null)) {
            long j10 = this.f12530d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f12531e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f12539m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f12539m.size(); i10++) {
            this.f12539m.get(i10).i(treeSet, z10 || equals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, b.C0115b> map) {
        if (!map.containsKey(str)) {
            b.C0115b c0115b = new b.C0115b();
            c0115b.o(new SpannableStringBuilder());
            map.put(str, c0115b);
        }
        return (SpannableStringBuilder) p3.a.e(map.get(str).e());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f12534h)) {
            str = this.f12534h;
        }
        if (m(j10) && "div".equals(this.f12527a) && this.f12535i != null) {
            list.add(new Pair<>(str, this.f12535i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, b.C0115b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f12534h) ? str : this.f12534h;
            Iterator<Map.Entry<String, Integer>> it = this.f12538l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f12537k.containsKey(key) ? this.f12537k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    b(map, (b.C0115b) p3.a.e(map3.get(key)), intValue, intValue2, ((e) p3.a.e(map2.get(str2))).f12549j);
                }
            }
            for (i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, b.C0115b> map) {
        this.f12537k.clear();
        this.f12538l.clear();
        if ("metadata".equals(this.f12527a)) {
            return;
        }
        if (!"".equals(this.f12534h)) {
            str = this.f12534h;
        }
        if (this.f12529c && z10) {
            k(str, map).append((CharSequence) p3.a.e(this.f12528b));
        } else if ("br".equals(this.f12527a) && z10) {
            k(str, map).append('\n');
        } else if (m(j10)) {
            for (Map.Entry<String, b.C0115b> entry : map.entrySet()) {
                this.f12537k.put(entry.getKey(), Integer.valueOf(((CharSequence) p3.a.e(entry.getValue().e())).length()));
            }
            boolean equals = "p".equals(this.f12527a);
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).p(j10, z10 || equals, str, map);
            }
            if (equals) {
                f.c(k(str, map));
            }
            for (Map.Entry<String, b.C0115b> entry2 : map.entrySet()) {
                this.f12538l.put(entry2.getKey(), Integer.valueOf(((CharSequence) p3.a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(d dVar) {
        if (this.f12539m == null) {
            this.f12539m = new ArrayList();
        }
        this.f12539m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f12539m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f12539m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<d3.b> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f12534h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f12534h, treeMap);
        o(j10, map, map2, this.f12534h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) p3.a.e(map2.get(pair.first));
                arrayList2.add(new b.C0115b().f(decodeByteArray).k(eVar.f12541b).l(0).h(eVar.f12542c, 0).i(eVar.f12544e).n(eVar.f12545f).g(eVar.f12546g).r(eVar.f12549j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) p3.a.e(map2.get(entry.getKey()));
            b.C0115b c0115b = (b.C0115b) entry.getValue();
            e((SpannableStringBuilder) p3.a.e(c0115b.e()));
            c0115b.h(eVar2.f12542c, eVar2.f12543d);
            c0115b.i(eVar2.f12544e);
            c0115b.k(eVar2.f12541b);
            c0115b.n(eVar2.f12545f);
            c0115b.q(eVar2.f12548i, eVar2.f12547h);
            c0115b.r(eVar2.f12549j);
            arrayList2.add(c0115b.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f12533g;
    }

    public boolean m(long j10) {
        long j11 = this.f12530d;
        return (j11 == -9223372036854775807L && this.f12531e == -9223372036854775807L) || (j11 <= j10 && this.f12531e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f12531e) || (j11 <= j10 && j10 < this.f12531e));
    }
}
