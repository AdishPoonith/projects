package v8;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.h;
import com.google.firebase.firestore.i0;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.u0;
import com.google.firebase.firestore.w0;
import com.google.firebase.firestore.z0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends r8.r {

    /* renamed from: d  reason: collision with root package name */
    public static final b f19468d = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19469a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f19470b;

        static {
            int[] iArr = new int[i0.a.values().length];
            f19470b = iArr;
            try {
                iArr[i0.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19470b[i0.a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19470b[i0.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[h.b.values().length];
            f19469a = iArr2;
            try {
                iArr2[h.b.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19469a[h.b.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19469a[h.b.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r1.equals("not-in") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.firebase.firestore.s q(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.q(java.util.Map):com.google.firebase.firestore.s");
    }

    private FirebaseFirestore r(ByteBuffer byteBuffer) {
        String str = (String) f(byteBuffer);
        a0 a0Var = (a0) f(byteBuffer);
        synchronized (w.f19513r) {
            if (w.N(str) != null) {
                return w.N(str);
            }
            FirebaseFirestore u10 = FirebaseFirestore.u(w5.f.p(str));
            u10.K(a0Var);
            w.q0(u10, str);
            return u10;
        }
    }

    private u0 s(ByteBuffer byteBuffer) {
        try {
            Map map = (Map) f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            u0 m10 = booleanValue ? firebaseFirestore.m(str) : firebaseFirestore.l(str);
            if (map2 == null) {
                return m10;
            }
            if (map2.containsKey("filters")) {
                m10 = m10.J(q((Map) map2.get("filters")));
            }
            Object obj3 = map2.get("where");
            Objects.requireNonNull(obj3);
            for (List list : (List) obj3) {
                com.google.firebase.firestore.q qVar = (com.google.firebase.firestore.q) list.get(0);
                String str2 = (String) list.get(1);
                Object obj4 = list.get(2);
                if ("==".equals(str2)) {
                    m10 = m10.M(qVar, obj4);
                } else if ("!=".equals(str2)) {
                    m10 = m10.S(qVar, obj4);
                } else if ("<".equals(str2)) {
                    m10 = m10.Q(qVar, obj4);
                } else if ("<=".equals(str2)) {
                    m10 = m10.R(qVar, obj4);
                } else if (">".equals(str2)) {
                    m10 = m10.N(qVar, obj4);
                } else if (">=".equals(str2)) {
                    m10 = m10.O(qVar, obj4);
                } else if ("array-contains".equals(str2)) {
                    m10 = m10.K(qVar, obj4);
                } else if ("array-contains-any".equals(str2)) {
                    m10 = m10.L(qVar, (List) obj4);
                } else if ("in".equals(str2)) {
                    m10 = m10.P(qVar, (List) obj4);
                } else if ("not-in".equals(str2)) {
                    m10 = m10.T(qVar, (List) obj4);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                m10 = m10.t(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                m10 = m10.u(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return m10;
            }
            for (List list3 : list2) {
                m10 = m10.v((com.google.firebase.firestore.q) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? u0.b.DESCENDING : u0.b.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                m10 = m10.C(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                m10 = m10.B(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                m10 = m10.j(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 != null) {
                Object[] array4 = list7.toArray();
                Objects.requireNonNull(array4);
                return m10.k(array4);
            }
            return m10;
        } catch (Exception e10) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e10);
            return null;
        }
    }

    private a0 t(ByteBuffer byteBuffer) {
        Map map = (Map) f(byteBuffer);
        a0.b bVar = new a0.b();
        if (map.get("persistenceEnabled") != null) {
            Object obj = map.get("persistenceEnabled");
            Objects.requireNonNull(obj);
            bVar.i(((Boolean) obj).booleanValue());
        }
        if (map.get("host") != null) {
            Object obj2 = map.get("host");
            Objects.requireNonNull(obj2);
            bVar.h((String) obj2);
            if (map.get("sslEnabled") != null) {
                Object obj3 = map.get("sslEnabled");
                Objects.requireNonNull(obj3);
                bVar.j(((Boolean) obj3).booleanValue());
            }
        }
        if (map.get("cacheSizeBytes") != null) {
            Long l10 = 104857600L;
            Object obj4 = map.get("cacheSizeBytes");
            if (obj4 instanceof Long) {
                l10 = (Long) obj4;
            } else if (obj4 instanceof Integer) {
                l10 = Long.valueOf(((Integer) obj4).intValue());
            }
            if (l10.longValue() == -1) {
                bVar.g(-1L);
            } else {
                bVar.g(l10.longValue());
            }
        }
        return bVar.f();
    }

    private Object[] u(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", obj.getClass().getCanonicalName()));
    }

    private void v(ByteArrayOutputStream byteArrayOutputStream, com.google.firebase.firestore.h hVar) {
        HashMap hashMap = new HashMap();
        int i10 = a.f19469a[hVar.e().ordinal()];
        hashMap.put("type", i10 != 1 ? i10 != 2 ? i10 != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put("data", hVar.b().d());
        hashMap.put("path", hVar.b().g().m());
        hashMap.put("oldIndex", Integer.valueOf(hVar.d()));
        hashMap.put("newIndex", Integer.valueOf(hVar.c()));
        hashMap.put("metadata", hVar.b().f());
        p(byteArrayOutputStream, hashMap);
    }

    private void w(ByteArrayOutputStream byteArrayOutputStream, com.google.firebase.firestore.n nVar) {
        Map<String, Object> map;
        HashMap hashMap = new HashMap();
        hashMap.put("path", nVar.g().m());
        if (nVar.a()) {
            n.a aVar = w.f19514s.get(Integer.valueOf(nVar.hashCode()));
            map = aVar != null ? nVar.e(aVar) : nVar.d();
        } else {
            map = null;
        }
        hashMap.put("data", map);
        hashMap.put("metadata", nVar.f());
        w.f19514s.remove(Integer.valueOf(nVar.hashCode()));
        p(byteArrayOutputStream, hashMap);
    }

    private void x(ByteArrayOutputStream byteArrayOutputStream, i0 i0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(i0Var.c()));
        hashMap.put("documentsLoaded", Integer.valueOf(i0Var.d()));
        hashMap.put("totalBytes", Long.valueOf(i0Var.f()));
        hashMap.put("totalDocuments", Integer.valueOf(i0Var.g()));
        int i10 = a.f19470b[i0Var.e().ordinal()];
        String str = "running";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "success";
            } else if (i10 == 3) {
                str = "error";
            }
        }
        hashMap.put("taskState", str);
        p(byteArrayOutputStream, hashMap);
    }

    private void y(ByteArrayOutputStream byteArrayOutputStream, w0 w0Var) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        n.a aVar = w.f19514s.get(Integer.valueOf(w0Var.hashCode()));
        for (com.google.firebase.firestore.n nVar : w0Var.m()) {
            arrayList.add(nVar.g().m());
            arrayList2.add(aVar != null ? nVar.e(aVar) : nVar.d());
            arrayList3.add(nVar.f());
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", w0Var.k());
        hashMap.put("metadata", w0Var.p());
        w.f19514s.remove(Integer.valueOf(w0Var.hashCode()));
        p(byteArrayOutputStream, hashMap);
    }

    private void z(ByteArrayOutputStream byteArrayOutputStream, z0 z0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(z0Var.a()));
        hashMap.put("isFromCache", Boolean.valueOf(z0Var.b()));
        p(byteArrayOutputStream, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r8.r
    public Object g(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case Byte.MIN_VALUE:
                return new Date(byteBuffer.getLong());
            case -127:
                r8.r.c(byteBuffer, 8);
                return new d0(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -126:
                return ((FirebaseFirestore) f(byteBuffer)).o((String) f(byteBuffer));
            case -125:
                return com.google.firebase.firestore.f.h(r8.r.d(byteBuffer));
            case -124:
                return com.google.firebase.firestore.r.b(u(f(byteBuffer)));
            case -123:
                return com.google.firebase.firestore.r.a(u(f(byteBuffer)));
            case -122:
                return com.google.firebase.firestore.r.c();
            case -121:
                return com.google.firebase.firestore.r.g();
            case -120:
                return new w5.q(byteBuffer.getLong(), byteBuffer.getInt());
            case -119:
                return com.google.firebase.firestore.r.e(((Number) f(byteBuffer)).doubleValue());
            case -118:
                return com.google.firebase.firestore.r.f(((Number) f(byteBuffer)).intValue());
            case -117:
                return com.google.firebase.firestore.q.a();
            case -116:
                int e10 = r8.r.e(byteBuffer);
                ArrayList arrayList = new ArrayList(e10);
                for (int i10 = 0; i10 < e10; i10++) {
                    arrayList.add(f(byteBuffer));
                }
                return com.google.firebase.firestore.q.d((String[]) arrayList.toArray(new String[0]));
            case -115:
                return Double.valueOf(Double.NaN);
            case -114:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -113:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -112:
                return r(byteBuffer);
            case -111:
                return s(byteBuffer);
            case -110:
                return t(byteBuffer);
            default:
                return super.g(b10, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r8.r
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i10;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-128);
            r8.r.n(byteArrayOutputStream, ((Date) obj).getTime());
        } else if (obj instanceof w5.q) {
            byteArrayOutputStream.write(-120);
            w5.q qVar = (w5.q) obj;
            r8.r.n(byteArrayOutputStream, qVar.l());
            r8.r.m(byteArrayOutputStream, qVar.k());
        } else if (obj instanceof d0) {
            byteArrayOutputStream.write(-127);
            r8.r.h(byteArrayOutputStream, 8);
            d0 d0Var = (d0) obj;
            r8.r.k(byteArrayOutputStream, d0Var.g());
            r8.r.k(byteArrayOutputStream, d0Var.h());
        } else if (obj instanceof com.google.firebase.firestore.m) {
            byteArrayOutputStream.write(-126);
            com.google.firebase.firestore.m mVar = (com.google.firebase.firestore.m) obj;
            p(byteArrayOutputStream, mVar.k().r().q());
            p(byteArrayOutputStream, mVar.m());
        } else if (obj instanceof com.google.firebase.firestore.n) {
            w(byteArrayOutputStream, (com.google.firebase.firestore.n) obj);
        } else if (obj instanceof w0) {
            y(byteArrayOutputStream, (w0) obj);
        } else if (obj instanceof com.google.firebase.firestore.h) {
            v(byteArrayOutputStream, (com.google.firebase.firestore.h) obj);
        } else if (obj instanceof i0) {
            x(byteArrayOutputStream, (i0) obj);
        } else if (obj instanceof z0) {
            z(byteArrayOutputStream, (z0) obj);
        } else if (obj instanceof com.google.firebase.firestore.f) {
            byteArrayOutputStream.write(-125);
            r8.r.i(byteArrayOutputStream, ((com.google.firebase.firestore.f) obj).k());
        } else {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                if (Double.isNaN(d10.doubleValue())) {
                    i10 = -115;
                } else if (d10.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                    i10 = -113;
                } else if (d10.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                    i10 = -114;
                }
                byteArrayOutputStream.write(i10);
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }
}
