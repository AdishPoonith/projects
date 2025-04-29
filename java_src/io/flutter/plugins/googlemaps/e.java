package io.flutter.plugins.googlemaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class e {
    private static Float A(Object obj) {
        if (obj == null) {
            return null;
        }
        return Float.valueOf(z(obj));
    }

    private static float B(Object obj, float f10) {
        return z(obj) * f10;
    }

    private static List<List<LatLng>> C(Object obj) {
        List<?> G = G(obj);
        ArrayList arrayList = new ArrayList(G.size());
        Iterator<?> it = G.iterator();
        while (it.hasNext()) {
            arrayList.add(N(it.next()));
        }
        return arrayList;
    }

    private static int D(Object obj) {
        return ((Number) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LatLng E(Object obj) {
        List<?> G = G(obj);
        return new LatLng(y(G.get(0)), y(G.get(1)));
    }

    private static LatLngBounds F(Object obj) {
        if (obj == null) {
            return null;
        }
        List<?> G = G(obj);
        return new LatLngBounds(E(G.get(0)), E(G.get(1)));
    }

    private static List<?> G(Object obj) {
        return (List) obj;
    }

    private static Map<?, ?> H(Object obj) {
        return (Map) obj;
    }

    private static Map<String, Object> I(Object obj) {
        HashMap hashMap = new HashMap();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            Object obj3 = map.get(obj2);
            if (obj3 != null) {
                hashMap.put((String) obj2, obj3);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r3.equals("dot") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<w4.n> J(java.lang.Object r7) {
        /*
            java.util.List r7 = G(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lc
            r7 = 0
            return r7
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r7.next()
            java.util.List r1 = G(r1)
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = O(r3)
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 1
            switch(r5) {
                case 99657: goto L54;
                case 102102: goto L49;
                case 3075986: goto L3e;
                default: goto L3c;
            }
        L3c:
            r2 = -1
            goto L5d
        L3e:
            java.lang.String r2 = "dash"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            goto L3c
        L47:
            r2 = 2
            goto L5d
        L49:
            java.lang.String r2 = "gap"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L52
            goto L3c
        L52:
            r2 = 1
            goto L5d
        L54:
            java.lang.String r5 = "dot"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L5d
            goto L3c
        L5d:
            switch(r2) {
                case 0: goto L9b;
                case 1: goto L8d;
                case 2: goto L7c;
                default: goto L60;
            }
        L60:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " as PatternItem"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L7c:
            w4.h r2 = new w4.h
            java.lang.Object r1 = r1.get(r6)
            float r1 = z(r1)
            r2.<init>(r1)
        L89:
            r0.add(r2)
            goto L19
        L8d:
            w4.j r2 = new w4.j
            java.lang.Object r1 = r1.get(r6)
            float r1 = z(r1)
            r2.<init>(r1)
            goto L89
        L9b:
            w4.i r1 = new w4.i
            r1.<init>()
            r0.add(r1)
            goto L19
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.J(java.lang.Object):java.util.List");
    }

    private static int K(Object obj, float f10) {
        return (int) B(obj, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Point L(Object obj) {
        return new Point(((Integer) H(obj).get("x")).intValue(), ((Integer) H(obj).get("y")).intValue());
    }

    private static Point M(Object obj, float f10) {
        List<?> G = G(obj);
        return new Point(K(G.get(0), f10), K(G.get(1), f10));
    }

    static List<LatLng> N(Object obj) {
        List<?> G = G(obj);
        ArrayList arrayList = new ArrayList(G.size());
        Iterator<?> it = G.iterator();
        while (it.hasNext()) {
            List<?> G2 = G(it.next());
            arrayList.add(new LatLng(y(G2.get(0)), y(G2.get(1))));
        }
        return arrayList;
    }

    private static String O(Object obj) {
        return (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bearing", Float.valueOf(cameraPosition.f5861m));
        hashMap.put("target", l(cameraPosition.f5858j));
        hashMap.put("tilt", Float.valueOf(cameraPosition.f5860l));
        hashMap.put("zoom", Float.valueOf(cameraPosition.f5859k));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("circleId", str);
        return hashMap;
    }

    private static w4.a c(List<?> list) {
        if (list.size() == 2) {
            try {
                return w4.b.d(s(list.get(1)));
            } catch (Exception e10) {
                throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", e10);
            }
        }
        throw new IllegalArgumentException("fromBytes should have exactly one argument, interpretTileOverlayOptions the bytes. Got: " + list.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(Object obj, c cVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            cVar.b(u(obj2));
        }
        Object obj3 = H.get("fillColor");
        if (obj3 != null) {
            cVar.e(D(obj3));
        }
        Object obj4 = H.get("strokeColor");
        if (obj4 != null) {
            cVar.c(D(obj4));
        }
        Object obj5 = H.get("visible");
        if (obj5 != null) {
            cVar.setVisible(u(obj5));
        }
        Object obj6 = H.get("strokeWidth");
        if (obj6 != null) {
            cVar.f(D(obj6));
        }
        Object obj7 = H.get("zIndex");
        if (obj7 != null) {
            cVar.a(z(obj7));
        }
        Object obj8 = H.get("center");
        if (obj8 != null) {
            cVar.h(E(obj8));
        }
        Object obj9 = H.get("radius");
        if (obj9 != null) {
            cVar.g(y(obj9));
        }
        String str = (String) H.get("circleId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("circleId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Object obj, m mVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("cameraTargetBounds");
        if (obj2 != null) {
            mVar.N(F(G(obj2).get(0)));
        }
        Object obj3 = H.get("compassEnabled");
        if (obj3 != null) {
            mVar.n(u(obj3));
        }
        Object obj4 = H.get("mapToolbarEnabled");
        if (obj4 != null) {
            mVar.o(u(obj4));
        }
        Object obj5 = H.get("mapType");
        if (obj5 != null) {
            mVar.e(D(obj5));
        }
        Object obj6 = H.get("minMaxZoomPreference");
        if (obj6 != null) {
            List<?> G = G(obj6);
            mVar.S(A(G.get(0)), A(G.get(1)));
        }
        Object obj7 = H.get("padding");
        if (obj7 != null) {
            List<?> G2 = G(obj7);
            mVar.K(z(G2.get(0)), z(G2.get(1)), z(G2.get(2)), z(G2.get(3)));
        }
        Object obj8 = H.get("rotateGesturesEnabled");
        if (obj8 != null) {
            mVar.J(u(obj8));
        }
        Object obj9 = H.get("scrollGesturesEnabled");
        if (obj9 != null) {
            mVar.u(u(obj9));
        }
        Object obj10 = H.get("tiltGesturesEnabled");
        if (obj10 != null) {
            mVar.B(u(obj10));
        }
        Object obj11 = H.get("trackCameraPosition");
        if (obj11 != null) {
            mVar.L(u(obj11));
        }
        Object obj12 = H.get("zoomGesturesEnabled");
        if (obj12 != null) {
            mVar.D(u(obj12));
        }
        Object obj13 = H.get("liteModeEnabled");
        if (obj13 != null) {
            mVar.M(u(obj13));
        }
        Object obj14 = H.get("myLocationEnabled");
        if (obj14 != null) {
            mVar.C(u(obj14));
        }
        Object obj15 = H.get("zoomControlsEnabled");
        if (obj15 != null) {
            mVar.F(u(obj15));
        }
        Object obj16 = H.get("myLocationButtonEnabled");
        if (obj16 != null) {
            mVar.m(u(obj16));
        }
        Object obj17 = H.get("indoorEnabled");
        if (obj17 != null) {
            mVar.k(u(obj17));
        }
        Object obj18 = H.get("trafficEnabled");
        if (obj18 != null) {
            mVar.G(u(obj18));
        }
        Object obj19 = H.get("buildingsEnabled");
        if (obj19 != null) {
            mVar.f(u(obj19));
        }
    }

    private static void f(r rVar, Map<String, Object> map) {
        String str = (String) map.get("title");
        String str2 = (String) map.get("snippet");
        if (str != null) {
            rVar.k(str, str2);
        }
        Object obj = map.get("anchor");
        if (obj != null) {
            List<?> G = G(obj);
            rVar.g(z(G.get(0)), z(G.get(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Object obj, r rVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("alpha");
        if (obj2 != null) {
            rVar.d(z(obj2));
        }
        Object obj3 = H.get("anchor");
        if (obj3 != null) {
            List<?> G = G(obj3);
            rVar.i(z(G.get(0)), z(G.get(1)));
        }
        Object obj4 = H.get("consumeTapEvents");
        if (obj4 != null) {
            rVar.b(u(obj4));
        }
        Object obj5 = H.get("draggable");
        if (obj5 != null) {
            rVar.e(u(obj5));
        }
        Object obj6 = H.get("flat");
        if (obj6 != null) {
            rVar.f(u(obj6));
        }
        Object obj7 = H.get("icon");
        if (obj7 != null) {
            rVar.c(t(obj7));
        }
        Object obj8 = H.get("infoWindow");
        if (obj8 != null) {
            f(rVar, I(obj8));
        }
        Object obj9 = H.get("position");
        if (obj9 != null) {
            rVar.j(E(obj9));
        }
        Object obj10 = H.get("rotation");
        if (obj10 != null) {
            rVar.h(z(obj10));
        }
        Object obj11 = H.get("visible");
        if (obj11 != null) {
            rVar.setVisible(u(obj11));
        }
        Object obj12 = H.get("zIndex");
        if (obj12 != null) {
            rVar.a(z(obj12));
        }
        String str = (String) H.get("markerId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("markerId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(Object obj, v vVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            vVar.b(u(obj2));
        }
        Object obj3 = H.get("geodesic");
        if (obj3 != null) {
            vVar.d(u(obj3));
        }
        Object obj4 = H.get("visible");
        if (obj4 != null) {
            vVar.setVisible(u(obj4));
        }
        Object obj5 = H.get("fillColor");
        if (obj5 != null) {
            vVar.e(D(obj5));
        }
        Object obj6 = H.get("strokeColor");
        if (obj6 != null) {
            vVar.c(D(obj6));
        }
        Object obj7 = H.get("strokeWidth");
        if (obj7 != null) {
            vVar.f(D(obj7));
        }
        Object obj8 = H.get("zIndex");
        if (obj8 != null) {
            vVar.a(z(obj8));
        }
        Object obj9 = H.get("points");
        if (obj9 != null) {
            vVar.g(N(obj9));
        }
        Object obj10 = H.get("holes");
        if (obj10 != null) {
            vVar.h(C(obj10));
        }
        String str = (String) H.get("polygonId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polygonId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Object obj, z zVar) {
        Map<?, ?> H = H(obj);
        Object obj2 = H.get("consumeTapEvents");
        if (obj2 != null) {
            zVar.b(u(obj2));
        }
        Object obj3 = H.get("color");
        if (obj3 != null) {
            zVar.j(D(obj3));
        }
        Object obj4 = H.get("endCap");
        if (obj4 != null) {
            zVar.h(x(obj4));
        }
        Object obj5 = H.get("geodesic");
        if (obj5 != null) {
            zVar.d(u(obj5));
        }
        Object obj6 = H.get("jointType");
        if (obj6 != null) {
            zVar.e(D(obj6));
        }
        Object obj7 = H.get("startCap");
        if (obj7 != null) {
            zVar.i(x(obj7));
        }
        Object obj8 = H.get("visible");
        if (obj8 != null) {
            zVar.setVisible(u(obj8));
        }
        Object obj9 = H.get("width");
        if (obj9 != null) {
            zVar.f(D(obj9));
        }
        Object obj10 = H.get("zIndex");
        if (obj10 != null) {
            zVar.a(z(obj10));
        }
        Object obj11 = H.get("points");
        if (obj11 != null) {
            zVar.g(N(obj11));
        }
        Object obj12 = H.get("pattern");
        if (obj12 != null) {
            zVar.c(J(obj12));
        }
        String str = (String) H.get("polylineId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polylineId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w4.y j(Map<String, ?> map) {
        return new w4.y(D(map.get("width")), D(map.get("height")), map.get("data") != null ? (byte[]) map.get("data") : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(Map<String, ?> map, d0 d0Var) {
        Object obj = map.get("fadeIn");
        if (obj != null) {
            d0Var.b(u(obj));
        }
        Object obj2 = map.get("transparency");
        if (obj2 != null) {
            d0Var.c(z(obj2));
        }
        Object obj3 = map.get("zIndex");
        if (obj3 != null) {
            d0Var.a(z(obj3));
        }
        Object obj4 = map.get("visible");
        if (obj4 != null) {
            d0Var.setVisible(u(obj4));
        }
        String str = (String) map.get("tileOverlayId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("tileOverlayId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object l(LatLng latLng) {
        return Arrays.asList(Double.valueOf(latLng.f5866j), Double.valueOf(latLng.f5867k));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object m(LatLngBounds latLngBounds) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("southwest", l(latLngBounds.f5868j));
        hashMap.put("northeast", l(latLngBounds.f5869k));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object n(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("markerId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Integer> o(Point point) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("x", Integer.valueOf(point.x));
        hashMap.put("y", Integer.valueOf(point.y));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object p(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polygonId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object q(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polylineId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> r(String str, int i10, int i11, int i12) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("tileOverlayId", str);
        hashMap.put("x", Integer.valueOf(i10));
        hashMap.put("y", Integer.valueOf(i11));
        hashMap.put("zoom", Integer.valueOf(i12));
        return hashMap;
    }

    private static Bitmap s(Object obj) {
        byte[] bArr = (byte[]) obj;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode bytes as a valid bitmap.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r2.equals("fromAssetImage") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static w4.a t(java.lang.Object r8) {
        /*
            java.util.List r0 = G(r8)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = O(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = -1
            switch(r3) {
                case -458749035: goto L3e;
                case 52960614: goto L33;
                case 54063841: goto L28;
                case 784458203: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = -1
            goto L47
        L1d:
            java.lang.String r1 = "defaultMarker"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L26
            goto L1b
        L26:
            r1 = 3
            goto L47
        L28:
            java.lang.String r1 = "fromBytes"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L31
            goto L1b
        L31:
            r1 = 2
            goto L47
        L33:
            java.lang.String r1 = "fromAsset"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3c
            goto L1b
        L3c:
            r1 = 1
            goto L47
        L3e:
            java.lang.String r3 = "fromAssetImage"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L47
            goto L1b
        L47:
            switch(r1) {
                case 0: goto Lb3;
                case 1: goto L83;
                case 2: goto L7e;
                case 3: goto L66;
                default: goto L4a;
            }
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " as BitmapDescriptor"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L66:
            int r8 = r0.size()
            if (r8 != r6) goto L71
            w4.a r8 = w4.b.a()
            return r8
        L71:
            java.lang.Object r8 = r0.get(r6)
            float r8 = z(r8)
            w4.a r8 = w4.b.b(r8)
            return r8
        L7e:
            w4.a r8 = c(r0)
            return r8
        L83:
            int r8 = r0.size()
            if (r8 != r5) goto L9a
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.String r8 = io.flutter.view.d.a(r8)
            w4.a r8 = w4.b.c(r8)
            return r8
        L9a:
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = O(r0)
            java.lang.String r8 = io.flutter.view.d.b(r8, r0)
            w4.a r8 = w4.b.c(r8)
            return r8
        Lb3:
            int r8 = r0.size()
            if (r8 != r4) goto Lca
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = O(r8)
            java.lang.String r8 = io.flutter.view.d.a(r8)
            w4.a r8 = w4.b.c(r8)
            return r8
        Lca:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'fromAssetImage' Expected exactly 3 arguments, got: "
            r1.append(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.t(java.lang.Object):w4.a");
    }

    private static boolean u(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraPosition v(Object obj) {
        Map<?, ?> H = H(obj);
        CameraPosition.a B = CameraPosition.B();
        B.a(z(H.get("bearing")));
        B.c(E(H.get("target")));
        B.d(z(H.get("tilt")));
        B.e(z(H.get("zoom")));
        return B.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
        if (r2.equals("newLatLng") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u4.a w(java.lang.Object r7, float r8) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.w(java.lang.Object, float):u4.a");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r2.equals("roundCap") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static w4.d x(java.lang.Object r7) {
        /*
            java.util.List r0 = G(r7)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = O(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 1
            r6 = -1
            switch(r3) {
                case -179356: goto L3d;
                case 241309887: goto L32;
                case 1314340213: goto L27;
                case 1611528865: goto L1c;
                default: goto L1a;
            }
        L1a:
            r1 = -1
            goto L46
        L1c:
            java.lang.String r1 = "customCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L25
            goto L1a
        L25:
            r1 = 3
            goto L46
        L27:
            java.lang.String r1 = "squareCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L30
            goto L1a
        L30:
            r1 = 2
            goto L46
        L32:
            java.lang.String r1 = "buttCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3b
            goto L1a
        L3b:
            r1 = 1
            goto L46
        L3d:
            java.lang.String r3 = "roundCap"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L46
            goto L1a
        L46:
            switch(r1) {
                case 0: goto L9b;
                case 1: goto L95;
                case 2: goto L8f;
                case 3: goto L65;
                default: goto L49;
            }
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " as Cap"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L65:
            int r7 = r0.size()
            if (r7 != r4) goto L79
            w4.g r7 = new w4.g
            java.lang.Object r0 = r0.get(r5)
            w4.a r0 = t(r0)
            r7.<init>(r0)
            return r7
        L79:
            w4.g r7 = new w4.g
            java.lang.Object r1 = r0.get(r5)
            w4.a r1 = t(r1)
            java.lang.Object r0 = r0.get(r4)
            float r0 = z(r0)
            r7.<init>(r1, r0)
            return r7
        L8f:
            w4.u r7 = new w4.u
            r7.<init>()
            return r7
        L95:
            w4.c r7 = new w4.c
            r7.<init>()
            return r7
        L9b:
            w4.s r7 = new w4.s
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.e.x(java.lang.Object):w4.d");
    }

    private static double y(Object obj) {
        return ((Number) obj).doubleValue();
    }

    private static float z(Object obj) {
        return ((Number) obj).floatValue();
    }
}
