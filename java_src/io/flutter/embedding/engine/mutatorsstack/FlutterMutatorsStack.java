package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private Matrix f10341a;

        /* renamed from: b  reason: collision with root package name */
        private Rect f10342b;

        /* renamed from: c  reason: collision with root package name */
        private float[] f10343c;

        /* renamed from: d  reason: collision with root package name */
        private b f10344d;

        public a(Matrix matrix) {
            this.f10344d = b.TRANSFORM;
            this.f10341a = matrix;
        }

        public a(Rect rect) {
            this.f10344d = b.CLIP_RECT;
            this.f10342b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f10344d = b.CLIP_RRECT;
            this.f10342b = rect;
            this.f10343c = fArr;
        }

        public Matrix a() {
            return this.f10341a;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i10, int i11, int i12, int i13, float[] fArr) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
