.class public Lcom/google/android/gms/internal/auth/e2;
.super Lcom/google/android/gms/internal/auth/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/auth/g2<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/auth/e2<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/auth/z0<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final j:Lcom/google/android/gms/internal/auth/g2;

.field protected k:Lcom/google/android/gms/internal/auth/g2;

.field protected l:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/auth/g2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/z0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/e2;->j:Lcom/google/android/gms/internal/auth/g2;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/auth/e2;->l:Z

    return-void
.end method

.method private static final h(Lcom/google/android/gms/internal/auth/g2;Lcom/google/android/gms/internal/auth/g2;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/auth/s3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/internal/auth/a1;)Lcom/google/android/gms/internal/auth/z0;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/auth/g2;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/auth/e2;->d(Lcom/google/android/gms/internal/auth/g2;)Lcom/google/android/gms/internal/auth/e2;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/auth/e2;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->j:Lcom/google/android/gms/internal/auth/g2;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/e2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/e2;->f()Lcom/google/android/gms/internal/auth/g2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/auth/e2;->d(Lcom/google/android/gms/internal/auth/g2;)Lcom/google/android/gms/internal/auth/e2;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/e2;->c()Lcom/google/android/gms/internal/auth/e2;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lcom/google/android/gms/internal/auth/g2;)Lcom/google/android/gms/internal/auth/e2;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/auth/e2;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/e2;->g()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/auth/e2;->l:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/auth/e2;->h(Lcom/google/android/gms/internal/auth/g2;Lcom/google/android/gms/internal/auth/g2;)V

    return-object p0
.end method

.method public f()Lcom/google/android/gms/internal/auth/g2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/auth/e2;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    invoke-static {}, Lcom/google/android/gms/internal/auth/p3;->a()Lcom/google/android/gms/internal/auth/p3;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/auth/p3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/s3;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/auth/s3;->b(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/auth/e2;->l:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    return-object v0
.end method

.method protected g()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/g2;->g(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/g2;

    iget-object v1, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/auth/e2;->h(Lcom/google/android/gms/internal/auth/g2;Lcom/google/android/gms/internal/auth/g2;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->k:Lcom/google/android/gms/internal/auth/g2;

    return-void
.end method

.method public bridge synthetic zzg()Lcom/google/android/gms/internal/auth/g3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/e2;->f()Lcom/google/android/gms/internal/auth/g2;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/auth/g3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/e2;->j:Lcom/google/android/gms/internal/auth/g2;

    return-object v0
.end method
