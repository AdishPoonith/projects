package io.flutter.plugins.imagepicker;

import io.flutter.plugins.imagepicker.o;
import java.util.ArrayList;
import java.util.List;
import r8.a;
/* loaded from: classes.dex */
public final /* synthetic */ class s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o.h<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10801a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10802b;

        a(ArrayList arrayList, a.e eVar) {
            this.f10801a = arrayList;
            this.f10802b = eVar;
        }

        @Override // io.flutter.plugins.imagepicker.o.h
        public void b(Throwable th) {
            this.f10802b.a(o.a(th));
        }

        @Override // io.flutter.plugins.imagepicker.o.h
        /* renamed from: c */
        public void a(List<String> list) {
            this.f10801a.add(0, list);
            this.f10802b.a(this.f10801a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o.h<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f10803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.e f10804b;

        b(ArrayList arrayList, a.e eVar) {
            this.f10803a = arrayList;
            this.f10804b = eVar;
        }

        @Override // io.flutter.plugins.imagepicker.o.h
        public void b(Throwable th) {
            this.f10804b.a(o.a(th));
        }

        @Override // io.flutter.plugins.imagepicker.o.h
        /* renamed from: c */
        public void a(List<String> list) {
            this.f10803a.add(0, list);
            this.f10804b.a(this.f10803a);
        }
    }

    public static r8.i<Object> a() {
        return o.f.f10783d;
    }

    public static /* synthetic */ void b(o.e eVar, Object obj, a.e eVar2) {
        ArrayList arrayList = (ArrayList) obj;
        eVar.a((o.j) arrayList.get(0), (o.g) arrayList.get(1), (Boolean) arrayList.get(2), (Boolean) arrayList.get(3), new a(new ArrayList(), eVar2));
    }

    public static /* synthetic */ void c(o.e eVar, Object obj, a.e eVar2) {
        ArrayList arrayList = (ArrayList) obj;
        eVar.c((o.j) arrayList.get(0), (o.l) arrayList.get(1), (Boolean) arrayList.get(2), (Boolean) arrayList.get(3), new b(new ArrayList(), eVar2));
    }

    public static /* synthetic */ void d(o.e eVar, Object obj, a.e eVar2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList.add(0, eVar.b());
        } catch (Throwable th) {
            arrayList = o.a(th);
        }
        eVar2.a(arrayList);
    }

    public static void e(r8.c cVar, final o.e eVar) {
        r8.a aVar = new r8.a(cVar, "dev.flutter.pigeon.ImagePickerApi.pickImages", a(), cVar.d());
        if (eVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.imagepicker.p
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar2) {
                    s.b(o.e.this, obj, eVar2);
                }
            });
        } else {
            aVar.e(null);
        }
        r8.a aVar2 = new r8.a(cVar, "dev.flutter.pigeon.ImagePickerApi.pickVideos", a(), cVar.d());
        if (eVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.imagepicker.q
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar2) {
                    s.c(o.e.this, obj, eVar2);
                }
            });
        } else {
            aVar2.e(null);
        }
        r8.a aVar3 = new r8.a(cVar, "dev.flutter.pigeon.ImagePickerApi.retrieveLostResults", a(), cVar.d());
        if (eVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.imagepicker.r
                @Override // r8.a.d
                public final void a(Object obj, a.e eVar2) {
                    s.d(o.e.this, obj, eVar2);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
