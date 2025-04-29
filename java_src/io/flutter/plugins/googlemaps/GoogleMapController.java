package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import j8.c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r8.k;
import u4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GoogleMapController implements DefaultLifecycleObserver, c.a, m, k.c, u4.f, l, io.flutter.plugin.platform.f {
    private final s A;
    private final w B;
    private final a0 C;
    private final d D;
    private final e0 E;
    private List<Object> F;
    private List<Object> G;
    private List<Object> H;
    private List<Object> I;
    private List<Map<String, ?>> J;
    List<Float> K;

    /* renamed from: j  reason: collision with root package name */
    private final int f10604j;

    /* renamed from: k  reason: collision with root package name */
    private final r8.k f10605k;

    /* renamed from: l  reason: collision with root package name */
    private final GoogleMapOptions f10606l;

    /* renamed from: m  reason: collision with root package name */
    private u4.d f10607m;

    /* renamed from: n  reason: collision with root package name */
    private u4.c f10608n;

    /* renamed from: w  reason: collision with root package name */
    final float f10617w;

    /* renamed from: x  reason: collision with root package name */
    private k.d f10618x;

    /* renamed from: y  reason: collision with root package name */
    private final Context f10619y;

    /* renamed from: z  reason: collision with root package name */
    private final o f10620z;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10609o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10610p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10611q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10612r = true;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10613s = true;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10614t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10615u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10616v = false;
    private boolean L = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Choreographer.FrameCallback {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Runnable f10621j;

        a(Runnable runnable) {
            this.f10621j = runnable;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f10621j.run();
        }
    }

    /* loaded from: classes.dex */
    class b implements c.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f10622a;

        b(k.d dVar) {
            this.f10622a = dVar;
        }

        @Override // u4.c.m
        public void a(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            this.f10622a.a(byteArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapController(int i10, Context context, r8.c cVar, o oVar, GoogleMapOptions googleMapOptions) {
        this.f10604j = i10;
        this.f10619y = context;
        this.f10606l = googleMapOptions;
        this.f10607m = new u4.d(context, googleMapOptions);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f10617w = f10;
        r8.k kVar = new r8.k(cVar, "plugins.flutter.dev/google_maps_android_" + i10);
        this.f10605k = kVar;
        kVar.e(this);
        this.f10620z = oVar;
        this.A = new s(kVar);
        this.B = new w(kVar, f10);
        this.C = new a0(kVar, f10);
        this.D = new d(kVar, f10);
        this.E = new e0(kVar);
    }

    private void Z(u4.a aVar) {
        this.f10608n.f(aVar);
    }

    private int a0(String str) {
        if (str != null) {
            return this.f10619y.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    private void b0() {
        u4.d dVar = this.f10607m;
        if (dVar == null) {
            return;
        }
        dVar.c();
        this.f10607m = null;
    }

    private CameraPosition c0() {
        if (this.f10609o) {
            return this.f10608n.g();
        }
        return null;
    }

    private boolean d0() {
        return a0("android.permission.ACCESS_FINE_LOCATION") == 0 || a0("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void f0() {
        u4.c cVar = this.f10608n;
        if (cVar == null || this.L) {
            return;
        }
        this.L = true;
        cVar.D(new c.g() { // from class: io.flutter.plugins.googlemaps.i
            @Override // u4.c.g
            public final void a() {
                GoogleMapController.this.i0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0() {
        u4.d dVar = this.f10607m;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0() {
        k0(new Runnable() { // from class: io.flutter.plugins.googlemaps.g
            @Override // java.lang.Runnable
            public final void run() {
                GoogleMapController.this.g0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0() {
        this.L = false;
        k0(new Runnable() { // from class: io.flutter.plugins.googlemaps.h
            @Override // java.lang.Runnable
            public final void run() {
                GoogleMapController.this.h0();
            }
        });
    }

    private void j0(u4.a aVar) {
        this.f10608n.n(aVar);
    }

    private static void k0(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new a(runnable));
    }

    private void l0(l lVar) {
        u4.c cVar = this.f10608n;
        if (cVar == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        cVar.z(lVar);
        this.f10608n.y(lVar);
        this.f10608n.x(lVar);
        this.f10608n.F(lVar);
        this.f10608n.G(lVar);
        this.f10608n.H(lVar);
        this.f10608n.I(lVar);
        this.f10608n.A(lVar);
        this.f10608n.C(lVar);
        this.f10608n.E(lVar);
    }

    private void s0() {
        this.D.c(this.I);
    }

    private void t0() {
        this.A.c(this.F);
    }

    private void u0() {
        this.B.c(this.G);
    }

    private void v0() {
        this.C.c(this.H);
    }

    private void w0() {
        this.E.b(this.J);
    }

    private void x0() {
        if (!d0()) {
            Log.e("GoogleMapController", "Cannot enable MyLocation layer as location permissions are not granted");
            return;
        }
        this.f10608n.w(this.f10610p);
        this.f10608n.k().k(this.f10611q);
    }

    @Override // io.flutter.plugin.platform.f
    public /* synthetic */ void A(View view) {
        io.flutter.plugin.platform.e.a(this, view);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void B(boolean z10) {
        this.f10608n.k().n(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void C(boolean z10) {
        if (this.f10610p == z10) {
            return;
        }
        this.f10610p = z10;
        if (this.f10608n != null) {
            x0();
        }
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void D(boolean z10) {
        this.f10608n.k().p(z10);
    }

    @Override // u4.c.k
    public void E(w4.o oVar) {
        this.B.g(oVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void F(boolean z10) {
        if (this.f10612r == z10) {
            return;
        }
        this.f10612r = z10;
        u4.c cVar = this.f10608n;
        if (cVar != null) {
            cVar.k().o(z10);
        }
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void G(boolean z10) {
        this.f10614t = z10;
        u4.c cVar = this.f10608n;
        if (cVar == null) {
            return;
        }
        cVar.K(z10);
    }

    @Override // io.flutter.plugin.platform.f
    public /* synthetic */ void H() {
        io.flutter.plugin.platform.e.b(this);
    }

    @Override // r8.k.c
    public void I(r8.j jVar, k.d dVar) {
        String str;
        boolean e10;
        String str2;
        Object obj;
        String str3 = jVar.f16777a;
        str3.hashCode();
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -2068530537:
                if (str3.equals("map#getVisibleRegion")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1753225255:
                if (str3.equals("map#isScrollGesturesEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1675017333:
                if (str3.equals("map#isRotateGesturesEnabled")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1389285936:
                if (str3.equals("map#update")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1366519597:
                if (str3.equals("map#getScreenCoordinate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1264573565:
                if (str3.equals("camera#animate")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1255039905:
                if (str3.equals("markers#isInfoWindowShown")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1253612063:
                if (str3.equals("map#getTileOverlayInfo")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1102318061:
                if (str3.equals("polygons#update")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -596474455:
                if (str3.equals("map#isTiltGesturesEnabled")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -577075523:
                if (str3.equals("map#isMyLocationButtonEnabled")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -508357782:
                if (str3.equals("markers#hideInfoWindow")) {
                    c10 = 11;
                    break;
                }
                break;
            case -451921790:
                if (str3.equals("map#getZoomLevel")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 262112323:
                if (str3.equals("map#getMinMaxZoomLevels")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 282895827:
                if (str3.equals("map#isZoomGesturesEnabled")) {
                    c10 = 14;
                    break;
                }
                break;
            case 295004975:
                if (str3.equals("map#waitForMap")) {
                    c10 = 15;
                    break;
                }
                break;
            case 390939153:
                if (str3.equals("map#isMapToolbarEnabled")) {
                    c10 = 16;
                    break;
                }
                break;
            case 434031410:
                if (str3.equals("map#takeSnapshot")) {
                    c10 = 17;
                    break;
                }
                break;
            case 622947733:
                if (str3.equals("map#getLatLng")) {
                    c10 = 18;
                    break;
                }
                break;
            case 643972249:
                if (str3.equals("polylines#update")) {
                    c10 = 19;
                    break;
                }
                break;
            case 712945078:
                if (str3.equals("map#setStyle")) {
                    c10 = 20;
                    break;
                }
                break;
            case 972868051:
                if (str3.equals("map#isBuildingsEnabled")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1098288608:
                if (str3.equals("map#isCompassEnabled")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1172199911:
                if (str3.equals("map#isZoomControlsEnabled")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1322988819:
                if (str3.equals("markers#update")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1546082965:
                if (str3.equals("map#isTrafficEnabled")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1564959387:
                if (str3.equals("tileOverlays#update")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1708609913:
                if (str3.equals("tileOverlays#clearTileCache")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1873569705:
                if (str3.equals("circles#update")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1915657375:
                if (str3.equals("map#isLiteModeEnabled")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1953391461:
                if (str3.equals("markers#showInfoWindow")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2003557999:
                if (str3.equals("camera#move")) {
                    c10 = 31;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                u4.c cVar = this.f10608n;
                if (cVar != null) {
                    obj = e.m(cVar.j().b().f19859n);
                    dVar.a(obj);
                    return;
                }
                str = "getVisibleRegion called prior to map initialization";
                dVar.b("GoogleMap uninitialized", str, null);
                return;
            case 1:
                e10 = this.f10608n.k().e();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 2:
                e10 = this.f10608n.k().d();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 3:
                e.e(jVar.a("options"), this);
                obj = e.a(c0());
                dVar.a(obj);
                return;
            case 4:
                if (this.f10608n != null) {
                    obj = e.o(this.f10608n.j().c(e.E(jVar.f16778b)));
                    dVar.a(obj);
                    return;
                }
                str = "getScreenCoordinate called prior to map initialization";
                dVar.b("GoogleMap uninitialized", str, null);
                return;
            case 5:
                Z(e.w(jVar.a("cameraUpdate"), this.f10617w));
                dVar.a(null);
                return;
            case 6:
                this.A.h((String) jVar.a("markerId"), dVar);
                return;
            case 7:
                obj = this.E.g((String) jVar.a("tileOverlayId"));
                dVar.a(obj);
                return;
            case '\b':
                f0();
                this.B.c((List) jVar.a("polygonsToAdd"));
                this.B.e((List) jVar.a("polygonsToChange"));
                this.B.h((List) jVar.a("polygonIdsToRemove"));
                dVar.a(null);
                return;
            case '\t':
                e10 = this.f10608n.k().f();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case '\n':
                e10 = this.f10608n.k().c();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 11:
                this.A.g((String) jVar.a("markerId"), dVar);
                return;
            case '\f':
                obj = Float.valueOf(this.f10608n.g().f5859k);
                dVar.a(obj);
                return;
            case '\r':
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(Float.valueOf(this.f10608n.i()));
                arrayList.add(Float.valueOf(this.f10608n.h()));
                obj = arrayList;
                dVar.a(obj);
                return;
            case 14:
                e10 = this.f10608n.k().h();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 15:
                if (this.f10608n != null) {
                    dVar.a(null);
                    return;
                } else {
                    this.f10618x = dVar;
                    return;
                }
            case 16:
                e10 = this.f10608n.k().b();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 17:
                u4.c cVar2 = this.f10608n;
                if (cVar2 != null) {
                    cVar2.L(new b(dVar));
                    return;
                }
                str = "takeSnapshot";
                dVar.b("GoogleMap uninitialized", str, null);
                return;
            case 18:
                if (this.f10608n != null) {
                    obj = e.l(this.f10608n.j().a(e.L(jVar.f16778b)));
                    dVar.a(obj);
                    return;
                }
                str = "getLatLng called prior to map initialization";
                dVar.b("GoogleMap uninitialized", str, null);
                return;
            case 19:
                f0();
                this.C.c((List) jVar.a("polylinesToAdd"));
                this.C.e((List) jVar.a("polylinesToChange"));
                this.C.h((List) jVar.a("polylineIdsToRemove"));
                dVar.a(null);
                return;
            case 20:
                f0();
                Object obj2 = jVar.f16778b;
                boolean s10 = (!(obj2 instanceof String) || (str2 = (String) obj2) == null) ? this.f10608n.s(null) : this.f10608n.s(new w4.k(str2));
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(Boolean.valueOf(s10));
                if (!s10) {
                    arrayList2.add("Unable to set the map style. Please check console logs for errors.");
                }
                dVar.a(arrayList2);
                return;
            case 21:
                e10 = this.f10608n.l();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 22:
                e10 = this.f10608n.k().a();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case f.j.f8330t3 /* 23 */:
                e10 = this.f10608n.k().g();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case f.j.f8335u3 /* 24 */:
                f0();
                this.A.c((List) jVar.a("markersToAdd"));
                this.A.e((List) jVar.a("markersToChange"));
                this.A.n((List) jVar.a("markerIdsToRemove"));
                dVar.a(null);
                return;
            case 25:
                e10 = this.f10608n.m();
                obj = Boolean.valueOf(e10);
                dVar.a(obj);
                return;
            case 26:
                f0();
                this.E.b((List) jVar.a("tileOverlaysToAdd"));
                this.E.d((List) jVar.a("tileOverlaysToChange"));
                this.E.i((List) jVar.a("tileOverlayIdsToRemove"));
                dVar.a(null);
                return;
            case 27:
                f0();
                this.E.e((String) jVar.a("tileOverlayId"));
                dVar.a(null);
                return;
            case 28:
                f0();
                this.D.c((List) jVar.a("circlesToAdd"));
                this.D.e((List) jVar.a("circlesToChange"));
                this.D.h((List) jVar.a("circleIdsToRemove"));
                dVar.a(null);
                return;
            case f.j.f8360z3 /* 29 */:
                obj = this.f10606l.G();
                dVar.a(obj);
                return;
            case 30:
                this.A.p((String) jVar.a("markerId"), dVar);
                return;
            case 31:
                j0(e.w(jVar.a("cameraUpdate"), this.f10617w));
                dVar.a(null);
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void J(boolean z10) {
        this.f10608n.k().l(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void K(float f10, float f11, float f12, float f13) {
        u4.c cVar = this.f10608n;
        if (cVar == null) {
            o0(f10, f11, f12, f13);
            return;
        }
        float f14 = this.f10617w;
        cVar.J((int) (f11 * f14), (int) (f10 * f14), (int) (f13 * f14), (int) (f12 * f14));
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void L(boolean z10) {
        this.f10609o = z10;
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void M(boolean z10) {
        this.f10606l.M(z10);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void N(LatLngBounds latLngBounds) {
        this.f10608n.r(latLngBounds);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void O(androidx.lifecycle.i iVar) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.g();
    }

    @Override // u4.c.h
    public void P(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", e.l(latLng));
        this.f10605k.c("map#onLongPress", hashMap);
    }

    @Override // io.flutter.plugin.platform.f
    public void Q() {
    }

    @Override // u4.c.i
    public boolean R(w4.l lVar) {
        return this.A.m(lVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void S(Float f10, Float f11) {
        this.f10608n.o();
        if (f10 != null) {
            this.f10608n.v(f10.floatValue());
        }
        if (f11 != null) {
            this.f10608n.u(f11.floatValue());
        }
    }

    @Override // u4.c.f
    public void T(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", e.l(latLng));
        this.f10605k.c("map#onTap", hashMap);
    }

    @Override // u4.c.j
    public void U(w4.l lVar) {
        this.A.k(lVar.a(), lVar.b());
    }

    @Override // u4.c.a
    public void V() {
        this.f10605k.c("camera#onIdle", Collections.singletonMap("map", Integer.valueOf(this.f10604j)));
    }

    @Override // j8.c.a
    public void a(Bundle bundle) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.e(bundle);
    }

    @Override // io.flutter.plugin.platform.f
    public void b() {
        if (this.f10616v) {
            return;
        }
        this.f10616v = true;
        this.f10605k.e(null);
        l0(null);
        b0();
        androidx.lifecycle.e a10 = this.f10620z.a();
        if (a10 != null) {
            a10.c(this);
        }
    }

    @Override // u4.c.e
    public void c(w4.l lVar) {
        this.A.i(lVar.a());
    }

    @Override // j8.c.a
    public void d(Bundle bundle) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.b(bundle);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void e(int i10) {
        this.f10608n.t(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        this.f10620z.a().a(this);
        this.f10607m.a(this);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void f(boolean z10) {
        this.f10615u = z10;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void g(androidx.lifecycle.i iVar) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.d();
    }

    @Override // u4.c.l
    public void h(w4.q qVar) {
        this.C.g(qVar.a());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void i(androidx.lifecycle.i iVar) {
        iVar.a().c(this);
        if (this.f10616v) {
            return;
        }
        b0();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void j(androidx.lifecycle.i iVar) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.b(null);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void k(boolean z10) {
        this.f10613s = z10;
    }

    @Override // u4.c.InterfaceC0272c
    public void l(int i10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("isGesture", Boolean.valueOf(i10 == 1));
        this.f10605k.c("camera#onMoveStarted", hashMap);
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void m(boolean z10) {
        if (this.f10611q == z10) {
            return;
        }
        this.f10611q = z10;
        if (this.f10608n != null) {
            x0();
        }
    }

    public void m0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.I = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10608n != null) {
            s0();
        }
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void n(boolean z10) {
        this.f10608n.k().i(z10);
    }

    public void n0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.F = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10608n != null) {
            t0();
        }
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void o(boolean z10) {
        this.f10608n.k().j(z10);
    }

    void o0(float f10, float f11, float f12, float f13) {
        List<Float> list = this.K;
        if (list == null) {
            this.K = new ArrayList();
        } else {
            list.clear();
        }
        this.K.add(Float.valueOf(f10));
        this.K.add(Float.valueOf(f11));
        this.K.add(Float.valueOf(f12));
        this.K.add(Float.valueOf(f13));
    }

    @Override // u4.c.j
    public void p(w4.l lVar) {
        this.A.l(lVar.a(), lVar.b());
    }

    public void p0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.G = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10608n != null) {
            u0();
        }
    }

    public void q0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.H = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10608n != null) {
            v0();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void r(androidx.lifecycle.i iVar) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.d();
    }

    public void r0(List<Map<String, ?>> list) {
        this.J = list;
        if (this.f10608n != null) {
            w0();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void s(androidx.lifecycle.i iVar) {
        if (this.f10616v) {
            return;
        }
        this.f10607m.f();
    }

    @Override // u4.c.d
    public void t(w4.e eVar) {
        this.D.g(eVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.m
    public void u(boolean z10) {
        this.f10608n.k().m(z10);
    }

    @Override // u4.f
    public void v(u4.c cVar) {
        this.f10608n = cVar;
        cVar.q(this.f10613s);
        this.f10608n.K(this.f10614t);
        this.f10608n.p(this.f10615u);
        cVar.B(this);
        k.d dVar = this.f10618x;
        if (dVar != null) {
            dVar.a(null);
            this.f10618x = null;
        }
        l0(this);
        x0();
        this.A.o(cVar);
        this.B.i(cVar);
        this.C.i(cVar);
        this.D.i(cVar);
        this.E.j(cVar);
        t0();
        u0();
        v0();
        s0();
        w0();
        List<Float> list = this.K;
        if (list == null || list.size() != 4) {
            return;
        }
        K(this.K.get(0).floatValue(), this.K.get(1).floatValue(), this.K.get(2).floatValue(), this.K.get(3).floatValue());
    }

    @Override // io.flutter.plugin.platform.f
    public View w() {
        return this.f10607m;
    }

    @Override // io.flutter.plugin.platform.f
    public void x() {
    }

    @Override // u4.c.j
    public void y(w4.l lVar) {
        this.A.j(lVar.a(), lVar.b());
    }

    @Override // u4.c.b
    public void z() {
        if (this.f10609o) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("position", e.a(this.f10608n.g()));
            this.f10605k.c("camera#onMove", hashMap);
        }
    }
}
