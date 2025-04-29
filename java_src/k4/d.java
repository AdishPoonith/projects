package k4;

import android.os.IBinder;
import c4.s;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import k4.b;
/* loaded from: classes.dex */
public final class d<T> extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12578a;

    private d(Object obj) {
        this.f12578a = obj;
    }

    public static <T> b H2(T t10) {
        return new d(t10);
    }

    @ResultIgnorabilityUnspecified
    public static <T> T M(b bVar) {
        if (bVar instanceof d) {
            return (T) ((d) bVar).f12578a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        s.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
