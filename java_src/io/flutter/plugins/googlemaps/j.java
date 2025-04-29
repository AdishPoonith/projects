package io.flutter.plugins.googlemaps;

import android.content.Context;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends io.flutter.plugin.platform.g {

    /* renamed from: b  reason: collision with root package name */
    private final r8.c f10672b;

    /* renamed from: c  reason: collision with root package name */
    private final o f10673c;

    /* renamed from: d  reason: collision with root package name */
    private final k f10674d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(r8.c cVar, Context context, o oVar) {
        super(r8.r.f16789a);
        this.f10672b = cVar;
        this.f10673c = oVar;
        this.f10674d = new k(context, cVar);
    }

    @Override // io.flutter.plugin.platform.g
    public io.flutter.plugin.platform.f a(Context context, int i10, Object obj) {
        Map map = (Map) obj;
        f fVar = new f();
        e.e(map.get("options"), fVar);
        if (map.containsKey("initialCameraPosition")) {
            fVar.b(e.v(map.get("initialCameraPosition")));
        }
        if (map.containsKey("markersToAdd")) {
            fVar.d(map.get("markersToAdd"));
        }
        if (map.containsKey("polygonsToAdd")) {
            fVar.g(map.get("polygonsToAdd"));
        }
        if (map.containsKey("polylinesToAdd")) {
            fVar.h(map.get("polylinesToAdd"));
        }
        if (map.containsKey("circlesToAdd")) {
            fVar.c(map.get("circlesToAdd"));
        }
        if (map.containsKey("tileOverlaysToAdd")) {
            fVar.i((List) map.get("tileOverlaysToAdd"));
        }
        return fVar.a(i10, context, this.f10672b, this.f10673c);
    }
}
