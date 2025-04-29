package y2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p3.n0;
/* loaded from: classes.dex */
public class c implements t2.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f20382a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20383b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20384c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20385d;

    /* renamed from: e  reason: collision with root package name */
    public final long f20386e;

    /* renamed from: f  reason: collision with root package name */
    public final long f20387f;

    /* renamed from: g  reason: collision with root package name */
    public final long f20388g;

    /* renamed from: h  reason: collision with root package name */
    public final long f20389h;

    /* renamed from: i  reason: collision with root package name */
    public final o f20390i;

    /* renamed from: j  reason: collision with root package name */
    public final l f20391j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f20392k;

    /* renamed from: l  reason: collision with root package name */
    public final h f20393l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f20394m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f20382a = j10;
        this.f20383b = j11;
        this.f20384c = j12;
        this.f20385d = z10;
        this.f20386e = j13;
        this.f20387f = j14;
        this.f20388g = j15;
        this.f20389h = j16;
        this.f20393l = hVar;
        this.f20390i = oVar;
        this.f20392k = uri;
        this.f20391j = lVar;
        this.f20394m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<t2.c> linkedList) {
        t2.c poll = linkedList.poll();
        int i10 = poll.f18192j;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f18193k;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f20374c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f18194l));
                poll = linkedList.poll();
                if (poll.f18192j != i10) {
                    break;
                }
            } while (poll.f18193k == i11);
            arrayList.add(new a(aVar.f20372a, aVar.f20373b, arrayList2, aVar.f20375d, aVar.f20376e, aVar.f20377f));
        } while (poll.f18192j == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // t2.a
    /* renamed from: b */
    public final c a(List<t2.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new t2.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((t2.c) linkedList.peek()).f18192j != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j10 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f20417a, d10.f20418b - j10, c(d10.f20419c, linkedList), d10.f20420d));
            }
            i10++;
        }
        long j11 = this.f20383b;
        return new c(this.f20382a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f20384c, this.f20385d, this.f20386e, this.f20387f, this.f20388g, this.f20389h, this.f20393l, this.f20390i, this.f20391j, this.f20392k, arrayList);
    }

    public final g d(int i10) {
        return this.f20394m.get(i10);
    }

    public final int e() {
        return this.f20394m.size();
    }

    public final long f(int i10) {
        if (i10 == this.f20394m.size() - 1) {
            long j10 = this.f20383b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - this.f20394m.get(i10).f20418b;
        }
        return this.f20394m.get(i10 + 1).f20418b - this.f20394m.get(i10).f20418b;
    }

    public final long g(int i10) {
        return n0.B0(f(i10));
    }
}
