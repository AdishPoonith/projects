package m9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final okio.f f13905a = okio.f.i(":");

    /* renamed from: b  reason: collision with root package name */
    private static final d[] f13906b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<okio.f, Integer> f13907c;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f13908a;

        /* renamed from: b  reason: collision with root package name */
        private final okio.e f13909b;

        /* renamed from: c  reason: collision with root package name */
        private int f13910c;

        /* renamed from: d  reason: collision with root package name */
        private int f13911d;

        /* renamed from: e  reason: collision with root package name */
        d[] f13912e;

        /* renamed from: f  reason: collision with root package name */
        int f13913f;

        /* renamed from: g  reason: collision with root package name */
        int f13914g;

        /* renamed from: h  reason: collision with root package name */
        int f13915h;

        a(int i10, int i11, n nVar) {
            this.f13908a = new ArrayList();
            d[] dVarArr = new d[8];
            this.f13912e = dVarArr;
            this.f13913f = dVarArr.length - 1;
            this.f13914g = 0;
            this.f13915h = 0;
            this.f13910c = i10;
            this.f13911d = i11;
            this.f13909b = okio.g.b(nVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, n nVar) {
            this(i10, i10, nVar);
        }

        private void a() {
            int i10 = this.f13911d;
            int i11 = this.f13915h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f13912e, (Object) null);
            this.f13913f = this.f13912e.length - 1;
            this.f13914g = 0;
            this.f13915h = 0;
        }

        private int c(int i10) {
            return this.f13913f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f13912e.length;
                while (true) {
                    length--;
                    i11 = this.f13913f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f13912e;
                    i10 -= dVarArr[length].f13899c;
                    this.f13915h -= dVarArr[length].f13899c;
                    this.f13914g--;
                    i12++;
                }
                d[] dVarArr2 = this.f13912e;
                System.arraycopy(dVarArr2, i11 + 1, dVarArr2, i11 + 1 + i12, this.f13914g);
                this.f13913f += i12;
            }
            return i12;
        }

        private okio.f f(int i10) {
            d dVar;
            if (!i(i10)) {
                int c10 = c(i10 - f.f13906b.length);
                if (c10 >= 0) {
                    d[] dVarArr = this.f13912e;
                    if (c10 < dVarArr.length) {
                        dVar = dVarArr[c10];
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            dVar = f.f13906b[i10];
            return dVar.f13897a;
        }

        private void h(int i10, d dVar) {
            this.f13908a.add(dVar);
            int i11 = dVar.f13899c;
            if (i10 != -1) {
                i11 -= this.f13912e[c(i10)].f13899c;
            }
            int i12 = this.f13911d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f13915h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f13914g + 1;
                d[] dVarArr = this.f13912e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f13913f = this.f13912e.length - 1;
                    this.f13912e = dVarArr2;
                }
                int i14 = this.f13913f;
                this.f13913f = i14 - 1;
                this.f13912e[i14] = dVar;
                this.f13914g++;
            } else {
                this.f13912e[i10 + c(i10) + d10] = dVar;
            }
            this.f13915h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= f.f13906b.length - 1;
        }

        private int j() {
            return this.f13909b.readByte() & 255;
        }

        private void m(int i10) {
            if (i(i10)) {
                this.f13908a.add(f.f13906b[i10]);
                return;
            }
            int c10 = c(i10 - f.f13906b.length);
            if (c10 >= 0) {
                d[] dVarArr = this.f13912e;
                if (c10 <= dVarArr.length - 1) {
                    this.f13908a.add(dVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void o(int i10) {
            h(-1, new d(f(i10), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i10) {
            this.f13908a.add(new d(f(i10), k()));
        }

        private void r() {
            this.f13908a.add(new d(f.e(k()), k()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f13908a);
            this.f13908a.clear();
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void g(int i10) {
            this.f13910c = i10;
            this.f13911d = i10;
            a();
        }

        okio.f k() {
            int j10 = j();
            boolean z10 = (j10 & 128) == 128;
            int n10 = n(j10, 127);
            return z10 ? okio.f.n(h.f().c(this.f13909b.G(n10))) : this.f13909b.n(n10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l() {
            while (!this.f13909b.B()) {
                int readByte = this.f13909b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n10 = n(readByte, 31);
                    this.f13911d = n10;
                    if (n10 < 0 || n10 > this.f13910c) {
                        throw new IOException("Invalid dynamic table size update " + this.f13911d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    r();
                } else {
                    q(n(readByte, 15) - 1);
                }
            }
        }

        int n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int j10 = j();
                if ((j10 & 128) == 0) {
                    return i11 + (j10 << i13);
                }
                i11 += (j10 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final okio.c f13916a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13917b;

        /* renamed from: c  reason: collision with root package name */
        int f13918c;

        /* renamed from: d  reason: collision with root package name */
        private int f13919d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13920e;

        /* renamed from: f  reason: collision with root package name */
        private int f13921f;

        /* renamed from: g  reason: collision with root package name */
        d[] f13922g;

        /* renamed from: h  reason: collision with root package name */
        int f13923h;

        /* renamed from: i  reason: collision with root package name */
        private int f13924i;

        /* renamed from: j  reason: collision with root package name */
        private int f13925j;

        b(int i10, boolean z10, okio.c cVar) {
            this.f13919d = Integer.MAX_VALUE;
            d[] dVarArr = new d[8];
            this.f13922g = dVarArr;
            this.f13924i = dVarArr.length - 1;
            this.f13918c = i10;
            this.f13921f = i10;
            this.f13917b = z10;
            this.f13916a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(okio.c cVar) {
            this(4096, false, cVar);
        }

        private void a() {
            Arrays.fill(this.f13922g, (Object) null);
            this.f13924i = this.f13922g.length - 1;
            this.f13923h = 0;
            this.f13925j = 0;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f13922g.length;
                while (true) {
                    length--;
                    i11 = this.f13924i;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f13922g;
                    i10 -= dVarArr[length].f13899c;
                    this.f13925j -= dVarArr[length].f13899c;
                    this.f13923h--;
                    i12++;
                }
                d[] dVarArr2 = this.f13922g;
                System.arraycopy(dVarArr2, i11 + 1, dVarArr2, i11 + 1 + i12, this.f13923h);
                this.f13924i += i12;
            }
            return i12;
        }

        private void c(d dVar) {
            int i10 = dVar.f13899c;
            int i11 = this.f13921f;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f13925j + i10) - i11);
            int i12 = this.f13923h + 1;
            d[] dVarArr = this.f13922g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f13924i = this.f13922g.length - 1;
                this.f13922g = dVarArr2;
            }
            int i13 = this.f13924i;
            this.f13924i = i13 - 1;
            this.f13922g[i13] = dVar;
            this.f13923h++;
            this.f13925j += i10;
        }

        void d(okio.f fVar) {
            int r10;
            int i10;
            if (!this.f13917b || h.f().e(fVar.v()) >= fVar.r()) {
                r10 = fVar.r();
                i10 = 0;
            } else {
                okio.c cVar = new okio.c();
                h.f().d(fVar.v(), cVar.x());
                fVar = cVar.z();
                r10 = fVar.r();
                i10 = 128;
            }
            f(r10, 127, i10);
            this.f13916a.g0(fVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(List<d> list) {
            int i10;
            int i11;
            if (this.f13920e) {
                int i12 = this.f13919d;
                if (i12 < this.f13921f) {
                    f(i12, 31, 32);
                }
                this.f13920e = false;
                this.f13919d = Integer.MAX_VALUE;
                f(this.f13921f, 31, 32);
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = list.get(i13);
                okio.f u10 = dVar.f13897a.u();
                okio.f fVar = dVar.f13898b;
                Integer num = (Integer) f.f13907c.get(u10);
                if (num != null) {
                    i10 = num.intValue() + 1;
                    if (i10 >= 2 && i10 <= 7) {
                        if (f.f13906b[i10 - 1].f13898b.equals(fVar)) {
                            i11 = i10;
                        } else if (f.f13906b[i10].f13898b.equals(fVar)) {
                            i11 = i10;
                            i10++;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f13924i;
                    while (true) {
                        i14++;
                        d[] dVarArr = this.f13922g;
                        if (i14 >= dVarArr.length) {
                            break;
                        } else if (dVarArr[i14].f13897a.equals(u10)) {
                            if (this.f13922g[i14].f13898b.equals(fVar)) {
                                i10 = f.f13906b.length + (i14 - this.f13924i);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i14 - this.f13924i) + f.f13906b.length;
                            }
                        }
                    }
                }
                if (i10 != -1) {
                    f(i10, 127, 128);
                } else {
                    if (i11 == -1) {
                        this.f13916a.D(64);
                        d(u10);
                    } else if (!u10.s(f.f13905a) || d.f13894h.equals(u10)) {
                        f(i11, 63, 64);
                    } else {
                        f(i11, 15, 0);
                        d(fVar);
                    }
                    d(fVar);
                    c(dVar);
                }
            }
        }

        void f(int i10, int i11, int i12) {
            int i13;
            okio.c cVar;
            if (i10 < i11) {
                cVar = this.f13916a;
                i13 = i10 | i12;
            } else {
                this.f13916a.D(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f13916a.D(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.f13916a;
            }
            cVar.D(i13);
        }
    }

    static {
        okio.f fVar = d.f13891e;
        okio.f fVar2 = d.f13892f;
        okio.f fVar3 = d.f13893g;
        okio.f fVar4 = d.f13890d;
        f13906b = new d[]{new d(d.f13894h, ""), new d(fVar, "GET"), new d(fVar, "POST"), new d(fVar2, "/"), new d(fVar2, "/index.html"), new d(fVar3, "http"), new d(fVar3, "https"), new d(fVar4, "200"), new d(fVar4, "204"), new d(fVar4, "206"), new d(fVar4, "304"), new d(fVar4, "400"), new d(fVar4, "404"), new d(fVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f13907c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static okio.f e(okio.f fVar) {
        int r10 = fVar.r();
        for (int i10 = 0; i10 < r10; i10++) {
            byte k10 = fVar.k(i10);
            if (k10 >= 65 && k10 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.w());
            }
        }
        return fVar;
    }

    private static Map<okio.f, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f13906b.length);
        int i10 = 0;
        while (true) {
            d[] dVarArr = f13906b;
            if (i10 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i10].f13897a)) {
                linkedHashMap.put(dVarArr[i10].f13897a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
