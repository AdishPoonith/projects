.class public final Lcom/google/android/gms/common/api/internal/n1;
.super Lcom/google/android/gms/common/api/internal/k1;
.source "SourceFile"


# instance fields
.field public final c:Lcom/google/android/gms/common/api/internal/y0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/y0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/common/api/internal/k1;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lcom/google/android/gms/common/api/internal/z;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/j0;)Z
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/y0;->a:Lcom/google/android/gms/common/api/internal/o;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/o;->f()Z

    move-result p1

    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/j0;)[Lb4/d;
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/y0;->a:Lcom/google/android/gms/common/api/internal/o;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/o;->c()[Lb4/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lcom/google/android/gms/common/api/internal/j0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/y0;->a:Lcom/google/android/gms/common/api/internal/o;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/j0;->t()Lcom/google/android/gms/common/api/a$f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/k1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/internal/o;->d(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/y0;->a:Lcom/google/android/gms/common/api/internal/o;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/o;->b()Lcom/google/android/gms/common/api/internal/j$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/j0;->v()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n1;->c:Lcom/google/android/gms/common/api/internal/y0;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
