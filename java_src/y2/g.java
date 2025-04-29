package y2;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f20417a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20418b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f20419c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f20420d;

    /* renamed from: e  reason: collision with root package name */
    public final e f20421e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f20417a = str;
        this.f20418b = j10;
        this.f20419c = Collections.unmodifiableList(list);
        this.f20420d = Collections.unmodifiableList(list2);
        this.f20421e = eVar;
    }

    public int a(int i10) {
        int size = this.f20419c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f20419c.get(i11).f20373b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
